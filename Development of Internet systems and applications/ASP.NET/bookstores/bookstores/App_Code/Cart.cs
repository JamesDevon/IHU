using System;
using System.Collections.Generic;
using System.Data.OleDb;
using System.Web;

public class ShoppingCart
{
    public List<CartItem> Items { get; private set; }

    #region Cart Creator

    public static readonly ShoppingCart Instance;

    static ShoppingCart()
    {
        // If the cart is not in the session, create one
        if (HttpContext.Current.Session["Cart"] == null)
        {
            Instance = new ShoppingCart();
            Instance.Items = new List<CartItem>();
            HttpContext.Current.Session["Cart"] = Instance;
        }
        // Otherwise, get it from the session
        else
        {
            Instance = (ShoppingCart)HttpContext.Current.Session["Cart"];
        }
    }

    //Ensures that an object can't be created from outside
    protected ShoppingCart() { }

    #endregion

    #region Item Modification Methods

    //Adds an  Item
    public void AddItem(int productId, int qnt)
    {
        CartItem newItem = new CartItem(productId);
        //Updated (Working)
        foreach (CartItem item in Items)
        {
            if (item.Equals(newItem))
            {
                item.Quantity += qnt;
                return;
            }
        }
        #region Increase Quantity (Not working)
        if (Items.Contains(newItem))
        {
            
            /*foreach (CartItem item in Items)
            {
                if (item.Equals(newItem))
                {
                    item.Quantity += qnt;
                    return;
                }
            }*/
        }
        #endregion
        // Otherwise, add the new item to the list
        else
        {
            newItem.Quantity = qnt;
            Items.Add(newItem);
            return;
        }
    }
        
    //Change the quantity of an item in the cart
    public void SetItemQuantity(int productId, int quantity)
    {
        #region If we are setting the quantity to 0, remove the item(not Working)
        if (quantity == 0)
        {
            RemoveItem(productId);
            return;
        }
        #endregion
        //update the quantity
        CartItem updatedItem = new CartItem(productId);
        foreach (CartItem item in Items)
        {
            if (item.Equals(updatedItem))
            {
                item.Quantity = quantity;
                return;
            }
        }
    }
    //Remove an item
    public void RemoveItem(int productId)
    {   //Updated (Woriking)
        CartItem removedItem = new CartItem(productId);
        foreach (CartItem item in Items)
        {
            if (item.Equals(removedItem))
            {
                Items.Remove(item);
                return;
            }
        }
        #region Not working
        //Not Working (You have to use the same item not it's equal)
        /*CartItem removedItem = new CartItem(productId);
        Items.Remove(removedItem);*/
        #endregion
    }
    //empty the cart
    public void ClearCart()
    {
        Items.Clear();
    }
    #endregion

    public Single getTotalPrice()
    {
        Single totalPrice = 0;
        foreach (CartItem item in Items)
            totalPrice += item.TotalPrice;
        return totalPrice;
    }

    public static ShoppingCart GetShoppingCart()
    {
        return Instance;
    }
    #region Place Order
    public void PlaceOrder(int cstID)
    {
        //to avoid errors in sql query
        int orderID = 0;
        DateTime dateTime = DateTime.UtcNow.Date;
        String date = dateTime.ToString("dd/MM/yyyy");
        string conString = @"Provider=Microsoft.ACE.OLEDB.12.0; Data Source = C:\Users\James\source\repos\bookstores\bookstores\ebookstoredb.mdb";
        using (OleDbConnection conn = new OleDbConnection(conString))
        {
            conn.Open();
            String query2 = "INSERT INTO orders (Customer, oDate) VALUES( @customerid , @date)";
            String query3 = "INSERT INTO orderdetails ([Order], [Quantity], [Product]) VALUES( @orderid , @quantity, @productid)";
            String query4 = "Select ID from orders where Customer = @customerid AND oDate = @date";
            //inserting into orders table
            using (OleDbCommand cmd2 = new OleDbCommand(query2, conn))
            {
                cmd2.Parameters.AddWithValue("@customerid", cstID);
                cmd2.Parameters.AddWithValue("@date", date);
                cmd2.ExecuteNonQuery();
            }
            //It may return more than 1 result (Didn't find a way)
            using (OleDbCommand cmd4 = new OleDbCommand(query4, conn))
            {
                cmd4.Parameters.AddWithValue("@customerid", cstID);
                cmd4.Parameters.AddWithValue("@date", date);
                OleDbDataReader data = cmd4.ExecuteReader();
                while (data.Read())
                {
                    orderID = Convert.ToInt32(data["ID"]);
                }
            }
            //inserting into orderdetail table with the orderid from the above query
            for (int i = 0; i < Items.Count; i++)
            {
                using (OleDbCommand cmd3 = new OleDbCommand(query3, conn))
                {
                    cmd3.Parameters.AddWithValue("@orderid", orderID);
                    cmd3.Parameters.AddWithValue("@quantity", Items[i].Quantity);
                    cmd3.Parameters.AddWithValue("@productid", Items[i].ID);
                    cmd3.ExecuteNonQuery();
                }
            }
            conn.Close();
        }
    }
    #endregion
}
public class CartItem
{
    //CartItem constructor
    public CartItem(int productId)
    {
        this.ProductId = productId;
    }
    #region Properties

    public int Quantity { get; set; }
    private int _productId;
    public int ProductId
    {
        get { return _productId; }
        set
        {
            // To ensure that the Prod object will be re-created
            _product = null;
            _productId = value;
        }
    }

    private Product _product = null;
    public Product Prod
    {
        get
        {
            //the object won't be created until it is needed
            if (_product == null)
            {
                _product = new Product(ProductId);
            }
            return _product;
        }
    }
    public int ID
    {
        get { return Prod.ID; }
    }

    public string Title
    {
        get { return Prod.Title; }
    }

    public Single UnitPrice
    {
        get { return Prod.Price; }
    }

    public Single TotalPrice
    {
        get { return UnitPrice * Quantity; }
    }
    public string Img
    {
        get { return Prod.img; }
    }
    #endregion
    //it's neede for the SetItemQuantity()
    public bool Equals(CartItem item)
    {
        return this.ProductId == item.ID;
    }
}
public class Product
{
    public int ID { get; set; }
    public string Title { get; set; }
    public string Description { get; set; }
    public Single Price { get; set; }
    public int Category { get; set; }
    public string img { get; set; }
    public Product(int id)
    {
        string conString = @"Provider=Microsoft.ACE.OLEDB.12.0; Data Source = C:\Users\James\source\repos\bookstores\bookstores\ebookstoredb.mdb";
        using (OleDbConnection conn = new OleDbConnection(conString))
        {
            conn.Open();
            String query = "select * from product where ID = @pid ";
            using (OleDbCommand cmd = new OleDbCommand(query, conn))
            {
                cmd.Parameters.AddWithValue("@pid", id);

                OleDbDataReader data = cmd.ExecuteReader();
                while (data.Read())
                {
                    this.ID = Convert.ToInt32(data["Id"]);
                    this.Title = data["Title"].ToString();
                    this.Description = data["Description"].ToString();
                    this.Price = Convert.ToInt32(data["Price"]);
                    this.Category = Convert.ToInt32(data["Category"]);
                    this.img = data["Img"].ToString();
                }
            }
            conn.Close();
        }
    }
}
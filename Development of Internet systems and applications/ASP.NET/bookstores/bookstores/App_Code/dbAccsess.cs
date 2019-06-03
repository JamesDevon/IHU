using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Data.SqlClient;
using System.Configuration;
using System.Data.OleDb;
using System.Web.UI;
using System.Web.UI.WebControls;
//No Comments on this one :)
namespace bookstores
{
    public class Product
    {
        public int ID { get; set; }
        public string Title { get; set; }
        public string Description { get; set; }
        public Single Price { get; set; }
        public int Category { get; set; }
    }

    public class Order
    {
        public int orderID { get; set; }
        public int customerID { get; set; }
        public String date { get; set; }
    }

    public class OrderDetails
    {
        public int orderdetailsID { get; set; }
        public int orderID{ get; set; }
        public int quantity { get; set; }
        public int productID { get; set; }
    }

    public class dbAccess
    {
        public static List<Product> getData(int? cid)
        {
            List<Product> listProducts = new List<Product>();
            if (cid != 0)
            {
                string conString = @"Provider=Microsoft.ACE.OLEDB.12.0; Data Source = C:\Users\James\source\repos\bookstores\bookstores\ebookstoredb.mdb";
                using (OleDbConnection conn = new OleDbConnection(conString))
                {
                    conn.Open();
                    String query = "select * from product where Category = @category ;";
                    using (OleDbCommand cmd = new OleDbCommand(query, conn))
                    {
                        cmd.Parameters.AddWithValue("@category", cid);

                        OleDbDataReader data = cmd.ExecuteReader();
                        while (data.Read())
                        {
                            Product product = new Product();
                            product.ID = Convert.ToInt32(data["Id"]);
                            product.Title = data["Title"].ToString();
                            product.Description = data["Description"].ToString();
                            product.Price = Convert.ToInt32(data["Price"]);
                            product.Category = Convert.ToInt32(data["Category"]);
                            listProducts.Add(product);
                        }
                    }
                    conn.Close();
                }
            }
            else
            {
                string conString = @"Provider=Microsoft.ACE.OLEDB.12.0; Data Source = C:\Users\James\source\repos\bookstores\bookstores\ebookstoredb.mdb";
                using (OleDbConnection conn = new OleDbConnection(conString))
                {
                    conn.Open();
                    String query = "select * from product";
                    using (OleDbCommand cmd = new OleDbCommand(query, conn))
                    {
                        OleDbDataReader data = cmd.ExecuteReader();
                        while (data.Read())
                        {
                            Product product = new Product();
                            product.ID = Convert.ToInt32(data["Id"]);
                            product.Title = data["Title"].ToString();
                            product.Description = data["Description"].ToString();
                            product.Price = Convert.ToInt32(data["Price"]);
                            product.Category = Convert.ToInt32(data["Category"]);
                            listProducts.Add(product);
                        }
                    }
                    conn.Close();
                }
            }
            return listProducts;
        }

        public void updateData(int ID, string Title, string Description, Single Price, int Category)
        {
            string conString = @"Provider=Microsoft.ACE.OLEDB.12.0; Data Source = C:\Users\James\source\repos\bookstores\bookstores\ebookstoredb.mdb";
            using (OleDbConnection conn = new OleDbConnection(conString))
            {
                conn.Open();
                String query = "Update product Set Title = @title , Description = @description , Price = @price , Category = @category WHERE ID = @id ;";
                using (OleDbCommand cmd = new OleDbCommand(query, conn))
                {
                    cmd.Parameters.AddWithValue("@title", Title);
                    cmd.Parameters.AddWithValue("@description", Description);
                    cmd.Parameters.AddWithValue("@price", Price);
                    cmd.Parameters.AddWithValue("@category", Category);
                    cmd.Parameters.AddWithValue("@id", ID);
                    cmd.ExecuteNonQuery();
                }
                conn.Close();
            }
        }

        public void deleteData(int ID)
        {
            string conString = @"Provider=Microsoft.ACE.OLEDB.12.0; Data Source = C:\Users\James\source\repos\bookstores\bookstores\ebookstoredb.mdb";
            using (OleDbConnection conn = new OleDbConnection(conString))
            {
                conn.Open();
                String query = "DELETE FROM product where ID = @id ";
                using (OleDbCommand cmd = new OleDbCommand(query, conn))
                {
                    cmd.Parameters.AddWithValue("@id", ID);
                    cmd.ExecuteNonQuery();
                }
                conn.Close();
            }
        }

        public static List<Order>  getOrders()
        {
            List<Order> orders = new List<Order>();
            string conString = @"Provider=Microsoft.ACE.OLEDB.12.0; Data Source = C:\Users\James\source\repos\bookstores\bookstores\ebookstoredb.mdb";
            using (OleDbConnection conn = new OleDbConnection(conString))
            {
                conn.Open();
                String query = "select * from orders";
                using (OleDbCommand cmd = new OleDbCommand(query, conn))
                {
                    OleDbDataReader data = cmd.ExecuteReader();
                    while (data.Read())
                    {
                        Order order = new Order();
                        order.orderID = Convert.ToInt32(data["ID"]);
                        order.customerID= Convert.ToInt32(data["Customer"]);
                        order.date = data["oDate"].ToString();
                        orders.Add(order);
                    }
                }
                conn.Close();
            }
            return orders;
        }

        public static List<OrderDetails> GetOrderDetails(int oid)
        {
            List<OrderDetails> ordersdetails= new List<OrderDetails>();
            string conString = @"Provider=Microsoft.ACE.OLEDB.12.0; Data Source = C:\Users\James\source\repos\bookstores\bookstores\ebookstoredb.mdb";
            using (OleDbConnection conn = new OleDbConnection(conString))
            {
                conn.Open();
                String query = "select * from orderdetails where [Order] = @orderid ";
                using (OleDbCommand cmd = new OleDbCommand(query, conn))
                {
                    cmd.Parameters.AddWithValue("@orderid", oid);
                    OleDbDataReader data = cmd.ExecuteReader();
                    while (data.Read())
                    {
                        OrderDetails orderdetails = new OrderDetails();
                        orderdetails.orderdetailsID = Convert.ToInt32(data["ID"]);
                        orderdetails.orderID = Convert.ToInt32(data["Order"]);
                        orderdetails.quantity = Convert.ToInt32(data["Quantity"]);
                        orderdetails.productID = Convert.ToInt32(data["Product"]);
                        ordersdetails.Add(orderdetails);
                    }
                }
                conn.Close();
            }
            return ordersdetails;
        }
    }
}

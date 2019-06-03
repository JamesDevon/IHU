using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace bookstores
{
    public partial class shopingcart : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            if (!IsPostBack)
            {
                BindData();
                Label1.Visible = false;
            }
            if (gvShoppingCart.Rows.Count == 0)
            {
                //if the cart is empty hide the buttons that arent needed
                editButton.Visible = false;
                emptyButton.Visible = false;
            }
            else
            {
                //Otherwise show the buttons
                editButton.Visible = true;
                emptyButton.Visible = true;
                //if a user hasn't logged in he can't place an order
                if (Session["ID"] != null)
                {
                    placeOrderButton.Visible = true;
                }
            }
        }
        //frequently binding data
        protected void BindData()
        {
            ShoppingCart cart = ShoppingCart.GetShoppingCart();
            gvShoppingCart.DataSource = cart.Items;
            gvShoppingCart.DataBind();
        }

        protected void gvShoppingCart_RowDataBound(object sender, GridViewRowEventArgs e)
        {
            //Adding the total price in the footer row
            if (e.Row.RowType == DataControlRowType.Footer)
            {
                ShoppingCart cart = ShoppingCart.GetShoppingCart();
                e.Row.Cells[3].Text = "Total: " + cart.getTotalPrice().ToString("C");
            }
        }
        protected void gvShoppingCart_RowCommand(object sender, GridViewCommandEventArgs e)
        {
            if (e.CommandName == "Remove")
            {
                int productId = Convert.ToInt32(e.CommandArgument);
                ShoppingCart cart = ShoppingCart.GetShoppingCart();
                cart.RemoveItem(productId);
            }
            BindData();
        }
        protected void updateCart(object sender, EventArgs e)
        {
            foreach (GridViewRow row in gvShoppingCart.Rows)
            {
                if (row.RowType == DataControlRowType.DataRow)
                {
                    //In case a letter is typed in , a try catch block will ignore it
                    try
                    {
                        // Get the productId from the GridView's datakeys
                        int productId = Convert.ToInt32(gvShoppingCart.DataKeys[row.RowIndex].Value);
                        // Find the quantity TextBox and retrieve the value
                        int quantity = int.Parse(((TextBox)row.Cells[1].FindControl("txtQuantity")).Text);
                        ShoppingCart cart = ShoppingCart.GetShoppingCart();
                        cart.SetItemQuantity(productId, quantity);
                    }
                    catch (FormatException) { }
                }
            }
            gvShoppingCart.Columns[2].Visible = true;
            gvShoppingCart.Columns[3].Visible = false;
            updateButton.Visible = false;
            cancelButton.Visible = false;
            editButton.Visible = true;
            emptyButton.Visible = true;
            BindData();
        }

        protected void editCart(object sender, EventArgs e)
        {
            gvShoppingCart.Columns[2].Visible = false;
            gvShoppingCart.Columns[3].Visible = true;
            updateButton.Visible = true;
            cancelButton.Visible = true;
            editButton.Visible = false;
            emptyButton.Visible = false;
        }

        protected void cancelUpdate(object sender, EventArgs e)
        {
            gvShoppingCart.Columns[2].Visible = true;
            gvShoppingCart.Columns[3].Visible = false;
            updateButton.Visible = false;
            cancelButton.Visible = false;
            editButton.Visible = true;
            emptyButton.Visible = false;
        }

        protected void emptyCart(object sender, EventArgs e)
        {
            editButton.Visible = false;
            emptyButton.Visible = false;
            ShoppingCart cart = ShoppingCart.GetShoppingCart();
            cart.ClearCart();
            BindData();
        }

        protected void placeOrder(object sender, EventArgs e)
        {
            if (Session["ID"] != null)
            {
                int userId = (int)Session["ID"];
                ShoppingCart cart = ShoppingCart.GetShoppingCart();
                cart.PlaceOrder(userId);
                //interacting with the user
                cart.ClearCart();
                BindData();
                Label1.Visible = true;
            }
        }
    }
}
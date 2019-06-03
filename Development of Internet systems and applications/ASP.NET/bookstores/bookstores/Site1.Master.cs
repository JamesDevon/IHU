using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace bookstores
{
    public partial class Site1 : System.Web.UI.MasterPage
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            //MenuController
            if (Session["ID"] != null)
            {

                Logout.Visible = true;
                Login.Visible = false;

                if (Convert.ToInt32(Session["ID"]) != 2)
                {
                    usersMenuPanel.Visible = true;
                }
                else
                {
                    adminMenuPanel.Visible = true;
                }
            }
            logo.ImageUrl = @"internal/bookstore.jpg";
        }
        protected void Homepage(object sender, EventArgs e)
        {
            Response.Redirect("default.aspx");
        }
        protected void Shopinfopage(object sender, EventArgs e)
        {
            Response.Redirect("shopinfo.aspx");
        }
        protected void Productspage(object sender, EventArgs e)
        {
            Response.Redirect("products.aspx");
        }
        protected void Shopingcartpage(object sender, EventArgs e)
        {
            Response.Redirect("shopingcart.aspx");
        }
        protected void Contactpage(object sender, EventArgs e)
        {
            Response.Redirect("contacts.aspx");
        }
        protected void Loginpage(object sender, EventArgs e)
        {
            Response.Redirect("login.aspx");
        }
        protected void LogoutFunction(object sender, EventArgs e)
        {
            adminMenuPanel.Visible = false;
            usersMenuPanel.Visible = false;
            Session["ID"] = null;
            Response.Redirect("default.aspx");
        }

        protected void manageCategoriesButton_Click(object sender, EventArgs e)
        {
            Response.Redirect("AdminCategories.aspx");
        }

        protected void manageProducts(object sender, EventArgs e)
        {
            Response.Redirect("AdminProducts.aspx");
        }

        protected void customerListButton_Click(object sender, EventArgs e)
        {
            Response.Redirect("customerlist.aspx");
        }

        protected void manageorders_Click(object sender, EventArgs e)
        {
            Response.Redirect("AdminOrders.aspx");
        }

        protected void showmyinfoButton_Click(object sender, EventArgs e)
        {
            Response.Redirect("editAccount.aspx");
        }

        protected void showOrdesButton_Click(object sender, EventArgs e)
        {
            Response.Redirect("showpersonalOrders.aspx");
        }
    }
}
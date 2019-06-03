using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data.OleDb;
using System.IO;

namespace bookstores
{
    public partial class products : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            if (Session["catid"] == null)
            {
                Session["catid"] = "0";
                DropDownListCategories.Items.Insert(0, new ListItem("All Categories", "0"));
            }
            string[] images = Directory.GetFiles("C:\\Users\\James\\source\\repos\\bookstores\\bookstores\\internal\\bookimg");
            //DropDownListCategories.Items.Insert(0, new ListItem("All Categories", "0"));
        }
        #region 
        //Getting the Categorys from the DB to fill the left Menu
        /*string conString = "Provider=Microsoft.ACE.OLEDB.12.0; Data Source = " + Server.MapPath("~/ebookstoredb.mdb");
        using (OleDbConnection conn = new OleDbConnection(conString))
        {
            conn.Open();
            String query = "SELECT * FROM category ";
            using (OleDbCommand cmd = new OleDbCommand(query, conn))
            {
                OleDbDataReader reader = cmd.ExecuteReader();
                while (reader.Read())
                {   //Setting the right category ID for later use
                    categoriesLiteral.Text += "<li><a class='a1' href='/products.aspx?cid=" + reader["ID"] + "'>" + reader["Name"] + "</a></li>";
                }
                reader.Close();
                //No action if the user doesn't interact
                if (Request["cid"] != null)
                {
                    string url = HttpContext.Current.Request.Url.AbsoluteUri;
                    String cid = Request["cid"].ToString();
                    //Getting the items from the Category the user clicked
                    String query1 = "SELECT * FROM product where Category = @catid";
                    using (OleDbCommand cmd1 = new OleDbCommand(query1, conn))
                    {
                        cmd1.Parameters.AddWithValue("@catid", cid);
                        OleDbDataReader productsReader = cmd1.ExecuteReader();
                        //Using literal - Dynamic Display of the items 
                        productsLiteral.Text = "<tr><th> Title </th><th> Price </th></tr> ";
                        //Filling the table with every item
                        while (productsReader.Read())
                        {
                            productsLiteral.Text += "<tr><td>";
                            productsLiteral.Text += "<a href='?pid=" + productsReader["ID"] + "'>" + productsReader["Title"] + "</a> </ td > ";
                            productsLiteral.Text += "<td>" + productsReader["Price"];
                            productsLiteral.Text += "$</td></tr>";
                        }
                        productsReader.Close();
                    }
                }
                conn.Close();
            }*/
        #endregion
        #region
        //loading the details for item the user selected
        //No action if the user doesn't interact
        /*if (Request["pid"] != null)
        {
            string conString1 = "Provider=Microsoft.ACE.OLEDB.12.0; Data Source = " + Server.MapPath("~/ebookstoredb.mdb");
            using (OleDbConnection conn1 = new OleDbConnection(conString1))
            {
                conn1.Open();
                string pid = Request["pid"].ToString();
                productsLiteral.Text = "";
                String query2 = "SELECT * FROM product where ID = @pid";
                using (OleDbCommand cmd2 = new OleDbCommand(query2, conn1))
                {
                    cmd2.Parameters.AddWithValue("@pid", pid);
                    OleDbDataReader productsReader = cmd2.ExecuteReader();
                    detailsLiteral.Text = "<tr><th style='width:20%;'> Title </th><th style='width:40%;'> Description </th><th style='width:40%;'> Price </th></tr> ";
                    string url = HttpContext.Current.Request.Url.AbsoluteUri;
                    //Using literal - Dynamic Display of the items
                    while (productsReader.Read())
                    {
                        detailsLiteral.Text += "<tr><td>";
                        detailsLiteral.Text += "<a href='/products.aspx?pid=" + productsReader["ID"] + "'>" + productsReader["Title"] + "</a> </ td > ";
                        detailsLiteral.Text += "<td>" + productsReader["Description"] + "</td>";
                        detailsLiteral.Text += "<td>" + productsReader["Price"] + "$";
                        detailsLiteral.Text += "</td></tr>";
                    }
                    productsReader.Close();
                    addtocartPanel.Visible = true;
                }
                conn1.Close();
            }
        }*/
        // string url = HttpContext.Current.Request.Url.AbsoluteUri;
        //Uri myUri = new Uri(url);
        //HttpUtility.ParseQueryString(myUri.Query).Get("cid");
        #endregion
        protected void Addtocart(object sender, EventArgs e)
        {
            Button btn = (Button)sender;
            int pid = Convert.ToInt32(btn.CommandArgument);
            //int pid = Convert.ToInt32(Request["pid"]);
            //int quantity = Convert.ToInt32(Q.Text);
            ShoppingCart.Instance.AddItem(pid, 1);
            Response.Redirect("shopingcart.aspx");

        }
        protected void LoadProducts(object sender, EventArgs e)
        {
            String index = DropDownListCategories.SelectedItem.Value;
            Session["catid"] = index;
            if (Session["catid"] == "0")
            {
                loginDataSetTableAdapters.productTableAdapter pr = new loginDataSetTableAdapters.productTableAdapter();
                gvProducts.DataSource = pr.getAllProducts();
                gvProducts.DataBind();
            }
            else
            {

            }
        }
    }
}
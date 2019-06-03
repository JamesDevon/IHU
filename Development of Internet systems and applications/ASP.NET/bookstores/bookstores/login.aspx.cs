using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data.OleDb;
namespace bookstores
{
    public partial class login : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }
        protected void LoginFunction(object sender, EventArgs e)
        {
            string uname = (string)username.Text;
            string pwd = (string)passwd.Text;
            //Using a dataSet for the login 
            loginDataSetTableAdapters.customerTableAdapter login = new loginDataSetTableAdapters.customerTableAdapter();
            if (Convert.ToInt32(login.trylogin(uname, pwd)) > 0)
            {
                Session["ID"] = login.getUsersID(uname);
                Response.Redirect("Default.aspx");
            }
            else
            {
                console.Text = "Please try again";
            }
            #region OldWay
            /*
            string conString = "Provider=Microsoft.ACE.OLEDB.12.0; Data Source = " + Server.MapPath("~/ebookstoredb.mdb");
            using (OleDbConnection conn = new OleDbConnection(conString))
            {
                conn.Open();

                String query = "SELECT * FROM customer WHERE uname = @username AND passwd = @passwd";
                using (OleDbCommand cmd = new OleDbCommand(query, conn))
                {
                    cmd.Parameters.AddWithValue("@username", uname);
                    cmd.Parameters.AddWithValue("@passwd", passwd.Text);
                    int? result = (int?)cmd.ExecuteScalar();
                    if (result != null)
                    {
                        Session["username"] = uname;
                        Response.Redirect("Default.aspx");
                    }
                    else
                    {
                        console.Text = "Please try again";
                    }
                }
                conn.Close();*/
            #endregion
        }

        protected void Singup(object sender, EventArgs e)
        {
            Response.Redirect("singup.aspx");
        }

        protected void recoverPassword(object sender, EventArgs e)
        {
            Response.Redirect("recoverPasswordPage.aspx");
        }
    }


}
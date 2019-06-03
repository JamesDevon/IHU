using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data.OleDb;
using System.Net.Mail;

namespace bookstores
{
    public partial class recoverPasswordPage : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Recover(object sender, EventArgs e)
        {
            string username = uname.Text;
            string mobile = phone.Text;
            string conString = "Provider=Microsoft.ACE.OLEDB.12.0; Data Source = " + Server.MapPath("~/ebookstoredb.mdb");
            using (OleDbConnection conn = new OleDbConnection(conString))
            {
                conn.Open();

                String query = "SELECT passwd FROM customer WHERE uname = @username AND Phone = @phone";
                using (OleDbCommand cmd = new OleDbCommand(query, conn))
                {
                    cmd.Parameters.AddWithValue("@username", username);
                    cmd.Parameters.AddWithValue("@phone", mobile);
                    //If the given vaules match
                    string result = (string)cmd.ExecuteScalar();
                    if (result != null)
                    {
                        //the user get's his Password
                        Response.Write("<script> alert('Your Password is : " + result + "'); " +
                                       "window.location.assign('/login.aspx');" +
                                       "</script>");
                    }
                    else
                    {
                        //otherwise not
                        Response.Write("<script> alert('False!'); " +
                                       "window.location.assign('/login.aspx');" +
                                       "</script>");
                    }
                }
                conn.Close();
            }
        }
    }
}
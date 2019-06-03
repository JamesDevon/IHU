using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data.OleDb;
using System.Text.RegularExpressions;

namespace bookstores
{
    public partial class singup : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
        }

        protected void Singup(object sender, EventArgs e)
        {
            //Storing Info
            string[] address = new string[10];
            //Personal info
            address[0] = (string)Fname.Text;
            address[1] = (string)Lname.Text;
            address[2] = (string)phone.Text;
            //Address info 
            address[3] = (string)addressNumber.Text;
            address[4] = (string)addressStreet.Text;
            address[5] = (string)city.Text;
            address[6] = (string)state.Text;
            address[7] = (string)uname.Text;
            address[8] = (string)passwd.Text;
            address[9] = (string)TextBox1.Text;
            //Getting the Address together in the form the database wants
            string fullAddress = address[3] + ", " + address[4] + ", " + address[5] + ", " + ", " + address[6];
            loginDataSetTableAdapters.customerTableAdapter singup = new loginDataSetTableAdapters.customerTableAdapter();
            ////Using the DataSet with the sing up method
            singup.registerUser(address[0], address[1], fullAddress, address[2], address[7], address[8], address[9]);
            Response.Redirect("/login.aspx");
            #region Old way
            /*
            string conString = "Provider=Microsoft.ACE.OLEDB.12.0; Data Source = " + Server.MapPath("~/ebookstoredb.mdb");
            using (OleDbConnection conn = new OleDbConnection(conString))
            {
                conn.Open();

                String query = "INSERT INTO customer ([Fname],[Lname],[Address],[Phone],[uname],[passwd],[email]) values(@first , @last , @address , @phone , @uname, @passwd, @email)";
                using (OleDbCommand cmd = new OleDbCommand(query, conn))
                {
                    cmd.Parameters.AddWithValue("@first", address[0]);
                    cmd.Parameters.AddWithValue("@last", address[1]);
                    cmd.Parameters.AddWithValue("@address", fullAddress);
                    cmd.Parameters.AddWithValue("@phone", address[2]);
                    cmd.Parameters.AddWithValue("@uname", address[7]);
                    cmd.Parameters.AddWithValue("@passwd", address[8]);
                    cmd.Parameters.AddWithValue("@email", address[9]);
                    cmd.ExecuteNonQuery();
                }
                conn.Close();
                Response.Write("<script> alert('Your sign up was Successful'); " +
                               "window.location.assign('/default.aspx');" +
                               "</script>");
            } */
            #endregion
        }
        protected void availability(object sender, EventArgs e)
        {
            //Using Asp.net Ajax components , so we Give a feedback on the user if the username he chose is beeing used by another account
            string username = (string)uname.Text;
            string conString = "Provider=Microsoft.ACE.OLEDB.12.0; Data Source = " + Server.MapPath("~/ebookstoredb.mdb");
            using (OleDbConnection conn = new OleDbConnection(conString))
            {
                conn.Open();
                String query = "SELECT * FROM customer WHERE uname = @username";
                using (OleDbCommand cmd = new OleDbCommand(query, conn))
                {
                    cmd.Parameters.AddWithValue("@username", username);
                    int? result = (int?)cmd.ExecuteScalar();
                    if (result != null)
                    {

                        user.ImageUrl = @"internal/Cross.jpg";
                    }
                    else
                    {
                        user.ImageUrl = @"internal/tick.png";
                    }
                }
                conn.Close();
            }
        }
    }
}
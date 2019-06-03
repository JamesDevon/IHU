using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace bookstores
{
    public partial class AdminCategories : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void onEdit(object sender, EventArgs e)
        {
            GridView1.Columns[1].Visible = false;
            GridView1.Columns[2].Visible = true;
        }

        protected void onUpdate(object sender, EventArgs e)
        {
            GridView1.Columns[1].Visible = true;
            GridView1.Columns[2].Visible = false;
        }

    }
}
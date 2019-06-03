using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace bookstores
{
    public partial class showpersonalOrders : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            //Filling the GridView through the DataSet
            loginDataSetTableAdapters.DataTable1TableAdapter orders = new loginDataSetTableAdapters.DataTable1TableAdapter();
            gvOrders.DataSource = orders.getPersonalOrders((int)Session["ID"]);
            gvOrders.DataBind();
        }
    }
}
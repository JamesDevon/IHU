<%@ Page Title="" Language="C#" MasterPageFile="~/Site1.Master" AutoEventWireup="true" CodeBehind="AdminShowOrderDetails.aspx.cs" Inherits="bookstores.AdminShowOrderDetails" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="left" runat="server">
</asp:Content>
<asp:Content ID="Content3" ContentPlaceHolderID="content" runat="server">
    <div style="width:30%; float:left;">
    <asp:ListView class="mt-1" runat="server" DataSourceID="ObjectDataSource1" EnableModelValidation="True">
        <AlternatingItemTemplate>
            <li style="background-color: #FFFFFF; color: #284775;">orderdetailsID:
                <asp:Label ID="orderdetailsIDLabel" runat="server" Text='<%# Eval("orderdetailsID") %>' />
                <br />
                orderID:
                <asp:Label ID="orderIDLabel" runat="server" Text='<%# Eval("orderID") %>' />
                <br />
                quantity:
                <asp:Label ID="quantityLabel" runat="server" Text='<%# Eval("quantity") %>' />
                <br />
                productID:
                <asp:Label ID="productIDLabel" runat="server" Text='<%# Eval("productID") %>' />
                <br />
            </li>
        </AlternatingItemTemplate>
        <EditItemTemplate>
            <li style="background-color: #999999;">orderdetailsID:
                <asp:TextBox ID="orderdetailsIDTextBox" runat="server" Text='<%# Bind("orderdetailsID") %>' />
                <br />
                orderID:
                <asp:TextBox ID="orderIDTextBox" runat="server" Text='<%# Bind("orderID") %>' />
                <br />
                quantity:
                <asp:TextBox ID="quantityTextBox" runat="server" Text='<%# Bind("quantity") %>' />
                <br />
                productID:
                <asp:TextBox ID="productIDTextBox" runat="server" Text='<%# Bind("productID") %>' />
                <br />
                <asp:Button ID="UpdateButton" runat="server" CommandName="Update" Text="Update" />
                <asp:Button ID="CancelButton" runat="server" CommandName="Cancel" Text="Cancel" />
            </li>
        </EditItemTemplate>
        <EmptyDataTemplate>
            No data was returned.
        </EmptyDataTemplate>
        <InsertItemTemplate>
            <li style="">orderdetailsID:
                <asp:TextBox ID="orderdetailsIDTextBox" runat="server" Text='<%# Bind("orderdetailsID") %>' />
                <br />
                orderID:
                <asp:TextBox ID="orderIDTextBox" runat="server" Text='<%# Bind("orderID") %>' />
                <br />
                quantity:
                <asp:TextBox ID="quantityTextBox" runat="server" Text='<%# Bind("quantity") %>' />
                <br />
                productID:
                <asp:TextBox ID="productIDTextBox" runat="server" Text='<%# Bind("productID") %>' />
                <br />
                <asp:Button ID="InsertButton" runat="server" CommandName="Insert" Text="Insert" />
                <asp:Button ID="CancelButton" runat="server" CommandName="Cancel" Text="Clear" />
            </li>
        </InsertItemTemplate>
        <ItemSeparatorTemplate>
            <br />
        </ItemSeparatorTemplate>
        <ItemTemplate>
            <li style="background-color: #E0FFFF; color: #333333;">orderdetailsID:
                <asp:Label ID="orderdetailsIDLabel" runat="server" Text='<%# Eval("orderdetailsID") %>' />
                <br />
                orderID:
                <asp:Label ID="orderIDLabel" runat="server" Text='<%# Eval("orderID") %>' />
                <br />
                quantity:
                <asp:Label ID="quantityLabel" runat="server" Text='<%# Eval("quantity") %>' />
                <br />
                productID:
                <asp:Label ID="productIDLabel" runat="server" Text='<%# Eval("productID") %>' />
                <br />
            </li>
        </ItemTemplate>
        <LayoutTemplate>
            <ul id="itemPlaceholderContainer" runat="server" style="font-family: Verdana, Arial, Helvetica, sans-serif;">
                <li runat="server" id="itemPlaceholder" />
            </ul>
            <div style="text-align: center; background-color: #5D7B9D; font-family: Verdana, Arial, Helvetica, sans-serif; color: #FFFFFF;">
                <asp:DataPager ID="DataPager1" runat="server">
                    <Fields>
                        <asp:NextPreviousPagerField ButtonType="Button" ShowFirstPageButton="True" ShowNextPageButton="False" ShowPreviousPageButton="False" />
                        <asp:NumericPagerField />
                        <asp:NextPreviousPagerField ButtonType="Button" ShowLastPageButton="True" ShowNextPageButton="False" ShowPreviousPageButton="False" />
                    </Fields>
                </asp:DataPager>
            </div>
        </LayoutTemplate>
        <SelectedItemTemplate>
            <li style="background-color: #E2DED6; font-weight: bold; color: #333333;">orderdetailsID:
                <asp:Label ID="orderdetailsIDLabel" runat="server" Text='<%# Eval("orderdetailsID") %>' />
                <br />
                orderID:
                <asp:Label ID="orderIDLabel" runat="server" Text='<%# Eval("orderID") %>' />
                <br />
                quantity:
                <asp:Label ID="quantityLabel" runat="server" Text='<%# Eval("quantity") %>' />
                <br />
                productID:
                <asp:Label ID="productIDLabel" runat="server" Text='<%# Eval("productID") %>' />
                <br />
            </li>
        </SelectedItemTemplate>
    </asp:ListView>
        </div>
    <div style="width:inherit; float:inherit;">
    <asp:GridView   ID="GridView1" runat="server" AutoGenerateColumns="False" DataSourceID="ObjectDataSource3" EnableModelValidation="True" CellPadding="4" ForeColor="#333333" GridLines="None">
        <AlternatingRowStyle BackColor="White" />
        <Columns>
            <asp:BoundField DataField="Title" HeaderText="Title" SortExpression="Title" />
            <asp:BoundField DataField="Quantity" HeaderText="Quantity" SortExpression="Quantity" />
            <asp:BoundField DataField="oDate" HeaderText="oDate" SortExpression="oDate" />
        </Columns>
        <EditRowStyle BackColor="#2461BF" />
        <FooterStyle BackColor="#507CD1" Font-Bold="True" ForeColor="White" />
        <HeaderStyle BackColor="#507CD1" Font-Bold="True" ForeColor="White" />
        <PagerStyle BackColor="#2461BF" ForeColor="White" HorizontalAlign="Center" />
        <RowStyle BackColor="#EFF3FB" />
        <SelectedRowStyle BackColor="#D1DDF1" Font-Bold="True" ForeColor="#333333" />
        </asp:GridView>
        <asp:ObjectDataSource ID="ObjectDataSource3" runat="server" OldValuesParameterFormatString="original_{0}" SelectMethod="getOrderDetails" TypeName="bookstores.loginDataSetTableAdapters.DataTable1TableAdapter">
            <SelectParameters>
                <asp:QueryStringParameter DefaultValue="null" Name="ID" QueryStringField="oid" Type="Int32" />
            </SelectParameters>
        </asp:ObjectDataSource>
        <asp:ObjectDataSource ID="ObjectDataSource2" runat="server"></asp:ObjectDataSource>
        </div>
    <asp:ObjectDataSource ID="ObjectDataSource1" runat="server" SelectMethod="GetOrderDetails" TypeName="bookstores.dbAccess">
        <SelectParameters>
            <asp:QueryStringParameter DefaultValue="0" Name="oid" QueryStringField="oid" Type="Int32" />
        </SelectParameters>
    </asp:ObjectDataSource>
</asp:Content>

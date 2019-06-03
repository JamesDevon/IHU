<%@ Page Title="eBookstore" Language="C#" MasterPageFile="~/Site1.Master" AutoEventWireup="true" CodeBehind="products.aspx.cs" Inherits="bookstores.products" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="left" runat="server">
    <hr style="color: blue; border: 1px solid blue;" />
    <h2><b>Categories</b> </h2>
    <div style="padding-left: 18%;">
        <div style="background-color: #2F9DDD; border: 2px solid blue; border-radius: 5px; width: 80%; text-align: left">
            <asp:Panel ID="Panel1" runat="server" class=" ml-4">
                <asp:Literal ID="categoriesLiteral" runat="server"></asp:Literal>
            </asp:Panel>
        </div>
    </div>
</asp:Content>
<asp:Content ID="Content3" ContentPlaceHolderID="content" runat="server">
    <asp:ScriptManager ID="ScriptManager1" runat="server">
    </asp:ScriptManager>
    <asp:UpdatePanel ID="UpdatePanel1" runat="server">
        <ContentTemplate>
            <asp:DropDownList  CssClass="mt-1" ID="DropDownListCategories" runat="server" OnSelectedIndexChanged="LoadProducts" AutoPostBack="True" DataSourceID="ObjectDataSource1" DataTextField="Name" DataValueField="ID">
            </asp:DropDownList>
            <asp:ObjectDataSource ID="ObjectDataSource1" runat="server" OldValuesParameterFormatString="original_{0}" SelectMethod="getCategories" TypeName="bookstores.loginDataSetTableAdapters.categoryTableAdapter">
            </asp:ObjectDataSource>
            <asp:GridView ID="gvProducts" runat="server" CellPadding="4" EnableModelValidation="True" ForeColor="#333333" GridLines="None" AutoGenerateColumns="False" DataSourceID="ObjectDataSource2">
                <AlternatingRowStyle BackColor="White" />
                <Columns>
                    <asp:BoundField DataField="Title" HeaderImageUrl="Title" HeaderText="Title" />
                    <asp:BoundField DataField="Price" HeaderText="Price" SortExpression="Price" />
                    <asp:ImageField DataImageUrlField="Img" ControlStyle-CssClass="w-50">
                        <ControlStyle CssClass="w-50" />
                    </asp:ImageField>
                    <asp:TemplateField ShowHeader="False">
                        <ItemTemplate>
                            <asp:Button runat="server" ID="Button1" Text="Add To Cart" CommandArgument='<%# Bind("ID") %>' OnClick="Addtocart"></asp:Button>
                        </ItemTemplate>
                    </asp:TemplateField>
                </Columns>
                <EditRowStyle BackColor="#2461BF" />
                <FooterStyle BackColor="#507CD1" Font-Bold="True" ForeColor="White" />
                <HeaderStyle BackColor="#507CD1" Font-Bold="True" ForeColor="White" />
                <PagerStyle BackColor="#2461BF" ForeColor="White" HorizontalAlign="Center" />
                <RowStyle BackColor="#EFF3FB" />
                <SelectedRowStyle BackColor="#D1DDF1" Font-Bold="True" ForeColor="#333333" />
            </asp:GridView>
            <asp:ObjectDataSource ID="ObjectDataSource2" runat="server" OldValuesParameterFormatString="original_{0}" SelectMethod="getProducts" TypeName="bookstores.loginDataSetTableAdapters.productTableAdapter">
                <SelectParameters>
                    <asp:SessionParameter DefaultValue="null" Name="Category" SessionField="catid" Type="Int32" />
                </SelectParameters>
            </asp:ObjectDataSource>
        </ContentTemplate>
    </asp:UpdatePanel>
    <table>
        <asp:Literal ID="productsLiteral" runat="server"></asp:Literal>
    </table>
    <br />
    <table>
        <asp:Literal ID="detailsLiteral" runat="server"></asp:Literal>
    </table>
    <input id="hiddenControl" type="hidden" runat="server" />
    <asp:Label ID="console" runat="server" Text=""></asp:Label>
    <asp:Panel ID="addtocartPanel" runat="server" Visible="false">
    <!-- can't use an input type number -->
        <asp:TextBox ID="Q" runat="server"></asp:TextBox>
        <asp:Button class="btn btn-light" ID="addButtonn" runat="server" Text="Add to cart"  />
    </asp:Panel>
</asp:Content>
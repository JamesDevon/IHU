<%@ Page Title="" Language="C#" MasterPageFile="~/Site1.Master" AutoEventWireup="true" CodeBehind="AdminCategories.aspx.cs" Inherits="bookstores.AdminCategories" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="left" runat="server">
</asp:Content>
<asp:Content ID="Content3" ContentPlaceHolderID="content" runat="server">
    <asp:ScriptManager ID="ScriptManager1" runat="server"></asp:ScriptManager>
    <asp:UpdatePanel ID="UpdatePanel1" runat="server">
        <ContentTemplate>
            <asp:GridView CssClass="mt-1" OnRowEditing="onEdit" OnRowUpdating="onUpdate" ID="GridView1" runat="server" DataKeyNames="ID" DataSourceID="categoriesdb" EnableModelValidation="True" CellPadding="4" ForeColor="#333333" GridLines="None" AutoGenerateColumns="False">
                <AlternatingRowStyle BackColor="White" />
                <Columns>
                    <asp:BoundField DataField="ID" HeaderText="ID" InsertVisible="False" ReadOnly="True" SortExpression="ID" />
                    <asp:HyperLinkField DataNavigateUrlFields="ID" DataNavigateUrlFormatString="AdminProducts.aspx?cid={0}" DataTextField="Name" DataTextFormatString="{0}" HeaderText="Book Categories" SortExpression="Name" />
                    <asp:BoundField DataField="Name" HeaderText="Edit Categories" SortExpression="Name" Visible="False" />
                    <asp:CommandField ShowEditButton="True" ButtonType="link" />
                    <asp:CommandField ShowDeleteButton="True" />
                </Columns>
                <EditRowStyle BackColor="#2461BF" />
                <FooterStyle BackColor="#507CD1" Font-Bold="True" ForeColor="White" />
                <HeaderStyle BackColor="#507CD1" Font-Bold="True" ForeColor="White" />
                <PagerStyle BackColor="#2461BF" ForeColor="White" HorizontalAlign="Center" />
                <RowStyle BackColor="#EFF3FB" />
                <SelectedRowStyle BackColor="#D1DDF1" Font-Bold="True" ForeColor="#333333" />
            </asp:GridView>
        </ContentTemplate>
    </asp:UpdatePanel>
    <asp:AccessDataSource ID="categoriesdb" runat="server" DataFile="ebookstoredb.mdb" DeleteCommand="DELETE FROM category where ID = @id" SelectCommand="SELECT ID, Name FROM category" UpdateCommand="UPDATE category SET Name = @name where ID = @id"></asp:AccessDataSource>
</asp:Content>

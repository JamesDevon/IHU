<%@ Page Title="" Language="C#" MasterPageFile="~/Site1.Master" AutoEventWireup="true" CodeBehind="shopingcart.aspx.cs" Inherits="bookstores.shopingcart" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="left" runat="server">
</asp:Content>
<asp:Content ID="Content3" ContentPlaceHolderID="content" runat="server">
    <asp:ScriptManager ID="ScriptManager1" runat="server"></asp:ScriptManager>
    <asp:UpdatePanel ID="UpdatePanel1" runat="server">
        <ContentTemplate>
            <asp:Label Style="background-color: greenyellow;" ID="Label1" runat="server" Text="Your order has been placed successfully!" Visible="false"></asp:Label>
            <asp:GridView CssClass="mt-1" runat="server" ID="gvShoppingCart" AutoGenerateColumns="False" EmptyDataText="There is nothing in your shopping cart." GridLines="None" Width="100%" CellPadding="4" ShowFooter="True" DataKeyNames="ProductId" OnRowDataBound="gvShoppingCart_RowDataBound" OnRowCommand="gvShoppingCart_RowCommand" EnableModelValidation="True" ForeColor="#333333">
                <HeaderStyle HorizontalAlign="Left" BackColor="#507CD1" ForeColor="#FFFFFF" Font-Bold="True" />
                <EditRowStyle BackColor="#2461BF" />
                <FooterStyle HorizontalAlign="Right" BackColor="#507CD1" ForeColor="#FFFFFF" Font-Bold="True" />
                <AlternatingRowStyle BackColor="White" />
                <Columns>
                    <asp:TemplateField>
                        <EditItemTemplate>
                            <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
                        </EditItemTemplate>
                        <ItemTemplate>
                            <asp:Image ID="Image1" runat="server" style="width:50;" ImageUrl='<%# Bind("Img") %>'/>
                        </ItemTemplate>
                    </asp:TemplateField>
                    <asp:BoundField DataField="Title" HeaderText="Title" />
                    <asp:BoundField DataField="Quantity" HeaderText="Quantity" />
                    <asp:TemplateField HeaderText="Quantity" Visible="False">
                        <ItemTemplate>
                            <asp:TextBox runat="server" ID="txtQuantity" Columns="5" Text='<%# Eval("Quantity") %>'></asp:TextBox><br />
                            <asp:LinkButton runat="server" ID="btnRemove" Text="Remove" CommandName="Remove" CommandArgument='<%# Eval("ProductId") %>' Style="font-size: 12px;"></asp:LinkButton>
                        </ItemTemplate>
                    </asp:TemplateField>
                    <asp:BoundField DataField="UnitPrice" HeaderText="Price" ItemStyle-HorizontalAlign="Right" HeaderStyle-HorizontalAlign="Right" DataFormatString="{0:C}">
                        <HeaderStyle HorizontalAlign="Right"></HeaderStyle>

                        <ItemStyle HorizontalAlign="Right"></ItemStyle>
                    </asp:BoundField>
                    <asp:BoundField DataField="TotalPrice" HeaderText="Total" ItemStyle-HorizontalAlign="Right" HeaderStyle-HorizontalAlign="Right" DataFormatString="{0:C}">
                        <HeaderStyle HorizontalAlign="Right"></HeaderStyle>
                        <ItemStyle HorizontalAlign="Right"></ItemStyle>
                    </asp:BoundField>
                </Columns>
                <PagerStyle BackColor="#2461BF" ForeColor="White" HorizontalAlign="Center" />
                <RowStyle BackColor="#EFF3FB" />
                <SelectedRowStyle BackColor="#D1DDF1" Font-Bold="True" ForeColor="#333333" />
            </asp:GridView>
            <asp:Button ID="placeOrderButton" runat="server" Text="Place Order" Visible="false" class="btn btn-primary" OnClick="placeOrder" />
            <asp:Panel ID="Panel1" runat="server" Style="float: right" CssClass="mt-1">
                <asp:Button CssClass="btn btn-primary " ID="updateButton" runat="server" Text="Update Cart" OnClick="updateCart" Visible="false" />
                <asp:Button CssClass="btn btn-primary " ID="cancelButton" runat="server" Text="Cancel" OnClick="cancelUpdate" Visible="false" />
                <asp:Button CssClass="btn btn-primary mt-1 ml-1" ID="editButton" runat="server" Text="Edit" OnClick="editCart" />
                <asp:Button CssClass="btn btn-primary " ID="emptyButton" runat="server" Text="Empty Cart" OnClick="emptyCart" />
            </asp:Panel>
        </ContentTemplate>
    </asp:UpdatePanel>


</asp:Content>

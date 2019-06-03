<%@ Page Title="" Language="C#" MasterPageFile="~/Site1.Master" AutoEventWireup="true" CodeBehind="recoverPasswordPage.aspx.cs" Inherits="bookstores.recoverPasswordPage" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="left" runat="server">
</asp:Content>
<asp:Content ID="Content3" ContentPlaceHolderID="content" runat="server">
    <table>
        <tr>
            <td>
                <asp:Label ID="Label2" runat="server" Text="Username :"></asp:Label>
            </td>
            <td>
                <asp:TextBox ID="uname" runat="server"></asp:TextBox></td>
        </tr>
        <tr>
            <td>
                <asp:Label ID="Label1" runat="server" Text="Insert your phone : "></asp:Label>
            </td>
            <td>
                <asp:TextBox ID="phone" runat="server"></asp:TextBox></td>
        </tr>
        <tr>
            <td>
                <asp:Button ID="recover" runat="server" Text="Recover" OnClick="Recover" /></td>
        </tr>
    </table>
</asp:Content>

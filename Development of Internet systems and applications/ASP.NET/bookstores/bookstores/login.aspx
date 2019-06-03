<%@ Page Title="" Language="C#" MasterPageFile="~/Site1.Master" AutoEventWireup="true" CodeBehind="login.aspx.cs" Inherits="bookstores.login" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="left" runat="server">
</asp:Content>
<asp:Content ID="Content3" ContentPlaceHolderID="content" runat="server">
    <asp:Label ID="console" runat="server" Text=""></asp:Label>
    <asp:Table ID="loginTable" runat="server">
        <asp:TableRow>
            <asp:TableCell>Username :</asp:TableCell>
            <asp:TableCell>
                <asp:TextBox ID="username" runat="server"></asp:TextBox>
            </asp:TableCell>
        </asp:TableRow>
        <asp:TableRow>
            <asp:TableCell>Password :</asp:TableCell>
            <asp:TableCell>
                <asp:TextBox ID="passwd" runat="server" TextMode="Password"></asp:TextBox>
            </asp:TableCell>
        </asp:TableRow>
    </asp:Table>
    <asp:Button ID="loginB" runat="server" Text="Login" OnClick="LoginFunction" />
    <br />
    <table>
        <tr>
            <td>
                <asp:Label ID="Label1" runat="server" Text="Not a member ?"></asp:Label>
            </td>
            <td>
                <asp:Button class="btn btn-light" ID="Button1" runat="server" Text="Create an account" OnClick="Singup" /><br />
            </td>
        </tr>
        <tr>
            <td>
                <asp:Label ID="Label2" runat="server" Text="Forgot your Password ? "></asp:Label></td>
            <td>
                <asp:Button ID="Button2" runat="server" Text="Recover password" class="btn btn-light" OnClick="recoverPassword" />
            </td>
        </tr>
    </table>
</asp:Content>
<%@ Page Title="" Language="C#" MasterPageFile="~/Site1.Master" AutoEventWireup="true" CodeBehind="singup.aspx.cs" Inherits="bookstores.singup" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
    <style type="text/css">
        .auto-style1 {
            width: 187px;
        }

        .auto-style2 {
            height: 37px;
        }

        .auto-style3 {
            width: 187px;
            height: 37px;
        }

        .auto-style4 {
            height: 39px;
        }

        .auto-style5 {
            margin-left: 40px;
        }
    </style>
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="left" runat="server">
</asp:Content>
<asp:Content ID="Content3" ContentPlaceHolderID="content" runat="server">

    <table id="personalInfoForSingUp">
        <tr>
            <td>
                <h2><b>
                    <asp:Label ID="Label4" runat="server" Text="Personal Info"></asp:Label>
                </b>
                </h2>
            </td>
        </tr>
        <tr>
            <td>
                <asp:Label ID="Label1" runat="server" Text="First Name :"></asp:Label></td>

            <td>

                <asp:TextBox ID="Fname" runat="server"></asp:TextBox>
            </td>
            <td>
                <asp:RequiredFieldValidator ID="FnameValidator" runat="server" ErrorMessage="Please enter your Name" ControlToValidate="Fname" Text="*"></asp:RequiredFieldValidator></td>
        </tr>
        <tr>
            <td>
                <asp:Label ID="Label2" runat="server" Text="Last Name :"></asp:Label></td>
            <td>
                <asp:TextBox ID="Lname" runat="server"></asp:TextBox>

            </td>
            <td>
                <asp:RequiredFieldValidator ID="LnameValidator" runat="server" ErrorMessage="Please enter your last name" ControlToValidate="Lname" Text="*"></asp:RequiredFieldValidator></td>
        </tr>
        <tr>
            <td>
                <asp:Label ID="Label5" runat="server" Text="Phone :"></asp:Label></td>
            <td>

                <asp:TextBox ID="phone" runat="server"></asp:TextBox>


            </td>
            <td>
                <asp:RequiredFieldValidator ID="phoneValidator" runat="server" ErrorMessage="Please enter your phone" Text="*" ControlToValidate="phone"></asp:RequiredFieldValidator>
                <asp:RegularExpressionValidator ID="phoneRegularValidation" runat="server" ControlToValidate="phone" ErrorMessage="Phone is invalid" ValidationExpression="^[+]*[(]{0,1}[0-9]{1,4}[)]{0,1}[-\s\./0-9]*$"></asp:RegularExpressionValidator>
            </td>
        </tr>
        <tr>
            <td>
                <hr />
            </td>
        </tr>
        <tr>
            <td>
                <h2>
                    <b>
                        <asp:Label ID="Label3" runat="server" Text="Address"></asp:Label>
                    </b>
                </h2>
            </td>
        </tr>
        <tr>
            <td>
                <asp:Label ID="Label6" runat="server" Text="Address Number :"></asp:Label></td>
            <td>

                <asp:TextBox ID="addressNumber" runat="server"></asp:TextBox>


            </td>
            <td>
                <asp:RequiredFieldValidator ID="addressnumberValidator" runat="server" ErrorMessage="Please enter your address number" Text="*" ControlToValidate="addressNumber"></asp:RequiredFieldValidator>
                <asp:RegularExpressionValidator ID="RegularExpressionValidator4" runat="server" ControlToValidate="addressNumber" ErrorMessage="Only Numbers" ValidationExpression="\d{1,4}"></asp:RegularExpressionValidator>
            </td>
        </tr>
        <tr>
            <td>
                <asp:Label ID="Label7" runat="server" Text="Address Street :"></asp:Label></td>
            <td>
                <asp:TextBox ID="addressStreet" runat="server"></asp:TextBox>


            </td>
            <td>
                <asp:RequiredFieldValidator ID="addressstreetValidator" runat="server" ErrorMessage="Please enter your Street Address" Text="*" ControlToValidate="addressStreet"></asp:RequiredFieldValidator></td>
        </tr>
        <tr>

            <td>
                <asp:Label ID="Label8" runat="server" Text="City :"></asp:Label>
            </td>
            <td>

                <asp:TextBox ID="city" runat="server"></asp:TextBox>


            </td>
            <td>
                <asp:RequiredFieldValidator ID="cityValidator" runat="server" ErrorMessage="Please Enter you City Address" Text="*" ControlToValidate="city"></asp:RequiredFieldValidator></td>
        </tr>
        <tr>
            <td>
                <asp:Label ID="Label9" runat="server" Text="State :"></asp:Label></td>
            <td>

                <asp:TextBox ID="state" runat="server"></asp:TextBox>


            </td>
            <td>
                <asp:RequiredFieldValidator ID="stateValidator" runat="server" ErrorMessage="Please Enter your State" Text="*" ControlToValidate="state"></asp:RequiredFieldValidator></td>
        </tr>
        <tr>
            <td>
                <hr />
            </td>
        </tr>
        <tr>
            <td>
                <h2><b>Account</b></h2>
            </td>
        </tr>

    </table>
    <div style="width: initial; float: left;">
        <table>
            <tr>
                <td>
                    <asp:Label ID="Label10" runat="server" Text="Username :"></asp:Label></td>
                <td>
                    <asp:TextBox ID="uname" runat="server"></asp:TextBox></td>
                <td>
                    <asp:RequiredFieldValidator ID="unameValidator" runat="server" ErrorMessage="Please Enter your Username" Text="*" ControlToValidate="uname"></asp:RequiredFieldValidator>
                    <asp:ScriptManager ID="ScriptManager2" runat="server"></asp:ScriptManager>
                    <asp:UpdatePanel ID="UpdatePanel2" runat="server">
                        <ContentTemplate>
                            <asp:Button ID="Button2" runat="server" Text="Check Avalability" OnClick="availability" class="btn btn-light" />
                            <asp:Image ID="user" runat="server" Style="max-width: 25px; max-height: 25px;"></asp:Image>
                        </ContentTemplate>
                    </asp:UpdatePanel>
                </td>
            </tr>

            <tr>
                <td class="auto-style4">
                    <asp:Label ID="Label11" runat="server" Text="Password :"></asp:Label>
                </td>
                <td class="auto-style4">
                    <asp:TextBox ID="passwd" runat="server" TextMode="Password"></asp:TextBox>
                </td>
                <td class="auto-style4">
                    <asp:RequiredFieldValidator ID="passwdValidator" runat="server" ErrorMessage="Please Enter your Password" Text="*" ControlToValidate="passwd"></asp:RequiredFieldValidator>
                    <asp:RegularExpressionValidator ID="RegularExpressionValidator6" runat="server" ControlToValidate="passwd" ErrorMessage="password should contain at least on number , one lowercase letter and one Uppercase letter" ValidationExpression="^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)[a-zA-Z\d]{8,}$"></asp:RegularExpressionValidator>
                </td>
            </tr>
            <tr>
                <td>
                    <asp:Label ID="Label13" runat="server" Text="Confirm Password : "></asp:Label></td>
                <td>
                    <asp:TextBox ID="passwdConfirmation" runat="server" TextMode="Password"></asp:TextBox></td>
                <td class="auto-style5">
                    <asp:RequiredFieldValidator ID="passwdConfirmationValidation" runat="server" ErrorMessage="Please confirm your password" Text="*" ControlToValidate="passwdConfirmation"></asp:RequiredFieldValidator>
                    <asp:CompareValidator ID="passwdConfirmationCompare" runat="server" ControlToCompare="passwd" ControlToValidate="passwdConfirmation" ErrorMessage="Passwords do not match"></asp:CompareValidator>
                </td>
            </tr>
            <tr>

                <td>
                    <asp:Label ID="Label12" runat="server" Text="Email : "></asp:Label></td>
                <td>
                    <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox></td>
                <td>
                    <asp:RequiredFieldValidator ID="emailValidator" runat="server" ErrorMessage="Prease Enter your Email" Text="*" ControlToValidate="TextBox1"></asp:RequiredFieldValidator>
                    <asp:RegularExpressionValidator ID="RegularExpressionValidator7" runat="server" ControlToValidate="TextBox1" ErrorMessage="Email is invalid" ValidationExpression="\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*"></asp:RegularExpressionValidator>
                </td>
            </tr>
            <tr>
                <td>
                    <asp:Button ID="Button1" runat="server" Text="SignUp" OnClick="Singup" /></td>
            </tr>
        </table>
    </div>
</asp:Content>

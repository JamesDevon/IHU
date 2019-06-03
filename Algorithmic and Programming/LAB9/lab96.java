class PasswordValidate {
 public static void main(String[] args) {
String Password="123456789kljmno"; //το σωστό password
String validPassw = "123456789kljΜno"; //αυτό που δίνει ο χρήστης
for (int i=0;i<Password.length();i++) {
 char c = Password.charAt(i); //ο χαρακτήρας της κάθε θέσης
 if (validPassw.indexOf(c)== -1) //ο έλεγχος του χαρακτ. κάθε θέσης
System.out.println("Lathos xaraktiras [)"+c+"] sth thesi "+i);
 }
 }
}
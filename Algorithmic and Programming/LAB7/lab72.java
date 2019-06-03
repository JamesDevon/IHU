import java.io.*;
class Menu {
 public static void main(String args[]) throws IOException {
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 String str;
 int choice;
 do {
 System.out.println("Menu:");
 System.out.println(" 1 – Epilogi A ");
 System.out.println(" 2 – Epilogi B ");
 System.out.println(" 3 – Epilogi C ");
 System.out.println(" 4 – Epilogi D ");
 System.out.println(" 5 – Epilogi E ");
 System.out.print("Epelexe mia epilogi (1-5): ");
 str = br.readLine();
 choice = Integer.parseInt(str);
 } while(choice < 1 || choice > 5);
 System.out.println("\n");
 switch(choice) {
	 case 1:
 System.out.println("Epilogi A");
 System.out.println("H epilogi sou einai 1");
 break;
 case 2:
 System.out.println("Epilogi B");
 System.out.println("H epilogi sou einai 2");
 break;
 case 3:
 System.out.println("Epilogi C");
 System.out.println("H epilogi sou einai 3");
 break;
 case 4:
 System.out.println("Epilogi D");
 System.out.println("H epilogi sou einai 4");
 break;
 case 5:
 System.out.println("Epilogi E");
 System.out.println("H epilogi sou einai 5");
 break;
 }
 System.out.println("Telos Programmatos.....");
 }
}
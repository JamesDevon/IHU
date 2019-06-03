import java.io.*;
import java.util.*;
class Lab1 {
 public static void main(String[] args) throws IOException {
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 ArrayList<String> myArr = new ArrayList<String>();
 myArr.add("Mykonos");
 myArr.add("Skiathos");
 myArr.add("Kriti");
 myArr.add("Rodos");
 myArr.add("Thasos");
 myArr.add("Mytilini");
 myArr.add("Samos");
 myArr.add("Halkidiki");
 myArr.add("Paros");
 myArr.add("Santorini");
 System.out.println("Tyhaia Epilogi Diakopon");
 System.out.println("Dose to onoma sou");
 String name = br.readLine();
 Integer nameLength = name.length();
 if (nameLength == 0)
 {
 System.out.println("Den edoses onoma");
 return;}
 Integer vacationIndex = nameLength % myArr.size();
 System.out.println("\nTo onoma sou einai "+name+", me plithos haraktirvn " +
 nameLength + " \n" + "gia ayto sou proteino na pas " + myArr.get(vacationIndex));
 }
 }

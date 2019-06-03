import java.io.*;
class ReadChars {
 public static void main(String args[]) throws IOException
 {
 char c;
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 System.out.println("Input characters, 'q' to quit.");
 // Είσοδος χαρακτήρων
 do {
 c = (char) br.read();
 System.out.println(c);
 } while(c != ‘q’);
 }
}
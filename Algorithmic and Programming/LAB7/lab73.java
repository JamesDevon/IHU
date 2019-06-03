import java.io.*;
class ReadLines {
public static void main(String args[]) throws IOException {
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 String str;
 System.out.println("Dose grammes keimenou");
 System.out.println("Pliktrologise Telos - gia telos eisodou");

 do {
 str = br.readLine();
 System.out.println(str);
 } while(!str.equals("Telos"));
 }
}
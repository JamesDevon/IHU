import java.util.Vector;
public class FindVector {
 public static void main(String args[]) {
 String data[] = { "Me", "aresei", "poly", "h", "java", "!"};
 Vector v = new Vector();
 for (int i = 0, n = data.length; i < n; i++) {
 v.add(data[i]);
 }
 System.out.println(v);
 System.out.println("Yparxei to ‘Me’ ?: " + v.contains("Me"));
 System.out.println("Yparxei to ‘!’ ?: " + v.contains(“!”));
 System.out.println("Yparxei to Hello ?: " + v.contains("Hello"));
 System.out.println("Se pia thesi vrisketai to poly ?: " + v.indexOf("poly"));
 System.out.println("Se pia thesi vrisketai h lexi java ?: " + v.indexOf("java"));
 System.out.println("Se pia thesi vrisketai h lexi aresei apo to telos: "
 + v.lastIndexOf("aresei"));
 }
}
import java.util.Vector;
public class Test1 {
 public static void main(String[] args) {
 Vector A = new Vector();
 A.addElement(new Integer(10));
 A.addElement(new Integer(20));
 Vector B = (Vector) A.clone();
 Vector C = A;
 System.out.println("Arxikoi vectors - A (arhikos), B (me tin clone), C (me assignment) ");
 System.out.println();
 System.out.println("A = " + A + ", B = " + B + ", C = " + C);
 System.out.println("");
 //
 // Allagi tou A
 //
 A.setElementAt(new Integer(20),0);
 //
 System.out.println("Allagi tou A; O B (klonos) menei ametavlitos; O C allazei (assignment) ");
 System.out.println("A = " + A + ", B = " + B + ", C = " + C);
 System.out.println("");
 //
 // Allagi tou B
 //
 B.setElementAt(new Integer(30),0);
 //
 System.out.println("Allagi tou B; A kai C menoun ametablita");
 System.out.println("A = " + A + ", B = " + B + ", C = " + C);
 System.out.println("");
 //
 // Allagi tou C
 //
 C.setElementAt(new Integer(40),0);
 //
 System.out.println("Allagi tou C; O B menei ametalitos ; O A allazei");
 System.out.println("A = " + A + ", B = " + B + ", C = " + C);
 System.out.println("");
 }
}
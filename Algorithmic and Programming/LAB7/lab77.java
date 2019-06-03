import java.io.*;
class Polyo {
 public static void main (String[] args ) throws IOException {
 BufferedReader userin = new BufferedReader(new InputStreamReader(System.in) );
 String xChars; // Η είσοδος χαρ. Από τον χρήστη
 double x; // Ο άγνωστος x του πολυωνύμου
 double result; // Το αποτέλεσμα του πολυωνύμου
 String response = "o"; // "ο" or "n"

 while ( response.equals( "o" ) ) {
 // Είσοδος του x
 System.out.println("Dose timi gia to x: ") ;
 xChars = userin.readLine() ;
 x = (Double.valueOf( xChars ) ).doubleValue();
 // Υπολογισμός του πολυωνύμου
 result =7*x*x*x - 3*x*x + 4*x - 12;
 // Εμφάνιση του αποτελέσματος
 System.out.println("H timi toy polyonymou x = " + x + " einai : " + result + "\n" ) ;
 // Συνέχεια ναι | όχι
 System.out.println("Telos (o | n)?");
 response = userin.readLine();
 }
 }
}
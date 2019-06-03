import java.io.*;
class Stars {
 public static void main (String[] args ) throws IOException {
 int numRows; // αριθμός των γραμμών
 int numStars; // αριθμός των αστεριών ανά γραμμή
 int row ; // τρέχον αριθμός γραμμής
 int star; // πλήθος αστεριών για την τρέχουσα γραμμή
 BufferedReader userin = new BufferedReader (new InputStreamReader(System.in));
 String inputData;
 // είσοδος δεδομένων
 System.out.print("Poses grammes? " );
 inputData = userin.readLine();
 numRows = Integer.parseInt( inputData );
 System.out.print( "Posa asterakia sti grammi? " );
 inputData = userin.readLine();
 numStars = Integer.parseInt( inputData );
 row = 1;
 while ( row <= numRows ) {
 star = 1;
 while ( star <= numStars ) {
 System.out.print("*");
 star = star + 1;
 }
 System.out.println(); // για αλλαγή γραμμής
 row = row + 1;
 }
 }
}

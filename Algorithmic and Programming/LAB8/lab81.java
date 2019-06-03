import java.io.* ;
class PinakasArithmon {
 public static void main ( String[] args ) throws IOException {
 BufferedReader inData = new BufferedReader(new InputStreamReader(System.in));
 int[] array;
 // είσοδος του πλήθους κελιών
 System.out.print( "Posa kelia na exei o pinakas; " );
 int size = Integer.parseInt(inData.readLine());
 // ορισμός του πίνακα
 array = new int[size];
 // είσοδος των δεδομένων
 for(int i=0; i < array.length; i++) {
 System.out.print( "Dose ena akeraio: " );
 array[i] = Integer.parseInt(inData.readLine());
 }
 // εμφάνιση των αποτελεσμάτων
 for(int i=0; i < array.length; i++ ) {
 System.out.println( "Keli[ " + i + " ] = " + array[i]);
 } } }
import java.io.* ;
class NumbersSqrt {
 public static void main(String[] args)throws IOException {
 String chars;
 double x;
 BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
 do {
 System.out.print("Dose ena pragmatiko arithmo: ");
 chars = stdin.readLine();
 x = (Double.valueOf(chars)).doubleValue();
 System.out.println("Tetragoniki riza tou " + x + " einai " + Math.sqrt( x ));
 System.out.print("Synexeia ? (nai | oxi)--> ");
 chars = stdin.readLine();
 } while ( chars.equals( "nai" ) );
 }
}

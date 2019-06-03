class AMethod {
 // εμφάνιση των στοιχείων από τιμή-start μέχρι-end.
 void printRange ( int[] x, int start, int end ) {
 for ( int index=start; index <= end ; index++ )
 System.out.print( x[index] + " " );
 System.out.println(); }}
 class MyArrayDemo {
 public static void main(String[] args) {
 AMethod operate = new AMethod();
 int[] myarr1 = {14, 1, -21, 13, 8, -7, 35, 80} ;
 // εμφάνιση πέντε στοιχείων των: 1, -21, 13, 8, -7.
 operate.printRange(myarr1, 1, 5 );
}} 
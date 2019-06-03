import java.io.*;
class SumOddsEvens {
public static void main (String[] args) throws IOException {
 BufferedReader userin = new BufferedReader (new InputStreamReader(System.in));
 String inputData;
 int N, sumAll = 0, sumEven = 0, sumOdd = 0;
 System.out.println( "Dose to plithos tvn arithmvn:" );
 inputData = userin.readLine();
 N = Integer.parseInt( inputData );
 int count = 0 ;
 while (count <= N ) {
 sumAll = sumAll + count ;
 if ( count % 2 == 0 )
 sumEven = sumEven + count ;
 else
 sumOdd = sumOdd + count ;
 count = count + 1 ;
 }
 System.out.print ( "Synoliko athroisma: " + sumAll );
 System.out.print ( "\tAthroisma zygvn: " + sumEven );
 System.out.println( "\tAthroisma monvn: " + sumOdd );
 }
}
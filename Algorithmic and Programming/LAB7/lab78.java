class FahrToCelsius {
 public static void main (String args[]) {
 double fahr, celsius;
 double lower, upper, step;
 // αρχική τιμή τις λίστας τιμών Φαρενάϊτ
 lower = 0.0;
 // τελική τιμή τις λίστας τιμών Φαρενάϊτ
 upper = 300.0;
 // βήμα των μετατροπών
 step = 20.0;
 fahr = lower;
 while (fahr <= upper) {
 celsius = (5.0 / 9.0) * (fahr - 32.0);
 System.out.print(fahr + " ");
 System.out.printf("%1.2f", celsius);
 System.out.println();
 fahr = fahr + step;
 }
 }
} 
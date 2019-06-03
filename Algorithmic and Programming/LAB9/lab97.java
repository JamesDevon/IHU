class StringBufferDemo1 {
 public static void main(String[] args) {
 //synenvsi string
 String myString1 = "I" + " " + "love "+"Java";
 System.out.println(myString1);
 //me ton StringBuffer, kai prosthesi stoixeivn
 StringBuffer myString2 = new StringBuffer();
 myString2.append("I");
 myString2.append(" ");
 myString2.append("love ");
 myString2.append("Java");
 //Metatropi tou periexomenou tou StringBuffer se String
 String s = myString2.toString();
 System.out.println(s);
 // H idia xrisi alla me pio sympiknomeno tropo
 StringBuffer myString3 = new StringBuffer().append("I").
 append(" ").append("love ").append("Java");
 System.out.println(myString3.toString());
 }
}
class FindΑWord {
 public static void main(String[] args) {
 String s="I love java java java"; //η συμβολοσειρά
 String s1="java"; //η λέξη που ψάχνουμε
 int len = s1.length(); //το μήκος της λέξης που ψάχνουμε
 int result = 0;
 if (len > 0) { //ψάχνουμε μόνο αν υπάρχει κείμενο στη συμβολοσειρά
 int start = s.indexOf(s1); //βρίσκουμε την αρχή (θέση) της λέξης μέσα στη συμβολοσειρά
 while (start != -1) { //επανάληψη για εύρεση της λέξης
 result++; //ο μετρητής επανάληψης της λέξης
 start = s.indexOf(s1, start+len); //κάθε φορά από το σημείο που ξεκινά η λέξη + μήκος της
 }
 }
 int i=result; //το αποτέλεσμα
 System.out.println("H lexi " + s1 + " emfanizetai " + result + " fores");
}
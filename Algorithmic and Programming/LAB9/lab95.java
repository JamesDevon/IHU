class ExtractWords {
 public static void main (String[] args) {
	 char keno = ' ';
 int i, arChar, arxi, telos;
 String lexi;
 String protasi = "H protasi ayti exei epta diaforetikes lexeis";
 arChar = protasi.length();
 i = 0;
 //ψάχνουμε να βρούμε την αρχή και το τέλος της κάθε λέξης, ώστε με την
 //substring() να τις ξεχωρίσουμε. Κλειδί του αλγόριθμου το κενό διάστημα.
 while ( i < arChar ) {
 //βρίσκουμε την αρχή της λέξης, μετρώντας τα κενά διαστήματα
 while (protasi.charAt(i) == keno) {
 i++;
 }
 //κρατάμε την αρχή της λέξης
 arxi = i;
 //βρίσκουμε το τέλος της λέξης
 while (i < arChar && protasi.charAt(i) != keno) { //i < arChar, sta oria tis protasis
 i++;
 }
 //κρατάμε το τέλος της λέξης
 telos = i;
 if (arxi != telos) {
 //βρήκαμε τη λέξη και την εξάγουμε από την πρόταση με την substring()
 lexi = protasi.substring(arxi, telos);
 System.out.println(lexi);
 }
 }
 }
}
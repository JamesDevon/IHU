class MetrisiFonienton {
 public static void main(String[] args) {
 char gramma;
 String name = "Nikos Nikas";
 int arXaraktiron = name.length();
 int metritis = 0;
for (int i = 0; i < arXaraktiron; i++) {
 gramma = name.charAt(i);
if (gramma == 'A' || gramma == 'a' || gramma == 'E' || gramma == 'e' ||
 gramma == 'I' || gramma == 'i' || gramma == 'O' || gramma == 'o' ||
 gramma == 'U' || gramma == 'u') {
metritis++;
 }
 }
 System.out.println("To onoma: " + name + " exei " + metritis + " fonienta");
 }
 }
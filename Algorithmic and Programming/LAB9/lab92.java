class AntikatastasiFonienton {
 public static void main(String[] args) {
 StringBuffer sb;
 String s="Nikas Nikos";
 int len;
 char gramma;
 sb = new StringBuffer(s);
 len = sb.length();
 for (int i = 0; i < len; i++) {
 gramma = sb.charAt(i);
 if (gramma == 'A' || gramma == 'a' || gramma == 'E' || gramma == 'e' ||
 gramma == 'I' || gramma == 'i' || gramma == 'O' || gramma == 'o' ||
 gramma == 'U' || gramma == 'u') {
 sb.setCharAt(i, 'a');
 }
 }
 System.out.println( "To arxiko String: " + s + "\n");
 System.out.println( "To teliko String: " + sb );
 }
}
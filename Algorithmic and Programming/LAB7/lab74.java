class ParseDemo {
 public static void main(String args[]) throws IOException {
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 String str;
 int i;
 int sum=0;

 System.out.println("Dose akeraious, 0 gia telos");
 do {
 str = br.readLine();
 try {
 i = Integer.parseInt(str);
 } catch(NumberFormatException e) {
 System.out.println("Lathos eisodos…");
 i = 0;
 }
 sum += i;
 System.out.println("To athroisma einai: " + sum);
 } while(i != 0);
 }
}
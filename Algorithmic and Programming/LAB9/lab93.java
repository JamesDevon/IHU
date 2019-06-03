class ReverseAnyString {
public static void main(String[] args) {
 String myString = "I Love Java";
 StringBuffer sb = new StringBuffer();
 for (int i = myString.length() - 1; i >= 0; i--)
 sb.append(myString.charAt(i));
 String s2=sb.toString();
 System.out.println(s2);
}
}
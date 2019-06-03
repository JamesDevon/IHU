class Test {
public static boolean equalsArray(int[] a, int[] b) {
if (a.length != b.length)
 return false;
else {
 int i = 0;
 while (i < a.length){
 if (a[i] != b[i]) return false;
 i++;
}
}
return true;
}
}
class EleghosPinakon {
 public static void main(String[] args) {
 int [] x={1,2,3,4,5,6,7,8,9};
 int [] y={1,2,3,4,5,6,7,8,9};
 boolean t = Test.equalsArray(x, y);
 System.out.println(t);
}
}
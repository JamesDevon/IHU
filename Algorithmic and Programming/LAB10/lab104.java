import java.util.*;
class ArrayListExample2 {
 public static void main(String[] args) {
 ArrayList arrayList = new ArrayList();
 arrayList.add("6");
 arrayList.add("2");
 arrayList.add("9");
 arrayList.add("7");
 arrayList.add("5");
 arrayList.add("1");
 arrayList.add("3");
 arrayList.add("8");
 arrayList.add("4");
 boolean search = arrayList.contains("9");
 System.out.println("Periehei h lista to stoixeio 9; " + search);
 int i = arrayList.indexOf("4");
 if(i == -1)
 System.out.println("H lista den periehei to stoiheio 4 ");
 else
 System.out.println("H lista periehei to stoiheio 4 stin thesi: " + i);
 }
}
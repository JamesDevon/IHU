import java.util.*;
class ArrayListExample1 {
public static void main(String[] args) {
 ArrayList arrayList = new ArrayList();
 //prosthiki stoiheivn stin Arraylist me tin methodo Add()
 arrayList.add("6");
 arrayList.add("2");
 arrayList.add("9");
 arrayList.add("7");
 arrayList.add("5");
 arrayList.add("1");
 arrayList.add("3");
 arrayList.add("8");
 arrayList.add("4");
 System.out.println("H lista prin tin taxinomisi: "+arrayList);
 Collections.sort(arrayList);
 System.out.println("H lista meta tin taxinomisi: "+arrayList);
 }
 }
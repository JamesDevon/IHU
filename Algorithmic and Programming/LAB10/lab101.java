import java.util.ArrayList;
class ArrayListExample {
 public static void main(String[] args) {
 ArrayList arrayList = new ArrayList();
 //prosthiki stoiheivn stin Arraylist me tin methodo Add()
 arrayList.add("1");
 arrayList.add("2");
 arrayList.add("3");
 System.out.println("H lista me prosthiki 3-stoiheivn: "+arrayList);
 //eisagvgi stoiheiou se thesi
 arrayList.add(1,"EISAGOMENO STOIHEIO");
 System.out.println("H lista meta tin eisagogi stoiheioy: "+arrayList);
 //diagrafi stoiheiou se thesi
 Object obj = arrayList.remove(1);
 System.out.println("H lista meta tin diagrafi stoiheioy: "+arrayList);
 //antikatastasi stoiheiou se thesi
arrayList.set(1,"ANTIKATASTASI STOIHEIOY");
 System.out.println("H lista meta tin antikatastasi stoiheioy: "+arrayList);
 }
 }
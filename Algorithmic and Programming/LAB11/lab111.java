import java.util.*;
public class VectorDemo1{
 public static void main(String[] args){
 Vector<Object> vector = new Vector<Object>();
 int primitiveType = 20;
 Integer wrapperType = new Integer(30);
 String str = "Nikos";
 vector.add(primitiveType);
 vector.add(wrapperType);
 vector.add(str);
 vector.add(2, new Integer(50));
 System.out.println("Ta stoiheia tou vector: " + vector);
 System.out.println("To megethos tou vector: " + vector.size());
 System.out.println("Ta stoiheia sti thesi 2: " + vector.elementAt(2));
 System.out.println("To 1o - stoiheio einai: " + vector.firstElement());
 System.out.println("To teleytaio stoiheio einai: " + vector.lastElement());
 System.out.println("________________________________________________________");
 vector.removeElementAt(2);
 Enumeration e=vector.elements();
 System.out.println("Meta tin Diagrafi tou 2ou-stoiheiou: " + vector);
 System.out.println("Ta stoiheia tou vector: " + vector);
 while(e.hasMoreElements()){
 System.out.println("Ta stoiheia einai: " + e.nextElement());
 }
 }
}
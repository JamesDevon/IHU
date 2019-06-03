import java.util.*;
public class ExamplePinakes {
public static void MonodiastatosPinakasTyxaionArithmon() {
 int kelia=getRandom();
 System.out.println("Dhmiourgia Monodiastatou Pinaka "+ kelia + " kelivn");
 System.out.println("--------------------------------------------");
 int[] Pinakas = new int[kelia];
 for(int i=0;i<Pinakas.length;i++) Pinakas[i]=getRandom();
 System.out.println("Emfanisi tou Monodiastatou Pinaka ");
 for(int i=0;i<Pinakas.length;i++) System.out.println(" Keli[" + i + "] = "+ Pinakas[i]);
 System.out.println();
}
public static void DidiastatosPinakasTyxaionArithmon() {
 int x,y;
 x=getRandom();
 y=getRandom();
 System.out.println("Dhmiourgia Didiastatou Pinaka " + x + " * " + y + " = " + (x*y) + " kelivn");
 System.out.println("--------------------------------------------");
 int[][] Pinakas = new int[x][y];
 for(int i=0;i<x;i++)
 for(int j=0;j<y;j++) Pinakas[i][j]=getRandom();
 System.out.println("Emfanisi tou Didiastatou Pinaka ");
 for(int i=0;i<x;i++){
 for(int j=0;j<y;j++) System.out.println(" Keli[" + i + "]["+ j + "] = " + Pinakas[i][j]);
 System.out.println();}
}
private static int getRandom() {
 Random rand = new Random();
 return rand.nextInt(10); //int mexri to 10
}
public static void main(String[] args) {
 MonodiastatosPinakasTyxaionArithmon();
 DidiastatosPinakasTyxaionArithmon();
}
}

class Box {
 double width;
 double height;
 double depth;
 Box(double w, double h ,double d)
 {
width = w;
height = h;
depth = d;
 }
 public static double[] volume(Box a[]) {
 double Vol[] = new double[3];
 for(int i=0; i<3; i++) Vol[i]=a[i].width * a[i].height * a[i].depth;
 return Vol;
}}
class ArrayofBoxes {
 public static void main(String args[]) {
 Box pinakas[]=new Box[3];
 pinakas[0]= new Box(10, 20, 15);
 pinakas[1]= new Box(3, 6, 9);
 pinakas[2]= new Box(4, 5, 6);
 double Volumes[]=new double[3];
 Volumes=Box.volume(pinakas);
 for(int i=0; i<3; i++){
 System.out.println(" O ogkos tou box [" + i + "]" + " einai = "+ Volumes[i]); }
}}
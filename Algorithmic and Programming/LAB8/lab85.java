class PosoFPA {
 public static double[] YpologismosFPA(double[] arxikosPinakas, double syntelestis) {

 //βοηθητικός πίνακας
 double[] fpapinakas = new double[arxikosPinakas.length];
 int i;
 for (i = 0; i < arxikosPinakas.length; i++)
 fpapinakas[i] = arxikosPinakas[i] * syntelestis;
 return fpapinakas;
}
}
class TestYpologismosFPA {
 public static void main(String[] args) {
 double[] posa = {20.1, 35.4, 48.3, 5.8, 7.4, 9.2, 45.7, 56.2, 30.0, 68.1};
 double syntelestis=0.19;
 double posaFPA[] = new double[10];
 posaFPA = PosoFPA.YpologismosFPA(posa, syntelestis);
 for (int i = 0; i < posaFPA.length; i++) System.out.println("PosaFPA["+i+"]= "+posaFPA[i]);
 }
}
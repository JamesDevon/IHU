/*
 * @author user
 */
public class ThesiStathmeusis {
    //true == piasmeni thesi
   private boolean katastasi;
   private String wraEisodou;
   private String wraEksodou;
   private Oxima oxima;
   
   public ThesiStathmeusis(String wraEisodou, Oxima o,boolean b){
       this.wraEisodou = wraEisodou;
       this.oxima =o ;
       this.katastasi = b;
   }
   
   public boolean getKatastasi(){
       return this.katastasi;
   }
   
   public void setKatastasi(boolean k){
       this.katastasi = k;
   }
   
   public void setWraEksodou(String w){
       this.wraEksodou =w;
   }
   
   public Oxima getOxima(){
       return oxima;
   }
   
   public int getKostos(){
       int eksodos = Integer.parseInt(wraEksodou);
       int eisodos = Integer.parseInt(wraEisodou);
       return eksodos-eisodos;
   }
}

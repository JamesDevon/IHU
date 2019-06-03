import java.util.Date;
import java.text.*;

public class Foititis {
    String kinitoTilefono;
    String statheroTilefono;
    private int mathimaIndex = 0;
    private static int auxwnArithmos = 0;
    private String AM;
    private String onomatEpwnymo;
    private Date hmeromGennisis;
    // σύνδεση Φοιτητή με Εγγραφή
    private Eggrafi [] eggrafes = new Eggrafi[5];
    
    public Foititis(int etos, String onomatEpwnymo, Date hmeromGennisis) {
        auxwnArithmos+=1;
        // Δημιουργία αριθμού 4 ψηφίων
        DecimalFormat mf = new DecimalFormat("0000");
        String tempArithm = mf.format(auxwnArithmos);
        this.AM= (etos + tempArithm); 
        this.onomatEpwnymo = onomatEpwnymo;
        this.hmeromGennisis = hmeromGennisis;
    }
        
    public void addEggrafi(Date hm,String ak, Mathima m ){
        eggrafes[mathimaIndex] = new Eggrafi(hm,ak,m);
        mathimaIndex++;
    }
    
    public String toString() {
        StringBuffer sb = new StringBuffer(this.AM + " ");
        sb.append(this.onomatEpwnymo + " ");
        sb.append(dateToStr(this.hmeromGennisis));
        return sb.toString();
    }
    
    private String dateToStr(Date hmeromGennisis) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String str = df.format(this.hmeromGennisis);
        return str;
    }
    
    public Eggrafi [] doseYparxousesEggrafes(){
        boolean empty = true;
        for (Eggrafi x : eggrafes) {
            if (x != null) {
                empty=false;
                break;
            }
        }
        if(empty){
            return null;
        }else{
            return eggrafes;
        }
    }
    
    public void addMobilePhoneNumber(String p){
        this.kinitoTilefono = p;
    }
    public void addPhoneNumber(String p){
        this.statheroTilefono = p;
    }
    
    public void setHmerom(String insertedDate){
            this.hmeromGennisis = strToDate(insertedDate);
        }
    
    public String getHmerom(){
        try{
            return dateToStr(this.hmeromGennisis); 
        }catch(NullPointerException e){
            return null;
        }
        
   }
    
    private Date strToDate(String date){
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date str =null;
        try{
            str = df.parse(date);
        }catch(ParseException e){
        }
        return str;
    }
         
}
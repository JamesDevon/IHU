import java.util.Date;
import java.text.*;
//import MyDateLib.java;

public class Foititis {
    
    private static int auxwnArithmos = 0;
    private String AM;
    private String onomatEpwnymo;
    private Date hmeromGennisis;
    
    public Foititis(int etos, String onomatEpwnymo, Date hmeromGennisis) {
        auxwnArithmos+=1;
        // Δημιουργία αριθμού 3 ψηφίων
        DecimalFormat myFormatter = new DecimalFormat("000");
        String tempArithm = myFormatter.format(auxwnArithmos);
        this.AM= (etos + tempArithm); 
        this.onomatEpwnymo = onomatEpwnymo;
        this.hmeromGennisis = hmeromGennisis;
    }
        
    public String toString() {
        StringBuffer sb = new StringBuffer(this.AM + " ");
        sb.append(this.onomatEpwnymo + " ");
        try{
            sb.append(dateToStr(this.hmeromGennisis));
        }catch(NullPointerException e){
            sb.append("No Date Found");
        }
        return sb.toString();
    }
    
    private String dateToStr(Date hmeromGennisis) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String str = df.format(this.hmeromGennisis);
        return str;
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
    
    public String getName(){
        String [] name = this.onomatEpwnymo.split("\\s+");
        return name[1];
    }
    
    public void setName(String newName){
        String [] name = this.onomatEpwnymo.split("\\s+");
        name[1] = newName;
        StringBuffer sb = new StringBuffer(name[0] + " ");
        sb.append(name[1]);
        this.onomatEpwnymo = sb.toString();
    }
    
    public String getAM(){
        return this.AM;
    }
    
    public String getFullName(){
        return this.onomatEpwnymo;
    }
}

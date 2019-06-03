import java.util.Date;
import java.text.*;

public class Foititis {
    
    private static int auxwnArithmos = 0;
    private String AM;
    private String onomatEpwnymo;
    private Date hmeromGennisis;
    
    public Foititis(int etos, String onomatEpwnymo, Date hmeromGennisis) {
        auxwnArithmos+=1;
        // Δημιουργία αριθμού 3 ψηφίων
        DecimalFormat mf = new DecimalFormat("000");
        String tempArithm = mf.format(auxwnArithmos);
        this.AM= (etos + tempArithm); 
        this.onomatEpwnymo = onomatEpwnymo;
        this.hmeromGennisis = hmeromGennisis;
    }
    @Override    
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
    
    public String getSurName(){
        String[] name;
        name = this.onomatEpwnymo.split("\\s+");
        return name[0];
    }
    
    public String getAM(){
        return this.AM;
    }
}

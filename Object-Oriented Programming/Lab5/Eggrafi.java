import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Eggrafi {
    private Date hmeromEggrafis;
    private String akadExamino;
    private float vathmos;
    private Mathima mathima;
    
    public Eggrafi(Date hm, String ak, Mathima m ,Eggrafi e){
        this.hmeromEggrafis = hm;
        this.akadExamino = ak;
        this.mathima = m;
        this.mathima.addEggrafi(e);
    }
    
    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer(dateToStr(this.hmeromEggrafis)+" ");
        sb.append(this.akadExamino+" ");
        sb.append(this.mathima.toString()+" ");
        if(this.vathmos!=0.0){
            sb.append(this.vathmos);
        }
        return sb.toString();
    }
    
    private String dateToStr(Date hm) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String str = df.format(hm);
        return str;
    }
    
    public Mathima getMathima(){
        return this.mathima;
    }
    
    public float getVathmo(){
        return this.vathmos;
    }
    
    public void addVathmos(float v){
        this.vathmos = v;
    }
}

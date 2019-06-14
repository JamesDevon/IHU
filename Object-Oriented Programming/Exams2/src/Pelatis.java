import java.util.ArrayList;
/**
 *
 * @author James
 */
public class Pelatis {
    private int kwdikos;
    private String onoma;
    private double upoloipo;
    private ArrayList<Synalagi> synalages= new ArrayList<>();
    
    public Pelatis(int k, String o, double y){
        this.kwdikos = k;
        this.onoma=o;
        this.upoloipo = y;
    }
    
    public void addSynalagi(Synalagi s){
     synalages.add(s);
    }
    
    public void agorazei(Metoxi m, int temaxia, Synalagi s)throws InsufficientBalanceExteption{
            if(s instanceof Agora){
                if(temaxia*m.getTimi()>upoloipo){
                throw new InsufficientBalanceExteption("Ανεπαρκής Υπολοιπο");
                }else{
                    Agora a = (Agora)s;
                    upoloipo = a.transaction(temaxia, upoloipo);
                }
            }else if(s instanceof Polisi){
                Polisi p = (Polisi)s;
                upoloipo = p.transaction(temaxia, upoloipo);
            }
    }
    @Override
    public String toString(){
        return "Όνομα  : "+this.onoma+" Υπόλοιπο : "+this.upoloipo+"\nΣυνναλαγη : "+synalages.get(synalages.size()-1).toString();
    }
}

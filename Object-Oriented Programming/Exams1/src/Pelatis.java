import java.util.ArrayList;

/**
 *
 * @author James
 */
public class Pelatis {
    private int afm;
    private String onomatEponumo;
    private ArrayList<TrapezikosLogariasmos> logariasmoi = new ArrayList<>(); 
    
    public Pelatis(int a, String o){
        this.afm =a;
        this.onomatEponumo=o;
    }
    
    public void createAccount(TrapezikosLogariasmos t){
        logariasmoi.add(t);
    }
    
    public void analipsoi(double poso, String kwdikos){
        for(int i=0; i<logariasmoi.size(); i++){
            if(logariasmoi.get(i).getKwdiko().equals(kwdikos)){
                logariasmoi.get(i).analipsoi(poso);
            }
        }
    }
    
    public double getYpoloipoLogariasmon(){
        double yp=0;
        for(TrapezikosLogariasmos t : logariasmoi){
            yp+=t.getYpoloipo();
        }
        return yp;
    }
}

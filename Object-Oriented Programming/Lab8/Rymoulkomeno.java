/*
 * @author James
 */
public class Rymoulkomeno {
    
    private int varos;
    
    public Rymoulkomeno(int v){
        this.varos =v;
    }
    
    public void rymoulkitaiApo(Oxima o){
        System.out.print("Το ρυμουλκούμενο "+this.getClass().getName()+" ρυμουλκείται από το όχημα "+o.getClass().getName()+" με αρ. κυκλοφορίας "+o.getArKykloforias());
    }
}

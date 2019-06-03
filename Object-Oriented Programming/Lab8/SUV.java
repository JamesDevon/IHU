/*
 * @author James
 */
public class SUV extends Epivatiko implements EktosDromou {
    
    private String kinisi;

    public SUV(String arKykloforias, String montelo, int etosKykloforias, int thyres, String k, Kinitiras ki) {
        super(arKykloforias, montelo, etosKykloforias, thyres, ki);
        this.kinisi = k;
    }
    
    public String getKinisi(){
        return this.kinisi;
    }
    
    @Override
    public void seDrasei(){
        StringBuffer sb = new StringBuffer("Το όχημα είναι "+this.getClass().getName()+" με κίνηση "+this.kinisi+" και κινείται σε δύσβατες περιοχές");
        System.out.println(sb);
    }

    @Override
    public void rymoulkei(Rymoulkomeno r) {
        r.rymoulkitaiApo(this);
    }
    
}

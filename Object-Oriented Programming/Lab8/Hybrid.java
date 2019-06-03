/*
 * @author James
 */
public class Hybrid extends Kinitiras {
    
    private Kinitiras k1;
    private Kinitiras k2;
    
    public Hybrid(int ippodynami, float katanalwsi,Kinitiras k, Kinitiras k0) {
        super(ippodynami, katanalwsi);
        this.k1=k;
        this.k2=k0;
    }
    
    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer(super.toString()+" Kινητήρας 1: "+this.k1+" Kινητήρας 2: "+this.k2);
        return sb.toString();
    }
    @Override
    public float getIppodunami(){
        return k1.getIppodunami()+k2.getIppodunami();
    }
}

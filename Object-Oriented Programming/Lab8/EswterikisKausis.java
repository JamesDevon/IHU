/*
 * @author James
 */
public class EswterikisKausis extends Kinitiras {
    
    private float litra;

    public EswterikisKausis(int ippodynami, float katanalwsi, float l) {
        super(ippodynami, katanalwsi);
        this.litra = l;
    }
    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer(super.toString()+" Λίτρα: "+this.litra);
        return sb.toString();
    }
    @Override
    public float getIppodunami(){
        return super.getIppodunami();
    }
    
    
}

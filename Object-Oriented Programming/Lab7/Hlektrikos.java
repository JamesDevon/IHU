
/*
 * @author James
 */
public class Hlektrikos extends Kinitiras {

    private float kwh ;
    public Hlektrikos(int ippodynami, float katanalwsi, float k) {
        super(ippodynami, katanalwsi);
        this.kwh = k;
    }
    
    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer(super.toString()+" KWH: "+this.kwh);
        return sb.toString();
    }
    @Override
    public float getIppodunami(){
        return super.getIppodunami();
    }
    
    @Override
    public void katanalwnei(float posostoKatanalwsis , float apostasi){
        
    }
}

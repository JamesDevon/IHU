/*
 * @author James
 */
public class GewrgikosElkystiras extends Oxima implements EktosDromou {
    
    public GewrgikosElkystiras(String arKykloforias, String montelo, int etosKykloforias, Kinitiras k ) {
        super(arKykloforias, montelo, etosKykloforias,k);
    }
    
    public String orgwnei(){
        return " και οργώνει αγρούς";
    }

    @Override
    public void seDrasei() {
        StringBuffer sb = new StringBuffer("To όχημα είναι "+this.getClass().getName()+" με κίνηση 2Χ4 "+this.orgwnei());
        System.out.println(sb);
    }

    @Override
    public void rymoulkei(Rymoulkomeno r){
        r.rymoulkitaiApo(this);
        
    }
}

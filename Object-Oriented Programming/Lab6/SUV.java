/*
 * @author James
 */
public class SUV extends Epivatiko {
    
    private String kinisi;

    public SUV(String arKykloforias, String montelo, int etosKykloforias, int thyres, String k, Kinitiras ki) {
        super(arKykloforias, montelo, etosKykloforias, thyres, ki);
        this.kinisi = k;
    }
    
    public String getKinisi(){
        return this.kinisi;
    }
    
}

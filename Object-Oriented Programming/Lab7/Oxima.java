import java.lang.Math;
public abstract class Oxima {
    
    private String arKykloforias;
    private String montelo;
    private int etosKykloforias;
    private Kinitiras kinitiras;
    private int sxesiTaxutitas;
    
    public Oxima (String arKykloforias, String montelo, int etosKykloforias,Kinitiras k) {
        this.arKykloforias = arKykloforias;
        this.montelo = montelo;
        this.etosKykloforias = etosKykloforias;
        this.kinitiras=k;
    }
    
    public String getArKykloforias() {
        return arKykloforias;
    }
    
    public String toString() {
        StringBuffer sb = new StringBuffer(this.arKykloforias+" ");
        sb.append(this.etosKykloforias+" ");
        sb.append(this.montelo+" ");
        sb.append(" Κινητήρας : "+this.kinitiras.toString());
        return sb.toString();
    }
    
    public Kinitiras getKinitira(){
        return kinitiras;
    }
    
    public void vazeiMpros(){
        this.sxesiTaxutitas=0;
        System.out.println("To όχημα με αριθμό κυκλοφορίας : "+this.arKykloforias);
        kinitiras.seLeitourgia();
        
    }
    
    public void seKinisi(float diadromi){
        float apostasi = 50+(float)(Math.random()*150);
        switch(this.sxesiTaxutitas){
            case 1:
                this.sxesiTaxutitas++;
                break;
            case 5:
                this.sxesiTaxutitas--;
                break;
            default:
                if(Math.random()<0.5){
                    this.sxesiTaxutitas++;
                }else{
                    this.sxesiTaxutitas--;
                }
        }
        
        
    }
}

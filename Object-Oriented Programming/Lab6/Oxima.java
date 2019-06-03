
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
    }
}

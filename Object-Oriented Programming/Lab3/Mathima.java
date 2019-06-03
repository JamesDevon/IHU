
public class Mathima {
    private int kwdikos;
    private char examinoPS;
    private String titlos;
    
    public Mathima(int k , char e, String t){
        this.kwdikos = k;
        this.examinoPS = e;
        this.titlos = t;
    }
    
    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer(this.kwdikos+" ");
        sb.append(this.examinoPS+" ");
        sb.append(this.titlos);
        return sb.toString();
    }
}

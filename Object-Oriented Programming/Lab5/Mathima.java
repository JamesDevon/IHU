import java.util.ArrayList;

public class Mathima {
    private int kwdikos;
    private char examinoPS;
    private String titlos;
    private int in=0;
    private ArrayList<Eggrafi> eggrafes= new ArrayList();
    private ArrayList<Mathima> proApaitoumena = new ArrayList<>(2);
    
    public Mathima(int k , char e, String t, Mathima m,Mathima m2){
        this.kwdikos = k;
        this.examinoPS = e;
        this.titlos = t;
        if(m!=null){
            this.proApaitoumena.add(m);
            in++;
            if(m2!=null){
            this.proApaitoumena.add(m2);
            }
        }
    }
    
    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer(this.kwdikos+" ");
        sb.append(this.examinoPS+" ");
        sb.append(this.titlos+" ");
        
        if(this.proApaitoumena.size()>0){
         
            sb.append("Προαπαιτούμενα : "+this.proApaitoumena.get(0).kwdikos);
            if(this.proApaitoumena.size()>1){
                sb.append(" | "+this.proApaitoumena.get(1).kwdikos);
            }
        }
        return sb.toString();
    }
    
    public int getKwdiko(){
        return this.kwdikos;
    }
    
    public ArrayList<Mathima> getProApaitoumen(){
        return this.proApaitoumena;
    }

    public void addEggrafi(Eggrafi e){
        this.eggrafes.add(e);
    }
        
}
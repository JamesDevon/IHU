
/*
 * @author James
 */
public abstract class TrapezikosLogariasmos {
    private String kwdikos ;
    private double ypoloipoKatathesewn;
    private  final int orioAnalipsis = 400;
    private Pelatis[] pelates = new Pelatis[10];
    
    public TrapezikosLogariasmos(String k, double y){
        this.kwdikos = k;
        this.ypoloipoKatathesewn = y;
    }
    
    public String getKwdiko(){
        return kwdikos;
    }
    
    public void analipsoi(double poso){
        try{
            if(poso > orioAnalipsis){
                throw new Exception("Adunati Analipsi. To orio Analipsis einai 400$.");
            }else{
                if(poso>ypoloipoKatathesewn){
                    throw new Exception("Adunatti Analipsi. Den uparxei auto to poso ston logariasmo");
                }else{
                    ypoloipoKatathesewn -=poso;
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
   public double getYpoloipo(){
       return this.ypoloipoKatathesewn;
   }
}

import java.util.Date;
/**
 *
 * @author James
 */
public class Prothesmiakos extends TrapezikosLogariasmos {
    private String hmeromLiksis;
    
    
    public Prothesmiakos(String k , double y, String h){
        super(k,y);
        try{
            if(h.matches("^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$")){
                this.hmeromLiksis = h;
            }else{
                throw new Exception();
            }
        }catch(Exception e){
            System.out.println("Wrong date input");
        }
    }
}

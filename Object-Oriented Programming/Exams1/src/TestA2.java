
/**
 *
 * @author James
 */
public class TestA2 {
    
    public static void main(String[] args){
        Pelatis[] pelates = new Pelatis[2];
        
        pelates[0] = new Pelatis(123456789,"Δημητριου");
        pelates[1] = new Pelatis(987654321,"Ανδρέου");
        
        pelates[0].createAccount(new Tamieutiriou("GR852",320));
        pelates[0].createAccount(new Prothesmiakos("GR577",680,"26/02/2023"));
        
        pelates[0].analipsoi(500, "GR852");
        System.out.println("Ypoloipo Logariasmwn : "+pelates[0].getYpoloipoLogariasmon());
    }

}

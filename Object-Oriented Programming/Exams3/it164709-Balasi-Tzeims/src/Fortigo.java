/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Fortigo extends Oxima {
    float ofelimoFortio;
    
    public Fortigo(String a, float o) throws OverLoadException{
        super(a);
        if(o>3000){
            throw new OverLoadException("Fortio pano apo to epitrepto orio");
        }else if(o<1000){
            throw new OverLoadException("Fortio kato apo to epitrepto orio");
        }else{
            this.ofelimoFortio=o;
        }
    }
}

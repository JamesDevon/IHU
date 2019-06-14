import java.lang.Math;
/**
 *
 * @author James
 */
public class TestMetoxes {
    static Metoxi[] metoxes = new Metoxi[2];
    static Pelatis[] pelates = new Pelatis[2];
    
    public static void main(String[] args){
        metoxes[0]= new Metoxi("ALFA");
        metoxes[1]= new Metoxi("ETE");
        
        pelates[0] = new Pelatis(1025,"Δημιτριου",1000);
        pelates[1] = new Pelatis(2877,"Γραικός",2000);
        
        float tuxaiaTimi;
        int tuxaiaMetoxi;
        int tuxaiosPelatis;
        int temaxia;
        for(int i=0; i<10; i++){
           tuxaiaMetoxi = (int)Math.floor(Math.random()*pelates.length);
           tuxaiaTimi = (float)(Math.random()*1.5+0.5);
           tuxaiosPelatis = (int)Math.floor(Math.random()*pelates.length);
           metoxes[tuxaiaMetoxi].setTimi(tuxaiaTimi);
           temaxia = (int)Math.ceil(Math.random()*150+150);
           Synalagi s;
           if(Math.random()*2>1){
                s = new Agora("Παρασκευή", temaxia,metoxes[tuxaiaMetoxi],tuxaiaTimi);
           }else{
                s = new Polisi("Παρασκευή", temaxia,metoxes[tuxaiaMetoxi],tuxaiaTimi);
           }
           pelates[tuxaiosPelatis].addSynalagi(s);
           try{
               if(Math.random()*2>1){
                   pelates[tuxaiosPelatis].agorazei(metoxes[tuxaiaMetoxi],temaxia,s);
                   System.out.println(pelates[tuxaiosPelatis].toString());
                }
           }catch(InsufficientBalanceExteption e){
               System.out.println(e.getMessage());
           }
        }
    }
}

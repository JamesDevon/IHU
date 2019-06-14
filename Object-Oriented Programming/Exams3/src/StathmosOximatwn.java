
/*
 * @author user
 */
public class StathmosOximatwn {
    private ThesiStathmeusis[] theseis = new ThesiStathmeusis[5];
    private static int index=0;
    
    public void eisodosOximatos(String wraEisodou,Oxima oxima){
        boolean flag = true; //gia na stamataei o algorithmos otan vrei kenei thesei
        
        for(int i=0; i<theseis.length; i++){
            if(flag){
                if(theseis[i]==null){
                    theseis[i] = new ThesiStathmeusis(wraEisodou, oxima, false);
                    index++;
                    flag = false;
                    System.out.println("Arithmos Kykloforias Oximatos : "+oxima.getArithmo()+" Thesi Stathmeusis : "+index);
                }else{
                    if(theseis[i].getKatastasi()){
                        theseis[i] = new ThesiStathmeusis(wraEisodou, oxima, false);
                        flag = false;
                        index++;
                        System.out.println("Arithmos Kykloforias Oximatos : "+oxima.getArithmo()+" Thesi Stathmeusis : "+index);
                    }
                }
            }
        }

    }
    
    public void eksodosOximatos(String wraEksodou, Oxima o){
        boolean flag = true; //gia na stamaei o algorithmos molis vrei to oxima
        int kostos;
        for(int i=0; i<theseis.length; i++){
            if(flag){
                if(theseis[i].getOxima().getArithmo().equals(o.getArithmo())){
                theseis[i].setWraEksodou(wraEksodou);
                kostos = theseis[i].getKostos(); // Den polaplasiazo me to 1 
                System.out.println("Arithmos Kykloforias Oximatos : "+theseis[i].getOxima().getArithmo()+" Thesi Stathmeusis : "+index+" Kostos : "+kostos+" euro");
                theseis[i].setKatastasi(true);
                flag = false;
                index--;
                }
            }
            
        }
    }
    
    public ThesiStathmeusis[] getTheseis(){
        return theseis;
    }
    
}

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args){
        Oxima[] oximata = new Oxima[3];
        oximata[0] = new IX("IKA4763",5);
        oximata[1] = new IX("HPO3526",4);
        try{
            oximata[2] = new Fortigo("POR8732",2400);
        }catch(OverLoadException message){
            System.out.println(message);
        }
        StathmosOximatwn stathmos = new StathmosOximatwn();
        
        stathmos.eisodosOximatos("14", oximata[0]);
        stathmos.eisodosOximatos("16", oximata[1]);
        stathmos.eisodosOximatos("9", oximata[2]);
        String wraEksodou;
        
        for(int i=0; i<oximata.length; i++){
            System.out.println("Dwse wra eksodou gia to oxima me ArKykloforias : "+oximata[i].getArithmo()+" (PX '14 gia 2 to mesimeri')");
            Scanner sc = new Scanner(System.in);
            wraEksodou = sc.nextLine();
            stathmos.eksodosOximatos(wraEksodou, oximata[i]);
        }
    }
}
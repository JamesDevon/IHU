import java.text.*;
import java.util.Date;
import java.util.Scanner;

public class MAIN {
   
    private static Foititis [] pinFoitites;
    public static void main(String args[]) {
        
        // 3.  ΕΡΓΑΣΤΗΡΙΟ
        // Ασκηση 1: Προσθήκη αντικειμένων
        pinFoitites = new Foititis[10];
        pinFoitites[0] = new Foititis(17, "Πολυκάρπου Κλέων",strToDate("10/10/1999"));
        pinFoitites[1] = new Foititis(17, "Γεωργίου Αριστέα",strToDate("2/5/1998"));
        pinFoitites[2] = new Foititis(17, "Τσουκαλάς Ανδρόνικος",strToDate("2/5/1998"));
        pinFoitites[3] = new Foititis(17, "Χυτήρης Οδυσσέας",strToDate("26/2/1998"));
        pinFoitites[4] = new Foititis(17, "Πετρίδου Δανάη",strToDate("2/5/1998"));
        pinFoitites[5] = new Foititis(18, "Μπαλάση Τζέιμς",strToDate("26/2/1998"));
        pinFoitites[6] = new Foititis(18, "Μπαλάση Τζόνι",strToDate("28/4/1992"));
        pinFoitites[7] = new Foititis(18, "Μπαλάση Τζέσσικα",strToDate("18/9/1996"));
        pinFoitites[8] = new Foititis(18, "Πέπα Ένο",strToDate("12/6/1994"));
        pinFoitites[9] = new Foititis(18, "Μπάζο Αμαρίλα",strToDate("22/6/1997"));
        
        // Askisi 2 : emfanisi foititon
        try{
            showFoitites(pinFoitites);
        }catch(NullPointerException e){}
        
        //Ασκηση 3: Σειριακή αναζήτηση
        //Δημιουργία μενού
        int epilogi = -1;
        while (epilogi <1 || epilogi > 4) {
            System.out.println("\n\n\tΜενού");
            System.out.println("1) Αναζήτηση με Επώνυμο");
            System.out.println("2) Αναζήτηση με AM");
            System.out.println("3) Αναζήτηση με αριθμό κινητού τηλεφώνου");
            System.out.println("0) Εξοδος");
            System.out.print("Επιλογή: ");
            Scanner sc = new Scanner(System.in);
            epilogi = sc.nextInt();
            switch(epilogi) {
               case 1: {
                    anazitisiMeEpwnymo(pinFoitites);
                    break;  }
               case 2: 
                 
               case 3: {
                 anazitisiAM(pinFoitites);
               }case 0 :{
                   epilogi = 2;
                   break;
               }
               default:
                 System.out.println("Λάθος επιλογή");
            }
        }
    }
    
    private static Date strToDate(String hmeromStr) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date hmerom = null;
        try {
            hmerom = df.parse(hmeromStr);
        }
        catch (Exception ex ){
            System.out.println(ex);
        }
        return hmerom;  
    }
    
    public static void showFoitites(Foititis [] x) {
        for (int i=0; i<x.length; i++ )
            if (x[i]!=null)
                System.out.println(x[i].toString()); 
    }
    
    public static void anazitisiMeEpwnymo(Foititis [] x) {
        boolean i = false;
        System.out.print("\n1) Δώσε επώνυμο: ");
        Scanner sc = new Scanner(System.in, "utf8");
        String keyStr = sc.nextLine();
        for(Foititis x1 :x){
            if(x1.getSurName().equals(keyStr)){
                System.out.println(x1.toString());
                i=true;
            }
        }
        if(!i){
                System.out.println("Δεν βρέθηκε Φοιτητης");
        }
    }
    
    public static void anazitisiAM(Foititis [] x) {
        System.out.println("Δώσε ΑΜ :");
        Scanner scanner = new Scanner(System.in);
        int am = scanner.nextInt();
        int middleIndex;
        int firstIndex = 0;
        int lastIndex = x.length-1;
        boolean flag = true;
        while((flag)&&(lastIndex > firstIndex)){
            middleIndex = (firstIndex+lastIndex)/2;
            if(Integer.parseInt(x[middleIndex].getAM())<am){
                firstIndex = middleIndex+1;
            }else if(Integer.parseInt(x[middleIndex].getAM())>am){
                lastIndex = middleIndex-1;
            }else{
                System.out.println(x[middleIndex].toString());
                flag=false;
            }
        }
        }
}

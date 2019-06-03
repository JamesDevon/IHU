import java.text.*;
import java.util.Date;
import java.util.Scanner;

public class MAIN {
   
    private static Foititis [] pinFoitites;
    private static Mathima [] pinMathimaton;
    public static void main(String args[]) {
        pinFoitites = new Foititis[10];
        pinFoitites[0] = new Foititis(17, "Πολυκάρπου Κλέων",strToDate("10/10/1999"));
        pinFoitites[1] = new Foititis(17, "Γεωργίου Αριστέα",null);
        pinFoitites[2] = new Foititis(17, "Τσουκαλάς Ανδρόνικος",strToDate("2/5/1998"));
        pinFoitites[3] = new Foititis(17, "Χυτήρης Οδυσσέας",strToDate("26/2/1998"));
        pinFoitites[4] = new Foititis(17, "Πετρίδου Δανάη",null);
        pinFoitites[5] = new Foititis(18, "Μπαλάση Τζέιμς",strToDate("26/2/1998"));
        pinFoitites[6] = new Foititis(18, "Μπαλάση Τζόνι",strToDate("28/4/1992"));
        pinFoitites[7] = new Foititis(18, "Μπαλάση Τζέσσικα",strToDate("18/9/1996"));
        pinFoitites[8] = new Foititis(18, "Πέπα Ένο",strToDate("12/6/1994"));
        pinFoitites[9] = new Foititis(18, "Μπάζο Αμαρίλα",strToDate("22/6/1997"));
        
        String mp;
        String p;
        boolean flag;
        boolean flag1;
        for(Foititis f : pinFoitites){
            flag = true;
            while(flag){
                try{
                    if(f.getHmerom()==null){
                        System.out.println(f.toString());
                        System.out.println("Δώσε Ημερομηνία Γέννησης :");
                        Scanner dt = new Scanner(System.in);
                        String hmerom = dt.nextLine();
                        if(hmerom.matches("^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$")){
                            f.setHmerom(hmerom);
                            flag=false;
                        }else{
                            throw new InvalideDateException();
                        }
                    }
                }catch(InvalideDateException i){ 
                    System.out.println("Wrong Date");
                }
            }
            while(flag){
                try{
                    System.out.println("Insert mobile phone Number for "+f.toString());
                    Scanner mpn = new Scanner(System.in);
                    mp = mpn.nextLine();
                    if(mp.matches("^6[0-9]{9}")){
                        f.addMobilePhoneNumber(mp);
                        flag = false;
                    }else{
                        throw new Exception();
                    }
                }catch(Exception e){
                    System.out.println("Wrong number");
                }
            }
            flag =true;
            while(flag){
                try{
                    System.out.println("Insert phone Number for"+f.toString());
                    Scanner  pn = new Scanner(System.in);
                    p= pn.nextLine();
                    if(p.matches("^2[0-9]{9}")){
                        f.addPhoneNumber(p);
                        flag=false;
                    }else{
                        throw new Exception();
                    }
                }catch(Exception e){
                    System.out.println("Wrong number");
                }
            }
            flag1 =true;
            
        }
        
        
        
        
        
        
        /*        
        // Ασκηση 1: Δημιουργία μαθημάτων
        pinMathimaton = new Mathima[2];
        pinMathimaton[0] = new Mathima(201,'B',"Αντικειμενοστρεφής Προγραμματισμός");
        pinMathimaton[1] = new Mathima(102,'A',"Αλγοριθμική και Προγραμματισμος");
        
        // Ασκηση 2: Συσχέτιση κλάσεων 
        // Βλ. Παράδειγμα E04paraggelies
        
        
        // Ασκηση 3: Δημιουργία και σύνδεση αντικειμένων
        pinFoitites[1].addEggrafi(strToDate("27/2/2018"), "2018-2019E", pinMathimaton[0]);
        pinFoitites[1].addEggrafi(strToDate("28/2/2018"), "2018-2019E", pinMathimaton[1]);
        pinFoitites[4].addEggrafi(strToDate("28/2/2018"), "2018-2019E", pinMathimaton[0]);
        
        // Ασκηση 4
        for(Foititis x : pinFoitites){
            if(x.doseYparxousesEggrafes()!=null){
               System.out.println("Φοιτητής : "+x.toString()+"\nΕγγραφές σε μαθήματα :\n");
               for(Eggrafi x1 : x.doseYparxousesEggrafes()){
                   try{
                       System.out.println(x1.toString());
                   }catch(NullPointerException n){
                       break;
                   }
               }
               System.out.println("\n");    
            }
        }*/
    }
    
    private static void insertDate(Foititis x){
            
        
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
    
    public static void emfanisiFoititwn() {
        for (int i=0; i<pinFoitites.length; i++ )
            if (pinFoitites[i]!=null)
                System.out.println(pinFoitites[i]); 
    }
}

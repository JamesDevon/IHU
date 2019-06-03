import java.text.*;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;

public class MAIN {
    private static ArrayList<Foititis> pinFoitites;
    private static ArrayList<Mathima> pinMathimaton;
    public static void main(String args[]) {
        pinFoitites.add(new Foititis(17, "Πολυκάρπου Κλέων",strToDate("10/10/1999"))) ;
        pinFoitites.add(new Foititis(17, "Γεωργίου Αριστέα",strToDate("2/5/1998")));
        pinFoitites.add(new Foititis(17, "Τσουκαλάς Ανδρόνικος",strToDate("2/5/1998")));
        pinFoitites.add(new Foititis(17, "Χυτήρης Οδυσσέας",strToDate("26/2/1998")));
        pinFoitites.add(new Foititis(17, "Πετρίδου Δανάη",strToDate("2/5/1998")));
        pinFoitites.add(new Foititis(18, "Μπαλάση Τζέιμς",strToDate("26/2/1998")));
        pinFoitites.add(new Foititis(18, "Μπαλάση Τζόνι",strToDate("28/4/1992")));
        pinFoitites.add(new Foititis(18, "Μπαλάση Τζέσσικα",strToDate("18/9/1996")));
        pinFoitites.add(new Foititis(18, "Πέπα Ένο",strToDate("12/6/1994")));
        pinFoitites.add(new Foititis(18, "Μπάζο Αμαρίλα",strToDate("22/6/1997")));
        // Ασκηση 1: Δημιουργία μαθημάτων
        pinMathimaton.add(new Mathima(201,'B',"Αντικειμενοστρεφής Προγραμματισμός"));
        pinMathimaton.add(new Mathima(102,'A',"Αλγοριθμική και Προγραμματισμος"));
        // Ασκηση 2: Συσχέτιση κλάσεων 
        // Βλ. Παράδειγμα E04paraggelies
        // Ασκηση 3: Δημιουργία και σύνδεση αντικειμένων
        pinFoitites.get(1).addEggrafi(strToDate("27/2/2018"), "2018-2019E", pinMathimaton.get(0));
        pinFoitites.get(1).addEggrafi(strToDate("28/2/2018"), "2018-2019E", pinMathimaton.get(1));
        pinFoitites.get(4).addEggrafi(strToDate("28/2/2018"), "2018-2019E", pinMathimaton.get(0));
        pinFoitites.get(0).addEggrafi(strToDate("28/2/2018"), "2018-2019E", pinMathimaton.get(0));
        pinFoitites.get(2).addEggrafi(strToDate("28/2/2018"), "2018-2019E", pinMathimaton.get(0));
        pinFoitites.get(3).addEggrafi(strToDate("28/2/2018"), "2018-2019E", pinMathimaton.get(0));
        pinFoitites.get(5).addEggrafi(strToDate("28/2/2018"), "2018-2019E", pinMathimaton.get(0));
        pinFoitites.get(6).addEggrafi(strToDate("28/2/2018"), "2018-2019E", pinMathimaton.get(0));
        pinFoitites.get(7).addEggrafi(strToDate("28/2/2018"), "2018-2019E", pinMathimaton.get(0));
        pinFoitites.get(8).addEggrafi(strToDate("28/2/2018"), "2018-2019E", pinMathimaton.get(0));
        pinFoitites.get(9).addEggrafi(strToDate("28/2/2018"), "2018-2019E", pinMathimaton.get(0));
        
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
        }
        
//LAB 4
        String answer="y";
        int k ;
        while(answer.equals("y")){
            //Askisi 1
            Scanner sc = new Scanner(System.in);
            System.out.println("Δώσε κωδικό μαθήματος :");
            k = sc.nextInt();
            for(Mathima m : pinMathimaton){
                if(m.getKwdiko()==k){
                    System.out.println(m.toString());
                    break;
                }
            }
            eisagwgeiVathmol(k);
            epitixontesFoitites(k);
            apotixontesFoitites(k);
            System.out.println("Whould you like to continue ? (y/n)");
            Scanner as = new Scanner(System.in);
            answer = as.nextLine();
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
    
    public static void emfanisiFoititwn() {
        for (int i=0; i<pinFoitites.size(); i++ )
            if (pinFoitites.get(i)!=null)
                System.out.println(pinFoitites.get(i)); 
    }
    
    private static void eisagwgeiVathmol(int k){
        for(Foititis x : pinFoitites){
            if(x.exeiEggrafiStoMathima(k)!=null){
                System.out.println(x.toString());
                System.out.println("Δώσε Βαθμό:\n");
                Scanner vh = new Scanner(System.in);
                float vathmos = vh.nextFloat();
                x.exeiEggrafiStoMathima(k).addVathmos(vathmos);
                System.out.println(x.exeiEggrafiStoMathima(k).toString());
            }
        }
    }
    
    private static void epitixontesFoitites(int k){
        System.out.println("\nΕπιτυχόντες Φοιτητές :\n");
        for(Foititis f : pinFoitites){
            if(f.exeiEggrafiStoMathima(k)!=null){
                if(f.exeiEggrafiStoMathima(k).getVathmo()>=5){
                System.out.println(f.toString()+" "+f.exeiEggrafiStoMathima(k).toString());
                }
            }
        }
    }
    
    private static void apotixontesFoitites(int k){
        System.out.println("\nΑποτυχόντες Φοιτητές :\n");
        for(Foititis f : pinFoitites){
            if(f.exeiEggrafiStoMathima(k)!=null){
                if(f.exeiEggrafiStoMathima(k).getVathmo()<5){
                System.out.println(f.toString()+" "+f.exeiEggrafiStoMathima(k).toString());
                }
            }   
        }
    }
    
}
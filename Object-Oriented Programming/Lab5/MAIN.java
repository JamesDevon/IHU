import java.text.*;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;

public class MAIN {
    private static ArrayList<Foititis> pinFoitites = new ArrayList<>();
    private static ArrayList<Mathima> pinMathimaton = new ArrayList<>();
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
        pinMathimaton.add(new Mathima(101,'A',"Εισαγωγή στην Πληροφορική", null,null));
        pinMathimaton.add(new Mathima(102,'A',"Αλγοριθμική και Προγραμματισμος", null,null));
        pinMathimaton.add(new Mathima(103,'A',"Ψηφιακά Συστήματα",null,null) );
        pinMathimaton.add(new Mathima(104,'A',"Μαθηματική Ανάλυση και Γραμμική Άλγεβρα",null,null));
        pinMathimaton.add(new Mathima(105,'A',"Δεξιότητες Επικοινωνίας/Κοινωνικά Δίκτυα",null,null));
        pinMathimaton.add(new Mathima(201,'B',"Αντικειμενοστρεφής Προγραμματισμός",pinMathimaton.get(1),pinMathimaton.get(0)));
        pinMathimaton.add(new Mathima(2011,'B',"Αντικειμενοστρεφής Προγραμματισμός -Ε",pinMathimaton.get(1),pinMathimaton.get(0)));
        pinMathimaton.add(new Mathima(202,'B',"Εισαγωγή στα λειτουργικά συστήματα",null,null));
        pinMathimaton.add(new Mathima(203,'B',"Διακριτά Μαθηματικά",pinMathimaton.get(3),null));
        pinMathimaton.add(new Mathima(204,'B',"Γλώσσες και Τεχνολογίες Ιστού",null,null));
        pinMathimaton.add(new Mathima(2041,'B',"Γλώσσες και Τεχνολογίες Ιστού - Ε",null,null));
        pinMathimaton.add(new Mathima(205,'B',"Πληροφοριακά Συστήματα",null,null));
        // Ασκηση 2: Συσχέτιση κλάσεων 
        // Βλ. Παράδειγμα E04paraggelies
        // Ασκηση 3: Δημιουργία και σύνδεση αντικειμένων
        pinFoitites.get(1).addEggrafi(strToDate("27/2/2018"), "2018-2019E", pinMathimaton.get(0));
        pinFoitites.get(1).addEggrafi(strToDate("28/2/2018"), "2018-2019E", pinMathimaton.get(5));
        pinFoitites.get(1).addEggrafi(strToDate("28/2/2018"), "2018-2019E", pinMathimaton.get(7));
        pinFoitites.get(4).addEggrafi(strToDate("28/2/2018"), "2018-2019E", pinMathimaton.get(0));
        pinFoitites.get(4).addEggrafi(strToDate("28/2/2018"), "2018-2019E", pinMathimaton.get(5));
        pinFoitites.get(6).addEggrafi(strToDate("28/2/2018"), "2018-2019E", pinMathimaton.get(5));
        pinFoitites.get(6).addEggrafi(strToDate("28/2/2018"), "2018-2019E", pinMathimaton.get(1));

        
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
        
        showProApaitoumena(pinMathimaton);
        
//LAB 4
        /*String answer="y";
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
        }*/
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
    
    private static void showProApaitoumena(ArrayList<Mathima> m){
        for(Mathima x : m ){
            if(x.getProApaitoumen().size()>0){
                System.out.println(x.toString());
            }
        }
    }
}
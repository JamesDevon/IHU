import java.util.ArrayList;
import java.util.Scanner;
public class MAIN {

    public static void main(String[] args) {
    
    // Ασκηση 1: Κληρονομικότητα μεταξύ κλάσεων
    // Δημιουργήθηκε το περίγραμμα των κλάσεων του διαγράμματος κλάσεων      
        
    // Ασκηση 2: Υλοποίηση κληρονομικότητας – Πολυμορφισμός στοιχείων πίνακα
        Oxima [] pinOximata = new Oxima[4];
        pinOximata[0] = new Epivatiko("ΝΖΤ1755", "Toyota Yaris", 2014, 3,new EswterikisKausis(90,0,5));
        pinOximata[1] = new GewrgikosElkystiras("ΝΗΡ1209", "Belarus", 2017,new EswterikisKausis(320,0,10));
        pinOximata[2] = new SUV("ΝΗΧ2341", "KIA Sorento", 2008, 5,"4X4",new EswterikisKausis(180,0,8));
        pinOximata[3] = new Epivatiko("ΝKK1372", "Fiat Panda", 2015, 5,new Hybrid(0 , 0, new EswterikisKausis(50,0,3), new Hlektrikos(70,0,10)));
    // Ασκηση 3: Πολυμορφισμός – Εμφάνιση αντικειμένων
        for(Oxima o : pinOximata){
            System.out.println(o.toString());
        }
        
    // Ασκηση 4: Πολυμορφισμός – Τελεστής instanceof - downcasting
        
        String answer = "y";
        String arKykloforias;
        int arThyron ;
        Epivatiko epiv;
        SUV suv;
        do{
            System.out.println("Δώσε Αριθμό κυκλοφορίας :");
            Scanner sc= new Scanner(System.in , "utf-8");
            arKykloforias = sc.nextLine();
            boolean flag=false;
            for(Oxima o : pinOximata){
                if(arKykloforias.equals(o.getArKykloforias())){
                    flag = true;
                    if(o instanceof Epivatiko){
                        epiv = (Epivatiko)o;
                        arThyron = epiv.getArThyrwn();
                        if(o instanceof SUV){
                            suv = (SUV)epiv;
                            System.out.println("\nΑριθμός Κυκλοφορίας : "+arKykloforias+"\nΘύρες : "+arThyron+" \nΚίνηση : "+suv.getKinisi()+" \nIπποδύναμη : "+suv.getKinitira().getIppodunami()+" \nΕίδος Κινητήρα : "+suv.getKinitira().getClass().getName());
                        }else{
                            System.out.println("\nΑριθμός Κυκλοφορίας : "+arKykloforias+" \nΘύρες : "+arThyron+ " \nIπποδύναμη : "+epiv.getKinitira().getIppodunami()+" \nΕίδος Κινητήρα : "+epiv.getKinitira().getClass().getName());
                        }
                    }else{
                        System.out.println("\nΑριθμός Κυκλοφορίας : "+arKykloforias+" \nIπποδύναμη : "+o.getKinitira().getIppodunami()+" \nΕίδος Κινητήρα : "+o.getKinitira().getClass().getName());
                    }
                }
                if(flag){
                    break;
                }
            }
            if(!flag){
                System.out.println("Ο αριθμός κυκλοφορίας δεν είναι Έγκυρος");
            }
            
            System.out.println("Do you want to continue ? (y/n)");
            Scanner an = new Scanner(System.in);
            answer = sc.nextLine().toLowerCase();
            switch(answer){
                case "y":
                    break;
                case "n":
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Your choice wasn't one of the options");
                    System.out.println("Do you want to continue ? (y/n)");
                    sc = new Scanner(System.in);
                    answer = sc.nextLine();
                    break;
            }
        }while(answer.equals("y"));
        
        for(Oxima o : pinOximata){
            o.vazeiMpros();
        }
    }
    
}
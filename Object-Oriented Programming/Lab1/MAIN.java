import java.text.*;
import java.util.Date;
import java.util.Scanner;
import static java.lang.System.out;

public class MAIN {
    static Scanner sc = new Scanner(System.in , "utf-8");
    //Askisi 2
    private static Foititis [] pinFoitites;
    public static void main(String args[]) {
        pinFoitites = new Foititis[10];
        pinFoitites[0] = new Foititis(17, "Πολυκάρπου Κλέων",strToDate("10/10/1999"));
        pinFoitites[1] = new Foititis(17, "Γεωργίου Αριστέα",strToDate("2/5/1998"));
        pinFoitites[2] = new Foititis(17, "Τσουκαλάς Ανδρόνικος",null);
        pinFoitites[3] = new Foititis(17, "Χυτήρης Οδυσσέας",strToDate("26/2/1998"));
        pinFoitites[4] = new Foititis(17, "Πετρίδου Δανάη",null);
        //Askisi 3
        try{
            showFoitites(pinFoitites);
        }catch(NullPointerException e){
            
        }
        out.println("------------------------------------------");
        out.println("Είσοδος Ημερομηνίας");
        try{
            insertDate(pinFoitites);
        }catch(NullPointerException n){
        }
        out.println("------------------------------------------");
        showFoitites(pinFoitites);
        out.println("------------------------------------------");
        //Askisi 4
        changeName(pinFoitites[1]);
        out.println("------------------------------------------");
        showFoitites(pinFoitites);
        out.println("------------------------------------------");
        out.println("Δώσε 2 Αμ για ανταλαγεί θέσεων");
        int am1 = sc.nextInt();
        int am2 = sc.nextInt();
        swap(pinFoitites , am1, am2);
        showFoitites(pinFoitites);
        out.println("------------------------------------------");
        out.println("Δώσε ΟνοματΕπωνυμο για τον Φοιτιτη που θες να διαγράψεις :");
        deleteFoititi(pinFoitites);
        showFoitites(pinFoitites);
        
    }
    
    private static Date strToDate(String hmeromStr) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date hmerom = null;
        try {
            hmerom = df.parse(hmeromStr);
        }
        catch (Exception ex ){
            out.println(ex);    
        }
        return hmerom;
    }
    
    private static void showFoitites(Foititis [] x){
        for (Foititis x1 : x) {
            try {
                System.out.println(x1.toString());
            }catch(NullPointerException e){
            }
        }
    }
    //Askisi 3
    private static void insertDate(Foititis [] x){
        for(int i=0; i<x.length; i++){
            if(x[i].getHmerom()==null){
                out.println(x[i].toString());
                out.println("Δώσε Ημερομηνία Γέννησης :");
                String hmerom = sc.nextLine();
                x[i].setHmerom(hmerom);
            }
        }
    }
    //Askisi 4
    private static void changeName(Foititis x){
            out.println("Please Enter a new Name for "+x.toString()+" : ");
            String newName = sc.nextLine();
            x.setName(newName);
    }
    //Askisi 5
    private static void swap(Foititis[] x, int i, int j){
        Foititis temp = null ;
        int tempKey = 0;
        for(int k=0; k<x.length; k++){
            try{
            if(Integer.parseInt(x[k].getAM())==i){
                temp = x[k];
                tempKey = k ;
                }
            }catch(NullPointerException n){
                //out.println(1);
            }
            }
        for(int p=0; p<x.length; p++){
            try{
                if(Integer.parseInt(x[p].getAM())==j){
                x[tempKey] = x[p];
                x[p] = temp;
            }
            }catch(NullPointerException n){
                //out.println("Το ΑΜ που δώσατε δεν είναι έγκυρο.");
            }
        }
    }
    //Askisi 6
    private static void deleteFoititi(Foititis[] x){
        String name;
        name = sc.nextLine();
        for(int i =0; i<x.length; i++){
            try{
                if(name.equals(x[i].getFullName())){
                x[i] = null;
            }
            }catch(NullPointerException n){
            }
        }
    }
}
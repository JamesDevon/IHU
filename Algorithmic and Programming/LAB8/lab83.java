class MaxMin {
	public static void main(String[] args) {
 int[] array = { -20, 19, 1, 5, -1, 27, 19, 5 } ;
 int max, min;
 // Δίνουμε αρχικές τιμές στις μεταβλητές max και min
 max = array[0]; min = 0;
 // Σαρώνουμε τον πίνακα
 for ( int index=0; index < array.length; index++ ) {
 // έλεγχος του τρέχοντος στοιχείου για max
 if (array[index]>max) max = array[index]; //Αν είναι μεγαλύτερο άλλαξε το max
 // έλεγχος του τρέχοντος στοιχείου για min
 if (array[index]<min) min = array[index]; //Αν είναι μικρότερο άλλαξε το min
 }
 System.out.println("O megaliteros arithmos einai o : " + max);
 System.out.println("O mikroteros arithmos einai o : " + min);
 }
}
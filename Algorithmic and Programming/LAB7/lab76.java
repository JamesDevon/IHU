class Interest {
 public static void main(String[] args) {
 double poso; // Tο ποσο επένδυσης.
 double rate; // Ο ετήσιος τόκος.
 System.out.print("Dose to arxiko poso: ");
 poso = UserInput.getDouble();
 System.out.print("Dose ton ethsio toko: ");
 rate = UserInput.getDouble();
 /* Ypologise thn ependysi gia 10 xronia. */
 int years;
 years = 0;
 while (years < 10) {
 double interest;
 interest = (poso * rate)/100.0;
 poso = poso + interest;
 years = years + 1;
 System.out.print(“To poso tis ependysis meta apo “ +years+ “xronia einai: “);
 System.out.printf(“%1.2f”, poso);
 System.out.println();
 } // end of while loop
 } // end of main()
} // end of class Interest
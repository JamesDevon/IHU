import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author James
 */
public class AirATEITH extends javax.swing.JFrame {

    /**
     * Creates new form AirATEITH
     */
    public AirATEITH() {
        initComponents();
        returnLabel.setVisible(false);
        returnDate.setVisible(false);
        jButton2.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        info = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        departmentCombo = new javax.swing.JComboBox(anaxorisi);
        returnCombo = new javax.swing.JComboBox(proorismos);
        onewayRadio = new javax.swing.JRadioButton();
        returnRadio = new javax.swing.JRadioButton();
        onewayDate = new datechooser.beans.DateChooserCombo();
        jLabel3 = new javax.swing.JLabel();
        returnLabel = new javax.swing.JLabel();
        returnDate = new datechooser.beans.DateChooserCombo();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        info.setColumns(20);
        info.setRows(5);
        jScrollPane1.setViewportView(info);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Air ATEITHE");

        jLabel1.setText("Αναχώρηση : ");

        jLabel2.setText("Προορισμος : ");

        buttonGroup1.add(onewayRadio);
        onewayRadio.setSelected(true);
        onewayRadio.setText("Απλή Πτήση");
        onewayRadio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                onewayRadioItemStateChanged(evt);
            }
        });

        buttonGroup1.add(returnRadio);
        returnRadio.setText("Με Επιστροφή");
        returnRadio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                returnRadioItemStateChanged(evt);
            }
        });

        jLabel3.setText("Ημερομηνία Αναχώρισης :");

        returnLabel.setText("Ημερομηνία Επιστροφής :");

        jLabel4.setText("Status : ");

        jLabel5.setText("Τιμή     :");

        jButton1.setText("Έλεγχος Διαθεσιμότητας");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Κάντε κράτηση");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addGap(11, 11, 11)
                        .addComponent(departmentCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel2)
                        .addGap(10, 10, 10)
                        .addComponent(returnCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(onewayRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(returnRadio)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(onewayDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(returnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(returnDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(21, 21, 21))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(priceLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statusLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(departmentCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(onewayDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel2))
                            .addComponent(returnCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(returnLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(onewayRadio)
                            .addComponent(returnRadio)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(returnDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(statusLabel)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(priceLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnRadioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_returnRadioItemStateChanged
        returnLabel.setVisible(true);
        returnDate.setVisible(true);
    }//GEN-LAST:event_returnRadioItemStateChanged

    private void onewayRadioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_onewayRadioItemStateChanged
        returnLabel.setVisible(false);
        returnDate.setVisible(false);
    }//GEN-LAST:event_onewayRadioItemStateChanged
String date;
String date2;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int departmentIndex = departmentCombo.getSelectedIndex();
        int returnIndex = returnCombo.getSelectedIndex();
         date = onewayDate.getText();
         date2 = returnDate.getText();
        if(anaxorisi[departmentIndex].equals("Torino")&&proorismos[returnIndex].equals("Milano")&&date.equals("1/17/19")){
                    statusLabel.setText("2 Διαθέσημες Θέσεις");
                    priceLabel.setText("67$");
                    jButton2.setVisible(true);
        }else{
            statusLabel.setText("Μη Διαθέσημες Θέσεις");
            priceLabel.setText("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed
String file = "C:\\Users\\James\\Documents\\NetBeansProjects\\Main\\src\\Orders.txt";
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String price = priceLabel.getText();
        int departmentIndex = departmentCombo.getSelectedIndex();
        int returnIndex = returnCombo.getSelectedIndex();
        String data = info.getText();
        info.setText(data+"\n Αναχώρηση από : "+anaxorisi[departmentIndex]+"\n"
                    +"Προορισμός : "+proorismos[returnIndex]+"\n"
                    +"Ημερομηνία Αναχώρησης : "+date+"\n"
                    + "Ημερομηνία Επιστροφής:"+date2+"\n"
                    + "Τιμή :"+price+"\n\n");
        try{
            FileWriter fw = new FileWriter(file);
            info.write(fw);
            fw.close();
            String message = "Η κράτηση έγινε επιτυχός";
            JOptionPane.showMessageDialog(null, message, "Ολοκλήρωση κράτησης", JOptionPane.INFORMATION_MESSAGE);
        }catch(IOException exc){
            String console = exc.getMessage();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AirATEITH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AirATEITH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AirATEITH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AirATEITH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AirATEITH().setVisible(true);
            }
        });
    }
    String [] anaxorisi = {"Milano","Rome","Athens","Monaco","Thessalonik","Tirana","Sofia","Instabull","Paris","Torino"};
    String [] proorismos = {"Milano","Rome","Athens","Monaco","Thessalonik","Tirana","Sofia","Instabull","Paris","Torino"};
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox departmentCombo;
    private javax.swing.JTextArea info;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private datechooser.beans.DateChooserCombo onewayDate;
    private javax.swing.JRadioButton onewayRadio;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JComboBox returnCombo;
    private datechooser.beans.DateChooserCombo returnDate;
    private javax.swing.JLabel returnLabel;
    private javax.swing.JRadioButton returnRadio;
    private javax.swing.JLabel statusLabel;
    // End of variables declaration//GEN-END:variables
}

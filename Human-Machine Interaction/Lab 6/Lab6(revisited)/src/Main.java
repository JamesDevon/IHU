import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        foodImage.setIcon(gyros);
        drinkImage.setIcon(fanta);
        orderTable.setAutoCreateRowSorter(true);
    }

    String foods[] = {"Γύρος", "Σουτζουκάκι", "Σουβλάκι", "Χωριάτικη", "Πράσινη", "Γεμιστά" };
    int foodPrice[] = {6, 5, 4, 3, 2, 7};
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        forma = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        foodlist = new javax.swing.JList(foods);
        foodImage = new javax.swing.JLabel();
        foodQuantity = new javax.swing.JSpinner();
        foodOrder = new javax.swing.JButton();
        drinkList = new javax.swing.JComboBox(drinks);
        drinkImage = new javax.swing.JLabel();
        drinkQuantity = new javax.swing.JSpinner();
        drinkOrder = new javax.swing.JButton();
        sunolo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        priceFull = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ο Μάκης");
        setPreferredSize(new java.awt.Dimension(450, 400));

        foodlist.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        foodlist.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                foodlistValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(foodlist);

        foodQuantity.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));

        foodOrder.setText("Add in order");
        foodOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodOrderActionPerformed(evt);
            }
        });

        drinkList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drinkListActionPerformed(evt);
            }
        });

        drinkQuantity.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));

        drinkOrder.setText("Add in order");
        drinkOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drinkOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formaLayout = new javax.swing.GroupLayout(forma);
        forma.setLayout(formaLayout);
        formaLayout.setHorizontalGroup(
            formaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(formaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formaLayout.createSequentialGroup()
                        .addGroup(formaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(foodOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(foodQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(foodImage, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formaLayout.createSequentialGroup()
                        .addGroup(formaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(drinkOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(formaLayout.createSequentialGroup()
                                .addComponent(drinkList, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(drinkQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                        .addComponent(drinkImage, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        formaLayout.setVerticalGroup(
            formaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(foodImage, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(foodQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(foodOrder)
                .addGap(36, 36, 36)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formaLayout.createSequentialGroup()
                        .addGroup(formaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(drinkList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drinkQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(drinkOrder))
                    .addComponent(drinkImage, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(192, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ΦΟΡΜΑ ΠΑΡΑΓΓΕΛΙΑΣ", forma);

        jLabel1.setText("Συνολική τιμή : ");

        priceFull.setText("0$");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(priceFull, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(276, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(priceFull))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Παραγγελία", "Ποσότητα", "Τιμή μονάδας"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(orderTable);
        if (orderTable.getColumnModel().getColumnCount() > 0) {
            orderTable.getColumnModel().getColumn(0).setResizable(false);
            orderTable.getColumnModel().getColumn(1).setResizable(false);
            orderTable.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 161, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout sunoloLayout = new javax.swing.GroupLayout(sunolo);
        sunolo.setLayout(sunoloLayout);
        sunoloLayout.setHorizontalGroup(
            sunoloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sunoloLayout.setVerticalGroup(
            sunoloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sunoloLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ΣΥΝΟΛΙΚΗ ΠΑΡΑΓΓΕΛΙΑ", sunolo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
ImageIcon fanta = new ImageIcon(getClass().getClassLoader().getResource("Images/fanta.jpg"));
ImageIcon gemista = new ImageIcon(getClass().getClassLoader().getResource("Images/gemista.jpg"));
ImageIcon gyros = new ImageIcon(getClass().getClassLoader().getResource("Images/gyros.jpg"));
ImageIcon kokakola = new ImageIcon(getClass().getClassLoader().getResource("Images/kokakola.jpg"));
ImageIcon lemonada = new ImageIcon(getClass().getClassLoader().getResource("Images/lemonada.jpg"));
ImageIcon nero = new ImageIcon(getClass().getClassLoader().getResource("Images/nero.jpg"));
ImageIcon prasini = new ImageIcon(getClass().getClassLoader().getResource("Images/prasini.jpg"));
ImageIcon soutsoukaki = new ImageIcon(getClass().getClassLoader().getResource("Images/soutsoukaki.jpg"));
ImageIcon souvlaki = new ImageIcon(getClass().getClassLoader().getResource("Images/souvlaki.jpg"));
ImageIcon xoriatiki = new ImageIcon(getClass().getClassLoader().getResource("Images/xoriatiki.jpg"));

    private void foodlistValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_foodlistValueChanged
        int index = foodlist.getSelectedIndex();
        selectedFood = foods[index];
        selectedFoodPrice = foodPrice[index];
        switch(selectedFood){
            case "Γύρος" : foodImage.setIcon(gyros);
                break;
            case "Σουτζουκάκι" : foodImage.setIcon(soutsoukaki);
                break;
            case "Σουβλάκι" : foodImage.setIcon(souvlaki);
                break;
            case "Χωριάτικη" : foodImage.setIcon(xoriatiki);
                break;
            case "Πράσινη" : foodImage.setIcon(prasini);
                break;
            case "Γεμιστά" : foodImage.setIcon(gemista);   
                break;
        }
    }//GEN-LAST:event_foodlistValueChanged
String drinks[] = { "Πορτοκαλάδα", "ΚόκαΚόλα", "Νερό", "Λεμονάδα"}; 
    int drinkPrice[] = {2, 3, 1, 2}; 
    private void drinkListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drinkListActionPerformed
        int index = drinkList.getSelectedIndex();
        selectedDrink = drinks[index];
        selectedDrinkPrice = drinkPrice[index];
        switch(selectedDrink){
            case "Πορτοκαλάδα" : drinkImage.setIcon(fanta);
                break;
            case "ΚόκαΚόλα" : drinkImage.setIcon(kokakola);
                break;
            case "Νερό" : drinkImage.setIcon(nero);
                break;
            case "Λεμονάδα" : drinkImage.setIcon(lemonada);
                break;
        }
    }//GEN-LAST:event_drinkListActionPerformed
String selectedFood , selectedDrink;
int selectedFoodQuantity, selectedDrinkQuantity, selectedFoodPrice, selectedDrinkPrice;
        
    private void foodOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodOrderActionPerformed
        selectedFoodQuantity = (int)foodQuantity.getValue();
        Object[] row = { selectedFood, selectedFoodQuantity, selectedFoodPrice};
        DefaultTableModel model = (DefaultTableModel)orderTable.getModel();
        model.addRow(row);
        KameTinSouma();
    }//GEN-LAST:event_foodOrderActionPerformed

    private void drinkOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drinkOrderActionPerformed
        selectedDrinkQuantity = (int)drinkQuantity.getValue();
        Object[] row = { selectedDrink, selectedDrinkQuantity, selectedDrinkPrice};
        DefaultTableModel model = (DefaultTableModel)orderTable.getModel();
        model.addRow(row);
        KameTinSouma();
    }//GEN-LAST:event_drinkOrderActionPerformed
    void KameTinSouma(){
        DefaultTableModel model = (DefaultTableModel)orderTable.getModel();
        int rows = model.getRowCount();
        int payment = 0;
        for(int i=0; i<rows; i++){
            payment += (int)model.getValueAt(i, 2)*(int)model.getValueAt(i, 1);
        }
        priceFull.setText(payment+"$");
    }
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel drinkImage;
    private javax.swing.JComboBox drinkList;
    private javax.swing.JButton drinkOrder;
    private javax.swing.JSpinner drinkQuantity;
    private javax.swing.JLabel foodImage;
    private javax.swing.JButton foodOrder;
    private javax.swing.JSpinner foodQuantity;
    private javax.swing.JList foodlist;
    private javax.swing.JPanel forma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable orderTable;
    private javax.swing.JLabel priceFull;
    private javax.swing.JPanel sunolo;
    // End of variables declaration//GEN-END:variables
}

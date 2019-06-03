public class NewJFrame extends javax.swing.JFrame {
   public NewJFrame() {
        initComponents();
    }
 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        en = new javax.swing.JLabel();
        de = new javax.swing.JLabel();
        ent = new javax.swing.JTextField();
        det = new javax.swing.JTextField();
        enb = new javax.swing.JButton();
        deb = new javax.swing.JButton();
        reb = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 250));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        en.setText("Encoded");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        getContentPane().add(en, gridBagConstraints);

        de.setText("Decoded");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        getContentPane().add(de, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(ent, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(det, gridBagConstraints);

        enb.setText("Encode");
        enb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enbActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        getContentPane().add(enb, gridBagConstraints);

        deb.setText("Decode");
        deb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                debActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        getContentPane().add(deb, gridBagConstraints);

        reb.setText("Reset");
        reb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rebActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        getContentPane().add(reb, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int i;
    private void debActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_debActionPerformed
        StringBuilder en1 = new StringBuilder(ent.getText());
        for(i=0; i<en1.length(); i++){
            en1.setCharAt(i, (char)(en1.charAt(i)+1));
        }
    det.setText(en1.toString());
        
    }//GEN-LAST:event_debActionPerformed

    private void enbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enbActionPerformed
        StringBuilder de1 = new StringBuilder(det.getText());
               for(i=0; i<de1.length(); i++){
                   de1.setCharAt(i, (char)(de1.charAt(i)-1));
               }
           ent.setText(de1.toString());
    }//GEN-LAST:event_enbActionPerformed

    private void rebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rebActionPerformed
        ent.setText("");
        det.setText("");
    }//GEN-LAST:event_rebActionPerformed
  public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel de;
    private javax.swing.JButton deb;
    private javax.swing.JTextField det;
    private javax.swing.JLabel en;
    private javax.swing.JButton enb;
    private javax.swing.JTextField ent;
    private javax.swing.JButton reb;
    // End of variables declaration//GEN-END:variables
}

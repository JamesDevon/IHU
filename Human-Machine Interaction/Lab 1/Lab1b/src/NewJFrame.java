import java.util.*;
public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
    }
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        Startb = new javax.swing.JButton();
        Stopb = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(300, 200));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Beggin timing");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        getContentPane().add(jLabel1, gridBagConstraints);

        Startb.setText("Start");
        Startb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartbActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        getContentPane().add(Startb, gridBagConstraints);

        Stopb.setText("Stop");
        Stopb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StopbActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        getContentPane().add(Stopb, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents
        Calendar cal;
        double start;
        double start1;
        double res;
        String res1;
    private void StartbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartbActionPerformed
        jLabel1.setText("Running...");
            cal = Calendar.getInstance();
            start=cal.getTimeInMillis();
    }//GEN-LAST:event_StartbActionPerformed
    private void StopbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StopbActionPerformed
        cal=Calendar.getInstance();
        start1=cal.getTimeInMillis();
        res = (start1-start)/1000;
        res1 = Double.toString(res);
        jLabel1.setText(res1);
    }//GEN-LAST:event_StopbActionPerformed
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Startb;
    private javax.swing.JButton Stopb;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

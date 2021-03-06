import java.io.*;
import javax.swing.*;

public class Lab7frameB extends javax.swing.JFrame {

    /** Creates new form Lab7frame */
    public Lab7frameB() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        file = new javax.swing.JFileChooser();
        comment = new javax.swing.JLabel();
        rout = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Open = new javax.swing.JToggleButton();
        Save = new javax.swing.JToggleButton();
        wc = new javax.swing.JLabel();
        wcc = new javax.swing.JLabel();
        ccc = new javax.swing.JLabel();
        cc = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        screen = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        comment.setText("comment");

        jLabel2.setText("route");

        Open.setText("Open");
        Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenActionPerformed(evt);
            }
        });

        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        wcc.setText("WC : ");

        ccc.setText("CC :");

        screen.setColumns(20);
        screen.setFont(new java.awt.Font("Monospaced", 0, 14));
        screen.setRows(5);
        screen.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                screenCaretUpdate(evt);
            }
        });
        jScrollPane1.setViewportView(screen);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(comment)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Open)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Save))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rout, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(wc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(wcc)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ccc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cc))
                            .addComponent(jLabel2))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Open)
                    .addComponent(Save))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wc)
                    .addComponent(wcc)
                    .addComponent(ccc)
                    .addComponent(cc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String route;
private void OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenActionPerformed
    int returnVal = file.showOpenDialog(this);
    FileReader fr;
    if(returnVal == JFileChooser.APPROVE_OPTION){
        String route = file.getSelectedFile().getPath();
        if(route.equals(""))
            rout.setText("Error");
        else{
            try{
                fr = new FileReader(route);
                screen.read(fr, null);
                fr.close();
                comment.setText("Done");
            }
            catch(IOException exc){
                comment.setText(exc.getMessage());
            }
        }
    }else if (returnVal == JFileChooser.CANCEL_OPTION){
        comment.setText("Canceled");
    }
    counts();
}//GEN-LAST:event_OpenActionPerformed

private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
    route = rout.getText();
    FileWriter saver ;
    if(route.equals(""))
        rout.setText("Error");
    else{
        try{
            saver = new FileWriter(route);
            screen.write(saver);
            saver.close();
            comment.setText("Done");
        }
        catch(IOException exc){
            comment.setText(exc.getMessage());
        }
    }
}//GEN-LAST:event_SaveActionPerformed

private void screenCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_screenCaretUpdate
    counts();
}//GEN-LAST:event_screenCaretUpdate

void counts(){
    String str = screen.getText();
    cc.setText(String.valueOf(str.length()));
    if(str.length()==0)
        wc.setText("0");
    else{
        String [] strsplit = str.split("\\W+");
        wc.setText(String.valueOf(strsplit.length));
    }
} 
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
            java.util.logging.Logger.getLogger(Lab7frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lab7frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lab7frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lab7frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Lab7frame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Open;
    private javax.swing.JToggleButton Save;
    private javax.swing.JLabel cc;
    private javax.swing.JLabel ccc;
    private javax.swing.JLabel comment;
    private javax.swing.JFileChooser file;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField rout;
    private javax.swing.JTextArea screen;
    private javax.swing.JLabel wc;
    private javax.swing.JLabel wcc;
    // End of variables declaration//GEN-END:variables
}

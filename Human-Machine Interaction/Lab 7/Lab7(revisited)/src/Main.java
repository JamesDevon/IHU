import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main extends javax.swing.JFrame {


    public Main()
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        console = new javax.swing.JLabel();
        filePath = new javax.swing.JTextField();
        open_Button = new javax.swing.JButton();
        save_Button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        countWord = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        countLetter = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textEditor = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 500));

        console.setText("console");

        filePath.setToolTipText("");

        open_Button.setText("Open");
        open_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                open_ButtonActionPerformed(evt);
            }
        });

        save_Button.setText("Save");
        save_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_ButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("WC : ");

        countWord.setText("0");

        jLabel3.setText("LC : ");

        countLetter.setText("0");

        textEditor.setColumns(20);
        textEditor.setRows(5);
        textEditor.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                textEditorCaretUpdate(evt);
            }
        });
        textEditor.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                textEditorInputMethodTextChanged(evt);
            }
        });
        jScrollPane1.setViewportView(textEditor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(console)
                            .addComponent(filePath, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(open_Button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(save_Button)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(countWord)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(countLetter)
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(console)
                .addGap(18, 18, 18)
                .addComponent(filePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(open_Button)
                    .addComponent(save_Button))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(countWord)
                    .addComponent(countLetter)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
String fileNameOpen;
    private void open_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_open_ButtonActionPerformed
        FileReader fr = null;
        fileNameOpen = filePath.getText();
        if(fileNameOpen.equals("")){
            console.setText("Error : No file specified.");
        }
        else
        {
            try
            {
                fr = new FileReader(fileNameOpen);
                textEditor.read(fr, null);
                fr.close();
                console.setText("Done!");
            } catch (IOException exc)
            {
                console.setText(exc.getMessage());
            }
        }
    }//GEN-LAST:event_open_ButtonActionPerformed
String fileNameSave;
    private void save_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_ButtonActionPerformed
            FileWriter fw = null;
            fileNameSave = filePath.getText();
            if(fileNameSave.equals("")){
                console.setText("No path or file name specified.");
            }
            else if(!fileNameSave.equals(fileNameOpen)){
                console.setText("The path or file given do not match the files path or name.");
            }
            else
            {
                try{
                fw = new FileWriter(fileNameSave);
                textEditor.write(fw);
                fw.close();
                console.setText("File Saved.");
                }
                catch(IOException exc)
                {
                    console.setText(exc.getMessage());
                }
            }
    }//GEN-LAST:event_save_ButtonActionPerformed

    private void textEditorInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_textEditorInputMethodTextChanged

    }//GEN-LAST:event_textEditorInputMethodTextChanged

    private void textEditorCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_textEditorCaretUpdate
        String str = textEditor.getText();
        int lc = str.length();
        countLetter.setText(lc+"");
        String [] strsplit = str.split("\\W+");
        countWord.setText(String.valueOf(strsplit.length));
    }//GEN-LAST:event_textEditorCaretUpdate

    
    public static void main(String args[]) {
        
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
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel console;
    private javax.swing.JLabel countLetter;
    private javax.swing.JLabel countWord;
    private javax.swing.JTextField filePath;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton open_Button;
    private javax.swing.JButton save_Button;
    private javax.swing.JTextArea textEditor;
    // End of variables declaration//GEN-END:variables
}

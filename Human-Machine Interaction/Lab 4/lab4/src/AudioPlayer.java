
import java.util.Hashtable;


public class AudioPlayer extends javax.swing.JFrame {

    
    public AudioPlayer() {
        initComponents();
        setupPresets();
        showSliderValues();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jSlider1 = new javax.swing.JSlider();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Bass = new javax.swing.JSlider();
        Midrange = new javax.swing.JSlider();
        Tremble = new javax.swing.JSlider();
        Balance = new javax.swing.JSlider();
        Volume = new javax.swing.JSlider();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        Store = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Bass");
        getContentPane().add(jLabel1, new java.awt.GridBagConstraints());

        jLabel2.setText("Midrange");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        getContentPane().add(jLabel2, gridBagConstraints);

        jLabel3.setText("Tremble");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        getContentPane().add(jLabel3, gridBagConstraints);

        jLabel4.setText("Balance");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        getContentPane().add(jLabel4, gridBagConstraints);

        jLabel5.setText("Volume");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        getContentPane().add(jLabel5, gridBagConstraints);

        jLabel6.setText("Bass: 0 Midrange: 0 Tremble: 0 Balance: 0 Volume: 0");
        jLabel6.setName(""); // NOI18N
        jLabel6.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridheight = 6;
        getContentPane().add(jLabel6, gridBagConstraints);

        Bass.setMajorTickSpacing(2);
        Bass.setMaximum(10);
        Bass.setMinimum(-10);
        Bass.setMinorTickSpacing(1);
        Bass.setPaintLabels(true);
        Bass.setPaintTicks(true);
        Bass.setToolTipText("");
        Bass.setValue(0);
        Bass.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 10, 10, 10));
        Bass.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                BassStateChanged(evt);
            }
        });
        getContentPane().add(Bass, new java.awt.GridBagConstraints());

        Midrange.setMajorTickSpacing(2);
        Midrange.setMaximum(10);
        Midrange.setMinimum(-10);
        Midrange.setMinorTickSpacing(1);
        Midrange.setPaintLabels(true);
        Midrange.setPaintTicks(true);
        Midrange.setValue(0);
        Midrange.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 10, 10, 10));
        Midrange.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                MidrangeStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        getContentPane().add(Midrange, gridBagConstraints);

        Tremble.setMajorTickSpacing(2);
        Tremble.setMaximum(10);
        Tremble.setMinimum(-10);
        Tremble.setMinorTickSpacing(1);
        Tremble.setPaintLabels(true);
        Tremble.setPaintTicks(true);
        Tremble.setValue(0);
        Tremble.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 10, 10, 10));
        Tremble.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                TrembleStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        getContentPane().add(Tremble, gridBagConstraints);

        Balance.setMajorTickSpacing(2);
        Balance.setMaximum(5);
        Balance.setMinimum(-5);
        Balance.setMinorTickSpacing(1);
        Balance.setPaintLabels(true);
        Balance.setSnapToTicks(true);
        Balance.setToolTipText("Center\n");
        Balance.setValue(0);
        Balance.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 10, 10, 10));
        Balance.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                BalanceStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        getContentPane().add(Balance, gridBagConstraints);

        Volume.setMajorTickSpacing(1);
        Volume.setMaximum(10);
        Volume.setPaintLabels(true);
        Volume.setPaintTicks(true);
        Volume.setSnapToTicks(true);
        Volume.setValue(0);
        Volume.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 10, 10, 10));
        Volume.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                VolumeStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        getContentPane().add(Volume, gridBagConstraints);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("M0");
        jRadioButton1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton1ItemStateChanged(evt);
            }
        });
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        getContentPane().add(jRadioButton1, gridBagConstraints);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("M1");
        jRadioButton2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton2ItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        getContentPane().add(jRadioButton2, gridBagConstraints);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("M3");
        jRadioButton3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton3ItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        getContentPane().add(jRadioButton3, gridBagConstraints);

        Store.setText("Store");
        Store.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StoreActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        getContentPane().add(Store, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StoreActionPerformed

    }//GEN-LAST:event_StoreActionPerformed

    private void BassStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_BassStateChanged
        showSliderValues();
    }//GEN-LAST:event_BassStateChanged

    private void MidrangeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_MidrangeStateChanged
        showSliderValues();
    }//GEN-LAST:event_MidrangeStateChanged

    private void TrembleStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_TrembleStateChanged
        showSliderValues();
    }//GEN-LAST:event_TrembleStateChanged

    private void BalanceStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_BalanceStateChanged
        showSliderValues();
    }//GEN-LAST:event_BalanceStateChanged

    private void VolumeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_VolumeStateChanged
        showSliderValues();
    }//GEN-LAST:event_VolumeStateChanged

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        if(jRadioButton1.isSelected())
            storePresets(pinakas[0]);
        else if(jRadioButton2.isSelected())
            storePresets(pinakas[1]);
        else if(jRadioButton3.isSelected())
                        storePresets(pinakas[2]);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton1ItemStateChanged
        loadPresets(pinakas[0]);
    }//GEN-LAST:event_jRadioButton1ItemStateChanged

    private void jRadioButton2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton2ItemStateChanged
        loadPresets(pinakas[1]);
    }//GEN-LAST:event_jRadioButton2ItemStateChanged

    private void jRadioButton3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton3ItemStateChanged
        loadPresets(pinakas[2]);
    }//GEN-LAST:event_jRadioButton3ItemStateChanged

 
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AudioPlayer().setVisible(true);
            }
        });
    }
    void setupPresets(){
        pinakas[0]=new Presets(0,0,0,0,0);
        pinakas[1] = new Presets(1,-1,9,0,4);
        pinakas[2] = new Presets(2,4,-2,4,2);
        
    }
        
    void loadPresets(Presets data ){
        Bass.setValue(data.bass);
        Midrange.setValue(data.midrange);
        Tremble.setValue(data.tremble);
        Balance.setValue(data.balance);
        Volume.setValue(data.volume);
    }
    
    void showSliderValues(){
        jLabel6.setText("<Html> Balance: "+ Bass.getValue()+ "<br> Midrange : "+ Midrange.getValue() +"<br> Tremble"+Tremble.getValue()+"<br> Balance: "+Balance.getValue()+"<br> Volume : "+Volume.getValue());
    }
    void storePresets(Presets data){
        data.bass=Bass.getValue();
        data.midrange=Midrange.getValue();
        data.tremble=Tremble.getValue();
        data.balance=Balance.getValue();
        data.volume=Volume.getValue();
    }
    Presets pinakas[] = new Presets[3];
 Hashtable table = new Hashtable();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider Balance;
    private javax.swing.JSlider Bass;
    private javax.swing.JSlider Midrange;
    private javax.swing.JButton Store;
    private javax.swing.JSlider Tremble;
    private javax.swing.JSlider Volume;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JSlider jSlider1;
    // End of variables declaration//GEN-END:variables
}

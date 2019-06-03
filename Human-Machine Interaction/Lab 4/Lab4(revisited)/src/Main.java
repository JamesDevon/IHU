import java.util.Hashtable;
import javax.swing.JLabel;
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        setupPresets();
        showSliderValues();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        Presets_RadioButtonGroup = new javax.swing.ButtonGroup();
        Bass_Label = new javax.swing.JLabel();
        Midrange_Label = new javax.swing.JLabel();
        Tremble_Label = new javax.swing.JLabel();
        Balance_Label = new javax.swing.JLabel();
        Volume_Label = new javax.swing.JLabel();
        info_Label = new javax.swing.JLabel();
        Bass_Slider = new javax.swing.JSlider();
        Midrange_Slider = new javax.swing.JSlider();
        tremble_Slider = new javax.swing.JSlider();
        balance_Slider = new javax.swing.JSlider();
        volume_Slider = new javax.swing.JSlider();
        Preset1_RadioButton = new javax.swing.JRadioButton();
        Preset2_RadioButton = new javax.swing.JRadioButton();
        Preset3_RadioButton = new javax.swing.JRadioButton();
        Store_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Audio Player");
        setPreferredSize(new java.awt.Dimension(550, 600));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        Bass_Label.setText("Bass");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(Bass_Label, gridBagConstraints);

        Midrange_Label.setText("Midrange");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(Midrange_Label, gridBagConstraints);

        Tremble_Label.setText("Tremble");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(Tremble_Label, gridBagConstraints);

        Balance_Label.setText("Balance");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(Balance_Label, gridBagConstraints);

        Volume_Label.setText("Volume");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(Volume_Label, gridBagConstraints);

        info_Label.setPreferredSize(new java.awt.Dimension(100, 150));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridheight = 2;
        getContentPane().add(info_Label, gridBagConstraints);

        Bass_Slider.setMajorTickSpacing(2);
        Bass_Slider.setMaximum(10);
        Bass_Slider.setMinimum(-10);
        Bass_Slider.setMinorTickSpacing(1);
        Bass_Slider.setPaintLabels(true);
        Bass_Slider.setPaintTicks(true);
        Bass_Slider.setPaintTrack(false);
        Bass_Slider.setToolTipText("");
        Bass_Slider.setValue(0);
        Bass_Slider.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 10, 10, 10));
        Bass_Slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Bass_SliderStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        getContentPane().add(Bass_Slider, gridBagConstraints);

        Midrange_Slider.setMajorTickSpacing(2);
        Midrange_Slider.setMaximum(10);
        Midrange_Slider.setMinimum(-10);
        Midrange_Slider.setMinorTickSpacing(1);
        Midrange_Slider.setPaintLabels(true);
        Midrange_Slider.setPaintTicks(true);
        Midrange_Slider.setPaintTrack(false);
        Midrange_Slider.setValue(0);
        Midrange_Slider.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 10, 10, 10));
        Midrange_Slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Midrange_SliderStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        getContentPane().add(Midrange_Slider, gridBagConstraints);

        tremble_Slider.setMajorTickSpacing(2);
        tremble_Slider.setMaximum(10);
        tremble_Slider.setMinimum(-10);
        tremble_Slider.setMinorTickSpacing(1);
        tremble_Slider.setPaintLabels(true);
        tremble_Slider.setPaintTicks(true);
        tremble_Slider.setPaintTrack(false);
        tremble_Slider.setValue(0);
        tremble_Slider.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 10, 10, 10));
        tremble_Slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tremble_SliderStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        getContentPane().add(tremble_Slider, gridBagConstraints);

        table.put(new Integer(0), new JLabel("Center"));
        table.put(new Integer(-5), new JLabel("L"));
        table.put(new Integer(5), new JLabel("R"));
        balance_Slider.setLabelTable(table);
        balance_Slider.setMajorTickSpacing(2);
        balance_Slider.setMaximum(5);
        balance_Slider.setMinimum(-5);
        balance_Slider.setMinorTickSpacing(1);
        balance_Slider.setPaintLabels(true);
        balance_Slider.setPaintTicks(true);
        balance_Slider.setPaintTrack(false);
        balance_Slider.setValue(0);
        balance_Slider.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 10, 10, 10));
        balance_Slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                balance_SliderStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        getContentPane().add(balance_Slider, gridBagConstraints);

        volume_Slider.setMajorTickSpacing(1);
        volume_Slider.setMaximum(10);
        volume_Slider.setPaintLabels(true);
        volume_Slider.setPaintTicks(true);
        volume_Slider.setPaintTrack(false);
        volume_Slider.setValue(0);
        volume_Slider.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 10, 10, 10));
        volume_Slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                volume_SliderStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        getContentPane().add(volume_Slider, gridBagConstraints);

        Presets_RadioButtonGroup.add(Preset1_RadioButton);
        Preset1_RadioButton.setText("M0");
        Preset1_RadioButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Preset1_RadioButtonItemStateChanged(evt);
            }
        });
        Preset1_RadioButton.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Preset1_RadioButtonStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        getContentPane().add(Preset1_RadioButton, gridBagConstraints);

        Presets_RadioButtonGroup.add(Preset2_RadioButton);
        Preset2_RadioButton.setText("M1");
        Preset2_RadioButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Preset2_RadioButtonItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        getContentPane().add(Preset2_RadioButton, gridBagConstraints);

        Presets_RadioButtonGroup.add(Preset3_RadioButton);
        Preset3_RadioButton.setText("M2");
        Preset3_RadioButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Preset3_RadioButtonItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        getContentPane().add(Preset3_RadioButton, gridBagConstraints);

        Store_Button.setText("Store");
        Store_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Store_ButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        getContentPane().add(Store_Button, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bass_SliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Bass_SliderStateChanged
        showSliderValues();
    }//GEN-LAST:event_Bass_SliderStateChanged

    private void Midrange_SliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Midrange_SliderStateChanged
        showSliderValues();
    }//GEN-LAST:event_Midrange_SliderStateChanged

    private void tremble_SliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tremble_SliderStateChanged
        showSliderValues();
    }//GEN-LAST:event_tremble_SliderStateChanged

    private void balance_SliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_balance_SliderStateChanged
        showSliderValues();
    }//GEN-LAST:event_balance_SliderStateChanged

    private void volume_SliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_volume_SliderStateChanged
        showSliderValues();
    }//GEN-LAST:event_volume_SliderStateChanged

    private void Preset1_RadioButtonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Preset1_RadioButtonStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_Preset1_RadioButtonStateChanged
int index ;
    private void Preset1_RadioButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Preset1_RadioButtonItemStateChanged
        index = 0 ;
        loadPresets(index);
    }//GEN-LAST:event_Preset1_RadioButtonItemStateChanged

    private void Preset2_RadioButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Preset2_RadioButtonItemStateChanged
        index = 1 ;
        loadPresets(index);
    }//GEN-LAST:event_Preset2_RadioButtonItemStateChanged

    private void Preset3_RadioButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Preset3_RadioButtonItemStateChanged
        index = 2 ;
        loadPresets(index);
    }//GEN-LAST:event_Preset3_RadioButtonItemStateChanged

    private void Store_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Store_ButtonActionPerformed
        storePresets(index);
    }//GEN-LAST:event_Store_ButtonActionPerformed

    
    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    void setupPresets(){
        pinakas[0] = new Presets(0,0,0,0,0);
        pinakas[1] = new Presets(1, -1, 9, 0, 4);
        pinakas[2] = new Presets(2, 4, -2, 4, 2);
    }
    void showSliderValues(){
        int bass, tremble, balance, volume, midrange;
        bass = Bass_Slider.getValue();
        midrange = Midrange_Slider.getValue();
        tremble = tremble_Slider.getValue();
        balance = balance_Slider.getValue();
        volume = volume_Slider.getValue();
        
        info_Label.setText("<html><table><tr><td>Bass : </td><td>"+bass+"</td></tr>"
                + "<tr><td>Midrange :</td><td>"+midrange+"</td></tr>"
                + "<tr><td>Tremble : </td><td>"+tremble+"</td></tr>"
                + "<tr><td>Balance : </td><td>"+balance+"</td></tr>"
                + "<tr><td>Volume</td><td>"+volume+"</td></tr>");
        
    }
    void loadPresets(int i){
        info_Label.setText(String.valueOf(pinakas[1]));
        Bass_Slider.setValue(pinakas[i].bass);
        Midrange_Slider.setValue(pinakas[i].midrange);
        tremble_Slider.setValue(pinakas[i].tremble);
        balance_Slider.setValue(pinakas[i].balance);
        volume_Slider.setValue(pinakas[i].volume);
    }
    
    void storePresets(int i){
        pinakas[i].bass = Bass_Slider.getValue();
        pinakas[i].midrange = Midrange_Slider.getValue();
        pinakas[i].tremble = tremble_Slider.getValue();
        pinakas[i].balance = balance_Slider.getValue();
        pinakas[i].volume = volume_Slider.getValue();
    }
Presets pinakas[] = new Presets[3];
Hashtable table = new Hashtable();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Balance_Label;
    private javax.swing.JLabel Bass_Label;
    private javax.swing.JSlider Bass_Slider;
    private javax.swing.JLabel Midrange_Label;
    private javax.swing.JSlider Midrange_Slider;
    private javax.swing.JRadioButton Preset1_RadioButton;
    private javax.swing.JRadioButton Preset2_RadioButton;
    private javax.swing.JRadioButton Preset3_RadioButton;
    private javax.swing.ButtonGroup Presets_RadioButtonGroup;
    private javax.swing.JButton Store_Button;
    private javax.swing.JLabel Tremble_Label;
    private javax.swing.JLabel Volume_Label;
    private javax.swing.JSlider balance_Slider;
    private javax.swing.JLabel info_Label;
    private javax.swing.JSlider tremble_Slider;
    private javax.swing.JSlider volume_Slider;
    // End of variables declaration//GEN-END:variables
}

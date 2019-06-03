public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
    }
 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        calcbox = new javax.swing.JTextField();
        powerb = new javax.swing.JButton();
        clearb = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        addb = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        minusb = new javax.swing.JButton();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        multb = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        dotb = new javax.swing.JButton();
        resb = new javax.swing.JButton();
        divb = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CALC");
        setMinimumSize(new java.awt.Dimension(300, 200));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        calcbox.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        calcbox.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(calcbox, gridBagConstraints);
        calcbox.getAccessibleContext().setAccessibleDescription("");

        powerb.setForeground(new java.awt.Color(204, 0, 0));
        powerb.setText("POWER");
        powerb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powerbActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(powerb, gridBagConstraints);

        clearb.setForeground(new java.awt.Color(204, 0, 0));
        clearb.setText("C");
        clearb.setEnabled(false);
        clearb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(clearb, gridBagConstraints);

        seven.setText("7");
        seven.setEnabled(false);
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(seven, gridBagConstraints);

        eight.setText("8");
        eight.setEnabled(false);
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(eight, gridBagConstraints);

        nine.setText("9");
        nine.setEnabled(false);
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(nine, gridBagConstraints);

        addb.setForeground(new java.awt.Color(204, 0, 0));
        addb.setText("+");
        addb.setEnabled(false);
        addb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(addb, gridBagConstraints);

        four.setText("4");
        four.setEnabled(false);
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(four, gridBagConstraints);

        five.setText("5");
        five.setEnabled(false);
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        getContentPane().add(five, gridBagConstraints);

        six.setText("6");
        six.setEnabled(false);
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(six, gridBagConstraints);

        minusb.setForeground(new java.awt.Color(204, 0, 0));
        minusb.setText("-");
        minusb.setEnabled(false);
        minusb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusbActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(minusb, gridBagConstraints);

        one.setText("1");
        one.setEnabled(false);
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(one, gridBagConstraints);

        two.setText("2");
        two.setEnabled(false);
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(two, gridBagConstraints);

        three.setText("3");
        three.setEnabled(false);
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(three, gridBagConstraints);

        multb.setForeground(new java.awt.Color(204, 0, 0));
        multb.setText("*");
        multb.setEnabled(false);
        multb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multbActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(multb, gridBagConstraints);

        zero.setText("0");
        zero.setEnabled(false);
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(zero, gridBagConstraints);

        dotb.setForeground(new java.awt.Color(204, 0, 0));
        dotb.setText(".");
        dotb.setEnabled(false);
        dotb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotbActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(dotb, gridBagConstraints);

        resb.setForeground(new java.awt.Color(204, 0, 0));
        resb.setText("=");
        resb.setEnabled(false);
        resb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resbActionPerformed(evt);
            }
        });
        resb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                resbKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                resbKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(resb, gridBagConstraints);

        divb.setForeground(new java.awt.Color(204, 0, 0));
        divb.setText("/");
        divb.setEnabled(false);
        divb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divbActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(divb, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

        boolean b =false;
    private void powerbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powerbActionPerformed
        if(b==false)
        {
            addb.setEnabled(true);
            calcbox.setEnabled(true);
            clearb.setEnabled(true);
            divb.setEnabled(true);
            dotb.setEnabled(true);
            eight.setEnabled(true);
            seven.setEnabled(true);
            nine.setEnabled(true);
            one.setEnabled(true);
            two.setEnabled(true);
            three.setEnabled(true);
            four.setEnabled(true);
            five.setEnabled(true);
            six.setEnabled(true);
            zero.setEnabled(true);
            minusb.setEnabled(true);
            multb.setEnabled(true);
            resb.setEnabled(true);
            b=true;
        } else{
            addb.setEnabled(false);
            calcbox.setEnabled(false);
            clearb.setEnabled(false);
            divb.setEnabled(false);
            dotb.setEnabled(false);
            eight.setEnabled(false);
            seven.setEnabled(false);
            nine.setEnabled(false);
            one.setEnabled(false);
            two.setEnabled(false);
            three.setEnabled(false);
            four.setEnabled(false);
            five.setEnabled(false);
            six.setEnabled(false);
            zero.setEnabled(false);
            minusb.setEnabled(false);
            multb.setEnabled(false);
            resb.setEnabled(false);
            b=false;
            calcbox.setText("");
        }
    }//GEN-LAST:event_powerbActionPerformed
    String t;
    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
            t=calcbox.getText()+0;
            calcbox.setText(t);
            
    }//GEN-LAST:event_zeroActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        t=calcbox.getText()+1;
            calcbox.setText(t);
    }//GEN-LAST:event_oneActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        t=calcbox.getText()+2;
            calcbox.setText(t);
    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        t=calcbox.getText()+3;
            calcbox.setText(t);
    }//GEN-LAST:event_threeActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        t=calcbox.getText()+4;
            calcbox.setText(t);
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
t=calcbox.getText()+5;
            calcbox.setText(t);     
    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
t=calcbox.getText()+6;
            calcbox.setText(t); 
    }//GEN-LAST:event_sixActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
t=calcbox.getText()+7;
            calcbox.setText(t); 
    }//GEN-LAST:event_sevenActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
    t=calcbox.getText()+8;
            calcbox.setText(t);     
    }//GEN-LAST:event_eightActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
t=calcbox.getText()+9;
            calcbox.setText(t); 
    }//GEN-LAST:event_nineActionPerformed
boolean d=false;
    private void dotbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotbActionPerformed
          if(d==false){
            t=calcbox.getText()+ ".";
            calcbox.setText(t);
            d=true;
          }
    }//GEN-LAST:event_dotbActionPerformed

    private void clearbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbActionPerformed
        e=0;
        m=false;
        num1=0;
        num2=0;
        calcbox.setText("");
    }//GEN-LAST:event_clearbActionPerformed
        double num1;
        double num2;
        int e=0;
        boolean m=false;
    private void addbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbActionPerformed
        if(e==0){
        num1=Double.parseDouble(calcbox.getText());
        e=1;
        calcbox.setText("");
        } else if(e==1)
        {
            if(m==false){
            num2=Double.parseDouble(calcbox.getText());
            num1= num1 + num2;
            }
            m=false;
            calcbox.setText("");
            e=1;
              }else if(e==2)
        {
            
            if(m==false){
            num2=Double.parseDouble(calcbox.getText());
            num1= num1 - num2;
            
            }m=false;
                calcbox.setText("");
            e=1;
              }else if(e==3)
        {
            
            if(m==false){
            num2=Double.parseDouble(calcbox.getText());
            num1= num1 * num2;
            
            }m=false;
                calcbox.setText("");
            e=1;
              }else if(e==4)
        {
            
            if(m==false){
            num2=Double.parseDouble(calcbox.getText());
            num1= num1 / num2;
            
            }m=false;
                calcbox.setText("");
            e=1;
              }
    }//GEN-LAST:event_addbActionPerformed

    private void resbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resbActionPerformed
                        if(e==1){
                num2=Double.parseDouble(calcbox.getText());
                num1=num1+num2;
                calcbox.setText(String.valueOf(num1));
            }else if(e==2){
                num2=Double.parseDouble(calcbox.getText());
                num1=num1-num2;
                calcbox.setText(String.valueOf(num1));
            }else if(e==3){
                num2=Double.parseDouble(calcbox.getText());
                num1=num2*num1;
                calcbox.setText(String.valueOf(num1));
            }else if(e==4){
                num2=Double.parseDouble(calcbox.getText());
                num1=num1/num2;
                calcbox.setText(String.valueOf(num1));
            }
             m=true;
           
        
    }//GEN-LAST:event_resbActionPerformed

    private void minusbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusbActionPerformed
        if(e==0){
        num1=Double.parseDouble(calcbox.getText());
        e=2;
        calcbox.setText("");
        } else if(e==1)
        {
            if(m==false){
            num2=Double.parseDouble(calcbox.getText());
            num1= num1 + num2;
            }m=false;
                calcbox.setText("");
            e=2;
              }else if(e==2)
        {
            
            if(m==false){
            num2=Double.parseDouble(calcbox.getText());
            num1= num1 - num2;
            
            }m=false;
                calcbox.setText("");
            e=2;
              }else if(e==3)
        {
            
            if(m==false){
            num2=Double.parseDouble(calcbox.getText());
            num1= num1 * num2;
            
            }m=false;
                calcbox.setText("");
            e=2;
              }else if(e==4)
        {
            
            if(m==false){
            num2=Double.parseDouble(calcbox.getText());
            num1= num1 / num2;
            
            }m=false;
                calcbox.setText("");
            e=2;
              }
    }//GEN-LAST:event_minusbActionPerformed

    private void multbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multbActionPerformed
        if(e==0){
        num1=Double.parseDouble(calcbox.getText());
        e=3;
        calcbox.setText("");
        } else if(e==1)
        {
            if(m==false){
            num2=Double.parseDouble(calcbox.getText());
            num1= num1 + num2;
            }m=false;
                calcbox.setText("");
            e=3;
              }else if(e==2)
        {
            
            if(m==false){
            num2=Double.parseDouble(calcbox.getText());
            num1= num1 - num2;
            
            }m=false;
                calcbox.setText("");
            e=3;
              }else if(e==3)
        {
            
            if(m==false){
            num2=Double.parseDouble(calcbox.getText());
            num1= num1 * num2;
            
            }m=false;
                calcbox.setText("");
            e=3;
              }else if(e==4)
        {
            
            if(m==false){
            num2=Double.parseDouble(calcbox.getText());
            num1= num1 / num2;
            
            }m=false;
                calcbox.setText("");
            e=3;
              }
    }//GEN-LAST:event_multbActionPerformed

    private void divbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divbActionPerformed
        if(e==0){
        num1=Double.parseDouble(calcbox.getText());
        e=4;
        calcbox.setText("");
        } else if(e==1)
        {
            if(m==false){
            num2=Double.parseDouble(calcbox.getText());
            num1= num1 + num2;
            }m=false;
                calcbox.setText("");
            e=4;
              }else if(e==2)
        {
            
            if(m==false){
            num2=Double.parseDouble(calcbox.getText());
            num1= num1 - num2;
            
            }m=false;
                calcbox.setText("");
            e=4;
              }else if(e==3)
        {
            
            if(m==false){
            num2=Double.parseDouble(calcbox.getText());
            num1= num1 * num2;
            
            }m=false;
                calcbox.setText("");
            e=4;
              }else if(e==4)
        {
            
            if(m==false){
            num2=Double.parseDouble(calcbox.getText());
            num1= num1 / num2;
            
            }m=false;
                calcbox.setText("");
            e=4;
              }
    }//GEN-LAST:event_divbActionPerformed

    private void resbKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_resbKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_resbKeyTyped

    private void resbKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_resbKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_resbKeyPressed
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addb;
    private javax.swing.JTextField calcbox;
    private javax.swing.JButton clearb;
    private javax.swing.JButton divb;
    private javax.swing.JButton dotb;
    private javax.swing.JButton eight;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JButton minusb;
    private javax.swing.JButton multb;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton powerb;
    private javax.swing.JButton resb;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}

import javax.swing.ImageIcon;
import java.util.Timer; 
import java.util.TimerTask;


/**
 *
 * @author James
 */
public class Main1 extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main1() {
        initComponents();
        
        iconsBig[0] = new ImageIcon(getClass().getClassLoader().getResource("StarWars/HanSolo.jpg"));
        iconsBig[1] = new ImageIcon(getClass().getClassLoader().getResource("StarWars/LukeSky.jpg"));
        iconsBig[2] = new ImageIcon(getClass().getClassLoader().getResource("StarWars/Organa.jpg"));
        iconsBig[3] = new ImageIcon(getClass().getClassLoader().getResource("StarWars/R2D2.jpg"));
        iconsBig[4] = new ImageIcon(getClass().getClassLoader().getResource("StarWars/c3po.jpg"));
        iconsBig[5] = new ImageIcon(getClass().getClassLoader().getResource("StarWars/rey.jpg"));
        
        iconsSmall[0] = new ImageIcon(getClass().getClassLoader().getResource("StarWars/HanSoloMin.jpg"));
        iconsSmall[1] = new ImageIcon(getClass().getClassLoader().getResource("StarWars/LukeSkyMin.jpg"));
        iconsSmall[2] = new ImageIcon(getClass().getClassLoader().getResource("StarWars/OrganaMin.jpg"));
        iconsSmall[3] = new ImageIcon(getClass().getClassLoader().getResource("StarWars/R2D2Min.jpg"));
        iconsSmall[4] = new ImageIcon(getClass().getClassLoader().getResource("StarWars/c3poMin.jpg"));
        iconsSmall[5] = new ImageIcon(getClass().getClassLoader().getResource("StarWars/reyMin.jpg"));
        
        iconBig.setIcon(iconsBig[1]);
        iconSmall1.setIcon(iconsSmall[0]);
        iconSmall2.setIcon(iconsSmall[1]);
        iconSmall3.setIcon(iconsSmall[2]);
        index = 2;
        timer.schedule(new iconChange(), 0, 3000);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        bigScreen = new javax.swing.JPanel();
        iconBig = new javax.swing.JLabel();
        smallScreen = new javax.swing.JPanel();
        iconSmall1 = new javax.swing.JLabel();
        iconSmall2 = new javax.swing.JLabel();
        iconSmall3 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(700, 600));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        bigScreen.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(25, 85, 25, 0);
        bigScreen.add(iconBig, gridBagConstraints);

        getContentPane().add(bigScreen, new java.awt.GridBagConstraints());

        smallScreen.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 50);
        smallScreen.add(iconSmall1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 50);
        smallScreen.add(iconSmall2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 50);
        smallScreen.add(iconSmall3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        getContentPane().add(smallScreen, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents
int index ;
Timer timer = new Timer();
ImageIcon [] iconsBig = new ImageIcon[6];
ImageIcon iconsSmall[] = new ImageIcon[6];
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

class iconChange extends TimerTask {
    public void run() {
       if(index==5){
                index = 0;
                iconSmall1.setIcon(iconsSmall[index+4]);
                iconSmall2.setIcon(iconsSmall[index+5]);
                iconBig.setIcon(iconsBig[index+5]);
                iconSmall3.setIcon(iconsSmall[index]);
                }
            else if(index==0){
                index +=1;
                iconSmall1.setIcon(iconsSmall[index+4]);
                iconSmall2.setIcon(iconsSmall[index-1]);
                iconBig.setIcon(iconsBig[index-1]);
                iconSmall3.setIcon(iconsSmall[index]);
            }else{
                index +=1;
                iconSmall1.setIcon(iconsSmall[index-2]);
                iconSmall2.setIcon(iconsSmall[index-1]);
                iconBig.setIcon(iconsBig[index-1]);
                iconSmall3.setIcon(iconsSmall[index]);
            
            }
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bigScreen;
    private javax.swing.JLabel iconBig;
    private javax.swing.JLabel iconSmall1;
    private javax.swing.JLabel iconSmall2;
    private javax.swing.JLabel iconSmall3;
    private javax.swing.JPanel smallScreen;
    // End of variables declaration//GEN-END:variables
}

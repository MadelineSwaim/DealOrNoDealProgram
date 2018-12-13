/*
 * Copyright (c) 2018 GNU General Public Liscense v3.0
 * All rights reserved.
 */
package dealornodeal;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author mrene
 */
public class frmFinalTwoCases extends javax.swing.JFrame {

    /**
     * Creates new form frmFinalTwoCases
     */
    public frmFinalTwoCases() {
        initComponents();
        
        //Finds out which case# is the players and the final unopened case
        //Then displays the numbers in the case images and in the text
        Icon caseHold1 = new ImageIcon("caseBlankSmall.png");
        Icon caseHold2 = new ImageIcon("caseBlankSmall.png");
        int pCaseHold = -1;
        String pStringHold = "";
        int fCaseHold = -1;
        String fStringHold = "";
        
        for(int i = 0; i < 12; i++){
            if (Opening.caseArr[i].isThisPlayersCase()){
                pCaseHold = i + 1;
                pStringHold = String.format("case%d.png", pCaseHold);
                caseHold1 = new ImageIcon(pStringHold);
            }
            else if(Opening.caseArr[i].isCaseOpen() == false){
                fCaseHold = i + 1;
                fStringHold = String.format("case%d.png", fCaseHold);
                caseHold2 = new ImageIcon(fStringHold);
            }
        }
        lblPCaseImg.setIcon(caseHold1);
        lblFCaseImg.setIcon(caseHold2);
        lblNumber1.setText(String.format("%d", pCaseHold));
        lblNumber2.setText(String.format("%d", fCaseHold));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPCaseImg = new javax.swing.JLabel();
        lblFCaseImg = new javax.swing.JLabel();
        lblMessage1 = new javax.swing.JLabel();
        lblMessage2 = new javax.swing.JLabel();
        lblMessage3 = new javax.swing.JLabel();
        lblMessage4 = new javax.swing.JLabel();
        lblMessage5 = new javax.swing.JLabel();
        btnKeep = new javax.swing.JButton();
        btnSwitch = new javax.swing.JButton();
        lblNumber1 = new javax.swing.JLabel();
        lblNumber2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblPCaseImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/caseBlankSmall.png"))); // NOI18N

        lblFCaseImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/caseBlankSmall.png"))); // NOI18N

        lblMessage1.setFont(new java.awt.Font("Trebuchet MS", 0, 40)); // NOI18N
        lblMessage1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMessage1.setText("This is Your Final Decision.");

        lblMessage2.setFont(new java.awt.Font("Trebuchet MS", 0, 40)); // NOI18N
        lblMessage2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblMessage2.setText("Your Case is Case #");

        lblMessage3.setFont(new java.awt.Font("Trebuchet MS", 0, 40)); // NOI18N
        lblMessage3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblMessage3.setText("The Final Case is Case #");

        lblMessage4.setFont(new java.awt.Font("Trebuchet MS", 0, 40)); // NOI18N
        lblMessage4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMessage4.setText("Would You like to keep your Case");

        lblMessage5.setFont(new java.awt.Font("Trebuchet MS", 0, 40)); // NOI18N
        lblMessage5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMessage5.setText("Or Switch it for the Final Case?");

        btnKeep.setFont(new java.awt.Font("Trebuchet MS", 0, 48)); // NOI18N
        btnKeep.setText("Keep Case");
        btnKeep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeepActionPerformed(evt);
            }
        });

        btnSwitch.setFont(new java.awt.Font("Trebuchet MS", 0, 48)); // NOI18N
        btnSwitch.setText("Switch Cases");
        btnSwitch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSwitchActionPerformed(evt);
            }
        });

        lblNumber1.setFont(new java.awt.Font("Trebuchet MS", 0, 40)); // NOI18N
        lblNumber1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNumber1.setText("__");

        lblNumber2.setFont(new java.awt.Font("Trebuchet MS", 0, 40)); // NOI18N
        lblNumber2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNumber2.setText("__");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMessage4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblMessage5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addComponent(lblPCaseImg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblFCaseImg))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMessage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMessage2, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblNumber1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMessage3, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNumber2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(btnKeep, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPCaseImg)
                    .addComponent(lblFCaseImg))
                .addGap(18, 18, 18)
                .addComponent(lblMessage1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMessage2)
                    .addComponent(lblNumber1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMessage3)
                    .addComponent(lblNumber2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMessage4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMessage5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKeep)
                    .addComponent(btnSwitch))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKeepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeepActionPerformed
        int pCase = -1;
        for(int i = 0; i < 12; i++){
            if (Opening.caseArr[i].isThisPlayersCase()){
                pCase = i;
            }
        }
        frmEndGame.winnings = Opening.caseArr[pCase].getValue();
        new frmEndGame().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnKeepActionPerformed

    private void btnSwitchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSwitchActionPerformed
        int oCase = -1;
        for(int i = 0; i < 12; i++){
            if (Opening.caseArr[i].isCaseOpen() == false){
                oCase = i;
            }
        }
        frmEndGame.winnings = Opening.caseArr[oCase].getValue();
        new frmEndGame().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSwitchActionPerformed

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
            java.util.logging.Logger.getLogger(frmFinalTwoCases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmFinalTwoCases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmFinalTwoCases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmFinalTwoCases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmFinalTwoCases().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKeep;
    private javax.swing.JButton btnSwitch;
    private javax.swing.JLabel lblFCaseImg;
    private javax.swing.JLabel lblMessage1;
    private javax.swing.JLabel lblMessage2;
    private javax.swing.JLabel lblMessage3;
    private javax.swing.JLabel lblMessage4;
    private javax.swing.JLabel lblMessage5;
    private javax.swing.JLabel lblNumber1;
    private javax.swing.JLabel lblNumber2;
    private javax.swing.JLabel lblPCaseImg;
    // End of variables declaration//GEN-END:variables
}
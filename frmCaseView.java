/*
 * Copyright (c) 2018 GNU General Public Liscense v3.0
 * All rights reserved.
 */
package dealornodeal;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Madeline Swaim
 */

public class frmCaseView extends javax.swing.JFrame {

    /**
     * Creates new form frmCaseView
     */
    public frmCaseView() {
        initComponents();
        
        if (Opening.turn > 0){
            Icon blankcase = new ImageIcon("caseBlankSmall.png");
            //This will change the image for the opened or selected cases to indicate that it is not an option
            for(int i = 0; i < 12; i++){
                if (Opening.caseArr[i].isCaseOpen() || Opening.caseArr[i].isThisPlayersCase()){
                    switch (i){
                        case 0:
                            btnCase1.setIcon(blankcase);
                        break;
                        case 1:
                            btnCase2.setIcon(blankcase);
                        break;
                        case 2:
                            btnCase3.setIcon(blankcase);
                        break;
                        case 3:
                            btnCase4.setIcon(blankcase);
                        break;
                        case 4:
                            btnCase5.setIcon(blankcase);
                        break;
                        case 5:
                            btnCase6.setIcon(blankcase);
                        break;
                        case 6:
                            btnCase7.setIcon(blankcase);
                        break;
                        case 7:
                            btnCase8.setIcon(blankcase);
                        break;
                        case 8:
                            btnCase9.setIcon(blankcase);
                        break;
                        case 9:
                            btnCase10.setIcon(blankcase);
                        break;
                        case 10:
                            btnCase11.setIcon(blankcase);
                        break;
                        case 11:
                            btnCase12.setIcon(blankcase);
                        break;
                            
                    }
                }
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCase1 = new javax.swing.JButton();
        btnCase2 = new javax.swing.JButton();
        btnCase3 = new javax.swing.JButton();
        btnCase4 = new javax.swing.JButton();
        btnCase5 = new javax.swing.JButton();
        btnCase6 = new javax.swing.JButton();
        btnCase7 = new javax.swing.JButton();
        btnCase8 = new javax.swing.JButton();
        btnCase9 = new javax.swing.JButton();
        btnCase10 = new javax.swing.JButton();
        btnCase11 = new javax.swing.JButton();
        btnCase12 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCase1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/case1.png"))); // NOI18N
        btnCase1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 191, 41), 3, true));
        btnCase1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCase1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCase1ActionPerformed(evt);
            }
        });

        btnCase2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/case2.png"))); // NOI18N
        btnCase2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 191, 41), 3, true));
        btnCase2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCase2ActionPerformed(evt);
            }
        });

        btnCase3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/case3.png"))); // NOI18N
        btnCase3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 191, 41), 3, true));
        btnCase3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCase3ActionPerformed(evt);
            }
        });

        btnCase4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/case4.png"))); // NOI18N
        btnCase4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 191, 41), 3, true));
        btnCase4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCase4ActionPerformed(evt);
            }
        });

        btnCase5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/case5.png"))); // NOI18N
        btnCase5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 191, 41), 3, true));
        btnCase5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCase5ActionPerformed(evt);
            }
        });

        btnCase6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/case6.png"))); // NOI18N
        btnCase6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 191, 41), 3, true));
        btnCase6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCase6ActionPerformed(evt);
            }
        });

        btnCase7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/case7.png"))); // NOI18N
        btnCase7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 191, 41), 3, true));
        btnCase7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCase7ActionPerformed(evt);
            }
        });

        btnCase8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/case8.png"))); // NOI18N
        btnCase8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 191, 41), 3, true));
        btnCase8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCase8ActionPerformed(evt);
            }
        });

        btnCase9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/case9.png"))); // NOI18N
        btnCase9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 191, 41), 3, true));
        btnCase9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCase9ActionPerformed(evt);
            }
        });

        btnCase10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/case10.png"))); // NOI18N
        btnCase10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 191, 41), 3, true));
        btnCase10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCase10ActionPerformed(evt);
            }
        });

        btnCase11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/case11.png"))); // NOI18N
        btnCase11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 191, 41), 3, true));
        btnCase11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCase11ActionPerformed(evt);
            }
        });

        btnCase12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/case12.png"))); // NOI18N
        btnCase12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 191, 41), 3, true));
        btnCase12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCase12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCase1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCase2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCase3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCase4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCase5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCase6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCase7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCase8)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCase9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCase10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCase11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCase12)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCase1)
                    .addComponent(btnCase2)
                    .addComponent(btnCase3)
                    .addComponent(btnCase4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCase6)
                    .addComponent(btnCase5)
                    .addComponent(btnCase7)
                    .addComponent(btnCase8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCase12)
                    .addComponent(btnCase11)
                    .addComponent(btnCase10)
                    .addComponent(btnCase9)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCase1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCase1ActionPerformed
        btnClicked(0);
    }//GEN-LAST:event_btnCase1ActionPerformed

    private void btnCase2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCase2ActionPerformed
        btnClicked(1);
    }//GEN-LAST:event_btnCase2ActionPerformed

    private void btnCase3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCase3ActionPerformed
        btnClicked(2);
    }//GEN-LAST:event_btnCase3ActionPerformed

    private void btnCase4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCase4ActionPerformed
        btnClicked(3);
    }//GEN-LAST:event_btnCase4ActionPerformed

    private void btnCase5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCase5ActionPerformed
        btnClicked(4);
    }//GEN-LAST:event_btnCase5ActionPerformed

    private void btnCase6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCase6ActionPerformed
        btnClicked(5);
    }//GEN-LAST:event_btnCase6ActionPerformed

    private void btnCase7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCase7ActionPerformed
        btnClicked(6);
    }//GEN-LAST:event_btnCase7ActionPerformed

    private void btnCase8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCase8ActionPerformed
        btnClicked(7);
    }//GEN-LAST:event_btnCase8ActionPerformed

    private void btnCase9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCase9ActionPerformed
        btnClicked(8);
    }//GEN-LAST:event_btnCase9ActionPerformed

    private void btnCase10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCase10ActionPerformed
        btnClicked(9);
    }//GEN-LAST:event_btnCase10ActionPerformed

    private void btnCase11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCase11ActionPerformed
        btnClicked(10);
    }//GEN-LAST:event_btnCase11ActionPerformed

    private void btnCase12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCase12ActionPerformed
        btnClicked(11);
    }//GEN-LAST:event_btnCase12ActionPerformed

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
            java.util.logging.Logger.getLogger(frmCaseView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCaseView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCaseView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCaseView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCaseView().setVisible(true);
            }
        });
    }
    
    private void btnClicked(int caseInd){
        if (Opening.turn <= 0){
            frmConfirmCase.caseNum = caseInd;
            frmConfirmCase.caseNum++;
            new frmConfirmCase().setVisible(true);
            this.setVisible(false);
        }
        else{
            if (Opening.caseArr[caseInd].isCaseOpen() == false && Opening.caseArr[caseInd].isThisPlayersCase() == false){
                //Opens the case
                Opening.caseArr[caseInd].openCase();
                Opening.turn++;
                //Hide this window and open OpenCase form to see what's inside
                frmOpenCase.caseIndex = caseInd;
                new frmOpenCase().setVisible(true);
                this.setVisible(false);
            }
            
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCase1;
    private javax.swing.JButton btnCase10;
    private javax.swing.JButton btnCase11;
    private javax.swing.JButton btnCase12;
    private javax.swing.JButton btnCase2;
    private javax.swing.JButton btnCase3;
    private javax.swing.JButton btnCase4;
    private javax.swing.JButton btnCase5;
    private javax.swing.JButton btnCase6;
    private javax.swing.JButton btnCase7;
    private javax.swing.JButton btnCase8;
    private javax.swing.JButton btnCase9;
    // End of variables declaration//GEN-END:variables
}

/*
 * Copyright (c) 2018 GNU General Public Liscense v3.0
 * All rights reserved.
 */
package dealornodeal;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Madeline Swaim
 */
public class frmConfirmCase extends javax.swing.JFrame {
    public static int caseNum;
    /**
     * Creates new form frmConfirmCase
     */
    public frmConfirmCase() {
        initComponents();
        
        //Setting the case image to have the correct number on it.
        Icon caseImg = new ImageIcon("caseBlankSmall.png");
        
        switch(caseNum){
            case 1:
                caseImg = new ImageIcon("case1.png");
            break;
            case 2:
                caseImg = new ImageIcon("case2.png");
            break;
            case 3:
                caseImg = new ImageIcon("case3.png");
            break;
            case 4:
                caseImg = new ImageIcon("case4.png");
            break;
            case 5:
                caseImg = new ImageIcon("case5.png");
            break;
            case 6:
                caseImg = new ImageIcon("case6.png");
            break;
            case 7:
                caseImg = new ImageIcon("case7.png");
            break;
            case 8:
                caseImg = new ImageIcon("case8.png");
            break;
            case 9:
                caseImg = new ImageIcon("case9.png");
            break;
            case 10:
                caseImg = new ImageIcon("case10.png");
            break;
            case 11:
                caseImg = new ImageIcon("case11.png");
            break;
            case 12:
                caseImg = new ImageIcon("case12.png");
            break;
        }
        lblCaseImage.setIcon(caseImg);
        //Sets the correct # below the image
        lblNumber.setText(String.format("%s", caseNum));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCaseImage = new javax.swing.JLabel();
        lblMessage1 = new javax.swing.JLabel();
        lblMessage2 = new javax.swing.JLabel();
        lblMessage3 = new javax.swing.JLabel();
        btnYes = new javax.swing.JButton();
        btnNo = new javax.swing.JButton();
        lblNumber = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCaseImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/caseBlankSmall.png"))); // NOI18N

        lblMessage1.setFont(new java.awt.Font("Trebuchet MS", 0, 48)); // NOI18N
        lblMessage1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMessage1.setText("You have Selected Case #");

        lblMessage2.setFont(new java.awt.Font("Trebuchet MS", 0, 48)); // NOI18N
        lblMessage2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMessage2.setText("Are you sure that you would ");

        lblMessage3.setFont(new java.awt.Font("Trebuchet MS", 0, 48)); // NOI18N
        lblMessage3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMessage3.setText("like to choose this case?");

        btnYes.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        btnYes.setText("  Yes  ");
        btnYes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(217, 191, 41), 3));
        btnYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYesActionPerformed(evt);
            }
        });

        btnNo.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        btnNo.setText("  No  ");
        btnNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(217, 191, 41), 3));
        btnNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoActionPerformed(evt);
            }
        });

        lblNumber.setFont(new java.awt.Font("Trebuchet MS", 0, 48)); // NOI18N
        lblNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumber.setText("__");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMessage3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(btnYes, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addComponent(btnNo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lblMessage2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(lblMessage1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(lblCaseImage)))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblCaseImage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMessage1)
                    .addComponent(lblNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMessage2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMessage3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnYes)
                    .addComponent(btnNo))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoActionPerformed
        this.setVisible(false);
        new frmCaseView().setVisible(true);
    }//GEN-LAST:event_btnNoActionPerformed

    private void btnYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYesActionPerformed
        int temp = caseNum - 1;
        Opening.turn++;
        Opening.caseArr[temp].setAsPlayerCase();
        new frmCaseView().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnYesActionPerformed

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
            java.util.logging.Logger.getLogger(frmConfirmCase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmConfirmCase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmConfirmCase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmConfirmCase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmConfirmCase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNo;
    private javax.swing.JButton btnYes;
    private javax.swing.JLabel lblCaseImage;
    private javax.swing.JLabel lblMessage1;
    private javax.swing.JLabel lblMessage2;
    private javax.swing.JLabel lblMessage3;
    private javax.swing.JLabel lblNumber;
    // End of variables declaration//GEN-END:variables
}
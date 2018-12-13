/*
 * Copyright (c) 2018 GNU General Public Liscense v3.0
 * All rights reserved.
 */
package dealornodeal;

/**
 *
 * @author Madeline Swaim
 */
public class frmBankerCall extends javax.swing.JFrame {
public static Double offer;
    /**
     * Creates new form frmBankerCall
     */
    public frmBankerCall() {
        initComponents();
        makeOffer();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnlMain = new javax.swing.JPanel();
        txtOfferNum = new javax.swing.JTextField();
        lblMessage1 = new javax.swing.JLabel();
        btnDeal = new javax.swing.JButton();
        btnNoDeal = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pnlMain.setOpaque(false);

        txtOfferNum.setBackground(new java.awt.Color(217, 191, 41));
        txtOfferNum.setFont(new java.awt.Font("Trebuchet MS", 0, 90)); // NOI18N
        txtOfferNum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOfferNum.setText("$000000");

        lblMessage1.setFont(new java.awt.Font("Trebuchet MS", 0, 120)); // NOI18N
        lblMessage1.setForeground(new java.awt.Color(255, 0, 0));
        lblMessage1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMessage1.setText("Banker's Offer");

        btnDeal.setFont(new java.awt.Font("Trebuchet MS", 0, 90)); // NOI18N
        btnDeal.setText("Deal");
        btnDeal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 5));
        btnDeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDealActionPerformed(evt);
            }
        });

        btnNoDeal.setFont(new java.awt.Font("Trebuchet MS", 0, 90)); // NOI18N
        btnNoDeal.setText("No Deal");
        btnNoDeal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 5));
        btnNoDeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoDealActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMessage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(btnDeal, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(btnNoDeal, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 246, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtOfferNum, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(371, 371, 371))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblMessage1)
                .addGap(95, 95, 95)
                .addComponent(txtOfferNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeal)
                    .addComponent(btnNoDeal))
                .addContainerGap(157, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(pnlMain, gridBagConstraints);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/BackgroundSmallest.jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(lblBackground, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDealActionPerformed
        frmEndGame.winnings = offer;
        new frmEndGame().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDealActionPerformed

    private void btnNoDealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoDealActionPerformed
        Opening.turn++;
        this.setVisible(false);
        new frmMoneyView().setVisible(true);
    }//GEN-LAST:event_btnNoDealActionPerformed

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
            java.util.logging.Logger.getLogger(frmBankerCall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBankerCall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBankerCall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBankerCall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmBankerCall().setVisible(true);
            }
        });
    }
    //Calls the CalcAverage method in Opening and offers the average to the player
    public void makeOffer(){
        Opening.calcAverage();
        Double temp1 = 0.0;
        Double test = 0.0;
        for (int i = 0; i < 12; i++){
            if (Opening.caseArr[i].isCaseOpen() == false && Opening.caseArr[i].getValue() > test){
                test = Opening.caseArr[i].getValue();
            }
        }
        Double temp2 = test / 2;
        if (temp1 < temp2){
            temp1 = temp2 - Opening.averageVal;
            temp1 /= 2;
        }
        else if (temp1 > temp2){
            temp1 = Opening.averageVal - temp2;
            temp1 /= 2;
        }
        else{
            temp1 = 0.0;
        }
        offer = temp1 + Opening.averageVal;
        String strHold = String.format("$%,.0f", offer);
        txtOfferNum.setText(strHold);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeal;
    private javax.swing.JButton btnNoDeal;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblMessage1;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JTextField txtOfferNum;
    // End of variables declaration//GEN-END:variables
}
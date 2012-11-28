/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thp.boundary;

import com.thp.control.SalespersonControl;
import com.thp.object.Salesperson;
import java.awt.Color;

/**
 *
 * @author user
 */
public class EditSalespersonForm extends javax.swing.JFrame {

    /**
     * Creates new form EditSalesperson
     */
    public EditSalespersonForm() {
        initComponents();
        this.jNameMsg.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel6 = new javax.swing.JPanel();
        jEditFirstNameTxt = new javax.swing.JTextField();
        jTitleLbl2 = new javax.swing.JLabel();
        jPriceLbl2 = new javax.swing.JLabel();
        jEditLastNameTxt = new javax.swing.JTextField();
        jNameLbl2 = new javax.swing.JLabel();
        jEditPhoneTxt = new javax.swing.JTextField();
        jEditBtn = new javax.swing.JButton();
        jOkBtn = new javax.swing.JButton();
        jTitleLbl3 = new javax.swing.JLabel();
        jTitleLbl4 = new javax.swing.JLabel();
        jTitleLbl5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jNameTxt = new javax.swing.JTextField();
        jTitleLbl = new javax.swing.JLabel();
        jSearchBtn = new javax.swing.JButton();
        jCancelBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jNameMsg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jStatusMsg = new javax.swing.JTextField();

        jFrame1.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                jFrame1WindowOpened(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Salesperson Information"));

        jTitleLbl2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jTitleLbl2.setText("First Name:");

        jPriceLbl2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPriceLbl2.setText("Last Name:");

        jNameLbl2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jNameLbl2.setText("Phone:");

        jEditBtn.setText("Save");
        jEditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jEditBtnMouseClicked(evt);
            }
        });

        jOkBtn.setText("OK");
        jOkBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jOkBtnMouseClicked(evt);
            }
        });

        jTitleLbl3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTitleLbl3.setText("First name is required.");

        jTitleLbl4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTitleLbl4.setText("Last name is required.");

        jTitleLbl5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTitleLbl5.setText("Phone number is required.");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPriceLbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTitleLbl2, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(jNameLbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jEditLastNameTxt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jEditFirstNameTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEditPhoneTxt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jOkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jEditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTitleLbl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTitleLbl4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTitleLbl5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTitleLbl2)
                    .addComponent(jEditFirstNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTitleLbl3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPriceLbl2)
                    .addComponent(jEditLastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTitleLbl4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNameLbl2)
                    .addComponent(jEditPhoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTitleLbl5))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEditBtn)
                    .addComponent(jOkBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Match");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jNameTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jNameTxtKeyTyped(evt);
            }
        });

        jTitleLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTitleLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTitleLbl.setText("Salesperson Name");

        jSearchBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jSearchBtn.setText("Search");
        jSearchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSearchBtnMouseClicked(evt);
            }
        });

        jCancelBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCancelBtn.setText("Cancel");
        jCancelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCancelBtnMouseClicked(evt);
            }
        });

        jLabel4.setText("(i.e. John Smith)");

        jNameMsg.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jNameMsg.setForeground(new java.awt.Color(255, 0, 0));
        jNameMsg.setText("Full name is required.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTitleLbl)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jNameTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addComponent(jNameMsg))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTitleLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNameMsg))
                .addGap(2, 2, 2)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSearchBtn)
                .addGap(4, 4, 4)
                .addComponent(jCancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("EDIT SALESPERSON INFORMATION");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Status:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jStatusMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 147, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(132, 132, 132))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 332, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jStatusMsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jNameTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNameTxtKeyTyped
        // TODO add your handling code here:
        this.jStatusMsg.setText("");
        this.jNameTxt.setBackground(Color.white);
        this.jNameMsg.setVisible(false);
    }//GEN-LAST:event_jNameTxtKeyTyped

    private void jSearchBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSearchBtnMouseClicked
        // TODO add your handling code here:
        //pass each data item into the database
        String [] name = this.jNameTxt.getText().split(" ");
        if(name.length == 2){
            String fn = name[0].toUpperCase();
            String ln = name[1].toUpperCase();

            Salesperson salesperson = new Salesperson();
            salesperson.setSalesperson(fn, ln, "");
            salesperson = SalespersonControl.searchSalesperson(salesperson);
            if(!salesperson.getPhone().equals("")){
                this.jEditFirstNameTxt.setText(salesperson.getFirstName());
                this.jEditLastNameTxt.setText(salesperson.getLastName());
                this.jEditPhoneTxt.setText(salesperson.getPhone());
                this.jStatusMsg.setText("Salesperson found.");
                this.jStatusMsg.setForeground(Color.GREEN);
                this.jFrame1.setVisible(true);
            }
            else
            {
                this.jStatusMsg.setText("No match found.");
                this.jStatusMsg.setForeground(Color.red);
                this.jEditFirstNameTxt.setText("");
                this.jEditLastNameTxt.setText("");
                this.jEditPhoneTxt.setText("");
                this.jNameTxt.requestFocus();
            }
        }
        else{
            this.jNameMsg.setVisible(true);
            this.jNameTxt.setBackground(Color.PINK);
            this.jStatusMsg.setText("Error. Enter the full name.");
            this.jNameTxt.requestFocus();
        }
        
    }//GEN-LAST:event_jSearchBtnMouseClicked

    private void jCancelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCancelBtnMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jCancelBtnMouseClicked

    private void jEditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEditBtnMouseClicked
        // TODO add your handling code here:
        Salesperson salesperson = new Salesperson(this.jEditFirstNameTxt.getText(), this.jEditLastNameTxt.getText(), this.jEditPhoneTxt.getText());
        SalespersonControl.editSalesperson(salesperson);
    }//GEN-LAST:event_jEditBtnMouseClicked

    private void jOkBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jOkBtnMouseClicked
        // TODO add your handling code here:
        this.jFrame1.dispose();
    }//GEN-LAST:event_jOkBtnMouseClicked

    private void jFrame1WindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame1WindowOpened
        // TODO add your handling code here:
        jFrame1.setSize(560, 300);
        jFrame1.setLocation(80,230);
    }//GEN-LAST:event_jFrame1WindowOpened

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
            java.util.logging.Logger.getLogger(EditSalespersonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditSalespersonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditSalespersonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditSalespersonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditSalespersonForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jCancelBtn;
    private javax.swing.JButton jEditBtn;
    public javax.swing.JTextField jEditFirstNameTxt;
    private javax.swing.JTextField jEditLastNameTxt;
    private javax.swing.JTextField jEditPhoneTxt;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jNameLbl2;
    private javax.swing.JLabel jNameMsg;
    public javax.swing.JTextField jNameTxt;
    private javax.swing.JButton jOkBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel jPriceLbl2;
    private javax.swing.JButton jSearchBtn;
    private javax.swing.JTextField jStatusMsg;
    private javax.swing.JLabel jTitleLbl;
    private javax.swing.JLabel jTitleLbl2;
    private javax.swing.JLabel jTitleLbl3;
    private javax.swing.JLabel jTitleLbl4;
    private javax.swing.JLabel jTitleLbl5;
    // End of variables declaration//GEN-END:variables
}

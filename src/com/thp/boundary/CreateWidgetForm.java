package com.thp.boundary;

import com.thp.control.WidgetControl;
import com.thp.object.Widget;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kenneth
 */
public class CreateWidgetForm extends javax.swing.JFrame {

    /**
     * Creates new form createWidgetForm
     */
    public CreateWidgetForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jCreateName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jCreateDesc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jCreateCost = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jCreatePrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jCreateQuant = new javax.swing.JTextField();
        jCreate = new javax.swing.JButton();
        jCancel = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jStatus = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("CREATE NEW WIDGET");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Name:");

        jCreateName.setText("jTextField1");
        jCreateName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCreateNameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Description:");

        jCreateDesc.setText("jTextField2");
        jCreateDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCreateDescActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Unit Cost Price: $");

        jCreateCost.setText("jTextField3");
        jCreateCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCreateCostActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Unit Price: $");

        jCreatePrice.setText("jTextField4");
        jCreatePrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCreatePriceActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Quantity:");

        jCreateQuant.setText("jTextField5");
        jCreateQuant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCreateQuantActionPerformed(evt);
            }
        });

        jCreate.setText("Create");
        jCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCreateMouseReleased(evt);
            }
        });

        jCancel.setText("Cancel");
        jCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCancelMouseReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Status:");

        jStatus.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jStatus.setText("jTextField1");

        jLabel7.setForeground(new java.awt.Color(255, 153, 153));
        jLabel7.setText("Only numbers are allowed.");

        jLabel9.setForeground(new java.awt.Color(255, 153, 153));
        jLabel9.setText("Only numbers are allowed.");

        jLabel10.setForeground(new java.awt.Color(255, 153, 153));
        jLabel10.setText("Only numbers are allowed.");

        jLabel11.setForeground(new java.awt.Color(255, 153, 153));
        jLabel11.setText("Description is too long");

        jLabel12.setForeground(new java.awt.Color(255, 153, 153));
        jLabel12.setText("Name is required.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCreateName, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(jCreateDesc)
                            .addComponent(jCreateCost)
                            .addComponent(jCreatePrice)
                            .addComponent(jCreateQuant)
                            .addComponent(jCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))))))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCreateName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCreateDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCreateCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCreatePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCreateQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCreate)
                    .addComponent(jCancel))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(jLabel1)
                .addContainerGap(253, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCreateNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCreateNameActionPerformed
        // TODO add your handling code here:
        jCreateName.getText();  //assign to name of instance of widget
    }//GEN-LAST:event_jCreateNameActionPerformed

    private void jCreateMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCreateMouseReleased
        // WRITE CODE TO DETECT STRINGS IN FIELDS THAT REQUIRE NUMBERS:
        String pattern = "[^0-9]*";
        Boolean errorstatus = false;
        this.jLabel7.setVisible(false);
        this.jLabel9.setVisible(false);
        this.jLabel10.setVisible(false);
        this.jLabel11.setVisible(false);
        this.jLabel12.setVisible(false);
        if(this.jCreateName.getText().isEmpty() || this.jCreateName.getText().length() > 30)
        {
            this.jLabel12.setVisible(true);
            this.jStatus.setText("BOUNDARY ERROR");
            errorstatus = true;
        }
        if(this.jCreateDesc.getText().length() > 60)
        {
            this.jLabel11.setVisible(true);
            this.jStatus.setText("BOUNDARY ERROR");
            errorstatus = true;
        }
        if(this.jCreateCost.getText().matches(pattern))
        {
            this.jLabel7.setVisible(true);
            this.jStatus.setText("INPUT ERROR");
            errorstatus = true;
        }
        if(this.jCreatePrice.getText().matches(pattern))
        {
            this.jLabel9.setVisible(true);
            this.jStatus.setText("INPUT ERROR");
            errorstatus = true;
        }
        if(this.jCreateQuant.getText().matches(pattern))
        {
            this.jLabel10.setVisible(true);
            this.jStatus.setText("INPUT ERROR");
            errorstatus = true;
        }
        if(errorstatus==false)
        {
            Widget w = new Widget(this.jCreateName.getText().toUpperCase(), this.jCreateDesc.getText(),
                    Double.parseDouble(this.jCreateCost.getText()), Double.parseDouble(this.jCreatePrice.getText()), 
                    Integer.parseInt(this.jCreateQuant.getText()));
            String message = WidgetControl.createWidget(w);

            this.jStatus.setText(message);
            this.jLabel7.setVisible(false);
            this.jLabel9.setVisible(false);
            this.jLabel10.setVisible(false);
        }
    }//GEN-LAST:event_jCreateMouseReleased

    private void jCreateDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCreateDescActionPerformed
        // TODO add your handling code here:
        jCreateDesc.getText();
    }//GEN-LAST:event_jCreateDescActionPerformed

    private void jCreateCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCreateCostActionPerformed
        // TODO add your handling code here:
        jCreateCost.getText();
    }//GEN-LAST:event_jCreateCostActionPerformed

    private void jCreatePriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCreatePriceActionPerformed
        // TODO add your handling code here:
        jCreatePrice.getText();
    }//GEN-LAST:event_jCreatePriceActionPerformed

    private void jCreateQuantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCreateQuantActionPerformed
        // TODO add your handling code here:
        jCreateQuant.getText();
    }//GEN-LAST:event_jCreateQuantActionPerformed

    private void jCancelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCancelMouseReleased
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jCancelMouseReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        jCreateName.setText("");
        jCreateDesc.setText("");
        jCreateCost.setText("");
        jCreatePrice.setText("");
        jCreateQuant.setText("");
        jStatus.setText("");
        jLabel7.setVisible(false);
        jLabel9.setVisible(false);
        jLabel10.setVisible(false);
        this.jLabel11.setVisible(false);
        this.jLabel12.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(CreateWidgetForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateWidgetForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateWidgetForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateWidgetForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateWidgetForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jCancel;
    private javax.swing.JButton jCreate;
    private javax.swing.JTextField jCreateCost;
    private javax.swing.JTextField jCreateDesc;
    private javax.swing.JTextField jCreateName;
    private javax.swing.JTextField jCreatePrice;
    private javax.swing.JTextField jCreateQuant;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jStatus;
    // End of variables declaration//GEN-END:variables
}

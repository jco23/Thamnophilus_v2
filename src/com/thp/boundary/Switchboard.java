package com.thp.boundary;

import com.thp.control.ReportControl;
import com.thp.object.AccountDB;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Switchboard extends javax.swing.JFrame {

    /**
     * Creates new form Switchboard
     */
    public Switchboard() {
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

        jPanel1 = new javax.swing.JPanel();
        jCreateC_btn = new javax.swing.JButton();
        jEditC_btn = new javax.swing.JButton();
        jCustomer_Label = new javax.swing.JLabel();
        jSearchC_btn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jWidgets_Label = new javax.swing.JLabel();
        jCreateW_btn = new javax.swing.JButton();
        jEditW_btn = new javax.swing.JButton();
        jSearchW_btn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jInvoices_Label = new javax.swing.JLabel();
        jCreateI_btn = new javax.swing.JButton();
        jDeleteI_bt = new javax.swing.JButton();
        jSearchI_btn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jSalesperson_Label = new javax.swing.JLabel();
        jCreateS_btn = new javax.swing.JButton();
        jEditS_btn = new javax.swing.JButton();
        jSearchS_btn = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jIndivMonthSalesBtn = new javax.swing.JButton();
        jIndivQuaterSalesBtn = new javax.swing.JButton();
        jReports_Label = new javax.swing.JLabel();
        jIndivMonthWidgetBtn = new javax.swing.JButton();
        jReports_Label1 = new javax.swing.JLabel();
        jReports_Label2 = new javax.swing.JLabel();
        jReports_Label3 = new javax.swing.JLabel();
        jReports_Label4 = new javax.swing.JLabel();
        jIndivCustSalesBtn = new javax.swing.JButton();
        jAllCustSalesBtn = new javax.swing.JButton();
        jAllMonthSalesBtn = new javax.swing.JButton();
        jAllQuaterSalesBtn = new javax.swing.JButton();
        jAllMonthWidgetBtn = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jRecordP_btn = new javax.swing.JButton();
        jPayments_Label = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Account Receivable");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jCreateC_btn.setText("Create");
        jCreateC_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCreateC_btnMouseClicked(evt);
            }
        });

        jEditC_btn.setText("Edit");
        jEditC_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jEditC_btnMouseClicked(evt);
            }
        });

        jCustomer_Label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jCustomer_Label.setText("Customers");

        jSearchC_btn.setText("Search");
        jSearchC_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSearchC_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSearchC_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCreateC_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jEditC_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jCustomer_Label))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCustomer_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCreateC_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jEditC_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSearchC_btn)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jWidgets_Label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jWidgets_Label.setText("Widgets");

        jCreateW_btn.setText("Create");
        jCreateW_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCreateW_btnMouseClicked(evt);
            }
        });

        jEditW_btn.setText("Edit");
        jEditW_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jEditW_btnMouseClicked(evt);
            }
        });

        jSearchW_btn.setText("Search");
        jSearchW_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSearchW_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jWidgets_Label)
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSearchW_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCreateW_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jEditW_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jWidgets_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCreateW_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jEditW_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSearchW_btn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jInvoices_Label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jInvoices_Label.setText("Invoices");

        jCreateI_btn.setText("Create");
        jCreateI_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCreateI_btnMouseClicked(evt);
            }
        });

        jDeleteI_bt.setText("Delete");
        jDeleteI_bt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDeleteI_btMouseClicked(evt);
            }
        });

        jSearchI_btn.setText("Search");
        jSearchI_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSearchI_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInvoices_Label)
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSearchI_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCreateI_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDeleteI_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInvoices_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCreateI_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDeleteI_bt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSearchI_btn)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSalesperson_Label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jSalesperson_Label.setText("Salespersons");

        jCreateS_btn.setText("Create");
        jCreateS_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCreateS_btnMouseClicked(evt);
            }
        });

        jEditS_btn.setText("Edit");
        jEditS_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jEditS_btnMouseClicked(evt);
            }
        });

        jSearchS_btn.setText("Search");
        jSearchS_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSearchS_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSearchS_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCreateS_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jEditS_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSalesperson_Label))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSalesperson_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCreateS_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jEditS_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSearchS_btn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jIndivMonthSalesBtn.setText("Individual");
        jIndivMonthSalesBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jIndivMonthSalesBtnMouseClicked(evt);
            }
        });

        jIndivQuaterSalesBtn.setText("Individual");
        jIndivQuaterSalesBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jIndivQuaterSalesBtnMouseClicked(evt);
            }
        });

        jReports_Label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jReports_Label.setText("Reports");

        jIndivMonthWidgetBtn.setText("Individual");
        jIndivMonthWidgetBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jIndivMonthWidgetBtnMouseClicked(evt);
            }
        });

        jReports_Label1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jReports_Label1.setText("Customer Sales Report");

        jReports_Label2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jReports_Label2.setText("Monthly Salesperson Sales Report");

        jReports_Label3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jReports_Label3.setText("Monthly Widget Sales Reports");

        jReports_Label4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jReports_Label4.setText("Quarterly Salesperson Sales Report");

        jIndivCustSalesBtn.setText("Individual");
        jIndivCustSalesBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jIndivCustSalesBtnMouseClicked(evt);
            }
        });

        jAllCustSalesBtn.setText("All");
        jAllCustSalesBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jAllCustSalesBtnMouseClicked(evt);
            }
        });

        jAllMonthSalesBtn.setText("All");
        jAllMonthSalesBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jAllMonthSalesBtnMouseClicked(evt);
            }
        });

        jAllQuaterSalesBtn.setText("All");
        jAllQuaterSalesBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jAllQuaterSalesBtnMouseClicked(evt);
            }
        });

        jAllMonthWidgetBtn.setText("All");
        jAllMonthWidgetBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jAllMonthWidgetBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jReports_Label)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jIndivQuaterSalesBtn)
                            .addComponent(jIndivMonthSalesBtn)
                            .addComponent(jIndivMonthWidgetBtn)))
                    .addComponent(jIndivCustSalesBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jAllQuaterSalesBtn)
                        .addComponent(jAllMonthSalesBtn)
                        .addComponent(jAllMonthWidgetBtn))
                    .addComponent(jAllCustSalesBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jReports_Label4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jReports_Label3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jReports_Label1)
                    .addComponent(jReports_Label2))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jReports_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jReports_Label1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jAllCustSalesBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jIndivCustSalesBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jReports_Label2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jAllMonthSalesBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jIndivMonthSalesBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(5, 5, 5)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jReports_Label4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jAllQuaterSalesBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jIndivQuaterSalesBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jReports_Label3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jAllMonthWidgetBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jIndivMonthWidgetBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jRecordP_btn.setText("Record Payment");
        jRecordP_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRecordP_btnMouseClicked(evt);
            }
        });

        jPayments_Label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPayments_Label.setText("Payments");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPayments_Label)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jRecordP_btn)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPayments_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRecordP_btn)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Quit");
        jMenuItem1.setActionCommand("jMenu_quit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jIndivCustSalesBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jIndivCustSalesBtnMouseClicked
        try {
            // TODO add your handling code here:
            ReportControl.createExcelWorkbook();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Switchboard.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Switchboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jIndivCustSalesBtnMouseClicked

    private void jIndivMonthSalesBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jIndivMonthSalesBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jIndivMonthSalesBtnMouseClicked

    private void jIndivQuaterSalesBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jIndivQuaterSalesBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jIndivQuaterSalesBtnMouseClicked

    private void jIndivMonthWidgetBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jIndivMonthWidgetBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jIndivMonthWidgetBtnMouseClicked

    private void jAllCustSalesBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAllCustSalesBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jAllCustSalesBtnMouseClicked

    private void jAllMonthSalesBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAllMonthSalesBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jAllMonthSalesBtnMouseClicked

    private void jAllQuaterSalesBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAllQuaterSalesBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jAllQuaterSalesBtnMouseClicked

    private void jAllMonthWidgetBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAllMonthWidgetBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jAllMonthWidgetBtnMouseClicked

    private void jRecordP_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRecordP_btnMouseClicked
        // TODO add your handling code here:
        new PaymentForm().setVisible(true);
    }//GEN-LAST:event_jRecordP_btnMouseClicked

    private void jSearchI_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSearchI_btnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jSearchI_btnMouseClicked

    private void jDeleteI_btMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDeleteI_btMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jDeleteI_btMouseClicked

    private void jCreateI_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCreateI_btnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jCreateI_btnMouseClicked

    private void jCreateW_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCreateW_btnMouseClicked
        // TODO add your handling code here:
        new CreateWidgetForm().setVisible(true);
    }//GEN-LAST:event_jCreateW_btnMouseClicked

    private void jEditW_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEditW_btnMouseClicked
        // TODO add your handling code here:
        new EditWidgetForm().setVisible(true);
    }//GEN-LAST:event_jEditW_btnMouseClicked

    private void jSearchW_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSearchW_btnMouseClicked
        // TODO add your handling code here:
        new SearchWidgetForm().setVisible(true);
    }//GEN-LAST:event_jSearchW_btnMouseClicked

    private void jSearchS_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSearchS_btnMouseClicked
        // TODO add your handling code here:
        new SearchSalespersonForm().setVisible(true);
    }//GEN-LAST:event_jSearchS_btnMouseClicked

    private void jEditS_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEditS_btnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jEditS_btnMouseClicked

    private void jCreateS_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCreateS_btnMouseClicked
        // TODO add your handling code here:
        new CreateSalespersonForm().setVisible(true);
    }//GEN-LAST:event_jCreateS_btnMouseClicked

    private void jCreateC_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCreateC_btnMouseClicked
        // TODO add your handling code here:
        new CreateCustomerForm().setVisible(true);
    }//GEN-LAST:event_jCreateC_btnMouseClicked

    private void jEditC_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEditC_btnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jEditC_btnMouseClicked

    private void jSearchC_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSearchC_btnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jSearchC_btnMouseClicked


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
            java.util.logging.Logger.getLogger(Switchboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Switchboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Switchboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Switchboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Switchboard().setVisible(true);
                try {
                    AccountDB.openDB();
                } catch (SQLException ex) {
                    Logger.getLogger(Switchboard.class.getName()).log(Level.SEVERE, null, ex);
            }

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAllCustSalesBtn;
    private javax.swing.JButton jAllMonthSalesBtn;
    private javax.swing.JButton jAllMonthWidgetBtn;
    private javax.swing.JButton jAllQuaterSalesBtn;
    private javax.swing.JButton jCreateC_btn;
    private javax.swing.JButton jCreateI_btn;
    private javax.swing.JButton jCreateS_btn;
    private javax.swing.JButton jCreateW_btn;
    private javax.swing.JLabel jCustomer_Label;
    private javax.swing.JButton jDeleteI_bt;
    private javax.swing.JButton jEditC_btn;
    private javax.swing.JButton jEditS_btn;
    private javax.swing.JButton jEditW_btn;
    private javax.swing.JButton jIndivCustSalesBtn;
    private javax.swing.JButton jIndivMonthSalesBtn;
    private javax.swing.JButton jIndivMonthWidgetBtn;
    private javax.swing.JButton jIndivQuaterSalesBtn;
    private javax.swing.JLabel jInvoices_Label;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel jPayments_Label;
    private javax.swing.JButton jRecordP_btn;
    private javax.swing.JLabel jReports_Label;
    private javax.swing.JLabel jReports_Label1;
    private javax.swing.JLabel jReports_Label2;
    private javax.swing.JLabel jReports_Label3;
    private javax.swing.JLabel jReports_Label4;
    private javax.swing.JLabel jSalesperson_Label;
    private javax.swing.JButton jSearchC_btn;
    private javax.swing.JButton jSearchI_btn;
    private javax.swing.JButton jSearchS_btn;
    private javax.swing.JButton jSearchW_btn;
    private javax.swing.JLabel jWidgets_Label;
    // End of variables declaration//GEN-END:variables
}

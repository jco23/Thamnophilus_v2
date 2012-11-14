/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thp.control;

import com.thp.boundary.PaymentForm;
import com.thp.object.AccountDB;
import com.thp.object.Payment;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class PaymentControl {
    public static String enterPayment(Payment pment){
        try{
            Statement stmt = AccountDB.conn.createStatement();
            String sql = "INSERT INTO APP.PAYMENTS(paymentID, invoiceID, amountPaid, paymentDate) VALUES(" +
                    pment.getPaymentId() + ", " +
                    pment.getInvoiceId() + ", " +
                    pment.getAmountPaid() + ", '" +
                    pment.getPaymentDate() +"')";
            stmt.executeUpdate(sql);
            return "Payment successfully entered";
        }catch (SQLException ex) {
            Logger.getLogger(PaymentForm.class.getName()).log(Level.SEVERE, null, ex);
            return "Error. Entering payment failed.";
        }
    } 
   
}

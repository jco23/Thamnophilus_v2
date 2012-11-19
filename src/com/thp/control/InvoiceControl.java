/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thp.control;

import com.thp.boundary.CreateCustomerForm;
import com.thp.object.AccountDB;
import com.thp.object.Invoice;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class InvoiceControl {
    InvoiceControl(){}
    public static String createInvoice(Invoice inv)
    {
         try {
            Statement stmt = AccountDB.conn.createStatement();  
            String sql = "INSERT INTO APP.INVOICES(invoiceid, customerid, salespersonid,"
                                                   + " widgetid, qty, invoicedate, termscode,"
                                                   + " shipdate, subtotal, discount,"
                                                   + " tax, total, balance, paymentduedate) VALUES('" + 
                            inv.getInvoiceId() + "', '" + 
                            inv.getCustomerId() + "', '" + 
                            inv.getSalespersonId() + "', '" +
                            inv.getWidgetId() + "', '" +
                            inv.getQuantity() + "', '" +
                            inv.getIssueDate() + "', '" +
                            inv.getTermsCode() + "', '" +
                            inv.getShipDate() + "', '" +
                            inv.getPaymentDueDate() + "', '" +
                            inv.getSubtotal() + "', '" +
                            inv.getDiscount() + "', '" +
                            inv.getTax() + "', '" +
                            inv.getTotal() + "', '" +
                            inv.getBalance() + "', '" +
                            inv.getPaymentDueDate() + "')";
            stmt.executeUpdate(sql);
            return "Salesperson successfully created.";
        } catch (SQLException ex) {
            Logger.getLogger(CreateCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
            return "Error. Salesperson was not successfully created.";
        }
    }
    public static void deleteInvoice(){}
    public static void searchInvoice(){} 
}

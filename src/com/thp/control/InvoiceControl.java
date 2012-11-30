/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thp.control;

import com.thp.boundary.CreateCustomerForm;
import com.thp.object.AccountDB;
import com.thp.object.Invoice;
import com.thp.object.WidgetInvoice;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class InvoiceControl {
    InvoiceControl(){}
    /**
     *
     * @param inv
     * @param widInvList
     * @return
     */
    public static String createInvoice(Invoice inv, ArrayList<WidgetInvoice> widInvList)
    {
         try {
            Statement stmt = AccountDB.conn.createStatement();  
            String sqlInv = "INSERT INTO APP.INVOICES(customerid, salespersonid,"
                                                   + "invoicedate, duedate, termscode,"
                                                   + " shipdate, subtotal, discount,"
                                                   + " tax, total, balance, financecharge) VALUES(" + 
                            inv.getCustomerId() + ", " + 
                            inv.getSalespersonId() + ", '" +
                            inv.getInvoiceDate() + "', '" +
                            inv.getDueDate() + "', '" +
                            inv.getTermsCode() + "', '" +
                            inv.getShipDate() + "', " +
                            inv.getSubtotal() + ", " +
                            inv.getDiscount() + ", " +
                            inv.getTax() + ", " +
                            inv.getTotal() + ", " +
                            inv.getBalance() + ", " +
                            inv.getFinanceCharge() + ")";
            //for(int i = 0; i < widInvList.size(); i++){
           //     String sqlWid = getSqlWid(widInvList, i);
          //      stmt.execute(sqlWid);
          //  }
            System.out.println(sqlInv);
            stmt.executeUpdate(sqlInv);
            return "Invoice successfully created.";
        } catch (SQLException ex) {
            Logger.getLogger(CreateCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
            return "Error. Invoice was not successfully created.";
        }
    }
    
    public static String getSqlWid(ArrayList<WidgetInvoice> widInvList, int i)
    {
        WidgetInvoice widInv = widInvList.get(i);
        String sqlWid = "INSERT INTO APP.WIDGETSINVOICES(widgetid, invoiceid, qty) VALUES(" + 
                            widInv.getWidgetId() + ", " + 
                            widInv.getInvoiceId() + ", " + 
                            widInv.getQuantity() + ")";
        return sqlWid;
    }
    /*
    public static void editInvoice(Invoice sp){
        try {
            Statement stmt = AccountDB.conn.createStatement();
            System.out.println("Connected");
            String sql = "UPDATE APP.SALESPEOPLE " + 
                        "SET FIRSTNAME='" + sp.getFirstName() +
                        "', LASTNAME='" + sp.getLastName() +
                        "', PHONE=" + sp.getPhone() + 
                        " WHERE FIRSTNAME='" + sp.getFirstName() +
                        "' AND LASTNAME='" + sp.getLastName() + "'" ;
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(CreateCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    //Pre-condition: Salesperson object containing firstname & lastname
    //Post-condition: Returns a status message
    public static Invoice searchInvoice(Invoice sp){
        try {
            Statement stmt = AccountDB.conn.createStatement();
            String sql = "SELECT ID, FIRSTNAME, LASTNAME, PHONE FROM APP.SALESPEOPLE WHERE FIRSTNAME='" + 
                            sp.getFirstName() + "' AND LASTNAME = '" + sp.getLastName() + "'";
            ResultSet rs = stmt.executeQuery(sql);
                while(rs.next()){
                    sp.setId(rs.getInt("ID"));
                    sp.setSalesperson(rs.getString("FIRSTNAME"), rs.getString("LASTNAME"), rs.getString("PHONE"));
                }
 
        } catch (SQLException ex) {
            Logger.getLogger(CreateCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sp;
    }*/
    public static void deleteInvoice(){}
    public static void searchInvoice(){} 
}

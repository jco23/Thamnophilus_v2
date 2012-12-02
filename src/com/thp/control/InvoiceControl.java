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
import java.sql.ResultSet;
import java.sql.Array;
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
    public static String createInvoice(Invoice inv)
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
            
            stmt.executeUpdate(sqlInv);
            return "Invoice successfully created.";
        } catch (SQLException ex) {
            Logger.getLogger(CreateCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
            return "Error. Invoice was not successfully created.";
        }
    }
    
    public static int populateWidInv(ArrayList<WidgetInvoice> widInvList)
    {
        try{
            Statement stmt = AccountDB.conn.createStatement(); 
            int siz = widInvList.size();
            for(int i = 0; i < widInvList.size(); i++){
                String sqlWid = getSqlWid(widInvList, i);
                stmt.execute(sqlWid);
            }
            return 1;
        }
        catch(SQLException ex) {
            Logger.getLogger(CreateCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
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
            Logger.getLogger(InvoiceControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    */
    //Pre-condition: Salesperson object containing firstname & lastname
    //Post-condition: Returns a status message
    public static ResultSet searchInvoiceBy(String attr, String lname){
        ResultSet rs = null;
        try {
            Statement stmt = AccountDB.conn.createStatement();
            String sql;
            if(attr.equals("CLASTNAME")){
                sql = "SELECT inv.INVOICEID, cust.LASTNAME, inv.BALANCE, inv.SALESPERSONID, cust.COMPANY "
                          + "FROM APP.INVOICES AS inv "
                          + "INNER JOIN APP.CUSTOMERS AS cust "
                          + "ON inv.CUSTOMERID = cust.ID "
                          + "WHERE " + attr.substring(1) +" = " + lname;
            }else{
                sql = "SELECT inv.INVOICEID, cust.LASTNAME, inv.BALANCE, inv.SALESPERSONID, cust.COMPANY "
                          + "FROM APP.INVOICES AS inv "
                          + "INNER JOIN APP.SALESPEOPLE AS sp "
                          + "ON inv.SALESPERSONID = sp.ID "
                          + "INNER JOIN APP.CUSTOMERS AS cust "
                          + "ON inv.CUSTOMERID = cust.ID "
                          + "WHERE sp." + attr.substring(1) +" = " + lname;
            }
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    public static ResultSet searchInvoiceBy(String attr, int id){
        ResultSet rs = null;
        try {
            Statement stmt = AccountDB.conn.createStatement();
            String sql = "SELECT inv.INVOICEID, cust.LASTNAME, inv.BALANCE, inv.SALESPERSONID, cust.COMPANY "
                          + "FROM APP.INVOICES AS inv "
                          + "INNER JOIN APP.CUSTOMERS AS cust "
                          + "ON inv.CUSTOMERID = cust.ID "
                          + "WHERE inv." + attr +" = " + id;
            rs = stmt.executeQuery(sql);
                
 
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public static int deleteInvoice(int invId){
        try{
            Statement stmt = AccountDB.conn.createStatement();
            String sqlWigInv = "delete from APP.WIDGETSINVOICES where INVOICEID = " + invId;
            String sqlInv = "delete from APP.INVOICES where INVOICEID = " + invId;
            stmt.executeUpdate(sqlWigInv);
            stmt.executeUpdate(sqlInv);
            return 1;
        }
        catch(SQLException ex){
            Logger.getLogger(InvoiceControl.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    
    }
}

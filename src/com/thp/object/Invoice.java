/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.thp.object;

import com.thp.boundary.CreateCustomerForm;
import java.sql.Array;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Invoice {
    int invoiceId;
    int customerId;
    int salespersonId;
    int widgetId;
    int quantity;
    Date invoiceDate;
    Date shipDate;
    String termsCode;
    Date paymentDueDate;
    double subtotal;
    double tax;
    double discount;
    double total;
    double balance;
    double financeCharge;
    String nullDate = "NULL";
    
    public Invoice(){
        setInvoice(0, 0, 0, 0,
                    0, null, null, "", null,
                    0, 0, 0, 0, 0);
    }
    public Invoice(int invId, int custId, int spId, int wId,
                    int qty, Date invDate, Date sDate, String tCode, Date pDate,
                    double subtot, double tAmount, double dAmount, double totAmount, double bal){
        setInvoice(invId, custId, spId, wId,
                    qty, invDate, sDate, tCode, pDate,
                    subtot, tAmount, dAmount, totAmount, bal);
    }
    
    public void setInvoice(int invId, int custId, int spId, int wId,
                    int qty, Date invDate, Date sDate, String tCode, Date pDate,
                    double subtot, double tAmount, double dAmount, double totAmount, double bal){
        setInvoiceId(invId);
        setCustomerId(custId);
        setSalespersonId(spId);
        setWidgetId(wId);
        setQuantity(qty);
        setInvoiceDate(invDate);
        setShipDate(sDate);
        setTermsCode(tCode);
        setPaymentDueDate(pDate);
        setSubtotal(subtot);
        setTax(tAmount);
        setDiscount(dAmount);
        setTotal(totAmount);
        setBalance(bal);
    }
    
    public String setInvoiceId(int invId){
        if(invIdExist(invId) == true){
            invoiceId = invId;
            return "";
        }
        else{
            String err = "ID: " + invId + " already exists!";
            return err;
        }
    }
    public String  setCustomerId(int custId){
        if(custIdExist(custId) == true){
            customerId = custId;
            return "";
        }
        else{
            String err = "ID: " + custId + " does not exists!";
            return err;
        }
    }
    public String setSalespersonId(int spId){
        if(spIdExist(spId) == true){
            salespersonId = spId;
            return "";
        }
        else{
            String err = "ID: " + spId + " does not exists!";
            return err;
        }
    }
    public void setWidgetId(int wId){
        widgetId = wId;
    }
    public void setQuantity(int qty){
        quantity = qty;
    }
    public void setInvoiceDate(Date invDate){
        invoiceDate = invDate;
    }
    public void setShipDate(Date sDate){
        shipDate = sDate;
    }
    public void setTermsCode(String tCode){
        termsCode = tCode;
    }
    public void setPaymentDueDate(Date pDate){
        paymentDueDate = pDate;
    }
    public void setSubtotal(double subtot){
        subtotal = subtot;
    }
    public void setTax(double tAmount){
        tax = tAmount;
    }
    public void setDiscount(double dAmount){
         discount = dAmount;
    }
    public void setTotal(double totAmount){
        total = totAmount;
    }
    public void setBalance(double bal){
        balance = bal;
    }
    public void setFinanceCharge(double finCharge){
        financeCharge = finCharge;
    }
   
    public int getInvoiceId(){
        return invoiceId;
    }
    public int getCustomerId(){
        return customerId;
    }
    public int getSalespersonId(){
        return salespersonId;
    }
    public int getWidgetId(){
        return widgetId;
    }
    public int getQuantity(){
        return quantity;
    }
    public Date getInvoiceDate(){
        return invoiceDate;
    }
    public Date getShipDate(){
        return shipDate;
    }
    public String getTermsCode(){
        return termsCode;
    }
    public Date getDueDate(){
        return paymentDueDate;
    }
    public double getSubtotal(){
        return subtotal;
    }
    public double getTax(){
        return tax;
    }
    public double getDiscount(){
         return discount;
    }
    public double getTotal(){
        return total;
    }
    public double getBalance(){
        return balance;
    }
    public double getFinanceCharge(){
        return financeCharge;
    }
    public boolean invIdExist(int invId){
        boolean valid = true;
        try{
            Statement stmt = AccountDB.conn.createStatement();  
            String sqlInvId = "select INVOICEID from APP.INVOICES";
            ResultSet rs = stmt.executeQuery(sqlInvId);
            while(rs.next()){
                if (invId == rs.getInt("INVOICEID")){
                    valid = true;
                    break;
                }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CreateCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
            valid = false;
            return valid;
        }
        return valid;
    }
    
    public boolean custIdExist(int custId){
        boolean valid = false;
        try{
            Statement stmt = AccountDB.conn.createStatement();  
            String sqlCustId = "select ID from APP.CUSTOMERS";
            ResultSet rs = stmt.executeQuery(sqlCustId);
            while(rs.next()){
                if (custId == rs.getInt("ID")){
                    valid = true;
                    break;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(CreateCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
            valid = false;
            return valid;
        }
        return valid;
    }
    
    public boolean spIdExist(int custId){
        boolean valid = false;
        try{
            Statement stmt = AccountDB.conn.createStatement();  
            String sqlCustId = "select ID from APP.CUSTOMERS";
            ResultSet rs = stmt.executeQuery(sqlCustId);
            while(rs.next()){
                if (custId == rs.getInt("ID")){
                    valid = true;
                    break;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(CreateCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
            valid = false;
            return valid;
        }
        return valid;
    }
}

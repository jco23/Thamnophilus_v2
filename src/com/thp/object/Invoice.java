/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.thp.object;

import java.sql.Date;

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
    String termsCode;
    Date shipDate;
    double subtotal;
    double tax;
    double discount;
    double total;
    double balance;
    
    public Invoice(){
        setInvoice(0, 0, 0, 0,
                    0, null, "", null,
                    0, 0, 0, 0, 0);
    }
    public Invoice(int invId, int custId, int spId, int wId,
                    int qty, Date invDate, String tCode, Date sDate,
                    double subtot, double tAmount, double dAmount, double totAmount, double bal){
        setInvoice(invId, custId, spId, wId,
                    qty, invDate, tCode, sDate,
                    subtot, tAmount, dAmount, totAmount, bal);
    }
    
    public void setInvoice(int invId, int custId, int spId, int wId,
                    int qty, Date invDate, String tCode, Date sDate,
                    double subtot, double tAmount, double dAmount, double totAmount, double bal){
        setInvoiceId(invId);
        setCustomerId(custId);
        setSalespersonId(spId);
        setWidgetId(wId);
        setQuantity(qty);
        setInvoiceDate(invDate);
        setTermsCode(tCode);
        setShipDate(sDate);
        setSubtotal(subtot);
        setTax(tAmount);
        setDiscount(dAmount);
        setTotal(totAmount);
        setBalance(bal);
    }
    
    public void setInvoiceId(int invId){
        invoiceId = invId;
    }
    public void setCustomerId(int custId){
        customerId = custId;
    }
    public void setSalespersonId(int spId){
        salespersonId = spId;
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
    public void setTermsCode(String tCode){
        termsCode = tCode;
    }
    public void setShipDate(Date sDate){
        shipDate = sDate;
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
    public String getTermsCode(){
        return termsCode;
    }
    public Date getShipDate(){
        return shipDate;
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
    
                    
}

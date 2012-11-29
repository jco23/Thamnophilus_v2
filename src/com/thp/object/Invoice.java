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
    Date shipDate;
    String termsCode;
    Date paymentDueDate;
    double subtotal;
    double tax;
    double discount;
    double total;
    double balance;
    double financeCharge;
    
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
}

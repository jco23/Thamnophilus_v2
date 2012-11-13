/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thp.object;
import java.util.*;
/**
 *
 * @author Mark Ma
 */
public class Payment {
    int paymentId;
    int invoiceId;
    double amountPaid;
    String paymentDate;
    
    public Payment(){
        setPayment(0,0,null);
    }
    public Payment(int invId, double amtPaid, String date)
    {
        setPayment(invId, amtPaid, date);
    }
    public void setPayment(int invId, double amtPaid, String pDate){
        setInvoiceId(invId);
        setAmountPaid(amtPaid);
        setPaymentDate(pDate);
    }
    
    public void setPaymentId(int payId){
        paymentId = payId;
    }
    public void setInvoiceId(int invId){
        invoiceId = invId;
    }
    public void setAmountPaid(double amtPaid){
        amountPaid = amtPaid;
    }
    public void setPaymentDate(String pDate){
        paymentDate = pDate;
    }
    
    public int getPaymentId(){
        return paymentId;
    }
    public int getInvoiceId(){
        return invoiceId;
    }
    public double getAmountPaid(){
        return amountPaid;
    }
    public String getPaymentDate(){
        return paymentDate;
    }
    
}

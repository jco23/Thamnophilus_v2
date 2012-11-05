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
    Date paymentDate;
    
    public Payment(){
        setPayment(0,0,null);
    }
    public Payment(int invId, double amtPaid, Date date)
    {
        setPayment(invId, amtPaid, date);
    }
    public void setPayment(int invId, double amtPaid, Date pDate){
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
    public void setPaymentDate(Date pDate){
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
    public Date getPaymentDate(){
        return paymentDate;
    }
    
}

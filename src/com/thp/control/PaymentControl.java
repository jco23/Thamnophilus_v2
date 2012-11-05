/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thp.control;

import com.thp.object.Payment;

/**
 *
 * @author user
 */
public class PaymentControl {
    public static String enterPayment(Payment pment){
        boolean success = true; 
        String status;
        if(success == true) {
            status = "Successful";
        }     
        else {
            status = "Fail!";
        }
        return status;
    } 
   
}

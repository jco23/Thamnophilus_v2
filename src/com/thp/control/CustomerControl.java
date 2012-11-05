/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thp.control;

import com.thp.boundary.CreateCustomerForm;
import com.thp.object.AccountDB;
import com.thp.object.Customer;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class CustomerControl {
    CustomerControl(){
        
    }
    
    public static String createCustomer(Customer cust){
        try {
            Statement stmt = AccountDB.conn.createStatement();  
            String sql = "INSERT INTO APP.CUSTOMERS(custtype, " + 
                    "firstname, lastname, company, phone, fax, email, contact, " +
                    "soldtoaddress, soldtocity, soldtostate, soldtozipcode, " + 
                    "shiptoaddress, shiptocity, shiptostate, shiptozipcode, " + 
                    "preference, salespersonid, termscode, discount, taxrate) VALUES('" + 
                            cust.getCustType() + ", " + 
                            cust.getFirstName() + "', '" + 
                            cust.getLastName() + "', " + 
                            cust.getPhone() + ", '" + 
                            cust.getFax() + ", " +
                            cust.getEmail() + "', '" + 
                            cust.getContact() + "', '" + 
                            cust.getSoldToAddress() + "', '" + 
                            cust.getSoldToCity() + "', '" + 
                            cust.getSoldToState() + "', " + 
                            cust.getSoldToZip() + ", '" +
                            cust.getShipToAddress() + "', '" + 
                            cust.getShipToCity() + "', '" +
                            cust.getShipToState() + "', " + 
                            cust.getShipToZip() + ", " + 
                            cust.getPreference() + ", " + 
                            cust.getSalesperson() + ", '" + 
                            cust.getTermsCode() + "', " + 
                            cust.getDiscountRate() + ", " +
                            cust.getTaxRate() + ")";
            stmt.executeUpdate(sql);
            return "Customer successfully created.";
        } catch (SQLException ex) {
            Logger.getLogger(CreateCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
            return "Error. Customer was not successfully created.";
        }
    }
    public static void editCustomer(){
    
    }
    public static void searchCustomer(){
    
    }
}

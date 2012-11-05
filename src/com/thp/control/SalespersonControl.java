/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thp.control;

import com.thp.boundary.CreateCustomerForm;
import com.thp.object.AccountDB;
import com.thp.object.Salesperson;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Joanne Co
 */
public class SalespersonControl {
    public SalespersonControl(){};
    
    //Pre-condition: Salesperson object containing firstname, lastname, & phone
    //Post-condition: Returns a status message
    public static String createSalesperson(Salesperson sp){
        try {
            Statement stmt = AccountDB.conn.createStatement();  
            String sql = "INSERT INTO APP.SALESPEOPLE(firstname, lastname, phone) VALUES('" + 
                            sp.getFirstName() + "', '" + 
                            sp.getLastName() + "', "+ 
                            sp.getPhone() + ")";
            stmt.executeUpdate(sql);
            return "Salesperson successfully created.";
        } catch (SQLException ex) {
            Logger.getLogger(CreateCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
            return "Error. Salesperson was not successfully created.";
        }
    }
        
    //Pre-condition: Salesperson object containing firstname, lastname, & phone
    //Post-condition: None
    public static void editSalesperson(Salesperson sp){
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
    public static Salesperson searchSalesperson(Salesperson sp){
        try {
            Statement stmt = AccountDB.conn.createStatement();
            String sql = "SELECT ID, FIRSTNAME, LASTNAME, PHONE FROM APP.SALESPEOPLE WHERE FIRSTNAME='" + 
                            sp.getFirstName() + "' AND LASTNAME = '" + sp.getLastName() + "'";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                sp.setId(rs.getInt("ID"));
                sp.setSalesperson(rs.getString("FIRSTNAME"), rs.getString("LASTNAME"), rs.getLong("PHONE"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CreateCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sp;
    }
}

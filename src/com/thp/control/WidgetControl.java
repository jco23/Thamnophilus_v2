/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thp.control;

import com.thp.boundary.CreateWidgetForm;
import com.thp.object.AccountDB;
import com.thp.object.Widget;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author user
 */
public class WidgetControl {
    WidgetControl(){}
    
    //Pre-Condition: Object containing widget's name, description, prices and quantity
    //Post-Condition: Status message is received upon successful creation
    public static String createWidget(Widget w)
    {
        try
        {
            Statement stmt = AccountDB.conn.createStatement();
            String sql = "INSERT INTO APP.WIDGETS(WIDGETNAME, DESCRIPTION,CUNITPRICE, SUNITPRICE, QTY) "
                    + "VALUES('"+ w.getName() +"', '"+ w.getDescription() +"', "+ w.getUnitCostPrice()
                    +", "+ w.getUnitSellPrice() +", "+w.getQuantity() +")";
            stmt.executeUpdate(sql);
            return "Success!";
        }catch (SQLException ex) {
            Logger.getLogger(CreateWidgetForm.class.getName()).log(Level.SEVERE, null, ex);
            return "ERROR.";}
    }
    
    //Pre-Condition: Widget object that have a name, description, prices, and quantity
    //Post-Condition: Status message received upon successful saving changes
    public static String editWidget(Widget w)
    {
        try
        {
            Statement stmt = AccountDB.conn.createStatement();
            String sql = "UPDATE APP.WIDGETS "+
                        "SET WIDGETNAME='" +w.getName() +
                        "', DESCRIPTION='" +w.getDescription() +
                        "', CUNITPRICE=" +w.getUnitCostPrice() +
                        ", SUNITPRICE=" +w.getUnitSellPrice() +
                        ", QTY=" +w.getQuantity() +
                        " WHERE ID= " +w.getWidgetId()+ "" ;
            stmt.executeUpdate(sql);
            return "Success!.";
        }catch(SQLException ex){
            Logger.getLogger(CreateWidgetForm.class.getName()).log(Level.SEVERE, null, ex);
            return "Error!";
        }
    }
    
    //Pre-Condition: Desired Widget object that has a name, description, prices, and quantity
    //Post-Condition: 
    public static Widget searchWidget(Widget w)
    {
        try
        {
            Statement stmt = AccountDB.conn.createStatement();
            String sql = "SELECT ID, WIDGETNAME, DESCRIPTION, CUNITPRICE, SUNITPRICE, QTY FROM APP.WIDGETS "+
                        "WHERE WIDGETNAME='" +w.getName()+ "'";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next())
            {
                w.setWidgetId(rs.getInt("ID"));
                w.setWidget(rs.getString("WIDGETNAME"), rs.getString("DESCRIPTION"), rs.getDouble("CUNITPRICE"),
                        rs.getDouble("SUNITPRICE"), rs.getInt("QTY"));
            }
        }catch(SQLException ex){Logger.getLogger(CreateWidgetForm.class.getName()).log(Level.SEVERE, null, ex);};
        return w;
    }    
}

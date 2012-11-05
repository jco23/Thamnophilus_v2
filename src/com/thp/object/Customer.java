package com.thp.object;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joanne Co
 */
public class Customer extends Person {
    int id;
    int type;
    String company;
    String soldToAddress;
    String soldToCity;
    String soldToState;
    int soldToZipCode;
    String shipToAddress;
    String shipToCity;
    String shipToState;
    int shipToZipCode;
    long phone;
    long fax;
    String email;
    String contact;
    boolean preference;
    int discount;
    String termsCode;
    double taxRate;
    int salespersonId;
    
    public Customer() throws SQLException{
        setCustomer("","","",0,0,"","","","","","","","","","",true,"","",0,0);
    }

    public Customer(String fn, 
                    String ln, 
                    String cp, 
                    long tel, 
                    long fax, 
                    String em, 
                    String ct, 
                    String soldAddr, 
                    String soldCity, 
                    String soldState, 
                    String soldZip, 
                    String shipAddr, 
                    String shipCity, 
                    String shipState, 
                    String shipZip, 
                    boolean pref, 
                    String sp,
                    String terms, 
                    int dRate, 
                    double tRate) throws SQLException {
        setCustomer(fn,ln,cp,tel,fax,em,ct,soldAddr,soldCity,soldState,soldZip,shipAddr,shipCity, shipState,shipZip,pref,sp,terms,dRate,tRate);
    }
 //Set functions
    public void setCustomer(String fn,
                            String ln,
                            String cp,
                            long tel,
                            long fx,
                            String em,
                            String ct,
                            String soldAddr,
                            String soldCity,
                            String soldState,
                            String soldZip,
                            String shipAddr,
                            String shipCity,
                            String shipState,
                            String shipZip,
                            boolean pref,
                            String sp,
                            String terms,
                            int dRate,
                            double tRate) throws SQLException{
        setPerson(fn, ln);
        setPhone(tel);
        setFax(fx);
        setEmail(em);
        setContact(ct);
        setSoldToAddress(soldAddr,soldCity,soldState,soldZip);
        setShipToAddress(shipAddr, shipCity, shipState, shipZip);
        setPreference(pref);
        setSalesPerson(sp);
        setTermsCode(terms);
        setDiscountRate(dRate);
        setTaxRate(tRate);
        
    }
    public void setCustType(boolean ctype){
        if(ctype)
            type = 1;
        else
            type = 2;
    }
    public void setCustomerName(String fn, String ln){
        setPerson(fn, ln);
    }
    public void setPhone(long tel){
        phone=tel;
    }
    public void setFax(long fx){
        fax=fx;
    }
    
    public void setEmail(String em){
        email=em;
    }
    public void setContact(String ct){
        contact=ct;
    }
    public void setSoldToAddress(String soldAddr, String soldCity, String soldState, String soldZip){
        soldToAddress=soldAddr;
        soldToCity=soldCity;
        soldToState=soldState;
        soldToZipCode=Integer.parseInt(soldZip);
    
    }
    public void setShipToAddress(String shipAddr, String shipCity, String shipState, String shipZip){
        shipToAddress=shipAddr;
        shipToCity=shipCity;
        shipToState=shipState;
        shipToZipCode=Integer.parseInt(shipZip);    
    }
    public void setPreference(boolean pref){
        preference=pref;
    }
    public void setSalesPerson(String sp) throws SQLException{
       String name[] = sp.split(" ");
       Statement stmt = AccountDB.conn.createStatement();
       String sql = "SELECT ID FROM APP.SALESPEOPLE WHERE FIRSTNAME='" + 
                    name[0] + "' AND LASTNAME = '" + name[1] + "'";
       ResultSet rs = stmt.executeQuery(sql);
       while(rs.next()){
            salespersonId = rs.getInt("ID");
       }
       rs.close();
    }
    public void setTermsCode(String terms){
        termsCode=terms;
    }
    public void setDiscountRate(int dRate){
        discount=dRate;
    }
    public void setTaxRate(double tRate){  
        taxRate=tRate;
    }
    
// GET Functions  
    public int getCustType(){
        return type;
    }

    public long getPhone(){
        return phone;
    }
    public String getCompany(){
        return company;
    }
    public long getFax(){
        return fax;
    }
    public String getEmail(){
        return email;
    }
    public String getContact(){
        return contact;
    }
    public String getSoldToAddress(){
        return soldToAddress;
    }
    public String getSoldToCity(){
        return soldToCity;
    }
    public String getSoldToState(){
        return soldToState;
    }
    public int getSoldToZip(){
        return soldToZipCode;
    }
    public String getShipToAddress(){
        return shipToAddress;
    }
    public String getShipToCity(){
        return shipToCity;
    }
    public String getShipToState(){
        return shipToState;
    }
    public int getShipToZip(){
        return shipToZipCode;
    }
    public boolean getPreference(){
        return preference;
    }
    public int getSalesperson(){
        return salespersonId;
    }
    public String getTermsCode(){
        return termsCode;
    }
    public int getDiscountRate(){
        return discount;
    }
    public double getTaxRate(){
        return taxRate;
    }
    
    
}

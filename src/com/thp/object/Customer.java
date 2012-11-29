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
    String soldToZipCode;
    String shipToAddress;
    String shipToCity;
    String shipToState;
    String shipToZipCode;
    String phone;
    String fax;
    String email;
    String contact;
    int preference;
    int discount;
    String termsCode;
    double taxRate;
    int salespersonId;
    
    public Customer() throws SQLException{
                    //type, fn,     ln,     cp, 
        setCustomer(true,   "",     "",     "", 
                    //tel,  fax,    em,     ct,
                    "",     "",     "",     "",
                    //sold, sold,   sold,   sold
                    "",     "",     "",     "",
                    //ship, ship,   ship,   ship
                    "",     "",     "",     "",
                    //pref, spId,   tc,     drate,  trate
                    true,   "",     "",     0,      0);
    }

    public Customer(boolean cType,      String fn,          String ln,          String cp, 
                    String tel,         String fax,         String em,          String ct, 
                    String soldAddr,    String soldCity,    String soldState,   String soldZip, 
                    String shipAddr,    String shipCity,    String shipState,   String shipZip, 
                    boolean pref,       String sp,          String terms,       int dRate,      double tRate) 
                    throws SQLException {
        setCustomer(cType,fn,ln,cp,
                    tel,fax,em,ct,
                    soldAddr,soldCity,soldState,soldZip,
                    shipAddr,shipCity, shipState,shipZip,
                    pref,sp,terms,dRate,tRate);
    }
 //Set functions
    public void setCustomer(boolean cType,      String fn,          String ln,          String cp,
                            String tel,         String fx,          String em,          String ct,
                            String soldAddr,    String soldCity,    String soldState,   String soldZip,
                            String shipAddr,    String shipCity,    String shipState,   String shipZip,
                            boolean pref,       String sp,          String terms,       int dRate,      double tRate) 
                            throws SQLException{
        setCustType(cType);         setPerson(fn,       ln);                    setCompany(cp);
        setPhone(tel);              setFax(fx);         setEmail(em);           setContact(ct);
        setSoldToAddress(soldAddr,  soldCity,           soldState,              soldZip);
        setShipToAddress(shipAddr,  shipCity,           shipState,              shipZip);
        setPreference(pref);        setSalesPerson(sp); setTermsCode(terms);    setDiscountRate(dRate); setTaxRate(tRate);
        
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
    public void setCompany(String cp){
        company=cp;
    }
    public void setPhone(String tel){
        phone=tel;
    }
    public void setFax(String fx){
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
        soldToZipCode=soldZip;
    
    }
    public void setShipToAddress(String shipAddr, String shipCity, String shipState, String shipZip){
        shipToAddress=shipAddr;
        shipToCity=shipCity;
        shipToState=shipState;
        shipToZipCode=shipZip;   
    }
    public void setPreference(boolean pref){
        if(pref){
            preference=1;
        }
        else
        {
            preference=2;
        }
    }
    public void setSalesPerson(String sp) throws SQLException{
       if(!sp.equals("")){
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
       else{
           salespersonId = 0;
       }
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
    public String getCompany(){
        return company;
    }
    public String getPhone(){
        return phone;
    }
    public String getFax(){
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
    public String getSoldToZip(){
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
    public String getShipToZip(){
        return shipToZipCode;
    }
    public int getPreference(){
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

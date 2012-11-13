/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thp.object;

/**
 *
 * @author user
 */
public class Salesperson extends Person{
    public static final int MAX_PHONE=14;
    int id;
    String phone;

    public Salesperson(){
        setSalesperson("","","");
    }

    public Salesperson(String fn, String ln, String tel){
        setSalesperson(fn, ln, tel);
    }
    public void setSalesperson(String fn, String ln, String tel) {
        setPerson(fn, ln);
        setPhone(tel);
    }

    
    public void setId(int sid){
        id = sid;
    }
    public void setPhone(String tel){
        if(tel.length() > MAX_PHONE){
            System.out.println("Phone number exceeds 10 digits. Will be set to null.");
            phone = "";
        }
        else{
            phone = tel;
        }
    }
    public int getId(){
        return id;
    }

    public String getPhone(){
        return phone;
    }  

}

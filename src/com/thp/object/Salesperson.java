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
    public static final int MAX_PHONE=10;
    int id;
    long phone;

    public Salesperson(){
        setSalesperson("","",0);
    }

    public Salesperson(String fn, String ln, long tel){
        setSalesperson(fn, ln, tel);
    }
    public void setSalesperson(String fn, String ln, long tel) {
        setPerson(fn, ln);
        setPhone(tel);
    }

    
    public void setId(int sid){
        id = sid;
    }
    public void setPhone(long tel){
        if(tel < 0){
            System.out.println("Phone number is negative. Will be set to 0");
            phone = 0000000000;
        }
        else{
            phone = tel;
        }
    }
    public int getId(){
        return id;
    }

    public long getPhone(){
        return phone;
    }  


}

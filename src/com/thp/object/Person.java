package com.thp.object;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joanne Co
 */
public class Person {
    public static final int MAX_NAME = 30;
    String firstName;
    String lastName;
    
    public Person(){
        setPerson("","");
    }
    public Person(String fn, String ln){
        setPerson(fn, ln);
    }
    public void setPerson(String fn, String ln){
        if(fn.length() > MAX_NAME){
            System.out.println("First name exceeds the maximum length. Will be truncated.");
            firstName=fn.substring(0, MAX_NAME);
        }
        else{
            firstName=fn;
        }
        
        if(ln.length() > MAX_NAME){
            System.out.println("Last name exceeds the maximum length. Will be truncated.");
            lastName=fn.substring(0, MAX_NAME);
        }
        else{
            lastName=ln;
        }
    }
    
    public String getFirstName(){
        return firstName; 
    }
    
    public String getLastName(){
        return lastName;
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thp.object;

/**
 *
 * @author user
 */
public class Widget {
    long id;
    String name;
    String description;
    double unitCostPrice;
    double unitSellPrice;
    int quantity;
    
    public Widget(){
        setWidget("","",0,0,0);
    }
    
    public Widget(String nm, String desc, double cPrice, double sPrice, int qty){
        setWidget(nm, desc, cPrice, sPrice, qty);
    }
    public void setWidget(String nm, String desc, double cPrice, double sPrice, int qty){
        setName(nm);
        setDescription(desc);
        setUnitCostPrice(cPrice);
        setUnitSellPrice(sPrice);
        setQuantity(qty);
    }
    
    
    
    public void setWidgetId(long wid){
        id = wid;
    }
    public void setName(String nm){
        name=nm;
    }
    public void setDescription(String desc){
        description=desc;
    }
    public void setUnitCostPrice(double cPrice){
        unitCostPrice=cPrice;
    }
    public void setUnitSellPrice(double sPrice){
        unitSellPrice=sPrice;
    }
    public void setQuantity(int qty){
        quantity=qty;
    }

    
    
    public long getWidgetId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public double getUnitCostPrice(){
        return unitCostPrice;
    }
    public double getUnitSellPrice(){
        return unitSellPrice;
    }
    public int getQuantity(){
        return quantity;
    }
    
}

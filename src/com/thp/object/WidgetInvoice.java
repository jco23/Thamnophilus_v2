/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thp.object;

/**
 *
 * @author Mark Ma
 */
public class WidgetInvoice {
    int widgetId;
    int invoiceId;
    int qty;
    
    public WidgetInvoice(){
        setWidgetInvoice(0,0,0);
    }
    public WidgetInvoice(int widId, int invId, int quant){
        setWidgetInvoice(widId, invId, quant);
    }
    public void setWidgetInvoice(int widId, int invId, int quant)
    {
        setWidgetId(widId);
        setInvoiceId(invId);
        setQuantity(quant);
    }
    public void setWidgetId(int widId)
    {
        widgetId = widId;
    }
    public void setInvoiceId(int invId)
    {
        invoiceId = invId;
    }
    public void setQuantity(int quant)
    {
        qty = quant;
    }
    public int getWidgetId()
    {
        return widgetId;
    }
    public int getInvoiceId()
    {
        return invoiceId;
    }
    public int getQuantity()
    {
        return qty;
    }

}

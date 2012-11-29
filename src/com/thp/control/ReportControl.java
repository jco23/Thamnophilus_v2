/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thp.control;

import com.thp.boundary.CreateCustomerForm;
import com.thp.object.AccountDB;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;

/**
 *
 * @author user
 */
public class ReportControl {
    //------------------------------------------------
    // O P E N   I N V O I C E S   R E P O R T
    //------------------------------------------------
    public static void openInvoiceReport() throws FileNotFoundException, IOException{
        // Array of header columns
        String[] header = { "First Name", "Last Name",  "Company",  "Email",    "Phone No.",    "Contact",   
                            "Total Finance Charges",    "Current",  "30 Days",  "60 Days",      
                            "Invoice No.", "Amount", "Due Date", "Invoice Date"
                          };
        // Creating an instance of HSSFWorkbook.
        // Create a sheet in excel document
        // Create the fist row in firstSheet
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet firstSheet = workbook.createSheet("Open Invoices Report");
        HSSFRow rowA = firstSheet.createRow(0);
        DataFormat format = workbook.createDataFormat();
        CellStyle style = workbook.createCellStyle();
        style.setDataFormat(format.getFormat("0.00"));
        
        // Display headers
        for(int i=0;i<header.length;i++){
           rowA.createCell(i).setCellValue(new HSSFRichTextString(header[i]));
        }
       /*
        // Populate data
        // Retrieve all customer sales information and display qty, sales, profit, and financial
        // charges 
        try {
            //------------------------------------------------
            // I N I T I A L  V A R I A B L E S
            //------------------------------------------------
            Statement stmt = AccountDB.conn.createStatement();
            String sql =    "SELECT  c.FIRSTNAME,"
                            + "       c.LASTNAME," 
                            + "       c.COMPANY,"
                            + "       c.EMAIL,"
                            + "       c.PHONE,"
                            + "       c.CONTACTINFO,"
                            + "       i.BALANCE,"
                            + "       i.INVOICEID,"
                            + "       i.TOTAL,"
                            + "       i.DUEDATE,"
                            + "       i.INVOICEDATE "
                            + "FROM invoices           AS i "
                            + "INNER JOIN customers    AS c ON i.customerID=c.id "
                            + "WHERE i.BALANCE < i.TOTAL "
                            + "ORDER BY c.LASTNAME, c.FIRSTNAME, c.COMPANY, i.INVOICEDATE";
            
                ResultSet rs = stmt.executeQuery(sql);
                int data=1;
                String widget="";
                int yr=0;
            //--------------------------------------------------
                while(rs.next()){
                    HSSFRow rowData = firstSheet.createRow(data);
                    //Display widget name
                    if(!rs.getString(1).equals(widget)){
                        rowData.createCell(0).setCellValue(new HSSFRichTextString(rs.getString(1)));
                    }
                    
                    //Display product name & year
                    if(!rs.getString(1).equals(widget) ||
                        rs.getString(1).equals(widget) && rs.getInt(2) != yr){
                        rowData.createCell(3).setCellValue(new HSSFRichTextString(rs.getString(2)));

                        //Display row headers
                        firstSheet.createRow(data+1).createCell(2).setCellValue(new HSSFRichTextString("[Quantity Sold]"));
                        firstSheet.createRow(data+2).createCell(2).setCellValue(new HSSFRichTextString("[Sales]"));
                        firstSheet.createRow(data+3).createCell(2).setCellValue(new HSSFRichTextString("[Cost of Sales]"));
                        firstSheet.createRow(data+4).createCell(2).setCellValue(new HSSFRichTextString("[Profit]"));
                        firstSheet.createRow(data+5).createCell(2).setCellValue(new HSSFRichTextString("[Finance Charges]"));
                    }
                   //Display monthly data (quantity sold, sales, profit, financial charges)
                   if(rs.getString(1).equals(widget) && rs.getInt(2)==yr){
                    data-=6;
                   }
                   for(int i=4;i<9;i++){
                        data++;
                        firstSheet.getRow(data).createCell(rs.getInt(3)+3).setCellValue(rs.getDouble(i)));
                        firstSheet.getRow(data).getCell(rs.getInt(3)+3).setCellStyle(style);
                    }
                    widget=rs.getString(1);
                    yr=rs.getInt(2);
                    data++;
                    
                }      
                
        } 
        catch (SQLException ex) {
            Logger.getLogger(CreateCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
* */
        outputFile(workbook, "OPEN INVOICES REPORT");
    }
    //------------------------------------------------
    // C U S T O M E R   S A L E S   R E P O R T
    //------------------------------------------------
    public static void customerSalesReport() throws FileNotFoundException, IOException{
        // Array of header columns
        String[] header = { "Customer", "Product",  "",         "Year",
                            "January",  "February", "March",    "April",
                            "May",      "June",     "July",     "August", 
                            "September","October",  "November", "December", "Yearly Total"
                          };
        // Creating an instance of HSSFWorkbook.
        // Create a sheet in excel document
        // Create the fist row in firstSheet
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet firstSheet = workbook.createSheet("Customer Sales Report");
        HSSFRow rowA = firstSheet.createRow(0);
        DataFormat format = workbook.createDataFormat();
        CellStyle style = workbook.createCellStyle();
        style.setDataFormat(format.getFormat("0.00"));
        
        // Display headers
        for(int i=0;i<header.length;i++){
           rowA.createCell(i).setCellValue(new HSSFRichTextString(header[i]));
        }
        
        // Populate data
        // Retrieve all customer sales information and display qty, sales, profit, and financial
        // charges 
        try {
            //------------------------------------------------
            // I N I T I A L  V A R I A B L E S
            //------------------------------------------------
            Statement stmt = AccountDB.conn.createStatement();
            String sql = "SELECT  c.lastName || ', ' || c.firstName, " +
                         "w.widgetName, " +
                         "YEAR(i.INVOICEDATE)," +
                         "MONTH(i.INVOICEDATE)," +
                         "SUM(wi.QTY)," +
                         "SUM(wi.QTY) * w.SUNITPRICE," +
                         "(SUM(wi.QTY) * w.SUNITPRICE)-(SUM(wi.QTY)*w.CUNITPRICE), " +
                         "i.FINANCECHARGE " +
                         "FROM widgetsinvoices AS wi " +
                         "INNER JOIN invoices AS i ON wi.invoiceId=i.invoiceId " +
                         "INNER JOIN customers AS c ON i.customerID=c.id " +
                         "INNER JOIN widgets AS w ON wi.widgetId=w.id " +
                         //"WHERE c.firstName= 'JAMES' " +
                         "GROUP BY    c.FIRSTNAME," +
                         "            c.LASTNAME," +
                         "            w.WIDGETNAME," +
                         "            w.id," +
                         "            w.SUNITPRICE," +
                         "            w.CUNITPRICE," +
                         "            i.FINANCECHARGE," +
                         "            YEAR(i.INVOICEDATE), " +
                         "            MONTH(i.INVOICEDATE) " +
                         "ORDER BY c.LASTNAME, c.FIRSTNAME, w.WIDGETNAME, YEAR(i.INVOICEDATE), MONTH(i.INVOICEDATE)";
            
                ResultSet rs = stmt.executeQuery(sql);
                int data=1;
                String name="";
                String widget="";
                int yr=0;
            //--------------------------------------------------
                while(rs.next()){
                    HSSFRow rowData = firstSheet.createRow(data);
                    //Display customer name
                    if(!rs.getString(1).equals(name)){
                        rowData.createCell(0).setCellValue(new HSSFRichTextString(rs.getString(1)));
                    }
                    //Display product name & year
                    if(!rs.getString(2).equals(widget)){
                        rowData.createCell(1).setCellValue(new HSSFRichTextString(rs.getString(2)));
                        rowData.createCell(3).setCellValue(new HSSFRichTextString(rs.getString(3)));

                        //Display row headers
                        firstSheet.createRow(data+1).createCell(2).setCellValue(new HSSFRichTextString("[Quantity Sold]"));
                        firstSheet.createRow(data+2).createCell(2).setCellValue(new HSSFRichTextString("[Sales]"));
                        firstSheet.createRow(data+3).createCell(2).setCellValue(new HSSFRichTextString("[Profit]"));
                        firstSheet.createRow(data+4).createCell(2).setCellValue(new HSSFRichTextString("[Finance Charges]"));
                        
                        //Create total formulas
                        firstSheet.getRow(data+1).createCell(16).setCellFormula("SUM(E"+ (data+2) + ":P" + (data+2) + ")");
                        firstSheet.getRow(data+1).getCell(16).setCellStyle(style);
                        firstSheet.getRow(data+2).createCell(16).setCellFormula("SUM(E"+ (data+3) + ":P" + (data+3) + ")");
                        firstSheet.getRow(data+2).getCell(16).setCellStyle(style);
                        firstSheet.getRow(data+3).createCell(16).setCellFormula("SUM(E"+ (data+4) + ":P" + (data+4) + ")");
                        firstSheet.getRow(data+3).getCell(16).setCellStyle(style);
                        firstSheet.getRow(data+4).createCell(16).setCellFormula("SUM(E"+ (data+5) + ":P" + (data+5) + ")");
                        firstSheet.getRow(data+4).getCell(16).setCellStyle(style);
                    }
                   //Display monthly data (quantity sold, sales, profit, financial charges)
                   if(rs.getString(1).equals(name)&& rs.getString(2).equals(widget) && rs.getInt(3)==yr){
                    data-=5;
                   }
                   else if (rs.getString(1).equals(name)&& rs.getString(2).equals(widget) && rs.getInt(3)!=yr){
                   //Display row headers
                        firstSheet.createRow(data).createCell(3).setCellValue(new HSSFRichTextString(rs.getString(3)));
                        firstSheet.createRow(data+1).createCell(2).setCellValue(new HSSFRichTextString("[Quantity Sold]"));
                        firstSheet.createRow(data+2).createCell(2).setCellValue(new HSSFRichTextString("[Sales]"));
                        firstSheet.createRow(data+3).createCell(2).setCellValue(new HSSFRichTextString("[Profit]"));
                        firstSheet.createRow(data+4).createCell(2).setCellValue(new HSSFRichTextString("[Finance Charges]"));
                        //Create total formulas
                        firstSheet.getRow(data+1).createCell(16).setCellFormula("SUM(E"+ (data+2) + ":P" + (data+2) + ")");
                        firstSheet.getRow(data+1).getCell(16).setCellStyle(style);
                        firstSheet.getRow(data+2).createCell(16).setCellFormula("SUM(E"+ (data+3) + ":P" + (data+3) + ")");
                        firstSheet.getRow(data+2).getCell(16).setCellStyle(style);
                        firstSheet.getRow(data+3).createCell(16).setCellFormula("SUM(E"+ (data+4) + ":P" + (data+4) + ")");
                        firstSheet.getRow(data+3).getCell(16).setCellStyle(style);
                        firstSheet.getRow(data+4).createCell(16).setCellFormula("SUM(E"+ (data+5) + ":P" + (data+5) + ")");
                        firstSheet.getRow(data+4).getCell(16).setCellStyle(style);
                   }
                   for(int i=5;i<9;i++){
                        data++;
                        firstSheet.getRow(data).createCell(rs.getInt(4)+3).setCellValue(rs.getDouble(i));
                        firstSheet.getRow(data).getCell(rs.getInt(4)+3).setCellStyle(style);
                    }
                    name=rs.getString(1);
                    widget=rs.getString(2);
                    yr=rs.getInt(3);
                    data++;
                }      
        } 
        catch (SQLException ex) {
            Logger.getLogger(CustomerControl.class.getName()).log(Level.SEVERE, null, ex);
        }

       outputFile(workbook, "CUSTOMER SALES REPORT");
    }
    
    //-------------------------------------------------------
    // S A L E S P E R S O N   S A L E S   R E P O R T
    //-------------------------------------------------------
    public static void salespersonSalesReport() throws FileNotFoundException, IOException{
        // Array of header columns
        String[] header = { "Salesperson", "",      "",         "Year",
                            "January",  "February", "March",    "April",
                            "May",      "June",     "July",     "August", 
                            "September","October",  "November", "December", "Yearly Total"
                          };
        // Creating an instance of HSSFWorkbook.
        // Create a sheet in excel document
        // Create the fist row in firstSheet
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet firstSheet = workbook.createSheet("FIRST SHEET");
        HSSFRow rowA = firstSheet.createRow(0);
        DataFormat format = workbook.createDataFormat();
        CellStyle style = workbook.createCellStyle();
        style.setDataFormat(format.getFormat("0.00"));
        
        // Display headers
        for(int i=0;i<header.length;i++){
           rowA.createCell(i).setCellValue(new HSSFRichTextString(header[i]));
        }
        
        // Populate data
        // Retrieve all salesperson sales commission and display sales & commission
        try {
            //------------------------------------------------
            // I N I T I A L  V A R I A B L E S
            //------------------------------------------------
            Statement stmt = AccountDB.conn.createStatement();
            String sql = "SELECT  s.lastName || ', ' || s.firstName, " +
                         "YEAR(i.INVOICEDATE)," +
                         "MONTH(i.INVOICEDATE)," +
                         "SUM(wi.QTY * w.SUNITPRICE)," +
                         "(SUM(wi.QTY * w.SUNITPRICE) * 0.05) " +
                         "FROM widgetsinvoices AS wi " +
                         "INNER JOIN invoices AS i ON wi.invoiceId=i.invoiceId " +
                         "INNER JOIN customers AS c ON i.customerID=c.id " + 
                         "INNER JOIN salespeople AS s ON c.salespersonid=s.id " +
                         "INNER JOIN widgets AS w ON wi.widgetId=w.id " +
                         //"WHERE c.firstName= 'JAMES' " +
                         "GROUP BY    s.FIRSTNAME," +
                         "            s.LASTNAME," +
                         "            YEAR(i.INVOICEDATE), " +
                         "            MONTH(i.INVOICEDATE) " +
                         "ORDER BY s.LASTNAME, s.FIRSTNAME, YEAR(i.INVOICEDATE), MONTH(i.INVOICEDATE)";
            
                ResultSet rs = stmt.executeQuery(sql);
                int data=1;
                String name="";
                int yr=0;
            //--------------------------------------------------
                while(rs.next()){
                    HSSFRow rowData = firstSheet.createRow(data);
                    //Display salesperson name
                    if(!rs.getString(1).equals(name)){
                        rowData.createCell(0).setCellValue(new HSSFRichTextString(rs.getString(1)));
                    }
                    //Display year
                    if(!rs.getString(1).equals(name) ||
                        rs.getString(1).equals(name) && rs.getInt(2) != yr){
                       rowData.createCell(3).setCellValue(new HSSFRichTextString(rs.getString(2)));

                        //Display row headers
                        firstSheet.createRow(data+1).createCell(2).setCellValue(new HSSFRichTextString("[Sales]"));
                        firstSheet.createRow(data+2).createCell(2).setCellValue(new HSSFRichTextString("[Commission]"));
                        //Create total formulas
                        firstSheet.getRow(data+1).createCell(16).setCellFormula("SUM(E"+ (data+2) + ":P" + (data+2) + ")");
                        firstSheet.getRow(data+1).getCell(16).setCellStyle(style);
                        firstSheet.getRow(data+2).createCell(16).setCellFormula("SUM(E"+ (data+3) + ":P" + (data+3) + ")");
                        firstSheet.getRow(data+2).getCell(16).setCellStyle(style);
                    }

                   //Display monthly data (quantity sold, sales, profit, financial charges)
                   if(rs.getString(1).equals(name) && rs.getInt(2)==yr){
                    data-=3;
                   }
                   for(int i=4;i<6;i++){
                        data++;
                        firstSheet.getRow(data).createCell(rs.getInt(3)+3).setCellValue(rs.getDouble(i));
                        firstSheet.getRow(data).getCell(rs.getInt(3)+3).setCellStyle(style);
                    }
                    name=rs.getString(1);
                    yr=rs.getInt(2);
                    data++;
                }        
        } 
        catch (SQLException ex) {
            Logger.getLogger(CreateCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        }

        outputFile(workbook, "SALESPERSON SALES COMMISSION REPORT");
    }
    
    //------------------------------------------------
    // W I D G E T   S A L E S   R E P O R T
    //------------------------------------------------
    public static void widgetSalesReport() throws FileNotFoundException, IOException{
        // Array of header columns
        String[] header = { "Product", "",          "",         "Year",
                            "January",  "February", "March",    "April",
                            "May",      "June",     "July",     "August", 
                            "September","October",  "November", "December", "Yearly Total"
                          };
        // Creating an instance of HSSFWorkbook.
        // Create a sheet in excel document
        // Create the fist row in firstSheet
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet firstSheet = workbook.createSheet("Widget Sales Report");
        HSSFRow rowA = firstSheet.createRow(0);
        DataFormat format = workbook.createDataFormat();
        CellStyle style = workbook.createCellStyle();
        style.setDataFormat(format.getFormat("0.00"));
        
        // Display headers
        for(int i=0;i<header.length;i++){
           rowA.createCell(i).setCellValue(new HSSFRichTextString(header[i]));
        }
        
        // Populate data
        // Retrieve all customer sales information and display qty, sales, profit, and financial
        // charges 
        try {
            //------------------------------------------------
            // I N I T I A L  V A R I A B L E S
            //------------------------------------------------
            Statement stmt = AccountDB.conn.createStatement();
            String sql =    "SELECT  w.widgetName, " +
                            "       YEAR(i.INVOICEDATE), " +
                            "       MONTH(i.INVOICEDATE), " +
                            "       SUM(wi.QTY) AS QUANTITY," +
                            "       SUM(wi.QTY) * w.SUNITPRICE AS SALES, " +
                            "       (SUM(wi.QTY)* w.CUNITPRICE) AS COSTOFSALES, " +
                            "       (SUM(wi.QTY) * w.SUNITPRICE)-(SUM(wi.QTY)*w.CUNITPRICE) AS PROFIT, " +
                            "       i.FINANCECHARGE AS FINANCECHARGE " +
                            "FROM widgetsinvoices    AS wi " +
                            "INNER JOIN invoices     AS i ON wi.invoiceId=i.invoiceId " +
                            "INNER JOIN widgets      AS w ON wi.widgetId=w.id " +
                            //"--WHERE c.firstName= 'JAMES' 
                            "GROUP BY    w.WIDGETNAME," +
                            "            w.SUNITPRICE," +
                            "            w.CUNITPRICE," +
                            "            i.FINANCECHARGE," +
                            "            YEAR(i.INVOICEDATE), " +
                            "            MONTH(i.INVOICEDATE) " +
                            "ORDER BY w.WIDGETNAME, YEAR(i.INVOICEDATE), MONTH(i.INVOICEDATE)";
            
                ResultSet rs = stmt.executeQuery(sql);
                int data=1;
                String widget="";
                int yr=0;
            //--------------------------------------------------
                while(rs.next()){
                    HSSFRow rowData = firstSheet.createRow(data);
                    //Display widget name
                    if(!rs.getString(1).equals(widget)){
                        rowData.createCell(0).setCellValue(new HSSFRichTextString(rs.getString(1)));
                    }
                    //Display product name & year
                    if(!rs.getString(1).equals(widget) ||
                        rs.getString(1).equals(widget) && rs.getInt(2) != yr){
                        rowData.createCell(3).setCellValue(new HSSFRichTextString(rs.getString(2)));

                        //Display row headers
                        firstSheet.createRow(data+1).createCell(2).setCellValue(new HSSFRichTextString("[Quantity Sold]"));
                        firstSheet.createRow(data+2).createCell(2).setCellValue(new HSSFRichTextString("[Sales]"));
                        firstSheet.createRow(data+3).createCell(2).setCellValue(new HSSFRichTextString("[Cost of Sales]"));
                        firstSheet.createRow(data+4).createCell(2).setCellValue(new HSSFRichTextString("[Profit]"));
                        firstSheet.createRow(data+5).createCell(2).setCellValue(new HSSFRichTextString("[Finance Charges]"));
                        //Create total formulas
                        firstSheet.getRow(data+1).createCell(16).setCellFormula("SUM(E"+ (data+2) + ":P" + (data+2) + ")");
                        firstSheet.getRow(data+1).getCell(16).setCellStyle(style);
                        firstSheet.getRow(data+2).createCell(16).setCellFormula("SUM(E"+ (data+3) + ":P" + (data+3) + ")");
                        firstSheet.getRow(data+2).getCell(16).setCellStyle(style);
                        firstSheet.getRow(data+3).createCell(16).setCellFormula("SUM(E"+ (data+4) + ":P" + (data+4) + ")");
                        firstSheet.getRow(data+3).getCell(16).setCellStyle(style);
                        firstSheet.getRow(data+4).createCell(16).setCellFormula("SUM(E"+ (data+5) + ":P" + (data+5) + ")");
                        firstSheet.getRow(data+4).getCell(16).setCellStyle(style);
                        firstSheet.getRow(data+5).createCell(16).setCellFormula("SUM(E"+ (data+6) + ":P" + (data+6) + ")");
                        firstSheet.getRow(data+5).getCell(16).setCellStyle(style);
                    }
                   //Display monthly data (quantity sold, sales, profit, financial charges)
                   if(rs.getString(1).equals(widget) && rs.getInt(2)==yr){
                    data-=6;
                   }
                   for(int i=4;i<9;i++){
                        data++;
                        firstSheet.getRow(data).createCell(rs.getInt(3)+3).setCellValue(rs.getDouble(i));
                        firstSheet.getRow(data).getCell(rs.getInt(3)+3).setCellStyle(style);
                    }
                    widget=rs.getString(1);
                    yr=rs.getInt(2);
                    data++;
                }      
        } 
        catch (SQLException ex) {
            Logger.getLogger(CreateCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        }

        outputFile(workbook, "WIDGET SALES REPORT");
    }

    //------------------------------------------------
    // O U T P U T   F I L E   T O   E X C E L
    //------------------------------------------------
    public static void outputFile(HSSFWorkbook workbook, String title){
     // Write workbook into a file using output stream
        FileOutputStream fos = null;
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int returnVal = chooser.showOpenDialog(chooser);

        if(returnVal == JFileChooser.APPROVE_OPTION){
            System.out.println(chooser.getSelectedFile().getAbsolutePath());
            String path=chooser.getSelectedFile().getAbsolutePath();
            try {
                fos = new FileOutputStream(new File(path +"\\"+title+".xls"));
                workbook.write(fos);     
            } 
            catch (IOException e) {
                e.printStackTrace();
            } 
            finally {
                if (fos != null) {
                    try {
                        fos.flush();
                        fos.close();
                        //Open the report
                         Desktop.getDesktop().open(new File(path+"\\"+title+".xls")); 
                    } 
                    catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

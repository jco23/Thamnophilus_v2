/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thp.control;

import com.thp.boundary.CreateCustomerForm;
import com.thp.object.AccountDB;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.hssf.usermodel.*;

/**
 *
 * @author user
 */
public class ReportControl {
    public static void createExcelWorkbook() throws FileNotFoundException, IOException{

        //
        // Creating an instance of HSSFWorkbook.
        //
        HSSFWorkbook workbook = new HSSFWorkbook();
 
        //
        // Create two sheets in the excel document and name it First Sheet and
        // Second Sheet.
        //
        HSSFSheet firstSheet = workbook.createSheet("FIRST SHEET");
        HSSFSheet secondSheet = workbook.createSheet("SECOND SHEET");
 
        //
        // Manipulate the firs sheet by creating an HSSFRow wich represent a
        // single row in excel sheet, the first row started from 0 index. After
        // the row is created we create a HSSFCell in this first cell of the row
        // and set the cell value with an instance of HSSFRichTextString
        // containing the words FIRST SHEET.
        //
        String[] header = new String[16];
        header = getHeaders();
        
        HSSFRow rowA = firstSheet.createRow(0);
        HSSFCell cellA = rowA.createCell(0);
        //HEADERS
        for(int i=0;i<16;i++)
        {
           rowA.createCell(i).setCellValue(new HSSFRichTextString(header[i]));
        }
        try {
            Statement stmt = AccountDB.conn.createStatement();
            String sql = "SELECT  c.firstName || ' ' || c.lastName, " +
        "w.widgetName, " +
        "YEAR(i.INVOICEDATE), "+
        "MONTH(i.INVOICEDATE),"+
        "SUM(i.QTY),"+
        "SUM(i.QTY) * w.SUNITPRICE, "+
        "(SUM(i.QTY) * w.SUNITPRICE)-(SUM(i.QTY)*w.CUNITPRICE) "+
        "FROM invoices AS i "+
        "INNER JOIN customers AS c ON i.customerID=c.id "+
        "INNER JOIN widgets AS w ON i.widgetId=w.id "+
        "GROUP BY c.firstName, "+
        "        c.lastName, "+
        "        w.widgetName,"+
        "        w.SUNITPRICE,"+
        "        w.CUNITPRICE,"+
        "MONTH(i.INVOICEDATE),"+
        "YEAR(i.INVOICEDATE)";
            ResultSet rs = stmt.executeQuery(sql);
            int data=1;
                while(rs.next()){
                    HSSFRow rowData = firstSheet.createRow(data);
                    for(int i=1; i<8; i++){
                        rowData.createCell(i-1).setCellValue(new HSSFRichTextString(rs.getString(i)));

                    }
                    data++;
                }
           
 
        } catch (SQLException ex) {
            Logger.getLogger(CreateCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        }

 
        //
        // To write out the workbook into a file we need to create an output
        // stream where the workbook content will be written to.
        //
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(new File("C:\\Users\\user\\Desktop\\CreateExcelDemo.xls"));
            workbook.write(fos);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.flush();
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    public static String[] getHeaders(){
        String path = "C:\\Users\\user\\Desktop\\headers.txt";
        String [] header = new String[16];
        try{   
        FileInputStream fstream = new FileInputStream(path);
        // Get the object of DataInputStream
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String strLine;
        int count=0;
        //Read File Line By Line
        while ((strLine = br.readLine()) != null)   {
        // Print the content on the console
              header[count]=strLine;
              count++;
        }
        //Close the input stream
        in.close();
          }catch (Exception e){//Catch exception if any
        System.err.println("Error: " + e.getMessage());
        }
        return header;
    }
}

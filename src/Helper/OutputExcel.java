/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

import Model.NhanVien;
import View.ThongKe;
import java.awt.Frame;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author admin
 */
public class OutputExcel {
    public OutputExcel(String name,DefaultTableModel model)
    {   
        XSSFWorkbook book = new XSSFWorkbook();
        XSSFSheet sheet = book.createSheet(name);
        XSSFRow row = null;
        XSSFCell cell = null;
        row = sheet.createRow(0);
        for(int i = 0;i< model.getColumnCount();i++)
        {
            cell = row.createCell(i,CellType.STRING);
            cell.setCellValue(model.getColumnName(i));
        }
        for(int y = 0;y<model.getRowCount();y++)
        {
            row  = sheet.createRow(y+1);
            for(int u = 0;u<model.getColumnCount();u++)
            {
                cell= row.createCell(u);
                cell.setCellValue( model.getValueAt(y, u).toString());
            }
        }
        File F = new File("D://danhsach.xlsx");
        try {
            FileOutputStream fis = new FileOutputStream(F);
            book.write(fis);
            fis.close();
            JOptionPane.showMessageDialog(null, "thành công");
        } catch (Exception e) {
            System.out.println("Sai");
        }
    } 



}

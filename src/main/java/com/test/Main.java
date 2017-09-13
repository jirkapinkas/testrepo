package com.test;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileOutputStream;

public class Main {

    /**
     * Add cell to row
     * @param row
     * @param index
     * @param value
     */
    private static void addCell(Row row, int index, String value) {
        Cell cell = row.createCell(index);
        cell.setCellValue(value);
    }

    public static void main(String[] args) throws Exception {
        try (Workbook wb = new HSSFWorkbook();
             FileOutputStream fileOut = new FileOutputStream("workbook.xls")) {
            Sheet sheet = wb.createSheet("new sheet");
            Row row = sheet.createRow(0);
            addCell(row, 0, "neco");
            addCell(row, 1, "dalsiho");
            wb.write(fileOut);
        }
    }

}

package com.AI_project.WebScrape.service;

import com.AI_project.WebScrape.model.WebsiteData;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import java.io.FileOutputStream;

@Service
public class ExcelService {

    public void generate(WebsiteData data) {

        try {
            Workbook wb = new XSSFWorkbook();

            // Sheet 1 → Basic Info
            Sheet sheet1 = wb.createSheet("Basic");

            Row row = sheet1.createRow(0);
            row.createCell(0).setCellValue("Title");
            row.createCell(1).setCellValue(data.getTitle());

            row = sheet1.createRow(1);
            row.createCell(0).setCellValue("Meta");
            row.createCell(1).setCellValue(data.getMetaDesc());

            // Sheet 2 → Links
            Sheet linkSheet = wb.createSheet("Links");
            int i = 0;
            for (String link : data.getLinks()) {
                Row r = linkSheet.createRow(i++);
                r.createCell(0).setCellValue(link);
            }

            // Sheet 3 → Images
            Sheet imageSheet = wb.createSheet("Images");
            i = 0;
            for (String img : data.getImages()) {
                Row r = imageSheet.createRow(i++);
                r.createCell(0).setCellValue(img);
            }

            // Sheet 4 → Headings
            Sheet headingSheet = wb.createSheet("Headings");
            i = 0;
            for (String h : data.getHeadings()) {
                Row r = headingSheet.createRow(i++);
                r.createCell(0).setCellValue(h);
            }

            FileOutputStream out = new FileOutputStream("report.xlsx");
            wb.write(out);
            out.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
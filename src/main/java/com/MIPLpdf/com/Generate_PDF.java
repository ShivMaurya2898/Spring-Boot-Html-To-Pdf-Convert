package com.MIPLpdf.com;

import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class Generate_PDF {

	public static void main(String[] args) {
		try {

			String file_name = "C:\\Users\\Shiv Maurya\\Desktop\\Pdf\\MIPL_test.pdf";
			Document document = new Document();

			PdfWriter.getInstance(document, new FileOutputStream(file_name));

			document.open();
			// Simple Paragraph
			Paragraph para = new Paragraph("This is for the Testing purpose.");
			document.add(para);
			
			//add new Paragraph between Header
			document.add(new Paragraph(" "));
			document.add(new Paragraph(" "));
			
			//add Table
			PdfPTable table=new PdfPTable(3); 
			PdfPCell c1 = new PdfPCell(new Phrase("Heading 1"));
			table.addCell(c1);
			
			c1 = new PdfPCell(new Phrase("Heading 2")); 
			table.addCell(c1);
			
			c1 = new PdfPCell(new Phrase("Heading 3")); 
			table.addCell(c1);
			
			table.setHeaderRows(1);
			
			table.addCell("1.0");
			table.addCell("1.1");
			table.addCell("1.2");
			table.addCell("2.1");
			table.addCell("2.2");
			table.addCell("2.3");
			
			document.add(table);
			
			document.close();

			System.out.println("Finished");
		} catch (Exception e) {
			System.err.println(e);
		}

	}

}

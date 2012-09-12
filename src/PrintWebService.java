package com.wsiv.ccm;

import java.io.IOException;

import org.apache.pdfbox.exceptions.COSVisitorException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.edit.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class PrintWebService {

	// Create and save PDF.
	public static void main(String[] arg0){
		try {
			// Init and configure PDF.
			PDDocument document = new PDDocument();
			PDPage page = new PDPage();
			document.addPage(page);
			PDFont font = PDType1Font.HELVETICA;
			PDPageContentStream contentStream = new PDPageContentStream(document, page);
			
			// Write content.
			contentStream.beginText();
			contentStream.setFont(font, 12);
			contentStream.moveTextPositionByAmount( 100, 700 );
			contentStream.drawString( "Ceci est un text pour test l'API PDFBox." );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.moveTextPositionByAmount( 100, 750 );
			contentStream.drawString( "Test test." );
			contentStream.endText();
			
			// Close and save.
			contentStream.close();
			document.save("pdf/test.pdf");
			document.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (COSVisitorException e) {
			e.printStackTrace();
		} 
		
	}
	
	
	// Return the date of printing.
	public String printDateOf(int id){
		
		return null;
	}
	
	
	// Return "true" if contract is in stack.
	public boolean isInStack(int id){
		
		return false;
	}
	
	
}

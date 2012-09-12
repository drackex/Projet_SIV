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
	public static void main(String[] string){
		try {
			// Init and configure PDF.
			PDDocument document = new PDDocument();
			PDPage page = new PDPage();
			document.addPage(page);
			PDFont font = PDType1Font.HELVETICA;
			PDFont fontBold = PDType1Font.HELVETICA_BOLD;
			PDPageContentStream contentStream = new PDPageContentStream(document, page);
			
			// Write content.
			contentStream.beginText();
			contentStream.setFont(font, 12);
			contentStream.moveTextPositionByAmount( 230, 770 );
			contentStream.drawString( "Certificat d'immatriculation" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.moveTextPositionByAmount( 0, 740 );
			contentStream.drawString( "------------------------------------------------------------"
									+ "------------------------------------------------------------"
									+ "------------------------------------------------------------");
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.moveTextPositionByAmount( 20, 730 );
			contentStream.drawString( "N° Immatriculation          Date de 1ère immatriculation" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(fontBold, 12);
			contentStream.moveTextPositionByAmount( 0, 718 );
			contentStream.drawString( "A." );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(font, 12);
			contentStream.moveTextPositionByAmount( 20, 718 );
			contentStream.drawString( "AA-123-BB" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(fontBold, 12);
			contentStream.moveTextPositionByAmount( 160, 718 );
			contentStream.drawString( "B." );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(font, 12);
			contentStream.moveTextPositionByAmount( 180, 718 );
			contentStream.drawString( "12/09/2012" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(fontBold, 12);
			contentStream.moveTextPositionByAmount( 0, 700 );
			contentStream.drawString( "C.1" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(font, 12);
			contentStream.moveTextPositionByAmount( 20, 700 );
			contentStream.drawString( "DURAND" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.moveTextPositionByAmount( 20, 660 );
			contentStream.drawString( "DAVID" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(fontBold, 12);
			contentStream.moveTextPositionByAmount( 0, 600 );
			contentStream.drawString( "C.4a" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(font, 12);
			contentStream.moveTextPositionByAmount( 50, 600 );
			contentStream.drawString( "EST LE PROPRIETAIRE DU VEHICULE" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(fontBold, 12);
			contentStream.moveTextPositionByAmount( 0, 580 );
			contentStream.drawString( "C.4.1" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(fontBold, 12);
			contentStream.moveTextPositionByAmount( 0, 560 );
			contentStream.drawString( "C.3" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(font, 12);
			contentStream.moveTextPositionByAmount( 40, 540 );
			contentStream.drawString( "10 RUE DE LA CONTRESCARPE" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(font, 12);
			contentStream.moveTextPositionByAmount( 40, 520 );
			contentStream.drawString( "80000 AMIENS" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(fontBold, 12);
			contentStream.moveTextPositionByAmount( 0, 480 );
			contentStream.drawString( "D.1" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(font, 12);
			contentStream.moveTextPositionByAmount( 30, 480 );
			contentStream.drawString( "LAMBORGHINI" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(fontBold, 12);
			contentStream.moveTextPositionByAmount( 300, 460 );
			contentStream.drawString( "D.2.1" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(fontBold, 12);
			contentStream.moveTextPositionByAmount( 0, 440 );
			contentStream.drawString( "D.3" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(font, 12);
			contentStream.moveTextPositionByAmount( 30, 440 );
			contentStream.drawString( "LP560-4" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(fontBold, 12);
			contentStream.moveTextPositionByAmount( 320, 440 );
			contentStream.drawString( "E" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(font, 12);
			contentStream.moveTextPositionByAmount( 350, 440 );
			contentStream.drawString( "AA2Z488M54545454" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(fontBold, 12);
			contentStream.moveTextPositionByAmount( 0, 420 );
			contentStream.drawString( "F.1" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(font, 12);
			contentStream.moveTextPositionByAmount( 30, 420 );
			contentStream.drawString( "0" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(fontBold, 12);
			contentStream.moveTextPositionByAmount( 100, 420 );
			contentStream.drawString( "F.2" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(font, 12);
			contentStream.moveTextPositionByAmount( 130, 420 );
			contentStream.drawString( "1234" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(fontBold, 12);
			contentStream.moveTextPositionByAmount( 200, 420 );
			contentStream.drawString( "F.3" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(font, 12);
			contentStream.moveTextPositionByAmount( 230, 420 );
			contentStream.drawString( "1500" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(fontBold, 12);
			contentStream.moveTextPositionByAmount( 0, 400 );
			contentStream.drawString( "G" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(fontBold, 12);
			contentStream.moveTextPositionByAmount( 100, 400 );
			contentStream.drawString( "G.1" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(fontBold, 12);
			contentStream.moveTextPositionByAmount( 0, 380 );
			contentStream.drawString( "J" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(fontBold, 12);
			contentStream.moveTextPositionByAmount( 100, 380 );
			contentStream.drawString( "J.1" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(font, 12);
			contentStream.moveTextPositionByAmount( 130, 380 );
			contentStream.drawString( "CITE" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(fontBold, 12);
			contentStream.moveTextPositionByAmount( 200, 380 );
			contentStream.drawString( "J.2" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(fontBold, 12);
			contentStream.moveTextPositionByAmount( 300, 380 );
			contentStream.drawString( "J.3" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(font, 12);
			contentStream.moveTextPositionByAmount( 330, 380 );
			contentStream.drawString( "DERIZZP" );
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

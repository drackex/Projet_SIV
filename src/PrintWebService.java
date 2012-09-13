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
			PDFont smallObliqueFont = PDType1Font.COURIER_OBLIQUE;
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
			
			contentStream.beginText();
			contentStream.setFont(fontBold, 12);
			contentStream.moveTextPositionByAmount( 0, 360 );
			contentStream.drawString( "K" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(fontBold, 12);
			contentStream.moveTextPositionByAmount( 0, 340 );
			contentStream.drawString( "P.1" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(font, 12);
			contentStream.moveTextPositionByAmount( 30, 340 );
			contentStream.drawString( "0" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(fontBold, 12);
			contentStream.moveTextPositionByAmount( 100, 340 );
			contentStream.drawString( "P.2" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(font, 12);
			contentStream.moveTextPositionByAmount( 130, 340 );
			contentStream.drawString( "0" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(fontBold, 12);
			contentStream.moveTextPositionByAmount( 200, 340 );
			contentStream.drawString( "P.3" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(font, 12);
			contentStream.moveTextPositionByAmount( 230, 340 );
			contentStream.drawString( "ES" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(fontBold, 12);
			contentStream.moveTextPositionByAmount( 300, 340 );
			contentStream.drawString( "P.6" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(font, 12);
			contentStream.moveTextPositionByAmount( 330, 340 );
			contentStream.drawString( "128" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(fontBold, 12);
			contentStream.moveTextPositionByAmount( 0, 320 );
			contentStream.drawString( "Q" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(font, 12);
			contentStream.moveTextPositionByAmount( 30, 320 );
			contentStream.drawString( "0.00" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(fontBold, 12);
			contentStream.moveTextPositionByAmount( 100, 320 );
			contentStream.drawString( "S.1" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(font, 12);
			contentStream.moveTextPositionByAmount( 130, 320 );
			contentStream.drawString( "2" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(fontBold, 12);
			contentStream.moveTextPositionByAmount( 200, 320 );
			contentStream.drawString( "S.2" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(font, 12);
			contentStream.moveTextPositionByAmount( 230, 320 );
			contentStream.drawString( "0" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(fontBold, 12);
			contentStream.moveTextPositionByAmount( 300, 320 );
			contentStream.drawString( "U.1" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(font, 12);
			contentStream.moveTextPositionByAmount( 330, 320 );
			contentStream.drawString( "0" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(fontBold, 12);
			contentStream.moveTextPositionByAmount( 0, 300 );
			contentStream.drawString( "U.2" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(font, 12);
			contentStream.moveTextPositionByAmount( 30, 300 );
			contentStream.drawString( "0" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(fontBold, 12);
			contentStream.moveTextPositionByAmount( 100, 300 );
			contentStream.drawString( "V.7" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(font, 12);
			contentStream.moveTextPositionByAmount( 130, 300 );
			contentStream.drawString( "0" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(fontBold, 12);
			contentStream.moveTextPositionByAmount( 200, 300 );
			contentStream.drawString( "V.9" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(fontBold, 12);
			contentStream.moveTextPositionByAmount( 0, 280 );
			contentStream.drawString( "X.1" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(font, 12);
			contentStream.moveTextPositionByAmount( 30, 280 );
			contentStream.drawString( "VISITE AVANT LE 10/10/2012" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(fontBold, 12);
			contentStream.moveTextPositionByAmount( 0, 260 );
			contentStream.drawString( "Y.1" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(font, 12);
			contentStream.moveTextPositionByAmount( 30, 260 );
			contentStream.drawString( "0" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(fontBold, 12);
			contentStream.moveTextPositionByAmount( 100, 260 );
			contentStream.drawString( "Y.2" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(smallObliqueFont, 10);
			contentStream.moveTextPositionByAmount( 280, 260 );
			contentStream.drawString( "Pour le ministre de l'intérieur et par la délégation," );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(font, 12);
			contentStream.moveTextPositionByAmount( 130, 260 );
			contentStream.drawString( "0" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(fontBold, 12);
			contentStream.moveTextPositionByAmount( 0, 240 );
			contentStream.drawString( "Y.3" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(font, 12);
			contentStream.moveTextPositionByAmount( 30, 240 );
			contentStream.drawString( "0" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(fontBold, 12);
			contentStream.moveTextPositionByAmount( 100, 240 );
			contentStream.drawString( "Y.4" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(smallObliqueFont, 10);
			contentStream.moveTextPositionByAmount( 380, 250 );
			contentStream.drawString( "la sous directrice de la circulation" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(smallObliqueFont, 10);
			contentStream.moveTextPositionByAmount( 430, 240 );
			contentStream.drawString( "et de la sécurité routières" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(font, 12);
			contentStream.moveTextPositionByAmount( 130, 240 );
			contentStream.drawString( "0" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(fontBold, 12);
			contentStream.moveTextPositionByAmount( 0, 220 );
			contentStream.drawString( "Y.5" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(font, 12);
			contentStream.moveTextPositionByAmount( 30, 220 );
			contentStream.drawString( "2.5" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(fontBold, 12);
			contentStream.moveTextPositionByAmount( 100, 220 );
			contentStream.drawString( "Y.6" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(font, 12);
			contentStream.moveTextPositionByAmount( 130, 220 );
			contentStream.drawString( "2.5" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(fontBold, 12);
			contentStream.moveTextPositionByAmount( 0, 180 );
			contentStream.drawString( "H" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(smallObliqueFont, 12);
			contentStream.moveTextPositionByAmount( 470, 180 );
			contentStream.drawString( "Jean MICHEL" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(fontBold, 12);
			contentStream.moveTextPositionByAmount( 0, 160 );
			contentStream.drawString( "I" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(font, 12);
			contentStream.moveTextPositionByAmount( 30, 160 );
			contentStream.drawString( "08/05/2000" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(fontBold, 12);
			contentStream.moveTextPositionByAmount( 0, 140 );
			contentStream.drawString( "Z.1" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(fontBold, 12);
			contentStream.moveTextPositionByAmount( 0, 120 );
			contentStream.drawString( "Z.2" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(fontBold, 12);
			contentStream.moveTextPositionByAmount( 0, 100 );
			contentStream.drawString( "Z.3" );
			contentStream.endText();
			
			contentStream.beginText();
			contentStream.setFont(fontBold, 12);
			contentStream.moveTextPositionByAmount( 0, 80 );
			contentStream.drawString( "Z.4" );
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

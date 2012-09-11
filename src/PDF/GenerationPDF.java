package PDF;

import org.apache.pdfbox.pdmodel.*;
import java.io.*;

public class GenerationPDF {
	
	public static void main(String[] args) 
	{
        PDDocument doc = null;
        try
        {
            doc = new PDDocument();
        } 
        catch (IOException ie)
        {
            System.out.println(ie);
        }
        doc.addPage(new PDPage());
        try
        {
            doc.save("pdf/Empty_PDF.pdf");
            doc.close();
        } 
        catch (Exception io)
        {
            System.out.println(io);
        }
    }

}

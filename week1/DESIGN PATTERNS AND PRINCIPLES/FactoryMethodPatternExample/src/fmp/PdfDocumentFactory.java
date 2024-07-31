package fmp;

public class PdfDocumentFactory extends DocumentFactory {
	    @Override
	    public Documents createDocument() {
	        return new PdfDocument();
	    }
}

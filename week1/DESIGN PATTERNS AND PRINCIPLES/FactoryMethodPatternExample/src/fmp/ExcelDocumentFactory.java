package fmp;

public class ExcelDocumentFactory extends DocumentFactory {
	 @Override
	    public Documents createDocument() {
	        return new ExcelDocument();
	    }
}

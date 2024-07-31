package fmp;

public class FactoryMethodPatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        DocumentFactory wordFactory = new WordDocumentFactory();
        Documents wordDoc = wordFactory.createDocument();
        wordDoc.open();
        wordDoc.save();
        wordDoc.close();

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Documents pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();
        pdfDoc.save();
        pdfDoc.close();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Documents excelDoc = excelFactory.createDocument();
        excelDoc.open();
        excelDoc.save();
        excelDoc.close();

		

	}

}

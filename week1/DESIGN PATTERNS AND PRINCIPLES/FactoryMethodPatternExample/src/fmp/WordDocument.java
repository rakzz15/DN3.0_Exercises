package fmp;

public class WordDocument implements Documents{
	 @Override
	    public void open() {
	        System.out.println("Opening Word document.");
	    }
	    @Override
	    public void save() {
	        System.out.println("Saving Word document.");
	    }
	    @Override
	    public void close() {
	        System.out.println("Closing Word document.");
	    }
}

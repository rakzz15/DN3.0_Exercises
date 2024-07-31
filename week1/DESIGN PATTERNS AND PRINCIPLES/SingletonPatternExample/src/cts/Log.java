package cts;

public class Log {
	  private static Log instance = null;

	    private Log() { }

	    public static Log getInstance() {
	        if (instance == null) {
	            instance = new Log();
	        }
	        return instance;
	    }

	    public void log(String message) {
	        System.out.println("[LOG] " + message);
	    }
}

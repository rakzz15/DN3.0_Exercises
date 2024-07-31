package cts;

public class singleton {

	public static void main(String[] args) {
		
        Log user1 = Log.getInstance();
        Log user2 = Log.getInstance();

        if (user1 == user2) {
        	// Checking if both logging instances are the same
            System.out.println("Only one instance of Log exists.");
        } else {
            System.out.println("Different instances of Log exist.");
        }

        user1.log("Logging message 1");
        user2.log("Logging message 2");
        }
    }





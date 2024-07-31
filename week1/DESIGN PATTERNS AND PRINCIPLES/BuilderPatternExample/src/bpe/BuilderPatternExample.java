package bpe;

public class BuilderPatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Computer basicComputer = new Computer.ComputerBuilder("Intel i5", "8GB")
	                .setStorage("256GB SSD")
	                .setPowerSupply("500W")
	                .build();

	        System.out.println("Basic Computer: " + basicComputer);

	        // Creating a gaming computer configuration
	        Computer gamingComputer = new Computer.ComputerBuilder("AMD Ryzen 7", "16GB")
	                .setStorage("1TB SSD")
	                .setPowerSupply("750W")
	                .build();

	        System.out.println("Gaming Computer: " + gamingComputer);

	        // Creating a workstation computer configuration
	        Computer workComputer = new Computer.ComputerBuilder("Intel Xeon", "32GB")
	                .setStorage("2TB SSD")
	                .setPowerSupply("850W")
	                .build();

	        System.out.println("Work Computer: " + workComputer);
	}

}

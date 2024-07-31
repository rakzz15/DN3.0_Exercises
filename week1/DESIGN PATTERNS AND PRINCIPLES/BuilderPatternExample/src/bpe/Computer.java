package bpe;

public class Computer {
	 private String CPU;
	    private String RAM;
	    private String storage;
	    private String powerSupply;

	    // Private constructor to enforce the use of the builder
	    private Computer(ComputerBuilder builder) {
	        this.CPU = builder.CPU;
	        this.RAM = builder.RAM;
	        this.storage = builder.storage;
	        this.powerSupply = builder.powerSupply;
	    }

	    // Getters for the Computer attributes
	    public String getCPU() {
	        return CPU;
	    }

	    public String getRAM() {
	        return RAM;
	    }

	    public String getStorage() {
	        return storage;
	    }

	    public String getPowerSupply() {
	        return powerSupply;
	    }

	    @Override
	    public String toString() {
	        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", storage=" + storage + 
	               ", powerSupply=" + powerSupply + "]";
	    }

	    // Static nested Builder class
	    public static class ComputerBuilder {
	        private String CPU;
	        private String RAM;
	        private String storage;
	        private String powerSupply;

	        // Constructor with mandatory parameters
	        public ComputerBuilder(String CPU, String RAM) {
	            this.CPU = CPU;
	            this.RAM = RAM;
	        }

	        public ComputerBuilder setStorage(String storage) {
	            this.storage = storage;
	            return this;
	        }

	        public ComputerBuilder setPowerSupply(String powerSupply) {
	            this.powerSupply = powerSupply;
	            return this;
	        }

	        // Method to construct the Computer object
	        public Computer build() {
	            return new Computer(this);
	        }
	    }
}

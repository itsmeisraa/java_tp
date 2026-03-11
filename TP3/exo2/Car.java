class Car extends Vehicule{
	private int fueleff;
	public Car(int fueleff, String model, int year){
		super(year,model);
		this.fueleff = fueleff;
	}
    public double calculcons(double distance) {
        return (fueleff * distance) / 100;
    }
    
    // Getter 
    public double getfueleff() {
        return fueleff;
    }
	  @Override
    public void DisplayInfo() {
        super.DisplayInfo();
        System.out.println("Fuel Efficiency: " + fueleff + " L/100km");
    }
	}
    
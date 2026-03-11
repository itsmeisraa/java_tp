class Vehicule{
	protected String model;
	int year;
	public Vehicule(int year, String model){
		this.year = year;
		this.model = model;
	}
	 public void DisplayInfo(){
	 	System.out.println(" model = " + model);
		System.out.println(" year = " + year);
		
	 }
}
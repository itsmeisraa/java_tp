public class Main {
    public static void main(String[] args) {
        Vehicule v = new Vehicule(2022, "Toyota");
        Car c = new Car(8, "Honda", 2023);
        
        System.out.println("Vehicle:");
        v.DisplayInfo();
        
        System.out.println("\nCar:");
        c.DisplayInfo();
        
        System.out.println("\nFuel for 250km: " + c.calculcons(250) + " liters");
    }
}
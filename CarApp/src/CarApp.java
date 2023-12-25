
public class CarApp {

	public static void main(String[] args) {
	
		Car defaultCar = new Car();
		Car customCar = new Car ("Toyota", "Camry", 2022);
		
		System.out.println(" default detali za kolata: ");
		System.out.println(defaultCar);
		
		System.out.println(" uredeni detali za kolata: ");
		System.out.println(customCar);
	}

}


public class Car {
	private String make;
	private String model;
	private int year;
	
	public Car() {
		this.make = "Unknown";
		this.model = "Unknown";
		this.year = 2023;
	}

public Car(String make, String model, int year) {
	this.make = make;
	this.model = model;
	this.year = 2023;
}

public String toString() {
	return " Make: " + " , Model: " + model + " , Year: " + year;
    }
}

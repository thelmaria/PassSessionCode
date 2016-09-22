public class Car {
	// under the assumption all cars have 4 wheels.
	private final int NUMOFWHEELS = 4;
	
	private String make;
	private String model;
	private String colour;
	private double numberOfKiolmeters;
	
	public Car(String  make, String model, String colour, double numberOfKiolmeters) {
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.numberOfKiolmeters = numberOfKiolmeters;
	}
	
	/*
	 * This method is not dependent on this class as converting from miles to 
	 * kilometers can be done for other purposes (it isn't only for Cars).
	 */
	public static double convertMilesToKiolmetres(double miles) {
		return (1.6 * miles);
	}
	
	public static void main(String[] args) {
		// 2700 miles
		double miles = 2700;
		
		// Used the method for Car "convertMilesToKiolmetres" without creating
		// an object (instance) of the class!
		double convertedToKM = Car.convertMilesToKiolmetres(miles);

		
		Car subaru = new Car("Subaru", "Forester", "Blue", convertedToKM);
	}
}

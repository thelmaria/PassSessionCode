// Pen is a subclass of DrawingObject
public class Pen extends DrawingObject {
	
	/* Instance Variables for Pen */
	private boolean hasLid;
	private boolean isPlastic;
	
	/* Constructor for Pen */
	public Pen(String colour, int length, String brand, boolean hasLid, boolean isPlastic) {
		// Calls the constructor of the Super class (Drawing Object).
		super(colour, length, brand);
		
		// These variables are set in Pen because they
		// belong to the Pen class.
		this.hasLid = hasLid;
		this.isPlastic = isPlastic;
	}
	
	/**
	 * Demonstrating how to override a method.
	 */
	@Override
	public void writing() {
		System.out.println("The pen wrote.");
	}
	
	/**
	 * Implementing a method that is specific to the Pen class.
	 */
	public void refillPen() {
		System.out.println("Refilling pen");
	}
	
	/**
	 * Overriding the toString() from DrawingObject (not Object).
	 */
	@Override
	public String toString() {
		// super.toString() calls the toString() method of the super class
		// DrawingObject! How cool is that!!
		String returnString = super.toString();
		returnString += "hasLid=" + hasLid + " isPlastic=" + isPlastic;
		
		return returnString;
	}
}

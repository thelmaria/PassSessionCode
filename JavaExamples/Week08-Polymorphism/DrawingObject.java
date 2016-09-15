/**
 * Basic example to show Polymorphism.
 * 
 * Polymorphism = "The condition of occurring in several different forms."
 * // https://goo.gl/RiQuD1
 * 
 * Example:
 * 	If a Dog is an Animal it can therefore take two different forms.
 * 
 * Animal dog1 = new Dog();
 * Dog dog2 = new Dog();
 * 
 * It is the same thing just occurring in different forms!
 * 
 * Polymorphism is an overly big term to explain something that is very simple.
 * 
 * If you understand inheritance polymorphism is easy to understand.
 * 
 * Confused? Try it for yourself or have a look at the Pen example.
 * 
 * Super Class: DrawingObject
 * Sub Classes: Pen and Pencil
 * 
 * Note: This was made with students in the PASS class. If you see a mistake please 
 * let me know by putting in an issue on GitHub (if you know how). Otherwise post in
 * the forums! These are not meant to be perfect examples but used to show the basics
 * of inheritance and polymorphism.
 * 
 * @author Sav Tripodi
 */
public abstract class DrawingObject {
	/* Member/Instance variables */
	// Note: private keeps the data encapsulated.
	// the Getters and Setter are used to access
	// these variables outside of this class!
	private String colour;
	private int length;
	private String brand;
	
	/* Constructor */
	public DrawingObject(String colour, int length, String brand) {
		this.colour = colour;
		this.length = length;
		this.brand = brand;
	}
	
	/* Public method:
	 * Therefore it will be inherited by all sub classes
	 *  */
	public void writing() {
		System.out.println(this.colour + " currently writting!");
	}
	
	/* Getters and Setters for instance variables */
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * Overriding the built-in string type 
	 * (found in java.lang.object : https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html)
	 */
	@Override
	public String toString() {
		return "DrawingObject: colour=" + colour + ", length=" + length
				+ ", brand=" + brand + " " ;
	}
}

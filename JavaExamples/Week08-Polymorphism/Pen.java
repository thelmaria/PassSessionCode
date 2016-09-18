// Pen is a subclass of DrawingObject
public class Pen extends DrawingObject {
	
	/* Instance Variables for Pen */
	
	// inkQuantity represents a percentage. e.g. 0.9 = 90%
    private double inkQuantity;
    private PenType typeOfPen;

	/* Constructor for Pen */
	public Pen(String colour, int length, String brand, double inkQuantity, PenType typeOfPen) {
		// Calls the constructor of the Super class (Drawing Object).
		super(colour, length, brand);
		
		// These variables are set in Pen because they
		// belong to the Pen class.
        this.inkQuantity = inkQuantity;
        this.typeOfPen = typeOfPen;
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
    
    private double getInkQuantity() {
      return this.inkQuantity;
    }

    private void setInkQuantity(double inkQuantity) {
      this.inkQuantity = inkQuantity;
    }

    private PenType getTypeOfPen() {
      return this.typeOfPen;
    }

    private void setTypeOfPen(PenType typeOfPen) {
      this.typeOfPen = typeOfPen;
    }
	
	/**
	 * Overriding the toString() from DrawingObject (not Object).
	 */
	@Override
	public String toString() {
		// super.toString() calls the toString() method of the super class
		// DrawingObject! How cool is that!!
		String returnString = super.toString();
		returnString += "inkQuantity=" + inkQuantity + " typeOfPen=" + typeOfPen;
		
		return returnString;
	}
}

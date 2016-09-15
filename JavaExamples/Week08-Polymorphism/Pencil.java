// Pencil is a subclass of DrawingObject
public class Pencil extends DrawingObject {
	
	/* Instance Variables for Pencil */
	private boolean isWooden;
	
	public Pencil(String colour, int length, String brand, boolean isWooden) {
		super(colour, length, brand);
		this.isWooden = isWooden;
	}
	
	/**
	 * Method specific to Pencil.
	 */
	public void sharpen() {
		System.out.println("sharpen");
	}
	
	/**
	 * Overriding the toString() from DrawingObject (not Object).
	 */
	@Override
	public String toString() {
		// super.toString() calls the method of super class
		// DrawingObject!
		String returnString = super.toString();
		returnString += "isWooden=" + isWooden;
		
		return returnString;
	}
}

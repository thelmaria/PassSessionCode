// Pencil is a subclass of DrawingObject
public class Pencil extends DrawingObject {
	
	/* Instance Variables for Pencil */
	// e.g. HB, B, 2B, etc
	private String pencilGrading;
	
	public Pencil(String colour, int length, String brand, String pencilGrading) {
		super(colour, length, brand);
		this.pencilGrading = pencilGrading;
	}
	
	/**
	 * Method specific to Pencil.
	 */
	public void sharpen() {
		System.out.println("sharpen");
	}

	public String getPencilGrading() {
		return pencilGrading;
	}

	public void setPencilGrading(String pencilGrading) {
		this.pencilGrading = pencilGrading;
	}

	/**
	 * Overriding the toString() from DrawingObject (not Object).
	 */
	@Override
	public String toString() {
		// super.toString() calls the method of super class
		// DrawingObject!
		String returnString = super.toString();
		returnString += "pencilGrading=" + pencilGrading;
		
		return returnString;
	}
}

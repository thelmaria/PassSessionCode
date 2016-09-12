/**
 * This class relates to a Pen example done in a PASS Session.
 */

public class Pen {
	/*
	 * What a Pen has.
	 */
	private String brand;
	private String color;
	private String owner;
	private boolean empty;
	
	/*
	 * Defines a Pen when called.
	 */
	public Pen(String brand, String color, String owner, boolean empty) {
		this.brand = brand;
		this.color = color;
		this.owner = owner;
		this.empty = empty;
	}

	/*
	 * Actions a Pen can do.
	 */
	public void draw() {
		if(empty == false) {
			System.out.println("A picture was drawn, it's good I swear!");
		} else {
			System.out.println("Can't draw the pen is empty!");
		}	
	}
	
	public void write() {
		if(empty == false) {
			System.out.println("The pen wrote something");
		} else {
			System.out.println("Can't write the pen is empty!");
		}	
	}
	
	public void refillPen() {
		if(empty == false) {
			System.out.println("The pen is empty!");
		} else {
			empty = false;
			System.out.println("The pen has been refilled.");
		}
	}
	
	/*
	 * Things you can do to a pen.
	 */
	public boolean isEmpty() {
		return empty;
	}
	
	@Override
	public String toString() {
		return "Pen [brand=" + brand + ", color=" + color + ", owner=" + owner + ", empty=" + empty + "]";
	}
	
	/*
	 * Where you create your pens.
	 */
	public static void main(String[] args) {
		// Pen 1: Blue Pen
		Pen bluePen = new Pen("Artline", "Blue", "Tony", false);
		// Pen 2: Red Pen
		Pen redPen = new Pen("Profile", "Red", "John", true);
		
		/*
		 * Prints information about the pen.
		 */
		System.out.println(bluePen);
		System.out.println(redPen);
		
		/*
		 * Write and draw with the pen (*Note what happens when it is empty!).
		 */
		bluePen.write();
		bluePen.draw();
		
		redPen.write();
		redPen.draw();
		
		// Refill the red pen and it will work
		redPen.refillPen();
		// Now test it
		redPen.write();
		redPen.draw();
	}

}

// Polymorphism = "taking many different forms."
// https://goo.gl/RiQuD1
public class Main {
	public static void main(String[] args) {

		Pen pen1 = new Pen("blue", 6, "Columbia", 0.9, PenType.BALLPOINT);
		Pencil pencil1 = new Pencil("red", 10,"PAPER MATE", "HB");

		// Pen object can be in the form of a DrawingObject
		// as it is a subclass!
		DrawingObject pen1Polymorphism = pen1;

		// Array of DrawingObject's (contains a Pen and a Pencil)
		DrawingObject[] arrayExample = {
				pen1,
				pencil1
		};

		for(int i = 0; i < arrayExample.length; i++) {
			arrayExample[i].writing();
			System.out.println(arrayExample[i]);

			// This checks the type to see if it's an instance of a Pen
			// if so it can safely use the method and cast back to a Pen.
			if(arrayExample[i] instanceof Pen) {
				Pen transfer = (Pen)arrayExample[i];
				transfer.refillPen();
			}
			
			// This checks the type to see if it's an instance of a Pencil
			// if so it can safely use the method and cast back to a Pencil.
			if(arrayExample[i] instanceof Pencil) {
				Pencil transfer = (Pencil)arrayExample[i];
				transfer.sharpen();
			}
		}
	}
}

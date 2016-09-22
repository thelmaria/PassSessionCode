public class Fish extends Animal {
	private int numberOfFins;
	
	public Fish(String name, int age, double height, double weight, boolean isAlive, AnimalGroup animalGroup, int numberOfFins) {
		super(name, age, height, weight, isAlive, animalGroup);
		// Can set extra parameters that weren't contained in super class (Animal.java).
		this.numberOfFins = numberOfFins;
	}

	@Override
	public void move() {
		System.out.println(this.getName() + " swam 50m.");
	}
	
	public int getNumberOfFins() {
		return numberOfFins;
	}

	@Override
	public String toString() {
		// by writing super.toString() you are calling the old implementation of the 
		// method (the toString() defined in Animal!). Pretty cool if you ask me!
		return super.toString() + "numberOfFins=" + numberOfFins;
	}
}

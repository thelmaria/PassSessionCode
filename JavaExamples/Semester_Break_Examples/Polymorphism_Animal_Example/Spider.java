public class Spider extends Animal {
	public Spider(String name, int age, double height, double weight, boolean isAlive, AnimalGroup animalGroup) {
		super(name, age, height, weight, isAlive, animalGroup);
	}

	@Override
	public void move() {
		System.out.println(this.getName() + " crawled away very fast");
	}
	
	public void bite() {
		System.out.println(this.getName() + " ");
	}
	
	/*
	 * Example of changing the behaviour of an inherited method.
	 */
	@Override
	public boolean die() {		
		if(this.isAlive()) {
			System.out.println("The spider yelled, \"I don't wanna die!\"");
			this.setAlive(false);
		}
		return this.isAlive();
	}
}

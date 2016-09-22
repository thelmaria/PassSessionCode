public class Dog extends Animal {
	public Dog(String name, int age, double height, double weight, boolean isAlive, AnimalGroup animalGroup) {
		super(name, age, height, weight, isAlive, animalGroup);
	}

	@Override
	public void move() {
		// Dog has access to getName() as it is inherited from the Animal class.
		System.out.println(this.getName() + " ran 20m");
	}
	
	public void bark() {
		System.out.println(this.getName() + " barked.");
	}
}

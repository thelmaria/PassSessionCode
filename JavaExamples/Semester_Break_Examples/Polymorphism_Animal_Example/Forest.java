public class Forest {
	/*
	 * All the animals contained in the forest.
	 */
	private Animal[] animalsInForest;
	
	public Forest(Animal[] animalsInForest) {
		this.animalsInForest = animalsInForest;
	}
	
	public Animal[] getAnimals() {
		return this.animalsInForest;
	}
	
	public static void main(String[] args) {
		
		// That is polymorphism.
		Animal[] animalCollections = {
				/* location [0] */ new Dog("Sam", 5, 50.0, 20.0, true, AnimalGroup.MAMMAL),
				/* location [1] */ new Fish("Johnny", 3, 10.0, 10.0, true, AnimalGroup.FISH, 2),
				/* location [2] */ new Spider("Tim", 1, 0.6, 0.001, true, AnimalGroup.INVERTEBRATE)
		};
		
		Forest forest = new Forest(animalCollections);
		Animal[] forestAnimals = forest.getAnimals();
		
		
		for(int i = 0; i < forestAnimals.length; i++) {
			Animal currentAnimal = forestAnimals[i];
			System.out.println(currentAnimal);
			
			/*
			 *  If we want all the dogs in the forest to bark
			 *  we have to check if its a dog and if so cast it and
			 *  use the method.
			 */
			if(currentAnimal instanceof Dog) {
				Dog convertToDogFromAnimal = (Dog) currentAnimal;
				convertToDogFromAnimal.bark();
			}
		}
		
		/*
		 *  The first element is a Dog.
		 *  Therefore, I can declare it as a dog, can't I?
		 *  Yes you can but you have to cast it first because
		 *  it is currently stored as an Animal.
		 *  More info read can be found at the casting section of this page: 
		 *  https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html
		 */
		Animal asAnAnimal = forestAnimals[0];
		Dog asADog = (Dog)forestAnimals[0];
		
		/*
		 * that is Polymorphism! It's the same thing being stored in two different forms
		 * (an animal and a Dog!). The big word isn't so scary now, is it?
		 * Polymorphism = "The condition of occurring in several different forms."
		 */

		/*
		 * If you want the full picture Java itself is just one big inheritance structure!
		 * Every time you make a class you have done Polymorphism/Inheritance because every class in
		 * java extends the Object class. (https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html)
		 */
		// Therefore I can store the Dog three different ways (Object, Animal, Dog).
		Object asAnObject = (Object)forestAnimals[0];
		asAnAnimal = (Animal) forestAnimals[0];
		asADog = (Dog)forestAnimals[0];
		
	}
}

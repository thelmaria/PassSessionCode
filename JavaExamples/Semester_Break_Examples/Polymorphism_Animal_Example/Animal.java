/**
 * Basic example to show Polymorphism.
 * 
 * Polymorphism = "The condition of occurring in several different forms."
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
 * Confused? Try it for yourself or have a look at the Animal example.
 * 
 * @author Sav Tripodi
 */
public abstract class Animal {
	private String name;
	private int age;
	private double height;
	private double weight;
	private boolean isAlive;
	// Uses enum type (find in AnimalGroup.java)
	private AnimalGroup animalGroup;
	
	// Constructor
	public Animal(String name, int age, double height, double weight, boolean isAlive, AnimalGroup animalGroup) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.isAlive = isAlive;
		this.animalGroup = animalGroup;
	}

	// Abstract. Therefore, any class that extends the Animal class 
	// has to override and implement this method.
	public abstract void move();

	// Slightly sad but hey, it happens.
	// This isn't abstract because most animals die.
	public boolean die() {
        this.isAlive = false;
		return this.isAlive;
	}
	
	/* Setters and Getters */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	public AnimalGroup getAnimalGroup() {
		return animalGroup;
	}

	public void setAnimalGroup(AnimalGroup animalGroup) {
		this.animalGroup = animalGroup;
	}

	/*
	 * Overriding the built-in string type 
	 * (found in java.lang.object : https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html)
	 */
	@Override
	public String toString() {
		return "Animal: name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + ", isAlive="
				+ isAlive + ", animalGroup=" + animalGroup + " ";
	}
}

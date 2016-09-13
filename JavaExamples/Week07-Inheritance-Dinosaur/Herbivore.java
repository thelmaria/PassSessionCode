
public class Herbivore extends Dinosaur{

	public Herbivore(String name, int age, String habitat, double size, double weight) {
		super(name, age, habitat, size, weight);
	}

	@Override
	public void eat() {
		System.out.println(getName() + " ate some leafs");
	}

}

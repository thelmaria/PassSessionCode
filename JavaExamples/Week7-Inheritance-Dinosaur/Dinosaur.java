
public abstract class Dinosaur {
	
	private String name = "";
	private int age = 0;
	private String habitat = "";
	private double size = 0.0;
	private double weight = 0.0;
	
	public abstract void eat();
	
	public void drink(){
		System.out.println(getName() + " drank some water");
	}
	
	public Dinosaur(String name, int age, String habitat, double size, double weight) {
		this.name = name;
		this.age = age;
		this.habitat = habitat;
		this.size = size;
		this.weight = weight;
	}

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

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}

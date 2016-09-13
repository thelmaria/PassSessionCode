
public class Carnivore extends Dinosaur{

	public Carnivore(String name, int age, String habitat, double size, double weight) {
		super(name, age, habitat, size, weight);
	}

	@Override
	public void eat() {
		System.out.println(getName() + " ate some animals, yummy!");
	}
	
	public void kill(int amountToKill){
		if(amountToKill < 1){
			System.out.println("");
		}else if(amountToKill == 1){
			System.out.println(getName() + " killed " + amountToKill + " small dinosaurs!");
		}else if(amountToKill > 1){
			System.out.println(getName() + " killed " + amountToKill + " small dinosaurs! " 
									+ getName() + " is on a rampage");
		}
	}
}

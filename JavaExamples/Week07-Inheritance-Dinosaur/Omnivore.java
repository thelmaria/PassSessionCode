
import java.util.Scanner;

public class Omnivore extends Dinosaur {
	
	public Omnivore(String name, int age, String habitat, double size, double weight) {
		super(name, age, habitat, size, weight);
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
	
	@Override
	public void eat() {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("What do you feel like? Leaves or meat? ");
		String userInput = keyboard.nextLine();

		if(!(userInput.equalsIgnoreCase("leaves")) || !(userInput.equalsIgnoreCase("meat"))){
			System.out.println("Please enter 'leaves' or 'meat'! ");
			userInput = keyboard.nextLine();
		} else {
			System.out.println(getName() + " ate " + userInput);
		}
	}

}

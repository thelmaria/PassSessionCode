
public class Carnivore extends Dinosaur{

	public Carnivore(String name, int age, String habitat, double size, double weight) {
		super(name, age, habitat, size, weight);
	}

	@Override
	public void eat() {
		System.out.println(getName() + " ate some animals, yummy!");
	}
	
	public void kill(int amountToKill){
		
        if(amountToKill <= 0){
			System.out.println("");
		} else {
          
            // Our base message. 
            System.out.print(getName() + " killed " + amountToKill + " small dinosaur");
            
            if(amountToKill == 1) { 
       
                // Finish the line
			    System.out.println("!");
		    } else { 

                // We killed more than one dinosaur. The last word should be plural, and 
                // we'll add a little more information. 
                System.out.println("s! " + getName() + " is on a rampage! Watch out!");
		    }
        
        }
	}
}

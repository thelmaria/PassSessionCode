
public class JurassicPark {
	
	private Dinosaur dinosaursInPark[];
	
	public JurassicPark(Dinosaur dinosaursInPark[]) {
		this.dinosaursInPark = dinosaursInPark;
	}
	
	public Dinosaur[] getDinosaursInPark() {
		return dinosaursInPark;
	}
	
	public static void main(String[] args) {
		//Herbivore
		Herbivore abrictosaurus = new Herbivore("abrictosaurus", 64, "forest", 120, 150);
		//Omnivore
		Omnivore troodon = new Omnivore("troodon", 34, "main land", 235, 2554);
		//Carnivore
		Carnivore avimimus = new Carnivore("abrictosaurus", 21, "forest", 189, 765);
		
		Dinosaur dinosaursToAdd[] = {
				abrictosaurus,
				troodon,
				avimimus
		};
		
		JurassicPark newPark = new JurassicPark(dinosaursToAdd);
		Dinosaur dinosaursInPark[] = newPark.getDinosaursInPark();
		
		for(int i = 0; i < dinosaursInPark.length; i++) {
			dinosaursInPark[i].drink();
			
			if(dinosaursInPark[i] instanceof Carnivore) {
				Carnivore carnivore = ((Carnivore)dinosaursInPark[i]);
				carnivore.kill(5);
			}
		}
	}
}

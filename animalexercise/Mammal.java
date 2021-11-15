package animalexercise;

public class Mammal extends Animal {
	
	private String areWarmblooded;
	
	public Mammal(String makesNoise, String canMove, String areEukaryotes) {
		super(makesNoise, canMove, areEukaryotes);
	}
	
	public String getAreWarmblooded() {
		return areWarmblooded;
	}

	public void setAreWarmblooded(String areWarmblooded) {
		this.areWarmblooded = areWarmblooded;
	}


	public void birth() {
		System.out.println("Most mammals give birth to live babies");
	}

}

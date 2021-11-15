package animalexercise;

public class Reptiles extends Animal{
	
	private String areColdblooded;

	public Reptiles(String makesNoise, String canMove, String areEukaryotes) {
		super(makesNoise, canMove, areEukaryotes);
	}

	public String getAreColdblooded() {
		return areColdblooded;
	}

	public void setAreColdblooded(String areColdblooded) {
		this.areColdblooded = areColdblooded;
	}

	public void eggs() {
		System.out.println("Most reptiles lay eggs");
	}
}

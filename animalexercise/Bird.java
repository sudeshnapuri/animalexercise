package animalexercise;

public class Bird extends Animal{
	
	private String canFly;

	public Bird(String makesNoise, String canMove, String areEukaryotes) {
		super(makesNoise, canMove, areEukaryotes);
	}

	public String getCanFly() {
		return canFly;
	}

	public void setCanFly(String canFly) {
		this.canFly = canFly;
	}

	public void feathers() {
		System.out.println("Birds have feathers");
	}
}
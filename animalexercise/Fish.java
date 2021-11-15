package animalexercise;

public class Fish extends Animal{
	
	private String haveGills;
	
	public Fish(String makesNoise, String canMove, String areEukaryotes) {
		super(makesNoise, canMove, areEukaryotes);
	}

	public String getHaveGills() {
		return haveGills;
	}

	public void setHaveGills(String haveGills) {
		this.haveGills = haveGills;
	}

	public void canSwim() {
		System.out.println("Fish can swim");
	}

}

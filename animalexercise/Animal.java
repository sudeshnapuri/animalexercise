package animalexercise;

import interfaces.Earth;
import interfaces.Living;

public class Animal implements Earth, Living{
	
// private variables
	private String makesNoise;
	private String canMove;
	private String areEukaryotes;
	
	
// getters and setters
	public String getMakesNoise() {
		return makesNoise;
	}
	public void setMakesNoise(String makesNoise) {
		this.makesNoise = makesNoise;
	}
	public String getCanMove() {
		return canMove;
	}
	public void setCanMove(String canMove) {
		this.canMove = canMove;
	}
	public String getAreEukaryotes() {
		return areEukaryotes;
	}
	public void setAreEukaryotes(String areEukaryotes) {
		this.areEukaryotes = areEukaryotes;
	}
	
// constructor
	public Animal(String makesNoise, String canMove, String areEukaryotes) {
		super();
		this.makesNoise = makesNoise;
		this.canMove = canMove;
		this.areEukaryotes = areEukaryotes;
	}
// tostring method
	@Override
	public String toString() {
		return "Animal [makesNoise=" + makesNoise + ", canMove=" + canMove + ", areEukaryotes=" + areEukaryotes + "]";
	}
	
// methods from interface (also inherited by 4 classes)
	public void isLiving() {
		
	}
	public void livesOnEarth() {
		
	}	
	
// my own methods
	public void hair() {
		System.out.println("Animals have hair/fur/feathers");
	}
		
	public void eggs() {
		System.out.println("Some animals can lay eggs");
		
	}
}
		

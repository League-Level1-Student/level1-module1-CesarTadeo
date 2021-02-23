package _06_duck;

public class HedgehogRunner {

	public static void main(String[] args) {
		
		Hedgehog hedgy = new Hedgehog("worms","forest");
		System.out.println("Hedgy's favorite food is " + hedgy.favoriteFood);
		System.out.println("Hedgy lives in the " + hedgy.habitat);
		hedgy.rollIntoBall();
		hedgy.sleep();	
	}
	
}

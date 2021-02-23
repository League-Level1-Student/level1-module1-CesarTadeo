package _06_duck;

public class Hedgehog {

	String habitat;
	String favoriteFood;
	String name = "Hedgy";
	
	void rollIntoBall() { 	
		System.out.println(name + " has rolled into a ball");
	}
	
	void sleep() {
		System.out.println(name + " has gone to sleep");
	}
	
	Hedgehog(String favoriteFood, String habitat) {
	       this.favoriteFood = favoriteFood;
	       this.habitat = habitat;
	}

	
}

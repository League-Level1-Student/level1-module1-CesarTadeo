package _06_duck;

public class Duck {

	int numberOfFriends;
	String favoriteFood;
	
	void quack() { 	
		System.out.println("Duck quacked");
	}
	
	void waddle() {
		System.out.println("Duck waddled");
	}
	
	Duck(String favoriteFood, int numberOfFriends) {
	       this.favoriteFood = favoriteFood;
	       this.numberOfFriends = numberOfFriends;
	}

	
}

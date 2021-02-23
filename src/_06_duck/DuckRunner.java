package _06_duck;

public class DuckRunner {

	public static void main(String[] args) {
		
		Duck daffy = new Duck("donuts",5);
		daffy.quack();
		daffy.waddle();
		System.out.println("Daffy's favorite food is " + daffy.favoriteFood);
		System.out.println("Daffy has " + daffy.numberOfFriends + " friends");
	}
	
}

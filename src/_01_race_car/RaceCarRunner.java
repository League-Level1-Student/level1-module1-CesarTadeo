package _01_race_car;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */



public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
		RaceCar RaceCarObject = new RaceCar("ritz", 5);
		// 2. Print the RaceCar's position in the race
		int position = RaceCarObject.getPositionInRace();
		System.out.println("You car is cuurently in position number " + position + ".");
		// 3. Crash the RaceCar
		RaceCarObject.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.
		if (RaceCarObject.isDamaged() == true) {
			RaceCarObject.pit();
		}
		// 5. Help the car move into first place.
		RaceCarObject.overtake();
		RaceCarObject.overtake();
		RaceCarObject.overtake();
		RaceCarObject.overtake();
		RaceCarObject.overtake();
		RaceCarObject.overtake();
		RaceCarObject.overtake();
		RaceCarObject.overtake();
		position = RaceCarObject.getPositionInRace();
	}
}

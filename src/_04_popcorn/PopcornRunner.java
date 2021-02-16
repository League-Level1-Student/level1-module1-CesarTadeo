package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornRunner {
	public static void main(String[] args) {
		
		String flavor = JOptionPane.showInputDialog("what flavor popcorn would you like");
		
		Popcorn PopcornObject = new Popcorn(flavor);
		Microwave MicrowaveObject = new Microwave();
		
		String time = JOptionPane.showInputDialog("how long would you like the time to be");
		int cookTime = Integer.parseInt(time);
		
		MicrowaveObject.setTime(cookTime);
		MicrowaveObject.putInMicrowave(PopcornObject);
		PopcornObject.eat();
		MicrowaveObject.startMicrowave();
	}
}

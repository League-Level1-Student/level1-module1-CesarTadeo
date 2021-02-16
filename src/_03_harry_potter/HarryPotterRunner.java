package _03_harry_potter;

public class HarryPotterRunner {
	public static void main(String[] args) {
		
		HarryPotter HarryPotterObject = new HarryPotter();
		HarryPotterObject.makeInvisible(true);
		HarryPotterObject.spyOnSnape();
		HarryPotterObject.makeInvisible(false);
		HarryPotterObject.castSpell("stupefy");
	}
}

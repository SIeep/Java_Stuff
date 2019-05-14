public class Example {

	public static void main(String[] args) {
		PezDispenser dispenser = new PezDispenser();
		System.out.println("I'm creating a Pez dispenser.");
		System.out.printf("The current dispenser is a %s dispenser %n",
			dispenser.getCharacterName());
	}

}
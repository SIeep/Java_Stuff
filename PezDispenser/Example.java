public class Example {

	public static void main(String[] args) {
		PezDispenser dispenser = new PezDispenser("Yoda");
		System.out.println("I'm creating a Pez dispenser.");
		System.out.printf("FUN FACT! The max Pez count in a Pez dispenser is %d %n", 
			PezDispenser.MAX_PEZ);
		System.out.printf("The current dispenser is a %s dispenser %n",
			dispenser.getCharacterName());
		String before = dispenser.swapHead("Brandon");
		System.out.printf("The old head was %s but now it is a %s head %n", 
			before, dispenser.getCharacterName());
		if (dispenser.isEmpty()) {
			System.out.println("dispenser is empty.");
		}
		System.out.println("Filling the dispenser with delicious PEZ...\n");
		System.out.println("..................\n");
		dispenser.fill();
		if (!dispenser.isEmpty()) {
			System.out.println("dispenser is full.");
		}
		while (dispenser.dispense()) {
			System.out.println("Nom");
		}
		if (dispenser.isEmpty()) {
			System.out.println("You ate all the pez!");
		}
		dispenser.fill(4);
		dispenser.fill(2);
		while (dispenser.dispense()) {
			System.out.println("Chomp!");
		}
		try {
			dispenser.fill(400);
			System.out.println("This shouldn't happen.");
		} catch (IllegalArgumentException iae) {
			System.out.println("Whoa there, partner");
			System.out.printf("The error was: %s %n", iae.getMessage());
		}
		
		
	}

}
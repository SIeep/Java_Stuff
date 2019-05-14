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
	}

}
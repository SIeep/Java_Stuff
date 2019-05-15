public class Main {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Usage: java Main <name>");
			System.out.println("requires name argument");
			System.exit(1);
		}
		Cat cat = new Cat(args[0]);
		System.out.printf("Created a cat named %s...%n", cat.getCatName());
	}

}
public class Main {

  public static void main(String[] args) {
  	if (args.length == 0) {
  		System.out.println("Usage: java Main <name>");
  		System.err.println("name is required.");
  		System.exit(1);
  	}
  	Cow cow = new Cow(args[0]);
    System.out.printf("Creating a cow named %s...%n", cow.getName());
  }
}
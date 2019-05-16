public class Explore {
 
  public static void main(String[] args) {
    String[] friends = {"Brandon", "Kayla", "Smith"};
    // System.out.println(friends[0]);

    for (String friend : friends) {
    	System.out.println("Hi there, " + friend + "! I'm testing an enhanced for loop.\n");
    }

  	System.out.println("----------------------");  

    for (int i = 0; i < friends.length; i++) {
    	System.out.printf("Hi %s, I'm testing a regular for loop.%n", friends[i]);
    }
  }
  
}
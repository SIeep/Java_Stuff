public class Explore {
 
  public static void main(String[] args) {
    String[] friends = {"Brandon", "Kayla", "Smith"};
    // System.out.println(friends[0]);
    for (String friend : friends) {
    	System.out.println("Hi there, " + friend + "! I'm testing an enhanced for loop.\n");
    };
  	System.out.println("----------------------");  
    for (int i = 0; i < friends.length; i++) {
    	System.out.printf("Hi %s, I'm testing a regular for loop.%n", friends[i]);
    };
    System.out.println("----------------------");  
    int[] brandonScoreCard = {1, 2, 8, 1, 3, 2, 7, 3, 6, 2, 5, 5, 1};
    for (int i = 0; i < brandonScoreCard.length; i++) {
    	System.out.printf(" The score for hole %d is %d. %n",
    	i + 1, 
    	brandonScoreCard[i]);
    };
    System.out.println("/////////////////////");
    int[][] scorecards = {
    	{
    		1, 4, 8, 1, 3, 2, 7, 3, 6, 2, 5, 5, 1
    	},
    	{
    		4, 6, 3, 6, 3, 1, 7, 3, 6, 1, 5, 5, 6
    	},
    	{
    		2, 6, 6, 2, 6, 1, 7, 6, 2, 1, 5, 5, 2
    	}
    };
    // for (int i = 0; i < scorecards.length; i++) {
    // 	System.out.printf("Testing scorecard %d", scorecards[i]);
    // }
    System.out.println("----------------------");
    System.out.println("----------------------");
    for (int i = 0; i < friends.length; i++) {
    	System.out.printf("%s %n ----------------- %n", friends[i]);
    	for (int j = 0; j < scorecards[i].length; j++) {
    		System.out.printf("Hole #%d: %d%n", j + 1 , scorecards[i][j]);
    	}
    	System.out.println("/------------------------------/");
    }
  }
  
}
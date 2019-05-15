public class Hangman {

  public static void main(String[] args) {
    // Your incredible code goes here...
    Game game = new Game("brandon");
    Prompter prompter = new Prompter(game);
    boolean isHit = prompter.promptForGuess();
    if (isHit) {
    	System.out.println("You got a hit!");
    } else {
    	System.out.println("Missed. Didn't hit.");
    }
  }
}
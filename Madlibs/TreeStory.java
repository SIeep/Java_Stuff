import java.io.Console;
 
public class TreeStory {
    
    public static void main(String[] args) {
        Console console = System.console();
        /*  Some terms:
            noun - Person, place or thing
            verb - An action
            adjective - A description used to modify or describe a noun
            Enter your amazing code here!
        */
            String name = console.readLine("Enter your name:   ");
            String adjective = console.readLine("Enter an adjective:   ");
            String verb = console.readLine("Enter an verb:   ");
            String adverb = console.readLine("Enter an adverb:   ");
            String noun = console.readLine("Enter an noun:   ");
            console.printf("Your story:\n---------------\n");
            console.printf("%s is a %s %s.  ", name, adjective, noun);
            console.printf("They are always %s %s\'s.\n", adverb, noun);
    }
    
}
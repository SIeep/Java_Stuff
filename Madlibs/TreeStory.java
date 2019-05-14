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
            int age = Integer.parseInt(console.readLine("How old are you?    "));
            if (age < 13) {
                console.printf("Sorry, you must be at least 13 years old to run this program.\n");
                System.exit(0);
            }
            String name = console.readLine("Enter your name:   ");
            String adjective = console.readLine("Enter an adjective:   ");
            String verb = console.readLine("Enter an verb:   ");
            String adverb = console.readLine("Enter an adverb:   ");
            String noun = console.readLine("Enter an noun:   ");
            if (noun.equals("dork")) {
                console.printf("No dorks allowed.\n");
                System.exit(0);
            }
            console.printf("Your story:\n---------------\n");
            console.printf("%s is a %s %s.  ", name, adjective, noun);
            console.printf("They are always %s %s\'s.\n", adverb, noun);
    }
    
}
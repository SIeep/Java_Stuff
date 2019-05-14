// I have initialized a java.io.Console for you. It is in a variable named console.

import java.io.Console;
 

 public class DoWhileLoop {

 	public static void main(String[] args) {
 		Console console = System.console();
 		String response;
 		
 		do {
 			response = console.readLine("Do you understand do while loops?\n");
 		} while(response.equalsIgnoreCase("no"));
	}
 }


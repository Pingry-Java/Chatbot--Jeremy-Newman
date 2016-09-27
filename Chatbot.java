import java.util.Scanner;

/**
* This class represents a basic AI that will chat with a human user.
* It isn't very human-like. yet......
* @author Coop Newman
* @version 0.1
*/
public class Chatbot
{

	public static void main(String[] args)
	{
		// Setup a new Scanner
		Scanner keys = new Scanner(System.in);
	
		System.out.println("Hi I'm Chatbot. What's your name?");
		String userName = keys.nextLine();
	
		// TODO greet user by name
		System.out.println("Nice to meet you " + userName + ", how old are you?");
		int age = keys.nextInt(); // Leaves the pointer before the newline character
		keys.nextLine(); // Gets the pointer to the beginning of the next line. Always do this after nextInt or nextDouble.
	
		if (age > 40 && age < 100) //&& is the and operator
		{
			System.out.println("Wow, that's old.");
			System.out.println("Only " + (100 - age) + " years until you're 100!");
		}
		else
		{
			System. out.println("How long until you turn " + (++age) + "?");
			keys.nextLine(); // Let the user answer, but doesn't store the answer anywhere.
		}
		String answer = "anything other than bye"; // Just to enter the loop for the first time
		while (! (answer.equals("bye") || answer.equals("Bye")))
		{
			System.out.println("Tell me one of your hobbies (or say \"bye\" to exit)");
			answer = keys.nextLine();
		}
	}
}
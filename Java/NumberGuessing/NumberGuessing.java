package numberguessing;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pearlberry
 */
public class NumberGuessing {

    public static void main(String[] args) {
        
        //Creates a new Scanner object
        Scanner scan = new Scanner(System.in);
        //Creates variable to hold the user's guess
        int guess = 0;
        
        //Generates random number using Java's built in Random method
        Random random = new Random();
        //Random number between 0 and 100
        int number = random.nextInt(100);
     
        //Runs until the user guesses correctly or guesses 10 times
        while(guess != number)
        {
            //Keeps track of how many guesses have been made - program stops after 10 guesses
            for(int guesses = 0; guesses <= 10; guesses++)
            {
                //Prompts user for a guess 
                System.out.println("Please guess a number between 0 and 100: ");
                //Reads guess
                guess = scan.nextInt();
                
                //Checks if guess is within range of 0 to 100
                if(guess < 0 || guess > 100)
                {
                    //User will be prompted to make a guess within range
                    System.out.println("Please use a number between 0 and 100. Try again.");
                }
                else if(guess >=0 && guess <= 100){
                //Checks if guess is high/low/correct
                if(guess == number)
                {
                    //Correct guess output
                    System.out.println("Congratulations! You guessed the number in " + guesses + " guesses. Thanks for playing!");
                    System.exit(0);
                }
                else if(guess < number)
                {
                    //Guess too low output and ask the user to enter a new guess
                    System.out.println("Too low, try again.\n");
                }
                else if(guess > number)
                {
                    //Guess too high output
                    System.out.println("Too high, try again.\n");
                }
            }
            }
            //Tells the user when they have guessed too many times and exits the program
            System.out.println("Sorry, you have guessed too many times. The number was " + number);
            System.exit(0);
        }
    }
    
}

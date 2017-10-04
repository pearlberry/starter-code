package numberguessing;

//Java will randomly generate a random number for me
import java.util.Random;
//Java library that makes it easy for us to get input from a user
import java.util.Scanner;

/**
 *
 * @author pearlberry
 */
public class NumberGuessing {

    public static void main(String[] args) {
        
        //Creates a new Scanner object
        //Anytime you are importing a library, you must initialize it within your program
        //So, whenever I want to get input from the user, i'll use scan.[inputIWant]
        Scanner scan = new Scanner(System.in);

        //Creates variable to hold the user's guess
        int guess = 0;
        
        //Initializes the random object, like stated above 
        Random random = new Random();

        //This utilizes the Random method to generate a random number between 0 and 100,
        //because I specified 100, but you can use whatever number you want.
        int number = random.nextInt(100);
     
        //Runs until the user guesses correctly OR guesses 10 times
        //This outer 'while' loop tells the program to run as long as the user has not guessed the number correctly
        //So within the 'while' loop, we also need to tell it to stop if the user hits 10 guesses.
        while(guess != number)
        {
            //Keeps track of how many guesses have been made
            //program will stop if the user guesses 10 times and does not guess correctly
            for(int guesses = 0; guesses <= 10; guesses++)
            {
                //Prompts user for a guess 
                System.out.println("Please guess a number between 0 and 100: ");
                //Reads guess from the user's input
                guess = scan.nextInt();
                
                //Checks if guess is within range of 0 to 100
                //This is sort of error-handling and would be optional to include this
                //Technically, the user can guess whatever number they want, but the computer will be nice and tell them
                //to guess a number within the given range. This won't count against one of their guesses since we
                //are not saying 'guesses++' within this if statement. You could do that, if you wanted the game to be 
                //more difficult :)
                if(guess < 0 || guess > 100)
                {
                    //User will be prompted to make a guess within the specified range
                    System.out.println("Please use a number between 0 and 100. Try again.");
                }
                else if(guess >=0 && guess <= 100){
                //Checks if guess is high/low/correct
                    //For performance purposes, if the user guesses the correct number on the first try, the program will only
                    //go through this step and skip the other else ifs. That is why I am checking for the correct guess first.
                    if(guess == number)
                    {
                        //Correct guess output
                        System.out.println("Congratulations! You guessed the number in " + guesses + " guesses. Thanks for playing!");
                        System.exit(0);
                    }
                    //If the user's guess is lower than the number
                    else if(guess < number)
                    {
                        //Guess too low output and ask the user to enter a new guess
                        System.out.println("Too low, try again.\n");
                    }
                    //If the user's guess is higher than the number
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

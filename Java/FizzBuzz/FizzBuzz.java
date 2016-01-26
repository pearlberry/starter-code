package fizzbuzz;

//imports Java Scanner library - you need this when you want to receive input from the user
import java.util.Scanner;

/**
 *
 * @author pearlberry
 * 
 */
public class FizzBuzz {

    public static void main(String[] args) {
        //Initializes the Scanner - this creates a new Scanner object which I called 'scan'.
        Scanner scan = new Scanner(System.in);
        //Prompts the user to enter a number.
        System.out.println("Enter a number greater than 15!");
        //Waits for the user to enter an integer.
        int input = scan.nextInt();
        //When the user enters a number, determines if the number meets any of our criteria.
        //For loop: starts at 1, runs loop until it reaches the user's number
        for (int i = 1; i <= input; i++) {
            //Checks if number is multiple of both 3 AND 5, prints FizzBuzz
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }
            //Checks if number is multiple of 3
            else if(i % 3 == 0){
                System.out.println("Fizz");
            }
            //Checks if number is multiple of 5
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }
            //If number is not multiple of 3 and/or 5, just prints the number.
            else{
                System.out.println(i);
            }
        }
    }
}

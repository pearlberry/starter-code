package reversestring;

//imports Java Scanner library - you need this when you want to receive input from the user
import java.util.Scanner;

/**
 *
 * @author pearlberry
 */
public class ReverseString {

    public static void main(String[] args) {
        //Initializes the Scanner - this creates a new Scanner object which I called 'scan'.
        Scanner scan = new Scanner(System.in);
        //Prompts the user to enter a string.
        System.out.println("Enter any string:");
        //Waits for the user to enter a string.
        String originalStr = scan.nextLine();
        
        //Using built-in StringBuffer method, pass in the original string, call reverse method & convert back to a String.
        String reverseStr = new StringBuffer(originalStr).reverse().toString();
        
        //Prints the reversed string.
        System.out.println("Here is your string in reverse:\n" + reverseStr);
    }
    
}

import java.util.Scanner;

/**
 *
 * @author hamc17
 */
public class Palindrome {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please type the text that you want to check.");
        String input = scan.nextLine();
        String reversed = "";
        int inputLength = input.length()-1;
        
        for(int done = 0; inputLength>=done; inputLength--)
        {
            reversed = reversed + input.charAt(inputLength);
        }
        
        if (reversed.equals(input))
        {
            System.out.println("The text was indeed a palindrome.");
            System.out.println( input + " == " + reversed );
        }
        else
        {
            System.out.println("The text was not a palindrome.");
            System.out.println( input + " != " + reversed );
        }
        
    }
}

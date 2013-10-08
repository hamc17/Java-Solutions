import java.util.Scanner;
/**
* @author hamc17
*/

public class ReverseString {
  
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in); // Sets up scanner
    
    System.out.println("Please type something."); // Asks user for input text
    
    String originalString = scan.nextLine(); // Scans for input text (including whitespace) and saves it in a string
    
    String reversedString = ""; // Declares and initialises an empty string
    
    for(int stringLength = originalString.length(), count = stringLength-1; count >= 0 ; count -= 1) 
      // sets up a loop to iterate through all chars from the last to the first and add them to the empty string
    {
      reversedString = reversedString + originalString.charAt(count);
    }
    scan.close(); // Closes scanner
    
    System.out.println("Your text reversed is: " + reversedString); // Prints the string with all chars added in reverse order

  }
}
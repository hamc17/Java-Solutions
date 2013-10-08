/**
 * @author hamc17
 * Program counts the number of individual words in some inputted text.
 */

import java.util.Scanner;

public class CountWords {

    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please type some text, the number of words will be counted. ");
        
        String input = scan.nextLine();
        int wordCount = 0;        
        
        String[] words = input.split("\\S+");
        wordCount = words.length;
        
        System.out.println("Total amount of words is: " + wordCount);
        }

        
}

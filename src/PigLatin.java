/**
* @author hamc17
* Program takes in text and prints it out using the rules of Pig Latin.
*/

import java.util.Scanner;

public class PigLatin {


  public static void main(String[] args) {
      
      Scanner scan = new Scanner(System.in); // Set up scanner
      
      String[] wordsArray = null; // Create array for individual words
      String inputString = "", nextWord = "", pigLatinWord = "";
      int wordCount = 0, totalWords = 0, inputStringLength = 0;
      
      System.out.println("Please type some words!");
      inputString = scan.nextLine(); // Take in input string
      inputStringLength = inputString.length(); // Find length of input string
       
       if (inputStringLength == 0) // Check if anything is actually typed
      {
          System.out.println("Please actually type something!"); 
          System.exit(0);
       }
      else if(inputString.matches(".*\\d.*")) // Check if the input string contains numbers
      {
         System.out.println("Please try again, but without any digits!");
         System.exit(0);
     }
      else // Otherwise split up the string into words in an array
      { 
          wordsArray = inputString.split("\\s+");
          totalWords = wordsArray.length;
     }
     
      
      while(wordCount < totalWords) // While there are more words in the array
     {
         String[] currentWordSplit = new String[2]; // Set up a small array for the word being worked on
         nextWord = wordsArray[wordCount]; // Get the next word
         nextWord = nextWord.toLowerCase(); // Set as lower case
         char firstLetter = nextWord.charAt(0); // Get the first letter of that word
         String firstLetterCheck = Character.toString(firstLetter); // Get first letter as a string
          
        if(firstLetterCheck.matches("[aeiouAEIOU]")) // Checks if the first letter is a vowel
         {   
             pigLatinWord = nextWord + "yay"; // Adds yay to the end of the word if it starts with a vowel
             wordsArray[wordCount] = pigLatinWord; // Replaces the original word with the modified one
             wordCount++; // Move on to next word
             pigLatinWord = ""; // Set the pig latin word as empty
         }
          
         else{
              currentWordSplit = nextWord.split("(?=[aeiouAEIOU])", 2); // Splits the word up into two pieces 
              pigLatinWord = currentWordSplit[1] + currentWordSplit[0] +"ay";
              wordsArray[wordCount] = pigLatinWord;
              wordCount++;
              pigLatinWord = "";
             }
              
         } 
      
          if (wordCount == totalWords) // If everything is finished with, set the first letter of the first word as a capital
          {
               String finalFirstWord = wordsArray[0], temp = "";
               int subStringLength = finalFirstWord.length();
               temp = Character.toString(finalFirstWord.charAt(0));
               temp = temp.toUpperCase();
               temp = temp + finalFirstWord.substring(1, subStringLength);
               wordsArray[0] = temp;
           }
         
         System.out.println("Your text in pig Latin is: ");
           for(String pigWord : wordsArray)
          {
                System.out.print(pigWord + " " );
          }
           
         System.out.println("");
    
     }
}   
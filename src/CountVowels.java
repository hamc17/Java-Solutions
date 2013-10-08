import java.util.Scanner;


/**
* @author hamc17
*/

public class CountVowels {

    public static void main(String[] args) {
        
        Scanner scan  = new Scanner(System.in);
        String option;
        
        int count = 0, vowelCount = 0, aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0, ACount = 0, ECount = 0, ICount = 0, OCount = 0, UCount = 0;
        
        System.out.println("Do you want to 1. Know how many vowels there are?");
        System.out.println("Do you want to 2. Know how many times each of the vowels appear?");
        System.out.println("Do you want to 3. Know how many times each of the vowels appear, both in uppercase and lowercase form?");
        System.out.println("Please type either 1, 2 or 3 to confirm your choice.");
        option = scan.nextLine();
        
        if(option.length() != 1 || option.matches("[1-3]") != true)
        {
            System.out.println("Try again but type 1, 2 or 3!");
        }
        else
        {
            System.out.println("Please type the text you want to check.");
            String input = scan.nextLine();
        
            while(count<input.length())
            {
                char currentChar = input.charAt(count);
                if(currentChar == 'a')
                {
                    aCount++;
                    vowelCount++;
                    count++;
                }
                else if(currentChar == 'e')
                {
                    eCount++;
                    vowelCount++;
                    count++;
                }
                else if(currentChar == 'i')
                {
                    iCount++;
                    vowelCount++;
                    count++;
                }
                else if(currentChar == 'o')
                {
                    oCount++;
                    vowelCount++;
                    count++;
                }
                else if(currentChar == 'u')
                {
                    uCount++;
                    vowelCount++;
                    count++;
                }
                else if(currentChar == 'A')
                {   
                    ACount++;
                    vowelCount++;
                    count++;
                }
                else if(currentChar == 'E')
                {
                    ECount++;
                    vowelCount++;
                    count++;
                }
                else if(currentChar == 'I')
                {
                    ICount++;
                    vowelCount++;
                    count++;
                }
                else if(currentChar == 'O')
                {   
                    OCount++;
                    vowelCount++;
                    count++;
                }
                else if(currentChar == 'U')
                {
                    UCount++;
                    vowelCount++;
                    count++;
                }
                else
                {
                    count++;
                }
            }
            
            
            if (option.matches("1"))
            {
                System.out.println("Total number of vowels was " + vowelCount);
            }
            else if(option.matches("2"))
            {
                int aAmount = aCount+ACount, eAmount = eCount+ECount, iAmount=iCount+ICount, oAmount=oCount+OCount, uAmount=uCount+UCount;
                System.out.println("Total number of vowels was " + vowelCount);
                System.out.println("Total number of a's was " + aAmount + ", e's was " + eAmount + ", i's was " + iAmount + ", o's was " + oAmount + " and u's was " + uAmount);
                
            }
            else if(option.matches("3"))
            {
                System.out.println("Total number of vowels was " + vowelCount);
                System.out.println("Total number of a's was " + aCount + ", e's was " + eCount + ", i's was " + iCount + ", o's was " + oCount + " and u's was " + uCount);
                System.out.println("Total number of A's was " + ACount + ", E's was " + ECount + ", I's was " + ICount + ", O's was " + OCount + " and U's was " + UCount);
                
            }

        }
    }
}
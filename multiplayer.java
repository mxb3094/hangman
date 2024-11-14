import java.util.Scanner;
public class multiplayer {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        String word = new String();
        boolean wordSolved = false;
        int bufferInt;

        System.out.println("Team 1, please enter your secret word: ");
        word = input.nextLine().trim();
        String lowercaseWord = word.trim().toLowerCase();
        char[] revealedWord = new char[lowercaseWord.length()];
        for (int i = 0; i < lowercaseWord.length(); i++)
        {
            if (lowercaseWord.charAt(i) == ' ')
            revealedWord[i] = ' ';
            else
            revealedWord[i] = '_';
        }
        System.out.print("\033[2J");
        System.out.println(word);
        System.out.println(lowercaseWord);
        
        while(wordSolved == false)
        {
            System.out.println(revealedWord);
            System.out.println("Team 2, would you like to either:\n1. Enter a letter\n2. Guess the word?");
            bufferInt = input.nextInt();
            input.nextLine(); //clearing new line buffer from .nextInt

            if(bufferInt == 1)
            {
            System.out.println("Team 2, please enter a letter: ");
            char inputLetter = input.nextLine().toLowerCase().charAt(0);
            for(int i = 0; i < word.length(); i++)
            {
                if(lowercaseWord.charAt(i) == inputLetter)
                revealedWord[i] = word.charAt(i);
            }
            }

            else if(bufferInt == 2)
            {
            System.out.println("Team 2, please enter your guess: ");
            String guess = input.nextLine().trim();
            
            if(guess.equalsIgnoreCase(lowercaseWord))
                {
                System.out.println("that is the word");
                wordSolved = true;
                }

                else
                {
                System.out.println(guess);
                System.out.println("That is not the correct word.");
                }
            }
            
            else
            System.out.println("Please enter a valid operation!");
        }
    }
}

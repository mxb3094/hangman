import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Hangman
{ 
    //instance variables
    private String WordGuess;
    private StringBuilder GuessCurrent;
    // given the attempts remaining to user
    private int RemainingAttempts = 5;
    private Genre genre;

    public Hangman(Genre genre)
    {
        this.genre = genre;
        List<String> WordBankUsed = genre.getWordsUsed();

    
   //start selecting a word to use
   //checking to se if wordbank is empty
   if (WordBankUsed.isEmpty())
   {
    System.out.println("No words are able to choose from");
    return;
   }
 // when not empty it will choose choose a random word from the filr
   Random random = new Random();
   setWordGuess(WordBankUsed.get(random.nextInt(WordBankUsed.size())));
   // shows the guess to the user 
   setGuessCurrent(new StringBuilder("_".repeat(getWordGuess().length())));



}
//method
// instance of encapsulation using setters and getters
// atrributes will be given a sense of security
public String getWordGuess()
{
    return WordGuess;
}
private void setWordGuess(String WordGuess)
{
    this.WordGuess = WordGuess;
}
public StringBuilder getGuessCurrent()
{
    return GuessCurrent;
}
private void setGuessCurrent(StringBuilder GuessCurrent)
{
    this.GuessCurrent = GuessCurrent;
}

public int getRemainingAttempts()
{
    return RemainingAttempts;
}
private void setRemainingAttempts( int RemainingAttempts)
{
    this.RemainingAttempts = RemainingAttempts;
}

public void start()
{
  if (getWordGuess()==null) //meaning its empty
  {
    System.out.println("The game cannot start because missing list");
    return;
  }
  try (Scanner scanner = new Scanner (System.in))
  {
    while(getRemainingAttempts() > 0 && getGuessCurrent().indexOf("_") >= 0)
    {
        System.out.println("The current guess is " + getGuessCurrent());
        //shows the current guess
        System.out.println("The attempts remaining are: "+getRemainingAttempts());
        //this shows the attemps remaing
        System.out.println("Please enter a letter:");
        char attempt = scanner.nextLine().charAt(0);
        //begins to check guess
        if (getWordGuess().contains(String.valueOf(attempt)))
        {
            for (int i = 0; i< getWordGuess().length(); i++)
            {
                if(getWordGuess().charAt(i) == attempt )
                {
                    //sets to attempt
                    getGuessCurrent().setCharAt(i,attempt);
                }
            }
        }else{
            setRemainingAttempts(getRemainingAttempts()-1);
            //if not chosen correctly
            System.out.println("Incorrect guess attempt");
        }
    }
    //now to see if they won 
    if(getGuessCurrent().indexOf("_") < 0)
    {
        System.out.println("Congratsss You Won! our game of Hangman  "+ getWordGuess());
        //attempts if they won
    }else{
        System.out.println("Game is over the word was "+ getWordGuess());
      }
 //ran out of attempts, did not win
    }
   }
  }

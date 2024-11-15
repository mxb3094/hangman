import java.util.Random;
import java.util.Scanner;

public class Hangman
{
    private String WordGuess;
    private StringBuilder GuessCurrent;

    private int RemainingAttempts = 5;
    private Genre genre;

    public Hangman(Genre genre)
    {
        this.genre = genre;
        List<String> wordbankused = genre.getWordsUsed();

    }
   //start selecting a word to use
   if (wordbankused.isEmpty())
   {
    System.out.println("No words are able to choose from");
    return;
   }

   Random random = new Random();
   setWordGuess(


}
//method
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

public int RemainingAttempts()
{
    return RemainingAttempts;
}
private void setRemainingAttempts( int RemainingAttempts)
{
    this.RemainingAttempts = RemainingAttempts;
}

public void start()
{

}
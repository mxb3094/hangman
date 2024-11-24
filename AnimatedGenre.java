import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.io.FileReader;

public class AnimatedGenre implements Genre
{
    private List<String> WordBankUsed;

    //method to read words from file
    private void LoadWordsUsedFromFile()
    {
         try (BufferedReader reader = new BufferedReader(new FileReader("AnimatedGenre.txt")))
          {  
            String line;
            while ((line = reader.readLine()) != null)
            {
                line = line.trim(); 
                // good for presentation 
                //make sure to check line is not empty
                if(!line.isEmpty())
                {
                    WordBankUsed.add(line);
                }
            }
            System.out.println("Words know being played from AnimatedGenre.txt");
          } 
             catch(IOException e)
          {
            System.out.println("Error was not able to read words from AnimatedGenre.txt");
          } 
    }
   
   
        //Action GENRE method
    public AnimatedGenre()
    {
        WordBankUsed = new ArrayList<>();
        LoadWordsUsedFromFile();

    }
    //specific methos implementation for this class
    @Override
    public List<String> getWordsUsed()
    {
        return WordBankUsed;
    }
}

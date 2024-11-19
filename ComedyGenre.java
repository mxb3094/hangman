import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.io.FileReader;

public class ComedyGenre implements Genre
{
    private List<String> wordbankused;

    //method to read words from file
    private void LoadWordsUsedFromFile()
    {
         try (BufferedReader reader = new BufferedReader(new FileReader("ComedyGenre.txt")))
          {  
            String line;
            while ((line = reader.readLine()) != null)
            {
                line = line.trim(); 
                // good for presentation 
                //make sure to check line is not empty
                if(!line.isEmpty())
                {
                    wordbankused.add(line);
                }
            }
            System.out.println("Words know being played from ComedyGenre.txt");
          } catch(IOException e)
          {
            System.out.println("Error was not able to read words from ComedyGenre.txt");
          } 
    }
    //COMEDY GENRE method
    public ComedyGenre()
    {
        wordbankused = new ArrayList<>();
        LoadWordsUsedFromFile();

    }
    @Override
    //specific methos implementation for this class
    public List<String> getWordsUsed()
    {
        return wordbankused;
    }
}
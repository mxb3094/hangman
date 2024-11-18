import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class ActionGenre implements Genre
{
    private List<String> wordbankused;

    //method to read words from file
    private void LoadWordsUsedFromFile()
    {
         try (BufferedReader reader = new BufferedReader(new FileReader("ActionGenre.txt")))
          {  
            String line;
            while ((line = reader.readLine() != null))
            {
                line = line.trim(); 
                // good for presentation 
                //make sure to check line is not empty
                if(!line.isEmpty())
                {
                    wordbankused.add(line);
                }
            }
            System.out.println("Words know being played from ActionGenre.txt");
          } 
             catch(IOException e)
          {
            System.out.println("Error was not able to read words from ActionGenre.txt")
          } 
    }
   
   
        //Action GENRE method
    public ActionGenre()
    {
        wordbankused = new ArrayList<>();
        LoadWordsUsedFromFile();

    }
    //specific methos implementation for this class
    @Override
    public List<String> getWordsUsed()
    {
        return wordbankused;
    }
}

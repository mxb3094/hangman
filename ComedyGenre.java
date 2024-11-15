import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class ComedyGenre implements Genre
{
    private List<String> wordbankused;

    //method to read words from file
    private void LoadWordsUsedFromFile()
    {
         try (BufferedReader reader = new BufferedReader(new FileReader("comedy.txt"))) {  // Hardcoded file name here
            String line;
            
    }
}
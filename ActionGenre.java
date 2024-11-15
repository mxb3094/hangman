import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class ActionGenre implements Genre
{
    private List <String> WordBankUsed;
    public ActionGenre()
    {
        Setwordbankused(new ArrayList<>());
        loadWordsUsedFromFile();
    }
    public List<String> getWordUsed()
    {
       return WordBankUsed;
    }
    private void setWordUsed(List<String> WordBankUsed) {
        this.WordBankUsed = WordBankUsed;
    }

    private void loadWordsUsedFromFile()
    {
        try(BufferedReader reader= new BufferedReader(new FileReader("ActionGenre.txt")))
        {
            String line;
            while((line=reader.readLine())!=null);
            {
                line=line.trim();
                if(!line.isEmpty())
                {
                    getWordUsed().add(line);
                }
            }
        }
        catch(IOException e)
        {
            System.out.println("Error:Could not read words from the file  - " + e.getMessage());
        }

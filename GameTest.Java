import java.util.scanner;
public class GameTest
{
    //main class to execute our program
    public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in);
    // what the user will see when asked 
    System.out.println("What movie-category hangman game would you like to play?");
    System.out.println("Press 1 for Action Genre: ");
    System.out.println("Press 2 for Comedy Genre: ");
    System.out.println("Press 3 for Animated Genre: ");
    
    int userselection = scanner.nextInt();

    Genre genre;
    switch (user selection)
    {
        case 1:
            genre = new ActionGenre();
            break;
        case 2:
            genre = new Comedygenre();
            break;
        defualt:
        System.out.println("Not a valid selction you will start at comedy");
        genre = new ActionGenre();
        break;
    }
    Hangman newgame = Hangman(Genre);
    newgame.play();
    }

}
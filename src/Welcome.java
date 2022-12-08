import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Welcome {
    public void welcome() throws FileNotFoundException {
        Scanner input = new Scanner(new File("src/ascii-art.txt"));

        while (input.hasNextLine())
        {
            System.out.println(input.nextLine());
        }
    }
}

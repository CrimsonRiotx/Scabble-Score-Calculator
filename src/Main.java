import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        ScrabbleScore scrabble = new ScrabbleScore();
        //Welcome welcome1 = new Welcome();
        Scanner input = new Scanner(System.in);
        ClearScreen.clearConsole();
        //welcome1.welcome();
        System.out.println("Welcome to the Scrabble Score Calculator!\nInput the word you would like to calculate:");
        String userInput = input.nextLine();
        scrabble.setWord(userInput);
        while (scrabble.getScore() <= 0) {
            ClearScreen.clearConsole();
            System.out.println("Input not valid. No numbers, symbols, or spaces allowed.");
            Thread.sleep(2000);
            ClearScreen.clearConsole();
            System.out.println("Input the word you would like to calculate:");
            userInput = input.nextLine();
            scrabble.setWord(userInput);
            scrabble.getScore();
        }
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream input1 = classLoader.getResourceAsStream("Dictionary.txt");
        boolean isNotVerified = true;
        Scanner dictionary = new Scanner(input1);
        StringBuilder str = new StringBuilder();
        while(dictionary.hasNext()){
            str.append(dictionary.next());
        }
        String dict1 = str.toString();
        while (isNotVerified) {
            String testWord = scrabble.getWord();
            if(dict1.contains(testWord)){
                System.out.println("your score is " + scrabble.getScore());
                isNotVerified = false;
            /*if (new Scanner(new File("src/Dictionary.txt")).useDelimiter("\\Z").next().contains(testWord)) {
                System.out.println("your score is " + scrabble.getScore());
                isNotVerified = false;
             */
            } else {
                ClearScreen.clearConsole();
                System.out.println("Not a valid word");
                Thread.sleep(1500);
                ClearScreen.clearConsole();
                System.out.println("Input the word you would like to calculate:");
                userInput = input.nextLine();
                scrabble.setWord(userInput);
            }
        }
    }
}
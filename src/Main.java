import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        Scrabble scrabble = new Scrabble();
        Scanner input = new Scanner(System.in);
        ClearScreen.clearConsole();
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
        String testWord;
        boolean isNotVerified = true;
        while (isNotVerified) {
            testWord = scrabble.getWord();
            if (new Scanner(new File("/Users/samuedut/IdeaProjects/Scrabble-Score-Calculator/Dictionary.txt")).useDelimiter("\\Z").next().contains(testWord)) {
                System.out.println("your score is " + scrabble.getScore());
                isNotVerified = false;
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
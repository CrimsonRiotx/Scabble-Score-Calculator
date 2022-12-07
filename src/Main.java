import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scrabble scrabble = new Scrabble();
        Scanner input = new Scanner(System.in);
        ClearScreen.clearConsole();
        System.out.println("Welcome to the Scrabble Score Calculator!\nInput the word you would like to calculate:");
        String userInput = input.nextLine();
        scrabble.setWord(userInput);
        while(scrabble.getScore() <= 0) {
            //Thread.sleep(2500);
            ClearScreen.clearConsole();
            System.out.println("Input not valid. No numbers, symbols, or spaces allowed.");
            Thread.sleep(2000);
            ClearScreen.clearConsole();
            System.out.println("Input the word you would like to calculate:");
            userInput = input.nextLine();
            scrabble.setWord(userInput);
            scrabble.getScore();
        }
                System.out.println("your score is " + scrabble.getScore());
        }
    }
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Scrabble Score Calculator!\nInput the word you would like to play:");
        String userInput = input.nextLine();
        Scrabble scrabble = new Scrabble(userInput);
        if(scrabble.getScore() > 0) {
            System.out.println("your score is " + scrabble.getScore());
        }
        else{System.out.println("Input not valid. No numbers, symbols, or spaces allowed");
        }
    }
}
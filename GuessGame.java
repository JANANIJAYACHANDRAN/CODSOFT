/* Created by Janani*/
import java.util.Scanner;
import java.util.Random;
public class GuessGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int lower = 1;
        int upper = 100;
        int targetNumber = random.nextInt(upper - lower + 1) + lower;
        int attempts = 0;
        boolean Guessed = false;

        System.out.println("WELCOME TO THE NUMBER GUESS GAME");
        System.out.println("The random number is between 1 to 100");

        while (!Guessed) {
            System.out.println("Enter your Guess:");
            int userGuess = sc.nextInt();
            attempts++;

            if (userGuess < 1 || userGuess > 100) {
                System.out.println("Select between 1 to 100 only");
            } else if (userGuess < targetNumber) {
                System.out.println("Guess too low");
            } else if (userGuess > targetNumber) {
                System.out.println("Guess too high");
            } else {
                System.out.println("CORRECT! You guessed in " + attempts + " attempts");
                Guessed = true;
            }
        }
        sc.close();
    }
}






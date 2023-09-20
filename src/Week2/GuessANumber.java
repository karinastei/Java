package Week2;

import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    public static int randomNumber() {
        int min = 0;
        int max = 100;
        Random random = new Random();
        return (random.nextInt((max - min) + 1) + min);
    }

    public static void guess(int randomNum, boolean hasGuessedTheNumber) {
        Scanner guessInput = new Scanner(System.in);

        while (!hasGuessedTheNumber) {
            System.out.println("Guess a number: ");
            String guessedNumberString = guessInput.nextLine();
            int guessedNumber = Integer.parseInt(guessedNumberString);
            if (guessedNumber == randomNum) {
                System.out.println("Congratulations, your guess is correct! :)");
                hasGuessedTheNumber = true;
            } else if (guessedNumber < randomNum) {
                System.out.println("The number is greater.");
            } else if (guessedNumber > randomNum) {
                System.out.println("The number is lesser.");
            }
        }
    }

    public static void main(String[] args) {
        int randomNum = randomNumber();
        boolean hasGuessedTheNumber = false;
        guess(randomNum, hasGuessedTheNumber);
    }
}

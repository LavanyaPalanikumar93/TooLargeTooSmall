import java.util.Random;
import java.util.Scanner;
/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Welcome to Guessing Game");
                System.out.println("Enter your Guess");
                Random random = new Random();
                int numberToguess = random.nextInt(10);
                boolean guessedcorrectly = false;
                int numberOftries = 0;
                {
                    while (!guessedcorrectly) {
                        int guess = scanner.nextInt();
                        numberOftries++;
                        if (guess > numberToguess) {
                            System.out.println("Guess is TooLarge try again");
                        } else if (guess < numberToguess) {
                            System.out.println("Guess is TooSmall");
                        } else {
                            guessedcorrectly = true;
                        }
                    }
                }
                System.out.println("congratulations!!!you guessed correctly");
            }
        }



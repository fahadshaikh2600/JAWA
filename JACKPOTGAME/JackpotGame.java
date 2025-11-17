import java.util.Scanner;
import java.util.Random;

public class JackpotGame {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    int jackpot = random.nextInt(100) + 1;
    int attempts = 0;

    System.out.println("Welcome to the Jackpot Guessing Game!");
    System.out.println("Select difficulty level:");
    System.out.println("1. Easy (20 attempts)");
    System.out.println("2. Medium (10 attempts)");
    System.out.println("3. Hard (5 attempts)");

    System.out.print("Enter your choice: ");
    int choice = sc.nextInt();

    if (choice == 1) {
      attempts = 20;
    } else if (choice == 2) {
      attempts = 10;
    } else if (choice == 3) {
      attempts = 5;
    } else {
      System.out.println("Invalid option! Defaulting to Medium.");
      attempts = 10;
    }

    System.out.println("\nGuess the number between 1 and 100!");
    boolean won = false;

    for (int i = 1; i <= attempts; i++) {
      System.out.print("Attempt " + i + ": Enter your guess → ");
      int guess = sc.nextInt();

      if (guess == jackpot) {
        System.out.println("Congratulations! You guessed the jackpot number!");
        won = true;
        break;
      } else if (guess > jackpot) {
        System.out.println("Too high! Try again.");
      } else {
        System.out.println("Too low! Try again.");
      }
    }

    if (!won) {
      System.out.println("\nOut of attempts! The jackpot number was: " + jackpot);
    }

    sc.close();
  }
}

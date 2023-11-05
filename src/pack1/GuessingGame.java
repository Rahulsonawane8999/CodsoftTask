package pack1;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       Random random = new Random();
       int min = 1;
       int max = 100;
       int attempts = 5;
       int score = 0;
       boolean playAgain = true;

       while (playAgain) {
           int randomNumber = random.nextInt(max - min + 1) + min;
           System.out.println("Guess a number between " + min + " and " + max + ". You have " + attempts + " attempts.");

           for (int i = 1; i <= attempts; i++) {
               int guess = input.nextInt();

               if (guess == randomNumber) {
                   System.out.println("Congratulations! You guessed the number in " + i + " attempts.");
                   score++;
                   break;
               } else if (guess < randomNumber) {
                   System.out.println("Too low. Guess again.");
               } else {
                   System.out.println("Too high. Guess again.");
               }

               if (i == attempts) {
                   System.out.println("Sorry, you ran out of attempts. The number was " + randomNumber + ".");
               }
           }

           System.out.println("Your score is " + score + ".");
           System.out.println("Do you want to play again? (yes/no)");
           String playAgainInput = input.next();

           if (playAgainInput.equalsIgnoreCase("no")) {
               playAgain = false;
           }
       }

       System.out.println("Thanks for playing!");
   }
}
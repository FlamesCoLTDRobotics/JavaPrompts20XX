 

import java.util.Scanner;

public class Toonatron   {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Set up the game
    int lives = 3;
    int score = 0;
    boolean gameOver = false;

    while (!gameOver) {
      // Display the current game status
      System.out.println("Lives: " + lives);
      System.out.println("Score: " + score);

      // Get the player's next move
      System.out.print("Enter a command (up, down, left, right): ");
      String move = scanner.nextLine();

      // Update the game based on the player's move
      if (move.equals("up")) {
        score += 10;
      } else if (move.equals("down")) {
        score += 5;
      } else if (move.equals("left")) {
        lives--;
      } else if (move.equals("right")) {
        lives++;
      } else {
        System.out.println("Invalid move. Please try again.");
      }

      // Check if the game is over
      if (lives == 0) {
        gameOver = true;
        System.out.println("Game over! You ran out of lives.");
      } else if (score >= 50) {
        gameOver = true;
        System.out.println("Congratulations! You won the game!");
      }
    }
  }
}

package arrays;

import java.util.Scanner;
public class rockpaper{

  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String[] arr = {"rock", "paper", "scissor"};

	        int computerScore = 0;
	        int playerScore = 0;

	    while (true) {
	            int rd = (int) (Math.random() * arr.length);
	            String computerChoice = arr[rd];
	            System.out.println("Enter your choice (rock, paper, scissor), or type 'exit' to end the game:");
	            String playerChoice = scanner.next().toLowerCase();
	            if (playerChoice.equals("exit")) {
	                System.out.println("Game ended. Goodbye!");
	                break;
	            }
	            System.out.println("Computer chose: " + computerChoice);
	            System.out.println("Player chose: " + playerChoice);

	            if ((computerChoice.equals("rock") && playerChoice.equals("scissor")) ||(computerChoice.equals("paper") && playerChoice.equals("rock")) ||(computerChoice.equals("scissor") && playerChoice.equals("paper"))) {
	                System.out.println("Computer wins!");
	                computerScore++;
	            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissor")) ||(playerChoice.equals("paper") && computerChoice.equals("rock")) ||(playerChoice.equals("scissor") && computerChoice.equals("paper"))) {
	                System.out.println("Player wins!");
	                playerScore++;
	            } else {
	                System.out.println("It's a draw!");
	            }

	            System.out.println("Score - Computer: " + computerScore + " | Player: " + playerScore);

	            if (computerScore == 5 || playerScore == 5) {
	                System.out.println("Game over! " + (computerScore == 5 ? "Computer" : "Player") + " wins!");
	                break;
	            }
	        }
	    }
	}






















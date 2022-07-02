/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WileyEdge;
import java.util.*;
/**
 *
 * @author Yonathan
 */
public class RockPaperScissors {
    public static void main(String[] args) {
    // Declare variables
    // Variable to use for conditions in either switch or if-else statement(s)
    Scanner inputReader = new Scanner(System.in);
    int roundCount, max;
    // 'cpuWinCount', 'userWinCount', & 'ties' will be added onto after each round gives that outcome
    int actualRoundCount = 0;
    int cpuWinCount = 0;
    int userWinCount=0;
    int ties = 0; 
    // Random class with the constructor on the other end
    Random rand = new Random(); 
    // What the cpu will randomly select from 
    String[] gameMenu = new String[] {"Rock", "Paper", "Scissors"};
    // How the user will answer the questions
    String userRdCount, userGameChoice, userPlayAgain;
    // How the winning result will be provided in the output
    String[] winningResult = new String[] {"player", "CPU", "no one, it was a tie"};
    // Asking for the user to enter the amount of rounds to play
    // Will only be asked once since it's not in the do-while loop
    System.out.println("How many rounds would you like to play?");
    userRdCount = inputReader.nextLine();
    roundCount = Integer.parseInt(userRdCount);

    // Starting the do-while loop to have the code iterate through each round of the game
        do {    
    // if statement with condition to end the game if the game rounds selected goes out of bounds (Works fine)
/* If the user input is outside of the range. Needs to be utilized within the loop to work correctly */
    if (roundCount > 10 || roundCount < 1) {
            System.out.println("Error, not within range. Now quitting.");
            // 'System.exit(0)' will end the program abruptly *
            System.exit(0);
    }
    // Ask for user choice
    System.out.println("What would you like to choose?");
    userGameChoice = inputReader.nextLine();
    // Random generation for the CPU choice
    int randomIndex = rand.nextInt(gameMenu.length);
    String randomName = gameMenu[randomIndex];
    
// Comparison logic (Either switch or if-else) 
    // switch statement cannot take in a boolean, so if-else statements with conditions for each potential outcome
    // Condition(s) that make 'ties' += 1
    if (randomName.equals(gameMenu[0]) && userGameChoice.equals(gameMenu[0])) {
        ties += 1;
    } else if (randomName.equals(gameMenu[1]) && userGameChoice.equals(gameMenu[1])) {
        ties += 1;
    } else if (randomName.equals(gameMenu[2]) && userGameChoice.equals(gameMenu[2])) {
        ties += 1;
    // Condition(s) to make 'cpuWinCount' += 1
    } else if (randomName.equals(gameMenu[0]) && userGameChoice.equals(gameMenu[2])) {
        cpuWinCount += 1;
    } else if (randomName.equals(gameMenu[2]) && userGameChoice.equals(gameMenu[1])) {
        cpuWinCount += 1;
    } else if (randomName.equals(gameMenu[1]) && userGameChoice.equals(gameMenu[0])) {
        cpuWinCount += 1;
    // Condition(s) to make 'userWinCount' += 1
    } else if (randomName.equals(gameMenu[0]) && userGameChoice.equals(gameMenu[2])) {
        userWinCount += 1;
    } else if (randomName.equals(gameMenu[2]) && userGameChoice.equals(gameMenu[1])) {
        userWinCount += 1;
    } else if (randomName.equals(gameMenu[1]) && userGameChoice.equals(gameMenu[0])) {
        userWinCount += 1;
    }
    // Array to store each counted amount of wins so that it can be easily accessed with 'Collections.max()'
    Integer[] counts = {cpuWinCount, userWinCount, ties};
    // if statement with condition to find max value within counts array that contains each variable for the results
    max = Collections.max(Arrays.asList(counts));
    // Iteration through a round should close with
    actualRoundCount += 1;    
    /* Add code to set the program to a stop as the 'actualRoundCount' == 'roundCount' with an if-else statement
    with to set a condition that ends the program & asks whether the user wants to play again  */
    if (actualRoundCount == roundCount) {
        // Matching the output for the winner 
        if (max == counts[0]) {
            System.out.println("The winner is the" + winningResult[1]);
        } else if (max == counts[1]) {
            System.out.println("The winner is the " + winningResult[0]);
        } else if (max == counts[2]) {
            System.out.println("The winner is " + winningResult[2]);
        }   
        // Ask if the user would like to play again
        System.out.println("Would you like to play again?");
        userPlayAgain = inputReader.nextLine();
        // if statement with "Yes" and "No" conditions
        if (userPlayAgain.equals("Yes") || userPlayAgain.equals("yes")) {
            // The count needs to be reset **
            actualRoundCount = 0;
            System.out.println("How many rounds would you like to play?");
            // Goes right outside of the loop to play again
            userRdCount = inputReader.nextLine();
            roundCount = Integer.parseInt(userRdCount);            
            // The loop still runs endlessly because it's not accessing the features of the do-while loop            
        } else if (userPlayAgain.equals("No") || userPlayAgain.equals("no")) {
            System.out.println("Thanks for playing!");
            // 'System.exit(0)' will end the program abruptly *
            System.exit(0);
      }
     }
    }  // Condition is contingent upon the 'roundCount' being less than the 'userRdCount'
       while(roundCount < 10 || roundCount >= 1);
  }
}

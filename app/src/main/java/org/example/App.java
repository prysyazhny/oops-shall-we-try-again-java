package org.example;
import java.util.Scanner;

public class App {
  public static int getInput() {
    int input; // intentionally not initialized

    Scanner scanner = new Scanner(System.in);
    System.out.print("\nPlease enter a value\n");
    input = scanner.nextInt(); // scanner not closed to fix bug.

    return input;
  }

  public static boolean isValidInput(int input, int lowerBound, int upperBound) {
    return input >= lowerBound && input <= upperBound;
  }

  public static void main(String[] args) {
    int upperBound = 100;
    int lowerBound = 1;

    int userInput = getInput();
    while(!isValidInput(userInput, lowerBound, upperBound)) {
      System.out.println("Your value is invalid, please try again.");
      userInput = getInput();
    }
    System.out.println("The value chosen by the user is: " + userInput+"\n");
  }
}

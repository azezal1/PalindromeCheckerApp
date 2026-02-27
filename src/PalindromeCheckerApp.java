/**
 * UseCase3PalindromeCheckerApp
 * Version: 1.0
 * Description: Checks whether a string is a palindrome
 *              by reversing it using a for loop.
 */

public class UseCase3PalindromeCheckerApp {

    // Main Method - Entry point of the application
    public static void main(String[] args) {

        // Original String
        String original = "racecar";

        // Variable to store reversed string
        String reversed = "";

        // Reverse string using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed using equals()
        if (original.equals(reversed)) {
            System.out.println("The string \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + original + "\" is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");
    }
}
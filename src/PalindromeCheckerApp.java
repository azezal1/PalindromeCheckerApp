/**
 * UseCase2PalindromeCheckerApp
 * Version: 1.0
 * Description: Checks whether a hardcoded string is a palindrome.
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string (String Literal)
        String word = "madam";

        // Variable to store reversed string
        String reversed = "";

        // Reverse the string using loop
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Conditional Statement to check palindrome
        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");
    }
}
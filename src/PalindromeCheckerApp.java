import java.util.Scanner;

// PalindromeChecker class encapsulates the palindrome logic
class PalindromeChecker {

    // Public method to check palindrome
    public boolean checkPalindrome(String input) {
        // Normalize input (optional: to make case-insensitive and ignore spaces)
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

// Main application class
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== UC11: Object-Oriented Palindrome Service ===");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Create PalindromeChecker object
        PalindromeChecker checker = new PalindromeChecker();

        // Use encapsulated method
        if (checker.checkPalindrome(input)) {
            System.out.println("Result: \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a palindrome.");
        }

        scanner.close();
    }
}

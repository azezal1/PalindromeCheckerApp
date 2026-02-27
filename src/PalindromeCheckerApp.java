import java.util.Scanner;

public class PalindromeCheckerApp {

    // Method to normalize string: remove spaces and convert to lowercase
    public static String normalize(String input) {
        // Remove all non-alphanumeric characters (spaces, punctuation) and convert to lowercase
        return input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }

    // Method to check palindrome
    public static boolean isPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== UC10: Case-Insensitive & Space-Ignored Palindrome Checker ===");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Normalize input
        String normalized = normalize(input);

        if (isPalindrome(normalized)) {
            System.out.println("Result: \"" + input + "\" is a palindrome (ignoring case and spaces).");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a palindrome (ignoring case and spaces).");
        }

        scanner.close();
    }
}

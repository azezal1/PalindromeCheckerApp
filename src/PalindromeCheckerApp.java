import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    // Method to check palindrome using stack
    public static boolean isPalindrome(String input) {
        Stack<Character> stack = new Stack<>();

        // Push all characters into the stack
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        // Pop characters and build reversed string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        // Compare original and reversed strings
        return input.equals(reversed.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== UC5: Stack-Based Palindrome Checker ===");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Result: \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a palindrome.");
        }

        scanner.close();
    }
}

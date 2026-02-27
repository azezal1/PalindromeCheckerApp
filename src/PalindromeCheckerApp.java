import java.util.*;

interface PalindromeStrategy {
    boolean checkPalindrome(String input);
    String getName();
}

// Stack-based strategy
class StackStrategy implements PalindromeStrategy {
    public boolean checkPalindrome(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return input.equals(reversed.toString());
    }
    public String getName() { return "StackStrategy"; }
}

// Deque-based strategy
class DequeStrategy implements PalindromeStrategy {
    public boolean checkPalindrome(String input) {
        Deque<Character> deque = new LinkedList<>();
        for (char ch : input.toCharArray()) {
            deque.addLast(ch);
        }
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();
            if (front != rear) return false;
        }
        return true;
    }
    public String getName() { return "DequeStrategy"; }
}

// Recursive strategy
class RecursiveStrategy implements PalindromeStrategy {
    public boolean checkPalindrome(String input) {
        return isPalindrome(input, 0, input.length() - 1);
    }
    private boolean isPalindrome(String input, int start, int end) {
        if (start >= end) return true;
        if (input.charAt(start) != input.charAt(end)) return false;
        return isPalindrome(input, start + 1, end - 1);
    }
    public String getName() { return "RecursiveStrategy"; }
}

// Main application
public class UseCase13PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== UC13: Performance Comparison of Palindrome Algorithms ===");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // List of strategies to compare
        List<PalindromeStrategy> strategies = Arrays.asList(
                new StackStrategy(),
                new DequeStrategy(),
                new RecursiveStrategy()
        );

        // Run each strategy and measure time
        for (PalindromeStrategy strategy : strategies) {
            long startTime = System.nanoTime();
            boolean result = strategy.checkPalindrome(input);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            System.out.println(strategy.getName() + ": " +
                    (result ? "Palindrome" : "Not Palindrome") +
                    " | Execution Time: " + duration + " ns");
        }

        scanner.close();
    }
}

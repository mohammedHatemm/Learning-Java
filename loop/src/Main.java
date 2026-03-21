import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // --- 1. for Loop ---
        System.out.println("--- 1. for Loop ---");
        System.out.println("Printing numbers from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count is: " + i);
        }
        System.out.println();

        // --- 2. while Loop ---
        System.out.println("--- 2. while Loop ---");
        System.out.println("A simple countdown from 5 to 1:");
        int count = 5;
        while (count > 0) {
            System.out.println("Countdown: " + count);
            count--; // Decrement the counter
        }
        System.out.println();

        // --- 3. do-while Loop ---
        System.out.println("--- 3. do-while Loop ---");
        System.out.println("This loop will execute at least once.");
        int choice;
        // Scanner scanner = new Scanner(System.in); // Uncomment to run interactively
        int simulatedInput = 0; // Simulating user input for demonstration
        do {
            System.out.println("Menu: Enter a number (enter 0 to exit)");
            // choice = scanner.nextInt(); // Uncomment for interactive use
            choice = simulatedInput; // Using simulated input
            System.out.println("You entered: " + choice);
        } while (choice != 0);
        System.out.println("Exited the do-while loop.");
        System.out.println();

        // --- 4. Enhanced for Loop (for-each) ---
        System.out.println("--- 4. Enhanced for Loop (for-each) ---");
        // With an array
        System.out.println("Iterating over an array of strings:");
        String[] names = {"Alice", "Bob", "Charlie"};
        for (String name : names) {
            System.out.println("Hello, " + name);
        }
        System.out.println();

        // With a collection (ArrayList)
        System.out.println("Iterating over an ArrayList of integers:");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        for (Integer number : numbers) {
            System.out.println("Number: " + number);
        }
        System.out.println();

        // With a Map (using entrySet())
        System.out.println("Iterating over a HashMap using entrySet():");
        Map<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington D.C.");
        capitals.put("France", "Paris");
        capitals.put("Japan", "Tokyo");
        for (Map.Entry<String, String> entry : capitals.entrySet()) {
            System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
        }
        System.out.println();

        // --- Loop Control Statements ---
        System.out.println("--- Loop Control Statements ---");
        // break statement
        System.out.println("Using 'break' to exit a loop at 5:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Found 5, breaking the loop!");
                break; // Exit the loop
            }
            System.out.println("i = " + i);
        }
        System.out.println();

        // continue statement
        System.out.println("Using 'continue' to skip even numbers:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Skip the rest of the loop body for this iteration
            }
            System.out.println("Odd number: " + i);
        }
    }
}
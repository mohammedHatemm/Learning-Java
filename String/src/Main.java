public class Main {
    public static void main(String[] args) {
        // --- String Creation ---
        System.out.println("--- String Creation ---");
        String s1 = "Hello, World!"; // Using string literal (from pool)
        String s2 = new String("Hello, World!"); // Using 'new' keyword (in heap)
        String s3 = "Hello, World!"; // Reuses the object from the pool

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("s1 == s2: " + (s1 == s2)); // false (different objects)
        System.out.println("s1 == s3: " + (s1 == s3)); // true (same object from pool)
        System.out.println("s1.equals(s2): " + s1.equals(s2)); // true (content is the same)
        System.out.println();

        // --- Essential String Methods ---
        System.out.println("--- Essential String Methods ---");
        String text = "  Java Programming is Fun!  ";
        System.out.println("Original Text: \"" + text + "\"");

        // length()
        System.out.println("1. length(): " + text.length());

        // charAt()
        System.out.println("2. charAt(3): " + text.charAt(4));

        // substring()
        System.out.println("3. substring(7): \"" + text.substring(7) + "\"");
        System.out.println("4. substring(7, 18): \"" + text.substring(7, 18) + "\"");

        // toUpperCase() and toLowerCase()
        System.out.println("5. toUpperCase(): \"" + text.toUpperCase() + "\"");
        System.out.println("6. toLowerCase(): \"" + text.toLowerCase() + "\"");

        // trim()
        String trimmedText = text.trim();
        System.out.println("7. trim(): \"" + trimmedText + "\"");

        // replace()
        System.out.println("8. replace('a', '@'): \"" + trimmedText.replace('a', '@') + "\"");

        // startsWith() and endsWith()
        System.out.println("9. startsWith(\"Java\"): " + trimmedText.startsWith("Java"));
        System.out.println("10. endsWith(\"Fun!\"): " + trimmedText.endsWith("Fun!"));

        // contains()
        System.out.println("11. contains(\"Programming\"): " + trimmedText.contains("Programming"));

        // indexOf() and lastIndexOf()
        System.out.println("12. indexOf('a'): " + trimmedText.indexOf('a'));
        System.out.println("13. lastIndexOf('a'): " + trimmedText.lastIndexOf('a'));

        // split()
        System.out.println("14. split(\" \"): ");
        String[] words = trimmedText.split(" ");
        for (String word : words) {
            System.out.println("   - \"" + word + "\"");
        }
        System.out.println();

        // --- String Immutability Example ---
        System.out.println("--- String Immutability ---");
        String original = "Java";
        String modified = original.concat(" is great!");
        System.out.println("Original string: " + original); // "Java"
        System.out.println("Modified string: " + modified); // "Java is great!"
        System.out.println("The 'original' string remains unchanged.");
        System.out.println();

        // --- StringBuilder for Mutable Strings ---
        System.out.println("--- StringBuilder (Mutable) ---");
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Initial StringBuilder: " + sb);
        sb.append(", ");
        sb.append("World!");
        sb.insert(5, " Java");
        System.out.println("Modified StringBuilder: " + sb);
        sb.reverse();
        System.out.println("Reversed StringBuilder: " + sb);
    }
}
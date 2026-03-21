# The String Class in Java

In Java, a `String` is an object that represents a sequence of characters. The `java.lang.String` class is used to create and manipulate strings.

## Key Characteristics of Java Strings

1.  **Immutability:**
    *   A `String` object is **immutable**, which means once it's created, its state (the sequence of characters) cannot be changed.
    *   When you perform an operation that seems to modify a string (like concatenation or substring), Java creates a *new* `String` object with the modified content, leaving the original string unchanged.
    *   This immutability ensures that strings are thread-safe and can be shared without the risk of modification.

2.  **String Pool:**
    *   Java maintains a special memory area called the "String pool" (or "String intern pool").
    *   When you create a string literal (e.g., `String s1 = "Java";`), the JVM checks the pool. If the string already exists, it returns a reference to the existing object. If not, it creates a new `String` object in the pool.
    *   This helps in saving memory by avoiding the creation of duplicate string objects.
    *   Creating a string with the `new` keyword (e.g., `String s2 = new String("Java");`) explicitly creates a new object in the heap, outside the pool.

---

## Creating Strings

There are two primary ways to create a `String` object:

1.  **Using a String Literal:**
    ```java
    String greeting = "Hello, World!";
    ```
    This is the most common and efficient way. It utilizes the String pool.

2.  **Using the `new` Keyword:**
    ```java
    String message = new String("Welcome to Java!");
    ```
    This creates a new `String` object in the heap memory, regardless of whether an identical string already exists in the pool.

---

## Essential String Methods

Here are some of the most commonly used methods from the `String` class for handling strings.

| Method                      | Description                                                                              | Example                                                 |
| --------------------------- | ---------------------------------------------------------------------------------------- | ------------------------------------------------------- |
| `length()`                  | Returns the number of characters in the string.                                          | `"Java".length()` returns `4`.                          |
| `charAt(int index)`         | Returns the character at the specified index (0-based).                                  | `"Java".charAt(0)` returns `'J'`.                       |
| `concat(String str)`        | Appends a string to the end of another string. (The `+` operator is more common).        | `"Java".concat(" is fun")` returns `"Java is fun"`.      |
| `substring(int beginIndex)` | Returns a new string that is a substring of this string, from `beginIndex` to the end.   | `"Java".substring(1)` returns `"ava"`.                  |
| `substring(int begin, int end)` | Returns a substring from `beginIndex` (inclusive) to `endIndex` (exclusive).             | `"Java".substring(1, 3)` returns `"av"`.                |
| `equals(Object another)`    | Compares this string to another object for content equality. Case-sensitive.             | `"Java".equals("java")` returns `false`.                |
| `equalsIgnoreCase(String another)` | Compares two strings for content equality, ignoring case differences.                    | `"Java".equalsIgnoreCase("java")` returns `true`.       |
| `indexOf(String str)`       | Returns the index of the first occurrence of the specified substring. Returns -1 if not found. | `"Java".indexOf("a")` returns `1`.                      |
| `lastIndexOf(String str)`   | Returns the index of the last occurrence of the specified substring.                     | `"Java".lastIndexOf("a")` returns `3`.                  |
| `toUpperCase()`             | Converts all characters in the string to uppercase.                                      | `"Java".toUpperCase()` returns `"JAVA"`.                |
| `toLowerCase()`             | Converts all characters in the string to lowercase.                                      | `"Java".toLowerCase()` returns `"java"`.                |
| `trim()`                    | Removes leading and trailing whitespace from the string.                                 | `"  Java  ".trim()` returns `"Java"`.                   |
| `replace(char old, char new)` | Replaces all occurrences of a specified character with a new character.                  | `"Java".replace('a', 'o')` returns `"Jovo"`.            |
| `startsWith(String prefix)` | Checks if the string starts with the specified prefix.                                   | `"Java".startsWith("Ja")` returns `true`.               |
| `endsWith(String suffix)`   | Checks if the string ends with the specified suffix.                                     | `"Java".endsWith("va")` returns `true`.                 |
| `contains(CharSequence s)`  | Checks if the string contains the specified sequence of characters.                      | `"Java".contains("av")` returns `true`.                 |
| `split(String regex)`       | Splits the string around matches of the given regular expression, returning an array of strings. | `"Java is fun".split(" ")` returns `["Java", "is", "fun"]`. |
| `isEmpty()`                 | Returns `true` if the string has a length of 0.                                          | `"".isEmpty()` returns `true`.                          |
| `join(CharSequence d, CharSequence... e)` | (Static method) Joins multiple strings with a specified delimiter.                       | `String.join("-", "J", "a", "v", "a")` returns `"J-a-v-a"`. |

---

## `String` vs. `StringBuilder` vs. `StringBuffer`

When you need to perform a lot of string modifications (concatenation, deletion, etc.), using `String` can be inefficient due to the creation of many intermediate objects. For such cases, Java provides mutable alternatives:

*   **`StringBuilder`:**
    *   Mutable (can be modified after creation).
    *   Not thread-safe (faster).
    *   **Recommended for single-threaded environments** where you need to build or modify a string frequently.

*   **`StringBuffer`:**
    *   Mutable (can be modified after creation).
    *   Thread-safe (synchronized methods, which makes it slower than `StringBuilder`).
    *   **Recommended for multi-threaded environments** where a string needs to be safely modified by multiple threads.

---

## Practice Exercises

### Exercise 1: String Inspector
Write a program that takes a string from the user and prints:
- Length of the string
- First and last character
- The string in uppercase and lowercase
- The string reversed (use `StringBuilder`)
- Whether it's a palindrome (reads the same forwards and backwards, e.g., "madam")

### Exercise 2: Word Counter
Write a program that takes a sentence from the user and:
1. Counts the number of words (hint: use `split(" ")`)
2. Counts the number of vowels (a, e, i, o, u)
3. Counts the number of consonants
4. Finds the longest word in the sentence
5. Replaces all spaces with hyphens (`-`)

### Exercise 3: Email Validator
Write a program that takes an email address and checks if it's valid using String methods:
- Must contain exactly one `@` (use `indexOf` and `lastIndexOf`)
- Must have at least one `.` after the `@`
- Must not start or end with `@` or `.`
- Must have characters before the `@`
- The domain part (after `@`) must have at least 2 characters after the last `.`

Print which checks passed and which failed.

### Exercise 4: Caesar Cipher
Implement a simple Caesar cipher:
1. Take a message and a shift number from the user
2. Encrypt: shift each letter by the given number (e.g., 'A' + 3 = 'D')
3. Decrypt: shift back by the same number
4. Handle wrapping (e.g., 'Z' + 1 = 'A')
5. Keep non-letter characters unchanged

**Hint:** Use `charAt()`, casting between `char` and `int`, and `StringBuilder`.

### Exercise 5: StringBuilder Performance Test
Write a program that concatenates the string "Hello" 100,000 times using:
1. Regular `String` with `+=`
2. `StringBuilder` with `.append()`

Measure the time each takes using `System.currentTimeMillis()` and print the difference. This demonstrates why `StringBuilder` matters.

# Loops in Java

Loops are a fundamental concept in programming used to execute a block of code repeatedly as long as a certain condition is met. Java provides several types of loops to handle different situations.

The primary types of loops in Java are:
1.  **`for` Loop**
2.  **`while` Loop**
3.  **`do-while` Loop**
4.  **Enhanced `for` Loop (or "for-each" loop)**

Additionally, we will cover loop control statements: `break` and `continue`.

---

## 1. `for` Loop

The `for` loop is used when you know in advance how many times you want to execute a block of code. It's a compact loop structure that consists of three parts: initialization, condition, and iteration (increment/decrement).

**Syntax:**
```java
for (initialization; condition; iteration) {
    // Code to be executed
}
```
*   **Initialization:** Executed once when the loop begins. Used to declare and initialize a loop control variable.
*   **Condition:** Evaluated before each iteration. The loop continues as long as this condition is `true`.
*   **Iteration:** Executed at the end of each iteration. Typically used to increment or decrement the loop variable.

**Example:**
Printing numbers from 1 to 5.
```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Count is: " + i);
}
```

---

## 2. `while` Loop

The `while` loop is used to execute a block of code as long as a specified condition is `true`. The condition is checked *before* the loop body is executed. If the condition is initially `false`, the loop body will not be executed at all.

**Syntax:**
```java
while (condition) {
    // Code to be executed
    // (Must include a statement to eventually make the condition false)
}
```

**Example:**
A simple countdown from 5 to 1.
```java
int count = 5;
while (count > 0) {
    System.out.println("Countdown: " + count);
    count--; // Decrement the counter
}
```

---

## 3. `do-while` Loop

The `do-while` loop is similar to the `while` loop, but with one key difference: the condition is checked *after* the loop body is executed. This means the loop body will **always be executed at least once**, even if the condition is initially `false`.

**Syntax:**
```java
do {
    // Code to be executed
} while (condition);
```

**Example:**
A menu that is displayed at least once.
```java
int choice;
do {
    System.out.println("Please enter your choice (0 to exit):");
    // Assume getChoice() gets user input
    choice = getChoice(); 
} while (choice != 0);
```

---

## 4. Enhanced `for` Loop (for-each)

The enhanced `for` loop (or "for-each" loop) was introduced in Java 5. It is used to iterate through the elements of an array or a collection (like `ArrayList`) without having to manage an index variable. It makes the code more readable and less error-prone.

**Syntax:**
```java
for (Type variableName : arrayOrCollection) {
    // Code to be executed for each element
}
```

**Example:**
Iterating over an array of strings.
```java
String[] names = {"Alice", "Bob", "Charlie"};
for (String name : names) {
    System.out.println("Hello, " + name);
}
```

---

## Loop Control Statements

Java provides two statements to control the flow of loops:

### `break`
The `break` statement is used to **terminate the loop immediately**. When `break` is encountered inside a loop, the loop is exited, and the program continues execution at the statement immediately following the loop.

**Example:**
Stop a loop when a specific value is found.
```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        break; // Exit the loop when i is 5
    }
    System.out.println(i); // Prints 1, 2, 3, 4
}
```

### `continue`
The `continue` statement is used to **skip the current iteration** of the loop and proceed to the next one. When `continue` is encountered, the rest of the code inside the loop for the current iteration is skipped.

**Example:**
Print only the odd numbers between 1 and 10.
```java
for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) {
        continue; // Skip this iteration if i is even
    }
    System.out.println(i); // Prints 1, 3, 5, 7, 9
}
```

---

## Practice Exercises

### Exercise 1: FizzBuzz
Print numbers from 1 to 100, but:
- If the number is divisible by 3, print "Fizz"
- If divisible by 5, print "Buzz"
- If divisible by both 3 and 5, print "FizzBuzz"
- Otherwise, print the number

This is a classic programming interview question.

### Exercise 2: Number Guessing Game
Write a program where:
1. The computer generates a random number between 1 and 100 (`(int)(Math.random() * 100) + 1`)
2. The user has 7 attempts to guess the number
3. After each guess, print "Too high!" or "Too low!"
4. If they guess correctly, print "You won in X attempts!"
5. If they run out of attempts, print "Game over! The number was: X"

Use a `while` loop with a counter.

### Exercise 3: Pattern Printer
Use nested `for` loops to print these patterns:

**Pattern A (Right Triangle):**
```
*
**
***
****
*****
```

**Pattern B (Pyramid):**
```
    *
   ***
  *****
 *******
*********
```

**Pattern C (Diamond):**
```
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
```

### Exercise 4: Prime Numbers Finder
Write a program that finds and prints all prime numbers between 1 and 100.
- A prime number is only divisible by 1 and itself
- Use a nested loop: outer loop for each number, inner loop to check divisibility
- **Challenge:** Use `continue` with a labeled outer loop (`outer:`) for a cleaner solution
- Print count at the end: "Found X prime numbers"

### Exercise 5: Menu-Driven Calculator
Build a calculator with a `do-while` loop:
```
===== Calculator =====
1. Add
2. Subtract
3. Multiply
4. Divide
5. History
6. Exit
======================
```
- After each operation, store the result
- Option 5 prints all previous operations (use an `ArrayList<String>`)
- Keep running until user chooses Exit
- Handle division by zero

### Exercise 6: Nested Loop Challenge - Matrix Operations
Create two 3x3 matrices (2D arrays) and:
1. Print both matrices in a formatted grid
2. Add them together and print the result matrix
3. **Bonus:** Multiply them and print the result

Use nested `for` loops for all operations.

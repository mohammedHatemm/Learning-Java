# Java Operations

This document provides an overview of various operators in Java, including arithmetic, unary, assignment, relational, logical, ternary, and bitwise operators.

## 1. Arithmetic Operators

Arithmetic operators are used to perform mathematical calculations.

-   **Addition (+):** Adds two operands.
-   **Subtraction (-):** Subtracts the right operand from the left.
-   **Multiplication (*):** Multiplies two operands.
-   **Division (/):** Divides the left operand by the right.
-   **Modulus (%):** Returns the remainder of a division.

## 2. Unary Operators

Unary operators require only one operand.

-   **Unary Plus (+):** Indicates a positive value (optional).
-   **Unary Minus (-):** Negates a value.
-   **Increment (++):** Increases a value by 1.
-   **Decrement (--):** Decreases a value by 1.
-   **Logical Not (!):** Inverts a boolean value.

## 3. Assignment Operators

Assignment operators are used to assign values to variables.

-   **Simple Assignment (=):** Assigns the value from the right to the left operand.
-   **Add and Assign (+=):** Adds the right operand to the left and assigns the result to the left.
-   **Subtract and Assign (-=):** Subtracts the right operand from the left and assigns the result to the left.
-   **Multiply and Assign (*=):** Multiplies the left operand by the right and assigns the result to the left.
-   **Divide and Assign (/=):** Divides the left operand by the right and assigns the result to the left.

## 4. Relational Operators

Relational operators are used to compare two operands.

-   **Equal to (==):** Checks if two operands are equal.
-   **Not Equal to (!=):** Checks if two operands are not equal.
-   **Greater than (>):** Checks if the left operand is greater than the right.
-   **Less than (<):** Checks if the left operand is less than the right.
-   **Greater than or equal to (>=):** Checks if the left operand is greater than or equal to the right.
-   **Less than or equal to (<=):** Checks if the left operand is less than or equal to the right.

## 5. Logical Operators

Logical operators are used to combine conditional statements.

-   **Logical AND (&&):** Returns true if both operands are true.
-   **Logical OR (||):** Returns true if at least one operand is true.
-   **Logical NOT (!):** Inverts the boolean value of an operand.

## 6. Ternary Operator

The ternary operator is a shorthand for an if-else statement.

-   **Ternary (? :):** `condition ? value_if_true : value_if_false`

## 7. Bitwise Operators

Bitwise operators perform operations on individual bits.

-   **Bitwise AND (&):** Performs a bitwise AND operation.
-   **Bitwise OR (|):** Performs a bitwise OR operation.
-   **Bitwise XOR (^):** Performs a bitwise XOR operation.
-   **Bitwise Complement (~):** Inverts the bits of an operand.
-   **Left Shift (<<):** Shifts bits to the left.
-   **Right Shift (>>):** Shifts bits to the right.
-   **Unsigned Right Shift (>>>):** Shifts bits to the right, filling with zeros.

---

## Practice Exercises

### Exercise 1: Arithmetic Calculator
Write a program that takes two numbers from the user and performs all 5 arithmetic operations on them (`+`, `-`, `*`, `/`, `%`). Print the results. **Edge case:** What happens when the user enters `0` as the second number for division?

### Exercise 2: Pre vs Post Increment
What will the following code print? **First guess the answer on paper**, then run it to verify:
```java
int x = 5;
int y = x++;    // What is y? What is x now?
int z = ++x;    // What is z? What is x now?
System.out.println("x=" + x + " y=" + y + " z=" + z);
```
Write a program that demonstrates the difference between `x++` (post-increment) and `++x` (pre-increment) with 3 different examples.

### Exercise 3: Ternary Operator Practice
Write a program that:
1. Takes the user's age and prints "Adult" or "Minor" using the ternary operator.
2. Takes two numbers and prints the larger one using the ternary operator.
3. Takes a number and prints "Even" or "Odd" using the ternary operator.
**Challenge:** Nest two ternary operators to classify a number as "Positive", "Negative", or "Zero".

### Exercise 4: Bitwise Flag System
Imagine a user permissions system where:
- `READ = 1` (binary: `001`)
- `WRITE = 2` (binary: `010`)
- `EXECUTE = 4` (binary: `100`)

Write a program that:
1. Gives a user READ and WRITE permissions using the `|` (OR) operator.
2. Checks if the user has WRITE permission using the `&` (AND) operator.
3. Removes WRITE permission using `&` and `~` (AND and NOT).
4. Toggles EXECUTE permission using `^` (XOR).

### Exercise 5: Bill Splitter
Write a program that takes:
- The total bill amount
- The number of people splitting the bill
- The tip percentage

Calculate and print:
- The tip amount
- The total with tip
- The amount each person pays

Use `+=` and `/=` operators where possible.

# Java `printf` Explanation

The `printf` method in Java allows for formatted output using placeholders, flags, and special characters. This document explains the various components used in the `Main.java` example.

## 1. Placeholders (Format Specifiers)

Placeholders begin with a `%` and specify the type of data to be formatted.

-   `%s`: Formats **strings**. (e.g., `String name = "mohamed";`)
-   `%c`: Formats a single **character**. (e.g., `char firstChar = 'm';`)
-   `%d`: Formats **decimal integers** (byte, short, int, long). (e.g., `int age = 27;`)
-   `%f`: Formats **floating-point numbers** (float, double). (e.g., `double height = 1.8;`)
-   `%b`: Formats **boolean** values (`true` or `false`). (e.g., `boolean isEmployed = true;`)

## 2. Precision

Precision is used with floating-point numbers (`%f`) to control the number of digits displayed after the decimal point. It is specified by adding a `.` followed by the number of digits.

-   `%.1f`: Formats the number to **one** decimal place.
    -   *Example:* `printf("%.1f", 100.2222);` outputs `100.2`
-   `%.2f`: Formats the number to **two** decimal places.
    -   *Example:* `printf("%.2f", -102020.021454);` outputs `-102020.02`

## 3. Special Characters and Flags

Flags are special characters that modify the output format.

-   `\n`: A special character representing a **newline**. It moves the output cursor to the next line.
-   `+` (Flag): When used in a format specifier (e.g., `%+d`), it forces the output to include a sign for both positive (`+`) and negative (`-`) numbers.
-   `( ` (Flag): Encloses negative numbers in parentheses.
    -   *Example:* `printf("%(f", -123.45);` outputs `(123.450000)`
-   `,` (Flag): Adds locale-specific grouping separators (e.g., a comma for thousands in the US).
    -   *Example:* `printf("%,.2f", -102020.021454);` outputs `-102,020.02`

### Combining Flags

Flags can be combined. For instance, `%(,.2f` combines three flags:
1.  `(`: Enclose negative numbers in parentheses.
2.  `,`: Add thousand separators.
3.  `.2`: Limit to two decimal places.

*Example:* `printf("%(,.2f", -102020.021454);` would output `(102,020.02)`.

## Mathematical Operations

The `printf` method itself **does not perform mathematical calculations**. It is used to format the *results* of calculations that have already been performed in your code.

*Example:*
```java
double result = 100.0 / 3.0; // Mathematical operation
System.out.printf("Result: %.2f\n", result); // Formatting the output
// Output: Result: 33.33
```

---

## Practice Exercises

### Exercise 1: Formatted Receipt
Write a program that prints a shopping receipt using `printf`. The output should look exactly like this:
```
================================
        JAVA STORE RECEIPT
================================
Item            Qty     Price
--------------------------------
Laptop            1   $999.99
Mouse             3    $29.99
Keyboard          2    $49.50
--------------------------------
Subtotal:              $1,139.46
Tax (14%):               $159.52
--------------------------------
TOTAL:                 $1,298.98
================================
```
**Hints:** Use `%-15s` for left-aligned strings, `%10.2f` for right-aligned prices, `%,` for comma formatting.

### Exercise 2: Multiplication Table
Use `printf` to print a formatted multiplication table (1-10). Each number should be right-aligned in a 5-character wide column:
```
    1    2    3    4    5    6    7    8    9   10
    2    4    6    8   10   12   14   16   18   20
    3    6    9   12   15   18   21   24   27   30
...
```
**Hint:** Use `%5d` for consistent column width.

### Exercise 3: Student Report Card
Take a student's name and 5 subject scores. Print a report card:
```
Student: Mohamed Ahmed
Subject         Score    Grade
-------------------------------
Math             85.50    B+
Science          92.00    A
English          78.25    C+
Arabic           95.00    A+
History          60.00    D
-------------------------------
Average:         82.15
Status:          PASS
```
Use `%-15s`, `%6.2f`, and `%5s` to align everything.

### Exercise 4: Number Formatter
Write a program that takes a `double` number from the user and prints it in 6 different formats:
1. Default: `%f`
2. 2 decimal places: `%.2f`
3. With sign: `%+.2f`
4. With commas: `%,.2f`
5. Negative in parentheses: `%(,.2f`
6. 15 characters wide, right-aligned: `%15.2f`

### Exercise 5: ASCII Art with Printf
Use `printf` to print a right-aligned triangle of stars:
```
    *
   **
  ***
 ****
*****
```
**Hint:** Use `%` with width specifier to right-align each line of stars. Use a loop and `String.repeat()` or build the star string manually.

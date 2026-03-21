# Type Casting in Java

Type casting is a mechanism in Java that allows you to convert a value of one data type into another data type. This conversion can be either implicit (automatically done by the compiler) or explicit (done manually by the programmer).

There are two main types of type casting in Java:

1.  **Widening Casting (Implicit / Automatic)**
2.  **Narrowing Casting (Explicit / Manual)**

---

## 1. Widening Casting (Implicit)

Widening casting, also known as "upcasting" or "automatic type conversion," occurs when you convert a smaller data type to a larger data type. This conversion is done automatically by the Java compiler because there is no loss of data.

**Rules for Widening Casting:**
*   The target type must be larger than the source type.
*   The conversion happens automatically.

**Order of Widening (from smallest to largest):**
`byte -> short -> char -> int -> long -> float -> double`

**Example:**
```java
int myInt = 9;
double myDouble = myInt; // Automatic casting: int to double
System.out.println(myInt);    // Outputs 9
System.out.println(myDouble); // Outputs 9.0
```

---

## 2. Narrowing Casting (Explicit)

Narrowing casting, also known as "downcasting" or "manual type conversion," occurs when you convert a larger data type to a smaller data type. This conversion is *not* done automatically by the Java compiler because there is a potential loss of data or precision. You must explicitly perform this conversion using parentheses `()` with the target type.

**Rules for Narrowing Casting:**
*   The target type must be smaller than the source type.
*   The conversion must be done manually by the programmer.
*   There is a potential for data loss or precision loss.

**Example:**
```java
double myDouble = 9.78;
int myInt = (int) myDouble; // Manual casting: double to int
System.out.println(myDouble); // Outputs 9.78
System.out.println(myInt);    // Outputs 9 (data loss: .78 is truncated)
```

---

## Type Casting with Objects (Polymorphism)

Type casting also applies to objects, especially in the context of inheritance and polymorphism.

*   **Upcasting (Implicit):** Converting a subclass object to a superclass type. This is always safe and implicit.
    ```java
    class Animal {}
    class Dog extends Animal {}

    Dog myDog = new Dog();
    Animal myAnimal = myDog; // Upcasting: Dog to Animal (implicit)
    ```

*   **Downcasting (Explicit):** Converting a superclass object to a subclass type. This requires explicit casting and can lead to a `ClassCastException` if the object being cast is not actually an instance of the target subclass.
    ```java
    class Animal {}
    class Dog extends Animal {}
    class Cat extends Animal {}

    Animal myAnimal = new Dog(); // Upcasting
    Dog anotherDog = (Dog) myAnimal; // Downcasting: Animal to Dog (explicit, safe here)

    Animal anotherAnimal = new Cat();
    // Dog yetAnotherDog = (Dog) anotherAnimal; // This would compile but throw ClassCastException at runtime
    ```
    To prevent `ClassCastException`, you can use the `instanceof` operator to check the actual type of the object before downcasting.
    ```java
    Animal anotherAnimal = new Cat();
    if (anotherAnimal instanceof Dog) {
        Dog yetAnotherDog = (Dog) anotherAnimal; // This code will not be executed
    } else {
        System.out.println("Cannot cast Animal to Dog.");
    }
    ```

---

## Practice Exercises

### Exercise 1: Casting Chain
Declare a `byte` variable with value `42`. Cast it through the entire widening chain and print each step:
```
byte -> short -> int -> long -> float -> double
```
Then reverse it (narrowing) back to `byte` and print each step. What happens to the value at each stage?

### Exercise 2: Data Loss Detective
Write a program that demonstrates data loss in narrowing casting:
1. Cast `double 9.99` to `int` — what happens to `.99`?
2. Cast `int 130` to `byte` — what value do you get and why? (hint: byte range is -128 to 127)
3. Cast `int 65` to `char` — what character do you get?
4. Cast `char 'Z'` to `int` — what number do you get?

Print each result with an explanation.

### Exercise 3: Temperature Converter
Write a program that converts temperature from Celsius to Fahrenheit.
- Formula: `F = (C * 9/5) + 32`
- **The catch:** If you write `9/5` in Java with `int` division, you get `1` instead of `1.8`. Fix this using casting.
- Take input as `int` (whole number Celsius), but the Fahrenheit result should be `double`.

### Exercise 4: Average Calculator with Casting
Write a program that takes 3 `int` grades from the user and calculates the average as a `double`.
- **Wrong way:** `int avg = (g1 + g2 + g3) / 3;` — this loses the decimal
- **Right way:** Use casting to get the correct decimal average
- Print both results to show the difference.

### Exercise 5: Animal Polymorphism
Create this class hierarchy:
```
Vehicle (parent)
├── Car (child)
└── Truck (child)
```
Each class has a method `describe()` that prints what it is. Write a program that:
1. Creates a `Car` object and upcasts it to `Vehicle`
2. Tries to downcast a `Truck` reference to `Car` — handle the `ClassCastException` using `instanceof`
3. Creates an array of `Vehicle[]` with mixed `Car` and `Truck` objects, then loops through and downcasts each one correctly

public class Main {
    public static void main(String[] args) {
        // 1. Widening Casting (Implicit / Automatic)
        System.out.println("--- Widening Casting (Implicit) ---");
        int myInt = 10;
        double myDouble = myInt; // int to double
        System.out.println("int myInt = " + myInt);
        System.out.println("double myDouble = myInt; // Result: " + myDouble);

        char myChar = 'A';
        int charToInt = myChar; // char to int
        System.out.println("char myChar = '" + myChar + "'");
        System.out.println("int charToInt = myChar; // Result: " + charToInt);
        System.out.println();

        // 2. Narrowing Casting (Explicit / Manual)
        System.out.println("--- Narrowing Casting (Explicit) ---");
        double anotherDouble = 9.78;
        int doubleToInt = (int) anotherDouble; // double to int
        System.out.println("double anotherDouble = " + anotherDouble);
        System.out.println("int doubleToInt = (int) anotherDouble; // Result: " + doubleToInt + " (data loss)");

        float myFloat = 10.5f;
        int floatToInt = (int) myFloat; // float to int
        System.out.println("float myFloat = " + myFloat);
        System.out.println("int floatToInt = (int) myFloat; // Result: " + floatToInt + " (data loss)");

        long myLong = 1234567890123L;
        int longToInt = (int) myLong; // long to int (potential data loss if long is too large)
        System.out.println("long myLong = " + myLong);
        System.out.println("int longToInt = (int) myLong; // Result: " + longToInt + " (potential data loss)");
        System.out.println();

        // 3. Type Casting with Objects (Polymorphism)
        System.out.println("--- Type Casting with Objects ---");

        // Upcasting (Implicit)
        Animal myAnimal = new Dog(); // Dog object upcast to Animal reference
        System.out.println("Upcasting: Dog myDog = new Dog(); Animal myAnimal = myDog;");
        myAnimal.makeSound(); // Calls Dog's makeSound()

        // Downcasting (Explicit)
        // Safe downcasting with instanceof
        if (myAnimal instanceof Dog) {
            Dog anotherDog = (Dog) myAnimal; // Downcasting Animal to Dog
            System.out.println("Downcasting: Dog anotherDog = (Dog) myAnimal; // Safe");
            anotherDog.fetch();
        }

        Animal genericAnimal = new Cat(); // Cat object upcast to Animal reference
        System.out.println("Animal genericAnimal = new Cat();");
        // Attempting unsafe downcasting
        if (genericAnimal instanceof Dog) {
            Dog unsafeDog = (Dog) genericAnimal; // This block will not execute
            System.out.println("This line will not be printed.");
            unsafeDog.fetch();
        } else {
            System.out.println("Cannot cast genericAnimal (which is a Cat) to Dog.");
        }
    }
}

// Helper classes for object casting examples
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }

    void fetch() {
        System.out.println("Dog fetches the ball");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }

    void scratch() {
        System.out.println("Cat scratches");
    }
}
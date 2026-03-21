public class Main {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Unary Operators
        int c = 5;
        System.out.println("+c = " + (+c));
        System.out.println("-c = " + (-c));
        System.out.println("++c = " + (++c));
        System.out.println("--c = " + (--c));
        boolean flag = true;
        System.out.println("!flag = " + (!flag));

        // Assignment Operators
        int d = 10;
        d += 5; // d = d + 5
        System.out.println("d += 5 -> d = " + d);

        // Relational Operators
        int e = 10, f = 20;
        System.out.println("e == f: " + (e == f));
        System.out.println("e != f: " + (e != f));
        System.out.println("e > f: " + (e > f));
        System.out.println("e < f: " + (e < f));
        System.out.println("e >= f: " + (e >= f));
        System.out.println("e <= f: " + (e <= f));

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // Ternary Operator
        int g = 10, h = 20;
        int max = (g > h) ? g : h;
        System.out.println("Max value is: " + max);

        // Bitwise Operators
        int i = 5, j = 7;
        System.out.println("i & j = " + (i & j)); // Bitwise AND
        System.out.println("i | j = " + (i | j)); // Bitwise OR
        System.out.println("i ^ j = " + (i ^ j)); // Bitwise XOR
        System.out.println("~i = " + (~i));       // Bitwise Complement
        System.out.println("i << 2 = " + (i << 2)); // Left Shift
        System.out.println("j >> 1 = " + (j >> 1)); // Right Shift
        System.out.println("j >>> 1 = " + (j >>> 1)); // Unsigned Right Shift
    }
}
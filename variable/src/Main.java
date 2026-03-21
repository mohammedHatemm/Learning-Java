import  java.util.Scanner;
public class Main {
    public static void main(String[] args){
       String name;
       int age ;
       double gpa;
       char grade;
       boolean isGraduated;
       int a = 10;
       int b = 20;

//        System.out.println("==========Student Card==========");
//        System.out.println("Enter your name : ");
//        Scanner input = new Scanner(System.in);
//        name = input.nextLine();
//        System.out.println("Enter your age : ");
//        age = input.nextInt();
//        System.out.println("enter your gpa : ");
//        gpa = input.nextDouble();
//        input.nextLine(); // مسح الـ buffer
//        System.out.println("enter your grade : ");
//        grade = input.nextLine().charAt(0);
//        System.out.println("is the student graduated :");
//        isGraduated = gpa >= 2.0;
//        if (isGraduated)
//            System.out.println(" yes the student graduated" );
//
//        System.out.println("==========Student Card==========");
//        System.out.println("Name : " + name);
//        System.out.println("Age : " + age);
//        System.out.println("GPA : " + gpa);
//        System.out.println("Grade : " + grade);
//        System.out.printf("is he graduated ? " + isGraduated);

        //### Exercise 2: Variable Swap

//        a = a+b;
//        b=a-b;
//        a=a-b;
//
//        System.out.println(" the new value of a  is :" + a);
//        a=b;
//        System.out.println(" the new value of b  is :" + b);

//### Exercise 5: Circle Calculator
        System.out.println("enter the radius of the circle :");
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();

        double area = Math.PI * r * r;
        double circumFerence = 2 * Math.PI * r;
        double diamater = 2 * r;
        System.out.println("the area of the circle is : " + area);
        System.out.println("the circumFerence of the circle is : " + circumFerence);
        System.out.println("the diamater of the circle is : " + diamater);
        input.close();

    }
}

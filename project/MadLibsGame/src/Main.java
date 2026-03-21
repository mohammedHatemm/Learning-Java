import java.util.Scanner;

public class Main {
    public  static void  main(String[] args){
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        Scanner scanner =new Scanner(System.in);

        System.out.print("Enter an adjective (description): ");
        adjective1 =scanner.nextLine();
        System.out.print("Enter a noun (animal pr person)!: ");
        noun1 = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a variable end with -ing  (action)!: ");
        verb1 =scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective3 =scanner.nextLine();



        System.out.println("to day I want to go to " + adjective1 + " zoo .");
        System.out.println("in a exhibit , I saw a  " + noun1 + ".");
        System.out.println(noun1 +"was " + adjective2 + " and" +verb1 + "!");
        System.out.println("I was " + adjective3 + "!");


    }
}

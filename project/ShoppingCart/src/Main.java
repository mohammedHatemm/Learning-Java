import java.util.Scanner;

public class Main {
    public static void  main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String items;
        int quantity;
        double price;
        char currency ='$';
        double total;
        System.out.println("what item you lik to buy: ");
        items = scanner.nextLine();
        System.out.println("what is the price for each ?: ");
        price= scanner.nextDouble();
        System.out.println("how many would you like?: ");
        quantity = scanner.nextInt();
        total =  price * quantity;
        System.out.println("you need a  "+ items + " and the total is : " +total + currency);

        scanner.close();
    }
}

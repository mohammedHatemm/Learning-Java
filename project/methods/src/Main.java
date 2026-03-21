import java.util.Scanner;

public class Main {
   static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        double balance=0;

        boolean isRunning= true;
        int choice;

        while (isRunning) {

            System.out.println("\n********************************\n");
            System.out.println("Banking     program ");
            System.out.println("\n********************************\n");
            System.out.println("1. Show Balancer");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            System.out.println("\n********************************\n");
            System.out.print("enter your choice(1-4): ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> showBalancer(balance);
                case 2 -> balance +=deposit();
                case 3 -> balance -=    withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("invalid choice");

            }


        }
        System.out.println("thank you have a nice day ");
        scanner.close();
    }

    static void showBalancer(double balance){
        System.out.println("\n********************************\n");

        System.out.printf("$%.2f\n" , balance);
    }
    static double deposit(){
        double amount ;
        System.out.println("Enter an amount to be deposited ");
        amount = scanner.nextDouble();
        if(amount<0) {
            System.out.println("amount cannot negative");
            return 0;
        }else {

            return amount;
        }
   }
   static double withdraw(double balance){
        double amount;
       System.out.println("enter amount to be withdrawn ");
       amount = scanner.nextDouble();
       if(amount >balance){
           System.out.println("insufficient funds ");
           return 0;
           
       } else if (amount < 0) {
           System.out.println("amount cannot  be negative");
           return 0;

           
       }
       else {
           return amount;
       }

   }

}

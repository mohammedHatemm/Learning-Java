import java.util.Random;
import java.util.Scanner;

public class Main {
    public  static void main(String[] args){
        int numberOfDice;
        int total = 0;

        Scanner scanner = new Scanner(System.in);
        Random random =new Random();
        System.out.println("Enter the # of the dice to roll");
        numberOfDice = scanner.nextInt();
        if(numberOfDice>0)
        {

            for (int i =0 ; i<numberOfDice ; i++){
                int roll = random.nextInt(1,7);
                System.out.println("you rolled " + roll);
                total += roll;
            }
            System.out.println("Total: " +total);
        }else {
            System.out.println("number of dice must be greater thant zero ");
        }
        scanner.close();
    }

    static void printDie(int roll){
        String dice1 = ""

                -------
                |      |
                |      |
                |      |
                 -------



                ;



    }
}

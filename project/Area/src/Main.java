import  java.util.Scanner;
public class Main {
    public static void main(String[] args){
        double width = 0 ;
        double height= 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter  the width of the rectangular ");

        width = scanner.nextDouble();

        System.out.println("please enter the height of the rectangular ");

        height = scanner.nextDouble();


        area = width * height;

        System.out.println("the area of the rectangular is: "+ area) ;

        scanner.close();





    }
}

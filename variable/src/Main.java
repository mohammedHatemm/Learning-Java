import  java.util.Scanner;
public class Main {
    public static void main(String[] args){
        String name ="mohamed";
        int age = 27;
        int year = 13;
//        boolean isStudent ;
        char na= 'a';

        Scanner scanner = new Scanner(System.in);
        System.out.println("please tell me if you are a student ");
        Boolean isStudent = scanner.nextBoolean();


        if(isStudent){
            System.out.println("you are astudent ");
            System.out.println("my name is " + name);
            System.out.println("the age is " +age);

        }


    }
}

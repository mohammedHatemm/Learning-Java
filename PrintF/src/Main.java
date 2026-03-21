public class Main {
    public static  void main(String[] args)
    {
        String name= "mohamed";
        int age = 27;
        char firstChar='m';
        double height = 1.8;
        boolean isEmployed = true;
        double price = +100.2222;
        double mmm = -102020.021454;
        System.out.printf( " hello %s\n" , name);
        System.out.printf("your first charachter  is %c\n" , firstChar );
        System.out.printf("your age is %d\n" , age);
        System.out.printf("your height is %f\n" , height);
        System.out.printf("yes he is an employes %b\n" , isEmployed);
        System.out.printf("this is %s and he is %d years old\n " , name , age);
        System.out.printf("the pricee is %.1f\n" ,price);
        System.out.printf("the second %(,.2f\n", mmm);


    }
}
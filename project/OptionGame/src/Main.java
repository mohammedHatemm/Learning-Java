import java.util.Scanner;

public class Main {
    public  static void main(String[] args){
        String[] question ={"what is the main function of a router?",
                "which part of the computer is considered the bran?" ,
                "what years did the face book lunch?",
                "who is known as the father of the computer?" ,
                "what was the first programming language?"};
        String[][] options ={{"1. storing filles " ,"2. Encysfklsdfjks" , "3. fghjkl;ldfds", "4. ertyuiop" },
                            {"1. dfghjkl;" , "2. ertyuiop" ,"3. sflsfskfkls" , "4. sdfsf"},
                            {"1. cmxna" , "2. adalkjalsd" , "3. qeoiqwe" , "4.jdhadk"},
                            {"1.aldaskd" , "2. klaskd" , "3.dsadpas" ,"4. qeopqwieo"},
                            {"1.adad" , "2. kjkljkl" , "3.opio" ,"4. iuyuy"}};
        int[] answers = {3 ,1 ,2 , 4,3};
        int score = 0 ;
        int guess ;
        Scanner scanner =new Scanner(System.in);

        System.out.println("\n*******************************\n");
        System.out.println("welcome to the java quiz game! ");
        System.out.println("\n*******************************\n");

        for(int i=0 ; i<question.length ; i++){
            System.out.println(question[i]);
            for(String option :options[i]){
                System.out.println(option);
            }
            System.out.print("Enter your answer: ");
             guess = scanner.nextInt();
            if(guess == answers[i] )
            {
                System.out.println("******");
                System.out.println("correct ");
                System.out.println("******");
                score++;
            }
            else {
                System.out.println("******");
                System.out.println("wrong");
                System.out.println("******");
            }
        }
        System.out.println("your score is " + score + " congratulation ");

    }
}

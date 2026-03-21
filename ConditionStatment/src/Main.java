public class Main {
    public static void main(String[] args) {
        // 1. if Statement
        System.out.println("--- if Statement ---");
        int age = 20;
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        }
        System.out.println();

        // 2. if-else Statement
        System.out.println("--- if-else Statement ---");
        int number = 7;
        if (number % 2 == 0) {
            System.out.println("The number " + number + " is even.");
        } else {
            System.out.println("The number " + number + " is odd.");
        }
        System.out.println();

        // 3. if-else-if Ladder
        System.out.println("--- if-else-if Ladder ---");
        int score = 85;
        char grade;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("A score of " + score + " results in a grade of: " + grade);
        System.out.println();

        // 4. Nested if Statement
        System.out.println("--- Nested if Statement ---");
        int personAge = 25;
        boolean hasDegree = true;
        if (personAge >= 21) {
            System.out.println("Age requirement met (21+).");
            if (hasDegree) {
                System.out.println("Qualification requirement met (has degree).");
                System.out.println("Result: You are eligible for the job.");
            } else {
                System.out.println("Qualification requirement not met.");
                System.out.println("Result: You need a degree to be eligible.");
            }
        } else {
            System.out.println("Age requirement not met.");
            System.out.println("Result: You must be at least 21 years old.");
        }
        System.out.println();

        // 5. switch Statement
        System.out.println("--- switch Statement ---");
        int dayOfWeek = 4;
        String dayName;
        switch (dayOfWeek) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }
        System.out.println("Day " + dayOfWeek + " is " + dayName);
        System.out.println();
        
        // switch Statement with fall-through
        System.out.println("--- switch Statement (with fall-through) ---");
        int month = 2;
        int year = 2024;
        int numDays = 0;

        switch (month) {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                numDays = 31;
                break;
            case 4: case 6:
            case 9: case 11:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
        System.out.println("Number of Days in month " + month + " = " + numDays);
    }
}
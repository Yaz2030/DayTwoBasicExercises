import java.util.Scanner;

public class Exercise2 {
    public static void main(String [] args){
        /*2.
Write a program that takes the obtained marks and total marks as input and
calculates the percentage, then prints it.
• Input: Obtained Marks = 85, Total Marks = 100
• Expected Output: Percentage = 85.0% */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the obtained marks: ");
        double obtainedMarks = sc.nextDouble();

        System.out.println("Enter the total marks: ");
        double totalMarks = sc.nextDouble();

        double percentage = (obtainedMarks / totalMarks) * 100;
        System.out.println("Percentage = " + percentage + "%");



    }

}

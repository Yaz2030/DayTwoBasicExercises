import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        /* 1.
Develop a program that takes the weight (in kilograms) and height (in meters)
as input and calculates the BMI, then prints it.
• Input: Weight (kg) = 70, Height (m) = 1.75
• Expected Output: BMI = 22.86 */
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your weight in kilograms: ");
        double weight = sc.nextDouble();
        System.out.println("Enter your height in meters: ");
        double height = sc.nextDouble();

        System.out.println("Your BMI is: " + (weight / (height * height)));
    }
}

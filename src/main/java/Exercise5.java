import java.util.Scanner;

public class Exercise5 {

    /*5.
Develop a program that takes a sentence as input and extracts a substring from
it, then prints the extracted substring.
• Input: Sentence = "The quick brown fox jumps over the lazy dog", Start Index
= 10, End Index = 20
• Expected Output: "brown fox"
*/


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Write your words to create a sentence: ");
        String sentence = input.nextLine();

        System.out.println("Enter the start index: ");
        int startIndex = input.nextInt();

        System.out.println("Enter the end index: ");
        int endIndex = input.nextInt();

        System.out.println(sentence.substring(startIndex, endIndex)); // I learned the substring method from ( W3School )


    }
}

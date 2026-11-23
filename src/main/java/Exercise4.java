import java.util.Scanner;

public class Exercise4 {

    /*4.
Create a program that takes a string as input, calculates its length, and then
reverses the string using the StringBuilder class, finally printing both the length and
reversed string.
• Input: "Hello, World!"
• Expected Output: Length of the string: 13 And Reversed string: "!dlroW
,olleH"  */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write any words you want:");

        String words = sc.nextLine();

        int lengthOfWords = words.length();

        StringBuilder sb = new StringBuilder(words); // I am learning this today from GeeksforGeeks


        System.out.println("Length of the string: " + lengthOfWords  + " and Reversed string: " + sb.reverse());
    }
}

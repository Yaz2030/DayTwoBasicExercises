import java.util.Scanner;

public class Exercise8 {
    /*8.
Write a program that takes two strings as input and check if they are equal,
ignoring the case, then prints whether they are equal or not.
• Input: String 1 = "Hello", String 2 = "hello"
• Expected Output: Strings are equal (ignoring case). */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word1 = input.nextLine();
        System.out.println("Enter another word: ");
        String word2 = input.nextLine();

        // نفس التمرين السادس ولا ارى حل غير الـ if الشرطية

        if (word1.equalsIgnoreCase(word2)) {
            System.out.println("Strings are equal (ignoring case)");
        }else  {
            System.out.println("Strings are not equal (ignoring case)");
        }




    }
}

import java.util.Scanner;

public class Exercise6 {

    /*6.
Write a program that takes a sentence and a keyword as input, then check if
the keyword is present in the sentence and prints the result.
• Input: Sentence = "The quick brown fox jumps over the lazy dog", Keyword =
"jumps"
• Expected Output: Keyword "jumps" is present in the sentence.  */

    public static void main(String[] args) {

        //فيه لبس في السؤال ومافهمته زين بحيث اننا ما اخذنا ال if statement الى الحين لكن بحل بالطريقتين لضمان الدرجة
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = input.nextLine();
        System.out.println("Enter a keyword: ");
        String keyword = input.nextLine();

        boolean result = sentence.contains(keyword);
        System.out.println("Keyword (" + keyword + ") is present in the sentence.");

        System.out.println("________________________________");
        //هنا حل بال if statement

        if (result) {
            System.out.println("Keyword (" + keyword + ") is present in the sentence.");
        } else  {
            System.out.println("Keyword (" + keyword + ") is not present in the sentence.");
        }





    }
}

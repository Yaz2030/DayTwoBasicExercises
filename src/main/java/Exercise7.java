import java.util.Scanner;

public class Exercise7 {

    /*7.
Develop a program that takes a sentence and a word to replace as input, then
replace all occurrences of the word with another word and prints the modified
sentence.
• Input: Sentence = "The quick brown fox jumps over the lazy dog", Word to
Replace = "fox", Replacement Word = "cat"
• Expected Output: "The quick brown cat jumps over the lazy dog"  */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        System.out.print("Enter a replace word: ");
        String replacement = input.nextLine();
        System.out.print("Enter a replacemnt word: ");
        String replacementWord = input.nextLine();

        String replacedSentence = sentence.replace(replacement, replacementWord);


        System.out.print(replacedSentence);

    }
}

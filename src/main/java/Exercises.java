import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {

        /* 1.
Develop a program that takes the weight (in kilograms) and height (in meters)
as input and calculates the BMI, then prints it.
• Input: Weight (kg) = 70, Height (m) = 1.75
• Expected Output: BMI = 22.86 */
//        System.out.println("Q1");
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter your weight in kilograms: ");
//        double weight = sc.nextDouble();
//        System.out.println("Enter your height in meters: ");
//        double height = sc.nextDouble();
//
//        System.out.println("Your BMI is: " + (weight / (height * height)));
//
//        System.out.println("--------------------------------");

        //-------------------------------------------------

        /*2.
Write a program that takes the obtained marks and total marks as input and
calculates the percentage, then prints it.
• Input: Obtained Marks = 85, Total Marks = 100
• Expected Output: Percentage = 85.0% */

//        System.out.println("Q2");
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the obtained marks: ");
//        double obtainedMarks = sc.nextDouble();
//
//        System.out.println("Enter the total marks: ");
//        double totalMarks = sc.nextDouble();
//
//        double percentage = (obtainedMarks / totalMarks) * 100;
//        System.out.println("Percentage = " + percentage + "%");


        //_____________________________________________


           /*3.
Create a program that takes an amount in one currency and an exchange rate
as input, then converts and prints the amount in another currency.
• Input: Amount in USD = 100, Exchange Rate (USD to EUR) = 0.85
• Expected Output: Amount in EUR = 85.0  */


//        System.out.println("Q3");
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the amount in any currency you want: ");
//        double amountInCurrency = sc.nextDouble();
//
//        System.out.println("Enter the exchange rate: ");
//        double exchangeRate = sc.nextDouble();
//
//
//        System.out.println("The amount in new currency is: " + (amountInCurrency * exchangeRate) );


        /*4.
Create a program that takes a string as input, calculates its length, and then
reverses the string using the StringBuilder class, finally printing both the length and
reversed string.
• Input: "Hello, World!"
• Expected Output: Length of the string: 13 And Reversed string: "!dlroW
,olleH"  */


//        System.out.println("Q4");
//            Scanner sc = new Scanner(System.in);
//
//            System.out.println("Write any words you want:");
//
//            String words = sc.nextLine();
//
//            int lengthOfWords = words.length();
//
//            StringBuilder sb = new StringBuilder(words);
//
//
//            System.out.println("Length of the string: " + lengthOfWords  + " and Reversed string: " + sb.reverse());


        //___________________________________________

        /*5.
Develop a program that takes a sentence as input and extracts a substring from
it, then prints the extracted substring.
• Input: Sentence = "The quick brown fox jumps over the lazy dog", Start Index
= 10, End Index = 20
• Expected Output: "brown fox"*/


//        System.out.println("Q5");
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Write your words to create a sentence: ");
//        String sentence = input.nextLine();
//
//        System.out.println("Enter the start index: ");
//        int startIndex = input.nextInt();
//
//        System.out.println("Enter the end index: ");
//        int endIndex = input.nextInt();
//
//        System.out.println(sentence.substring(startIndex, endIndex));

        //_________________________________

          /*6.
Write a program that takes a sentence and a keyword as input, then check if
the keyword is present in the sentence and prints the result.
• Input: Sentence = "The quick brown fox jumps over the lazy dog", Keyword =
"jumps"
• Expected Output: Keyword "jumps" is present in the sentence.  */


//        System.out.println("Q6");
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a sentence: ");
//        String sentence = input.nextLine();
//        System.out.println("Enter a keyword: ");
//        String keyword = input.nextLine();
//
//        boolean result = sentence.contains(keyword);
//        System.out.println("Keyword (" + keyword + ") is present in the sentence. " + result);



        //----------------------------------------


         /*7.
Develop a program that takes a sentence and a word to replace as input, then
replace all occurrences of the word with another word and prints the modified
sentence.
• Input: Sentence = "The quick brown fox jumps over the lazy dog", Word to
Replace = "fox", Replacement Word = "cat"
• Expected Output: "The quick brown cat jumps over the lazy dog"  */


//        System.out.println("Q7");
//        Scanner input = new Scanner(System.in);
//            System.out.print("Enter a sentence: ");
//            String sentence = input.nextLine();
//            System.out.print("Enter the word to replace: ");
//            String replacement = input.nextLine();
//            System.out.print("Enter the replacemnt word: ");
//            String replacementWord = input.nextLine();
//
//            String replacedSentence = sentence.replace(replacement, replacementWord);
//
//
//            System.out.print(replacedSentence);


        //-------------------------------------------------------


        /*8.
Write a program that takes two strings as input and check if they are equal,
ignoring the case, then prints whether they are equal or not.
• Input: String 1 = "Hello", String 2 = "hello"
• Expected Output: Strings are equal (ignoring case). */

        System.out.println("Q8");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word1 = input.nextLine();
        System.out.println("Enter another word: ");
        String word2 = input.nextLine();


        boolean result = word1.equalsIgnoreCase(word2);

        System.out.println("Strings are equal (ignoring case). " + result);


        }
}

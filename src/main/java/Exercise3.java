import java.util.Scanner;

public class Exercise3 {
    /*3.
Create a program that takes an amount in one currency and an exchange rate
as input, then converts and prints the amount in another currency.
• Input: Amount in USD = 100, Exchange Rate (USD to EUR) = 0.85
• Expected Output: Amount in EUR = 85.0  */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount in any currency you want: ");
        double amountInCurrency = sc.nextDouble();

        System.out.println("Enter the exchange rate: ");
        double exchangeRate = sc.nextDouble();


        System.out.println("The amount in new currency is: " + (amountInCurrency * exchangeRate) );

    }

}

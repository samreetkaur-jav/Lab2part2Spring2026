import java.util.Scanner;

/**
 * * ProChall13 class does the following:
 * 1) Prompts the user for a meal amount
 * 2) Calculates tax and tip using constant rates
 * 3) Calculates the total meal cost
 * 4) Displays the tax, tip, and total
 *
 *
 *@author: Samreet Kaur
 * @since: 2/20/2026
 * @version: v1.0
 */
public class ProChall13
{
   public static void main(String[] args)
   {
       
        double meal, total, taxAmount, tipAmount;
        
        // constants for tax and tip rate
        final double TAX = 0.0675;   // 6.75% tax
        final double TIP = 0.20;     // 20% tip
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter meal amount: $");
        meal = keyboard.nextDouble();
        
        taxAmount =meal *TAX;
        tipAmount =meal *TIP;
        total = meal +taxAmount+ tipAmount;
        
        System.out.printf("\nThe tax is: $%,.2f", taxAmount);
        System.out.printf("\nThe tip is: $%,.2f", tipAmount);
         System.out.printf("\nThe meal cost with tax and tip is: $%,.2f", total);
         
             keyboard.close();
    }
}

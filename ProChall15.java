import java.util.Scanner;


/**
 * This program calculates the commission and total amount paid
 * for purchasing shares of stock.
 *
 * The commission is created as a constant.
 *
 * Author: Samreet Kaur
 * Version: v1.0
 * Since: 2/21/2026
 */
public class ProChall15
 {

    public static void main(String[] args) 
    {

        final double COMM_RATE = 0.02;

       
    
        double  total,pricePerShare, commission,totalCostShares;
        int numShares;
        Scanner keyboard = new Scanner(System.in);

  
        System.out.print("Enter number of shares purchased: ");
        numShares = keyboard.nextInt();

        System.out.print("Enter price per share: ");
        pricePerShare = keyboard.nextDouble();
        
      // Calculate final total cost including commission
        totalCostShares =numShares * pricePerShare;
        commission = totalCostShares *COMM_RATE;
        total = totalCostShares + commission;
        
        System.out.println("Total cost of shares: $" + totalCostShares);
        System.out.println("Commission cost is: $" + commission);
        System.out.println("Total cost is: $" + total);

        
        
        keyboard.close();
    }
}
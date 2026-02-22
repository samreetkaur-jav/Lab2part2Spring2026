import javax.swing.JOptionPane;


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

       
        String temp;
        double  total,pricePerShare, commission,totalCostShares;
        int numShares;

  
        temp = JOptionPane.showInputDialog("Enter number of shares purchased:");
        numShares = Integer.parseInt(temp);

        temp = JOptionPane.showInputDialog("Enter price per share:");
        pricePerShare = Double.parseDouble(temp);

      // Calculate final total cost including commission
        totalCostShares = numShares * pricePerShare;
        commission = totalCostShares * COMM_RATE;
        total = totalCostShares + commission;

        
        JOptionPane.showMessageDialog(null,
                "Total cost of shares: $" + totalCostShares +
                "\nCommission cost is: $" + commission +
                "\nTotal cost is: $" + total);

        System.exit(0);
    }
}
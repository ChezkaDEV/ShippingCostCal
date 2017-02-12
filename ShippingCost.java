import java.util.Scanner;

public class ShippingCost {
	
	public static void main(String args[]){
		double total = 0;
		/*Ask customer to choose from Standard Shipping($10 per order) or next day shipping ($25 per order)*/		
		
		Scanner user_Input = new Scanner(System.in);
		System.out.println("Welcome to the Shipping Cost Calculator. NOTE: Shipping is only available in the U.S.");
		System.out.println();
	    System.out.print("What is your preferred shipping method? Enter '1' for Standard Shipping and press '2' for Next-Day Shipping: ");
	    int preferredShippingMethod = user_Input.nextInt();
	    if(preferredShippingMethod == 1){
	    	System.out.println("You chose Standard Shipping. That will cost $10 per order.");
	    	System.out.println("How many order(s): ");
	    	int orders = user_Input.nextInt();
	    	total = total + (orders * 10);
	    	System.out.println("Total right now: $" + total);
	    } else {
	    	System.out.println("You chose Next-Day Shipping. That will cost $25 per order.");
	    	System.out.println("How many order(s): ");
	    	int orders = user_Input.nextInt();
	    	total = total + (orders * 25);
	    	System.out.println("Total right now: $" + total);
	    }
	    
	    /*If you live in IL, CA, NY, you will be charged 6% state sales tax, excluding the shipping cost.*/
	    System.out.print("If you live in IL, CA, NY, enter 1. You will be charged 6% state sales tax, excluding the shipping cost). If any other states, enter 2: ");
	    int state = user_Input.nextInt();
	    if (state == 1){
	    	System.out.println("6% state sales tax was added to your total.");
	    	double saleTax;
	    	saleTax = total * 0.06;
	    	total = total + saleTax;
	    	System.out.println("Total right now: $" + total);
	    } else{
	    	System.out.println("No state sales tax was added to your total.");
	    	System.out.println("Total right now: $" + total);
	    }
	    
	    if(total > 50){
	    	System.out.println("Since your total was over $50, standard shipping charge ($10) will be deducted from the total.");
	    	total = total - 10;
	    	System.out.println("Final total: $" + total);
	    } else{
	    	System.out.println("Final total: $" + total);
	    }
	}	
}

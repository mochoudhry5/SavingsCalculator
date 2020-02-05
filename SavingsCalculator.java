/*
 * This class calculates savings from three different deposits 
 * @author mominchoudhry
 */
public class SavingsCalculator {

	static double rate_decrement= 0.25;
	static double initial_rate= 0.4525;
	static double i;
	static double savings_rate=initial_rate/(1+(i*rate_decrement));
	static double initial_deposit=3000.0;
	static double time_invest=5;
	public static final double BONUS= 500;
	
	// Calculate savings for deposit of 3000, 4000, and 5000 
	public static void allThreeDeposits() {
		// Have deposit start off at 3000 and increase 
		// by 1000 till it reaches 5000
		for (int k=3000; k<=5000;k+=1000) {
			// Have the deposit equal itself so that it prints
			// only once 
			for (int i = k; i<=k; i++) {
				// Store variable "k" in "initial_deposit
				initial_deposit=k;
				// Print 8 -'s , "Savings Calculator", then 19 -'s 
				System.out.println(" --------Savings Calculator-------------------");
				// Create Printf statement using both initial-deposit and initial_rate variables 
				// initial_rate  will be multiplied by 100 
				System.out.printf(" Initial Deposit: $%.1f Initial Rate: %.2f%%%n"
				,initial_deposit,initial_rate*100);
				// Print 45 -'s
				System.out.println(" ---------------------------------------------");
				// Print new line 
				System.out.println();
				}
			// Loop until j reaches past 5 
			for (int j=1;j<=5;j++) {
				// Have loop continue as long as i is less than j 
				for (int i=0;i<j;i++) {
					// Initial deposit with bonus included as "i" changes 
					initial_deposit=k+BONUS*i;
					// New savings rate with "i" as the variable changes 
					savings_rate=initial_rate/(1+(i*rate_decrement));
					}
				/*
				 *  Have loop run the "initial_deposit+=(initial_deposit*savings_rate
				 *  calculations (j*5)-1 amount of times 
				 */
				for(int i=1;i<=(j*5)-1;i++) {
					// Calculate new initial deposit 
					initial_deposit+=(initial_deposit*savings_rate);
					}
					// Printf with time_invest and initial_deposit as its two variables
					// "time_invest" years: "initial_deposit"
					System.out.printf(" %2.0f years: %9.2f", time_invest*j, initial_deposit);
					// Print one space 
					System.out.print(" ");
					// Loop that prints initial_deposit/10000 amount of asterisks 
					for (int i=1; i<=initial_deposit/10000;i++) {
						// Print asterisks 
						System.out.print("*");
						}
					// Print new line 
					System.out.println();
				}	
			// Print new line 
			System.out.println();
				
		}
	}
	
}

	




















	
			

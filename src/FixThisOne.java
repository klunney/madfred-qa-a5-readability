import java.util.Scanner;

public class FixThisOne {

	public static void main(String[] args) {
		//Declares constant variables and names others
		final float PRICE_PER_DOZEN = 3.25f;
		final float PRICE_PER_SINGLE = 0.45f;
		int eggs, dozens, singles;
		float dozens_cost, singlesCost, tc;
		Scanner kbrd = new Scanner(System.in);
		//Prompt user for input and stores in 'eggs'
		System.out.print("How many eggs do you want? >> ");
		eggs = kbrd.nextInt();
		//Calculates the cost
		dozens = eggs / 12;
		singles = eggs % 12;
		dozens_cost = dozens * PRICE_PER_DOZEN;
		singlesCost = singles * PRICE_PER_SINGLE;
		tc = dozens_cost + singlesCost;
		
		/**
		 * This program displays the total amount of eggs purchased
		 * Next it displays how many dozen eggs you purchased and how much it cost
		 * Next it displays how many single eggs you purchased and how much it cost
		 * Lastly it displays your total cost
		 */
		System.out.println("You ordered " + eggs + " eggs in total.");
		System.out.println("That's " + dozens + " dozen at $3.25, or $" + dozens_cost);
		System.out.println("That's " + singles + " singles at 45c, or $" + singlesCost);
		System.out.println("Your total cost is $" + tc);
		
	
	}

}

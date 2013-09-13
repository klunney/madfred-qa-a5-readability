import java.util.Scanner;public class DamageThisOne {

	/*
	 * @author Clyde Brown
	 * @version 1.0
	 * @date August 12, 1856
	 * @param void
	 */
	
	public static void main(String[] args) 
{
		//this isa coment
		//variables
int number, stem, digit;Scanner sc = new Scanner(System.in);
		
		/* This section requests input
		 * six digit number, then it generates a stem and checkdigit 
		 */
								System.out.print("Please enter a six-digit ticket number: ");
				number = sc.nextInt();stem = number / 10;digit = number % 10;	
		/* validity of the ticket number
		 * new ticketnumber
		 *current number is invalid
		 */
					while (digit != stem % 7) 
								{
			System.out.println("That is NOT a valid ticket number, bucko! ");
					System.out.print("Try again: ");
			number = sc.nextInt();
				stem = number / 10;
			digit = number % 10;	
}
						
						System.out.println("That is a valid ticket number, well done! ");
	//this the last comment
	}

					}

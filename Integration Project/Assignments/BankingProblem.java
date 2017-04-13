import java.util.Scanner;

public class BankingProblem {

	public void findBalance(Scanner scan) {

		double withdrawAmount;
		double balance;
		final double BANK_CHARGE = .50;
		System.out.println("This is the banking problem from CodeChef.");
		System.out.println("You may only withdraw amounts that are " 
		+ "divisible by 5.");
		System.out.println("***************************************");
		int counter = 0;

		while (counter < 1) {

			System.out.println("Enter Current Balance:");
			balance = scan.nextDouble();
			scan.nextLine();
			System.out.println("Enter Amount to Withdraw:");
			withdrawAmount = scan.nextDouble();
			scan.nextLine();

			if (withdrawAmount % 5 != 0 || (withdrawAmount + BANK_CHARGE) >= 
					balance || balance < 0) {
				System.out.println("User can only withdraw amounts that are"
					+ " multiples of 5 and less than amount of current balance.");
				counter = 0;
			} else {
				balance = balance - withdrawAmount - BANK_CHARGE;
				System.out.println("The current balance is :" + balance);
				counter++;
			}
		}
		System.out.println("***************************************");
		System.out.println("Banking Rocks! Press enter to continue.");
		scan.nextLine();
	}
}

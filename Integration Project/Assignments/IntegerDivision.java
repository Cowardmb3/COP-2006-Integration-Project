import java.util.Scanner;

public class IntegerDivision {

	public void divideSimple(Scanner scan) {
					// This is a method header with a (parameter) inside.
		int i = 0;
		int oddNum = 1;
		int evenNum = 1;

		while (i < 1 && oddNum != 0 && evenNum !=0) {

			System.out.println("Please enter an odd number");
			oddNum = scan.nextInt();

			System.out.println("Please enter an even number");
			evenNum = scan.nextInt();
			scan.nextLine();
			if (oddNum % 2 == 1 && evenNum % 2 == 0) {
				System.out.println("Java says the answer is " 
						+ oddNum / evenNum + ".");
				i = 1;
			} else {
				System.out.println("You didn't type acceptable integers!");
				i = 0;
			}
		}
		System.out.println("As you can see, division with "
				+ "integers is inaccurate.");
		System.out.println("Press enter to continue.");
		System.out.println("***************************************");
		scan.nextLine();
	}
}

import java.util.Scanner;

public class ExceptionCode {
	int goodInt = 0;
	double goodDouble = 0;

	public int ScanInt(Scanner scan) {
		boolean gottenGoodInput = false;
		while (gottenGoodInput == false) {
			try {
				goodInt = scan.nextInt();
				gottenGoodInput = true;
			} catch (Exception e) {
				System.out.println("Invalid input, please enter an integer");
				scan.nextLine();
			}
		}
		System.out.println(goodInt);
	}

	public void scanDouble(Scanner scan) {
		boolean gottenGoodInput = false;
		while (gottenGoodInput == false) {
			try {
				goodDouble = scan.nextDouble();
				gottenGoodInput = true;
			} catch (Exception e) {
				System.out.println("Invalid input, please enter an integer");
				scan.nextLine();
			}
		}
		System.out.println(goodDouble);
	}

}

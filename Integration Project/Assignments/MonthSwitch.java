import java.util.Scanner;

public class MonthSwitch {

	// This is my attempt at using the switch technique.

	public void findMonth(Scanner scan) {
		System.out.println("Enter your favorite month of the year:");

		String month = "";
		String season = "";
		scan.nextLine();
		month = scan.nextLine();

		switch (month.toLowerCase()) {
		case "january":
		case "february":
		case "december":
			season = "Winter";
			break;
		case "april":
		case "may":
		case "june":
		case "march":
			season = "Spring";
			break;
		case "july":
		case "august":
		case "september":
			season = "Summer";
			break;
		case "october":
		case "november":
			season = "Fall";
			break;
		default:
			season = "Input was not a valid month.";
			break;
		}
		System.out.println("Your month is in: " + season);
		System.out.println("Press enter to continue.");
		scan.nextLine();
	}
}

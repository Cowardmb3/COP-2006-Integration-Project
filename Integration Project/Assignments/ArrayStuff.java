import java.util.Scanner;
import java.util.Random;

public class ArrayStuff {

	public void useArrays(Scanner scan, Random rand) {

			System.out.println("How long will your array be?");
			int n = scan.nextInt();
	
			System.out.println("Enter " + n + " integers to go into an array: ");
	
			int[] myArray = new int[n];
			for (int i = 0; i < n; i++) {
	
				myArray[i] = scan.nextInt();
				scan.nextLine();
			}
	
			System.out.println("Now we will find the smallest value in our array.");
			System.out.println();
	
			int smallestInt = myArray[0];
	
			for (int i = 0; i < myArray.length; i++) {
	
				if (myArray[i] < smallestInt) {
					smallestInt = myArray[i];
				}
			}
			System.out.println("The smallest value was: " + smallestInt);
			System.out.println("***************************************");
	
			System.out.println("Now we will get the sum of all the " + "elements of our array.");
			System.out.println();
	
			int myArraySum = 0;
	
			for (int i = 0; i < myArray.length; i++) {
				myArraySum += myArray[i];
			}
			System.out.println("The sum of all of the elements is: " + myArraySum);
			System.out.println("***************************************");
			System.out.println("Press enter to continue.");
			scan.nextLine();
	
			System.out.println("Now we will try to find the index of a " + "certain value.");
	
			System.out.println("Please enter the integer you would like " + "to search for in the array.");
	
			int arrayToFind = scan.nextInt();
			scan.nextLine();
			int myArrayIndex = -10;
			int j = 0;
			for (j = 0; j < myArray.length; j++) {
				if (myArray[j] == arrayToFind) {
					myArrayIndex = j;
					System.out.println("The integer you entered is located at index: " + myArrayIndex);
				} else if (j == myArray.length - 1 && myArrayIndex == -10) {
					System.out.println("The value you entered was not int the array.");
				}
			}
		
			System.out.println("***************************************");
			System.out.println("Press enter to continue to the 2D array example.");
			scan.nextLine();
			
		//This is my 2D Array Stuff
		int [][] ArrExample2 = new int [5][5];
		
		
			
		System.out.println("This is a random 2D Array");
		
		for (int i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				ArrExample2[i][j] = rand.nextInt(10);
			}
		}
		System.out.println("*******************");
		for (int i = 0; i < 5; i++) {
			System.out.print("*  ");
			for (j = 0; j < 5; j++) {
				System.out.print(ArrExample2[i][j] + "  ");
			}
			System.out.print("*");
			System.out.println();
		}
		System.out.println("*******************");
		System.out.println("Enter an integer that you would like to search for in our 2D array.");
		
		arrayToFind = scan.nextInt();
		scan.nextLine();
		int intsSeen = 0;
		
		for (int i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				if ( arrayToFind == ArrExample2[i][j]){
					System.out.println("The integer you were looking for is located at index ["
							+ i + "][" + j + "]");
					intsSeen ++;
				}
			}
		}
		System.out.println("There were " + intsSeen + " of your integer: " + arrayToFind +"s.\n");
		System.out.println("Now wasn't that cool!\nPress enter to continue");
		scan.nextLine();
	}
}

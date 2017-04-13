import java.util.Scanner;
import java.util.Random;

public class MiscellaneousBits {
	
	private int apples = 0;
	private int oranges = 0;
	Random rand = new Random();
	//This is my setter
	public void setTotalFruit(int a, int b){
		apples = a;
		oranges = b;
		}
	//this is my getter
	public int getTotalFruit(){
		int totalFruit = apples + oranges;
		return totalFruit;
	}
	
	public void miscellaneous(Scanner scan){
		System.out.println("A VARIABLE IS A LOCATION IN MEMORY!!!");
		System.out.println("***************************************");

		scan.nextLine();

		// This is my demonstration of integer division
		
		System.out.println("***************************************");

		//This is a call with an (argument) inside the parenthesis.
		
		//This is my use of a for loop, an unnecessarily complicated
		//cubing technique...
		
		System.out.println("Please enter a number you would like"
				+ " to cube: ");
		int addNumInit = scan.nextInt();
		int addNum = addNumInit;
		
		for (int i=0;i < 3;i++){
			System.out.println(addNum);
			addNum = addNum*addNumInit;
		}
	}
	public void processString(){
		System.out.println("Please enter a string.");
		String manip = scan.nextLine();
		manip.toUpperCase();
		System.out.println("Back at you!");
		System.out.println(manip);
	}
	public void useQueue(){
		
	}
}


// Matthew Coward
// This is my integration project.

import java.util.Random;
import java.util.Scanner;

/*  
 *  byte - 8-bit signed two's complement integer. 
 *  	   It has a minimum value of -128 and a maximum value of 127. 
 *  short - The short data type is a 16-bit signed two's complement
 *   integer.
 *  	   It has a minimum value of -32,768 and a maximum value of 
 *  32,767. 
 *  int - The int data type is a 32-bit signed two's complement 
 *  integer, which has a minimum value of -2^31 and a maximum 
 *  value of 2^31-1.
 *  long - The long data type is a 64-bit two's complement integer.
 *  	   The signed long has a minimum value of -263 and a maximum 
 *  value of 263-1.
 *  float - The float data type is a single-precision 32-bit IEEE 
 *  754 floating point
 *  double - The double data type is a double-precision 64-bit IEEE 
 *  754 floating point.
 *  boolean - The boolean data type has only two possible values: 
 *  true and false.
 *  char - The char data type is a single 16-bit Unicode character.
 */

// inheritance is the mechanism that allows a new class to be derived from an old one.

//Polymorphism is the ability of an object to take on many forms

public class IntegrationProject {
  public static void main(String[] args) {
    System.out.println("Welcome to my integration project!");
    System.out.println("***************************************");
    System.out.println("Press enter for a surprse!");

    // This is my Scanner
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    scan.nextLine();

    // Strings use " and chars use '.
    char letterM = 'M';
    char letterB = 'B';
    char letterC = 'C';

    System.out.println("This is my use of the char data type, " + "My"
        + " initials are: " + letterM + "." + letterB + "." + letterC + ".");
    System.out.println("***************************************");
    System.out.println("Press enter again to see " + "another sweet fact!");
    scan.nextLine();

    int selection = 0;

    System.out.println(
        "This is a menu to quickly navigate through the program:");

    // Loop with menu for navigating to certain parts of program.

    while (selection != 100) {
      /*
       * a relational operator is a programming language construct or operator
       * that tests or defines some kind of relation between two entities.
       */
      System.out.println("***************************************");
      System.out.println("1.\tGo to the Code Chef banking problem");
      System.out.println("2.\tGo to the demonstration of integer division");
      System.out.println("3.\tGo to the month to season switch example ");
      System.out.println("4.\tRun the array examples");
      System.out
          .println("5.\tRun all other miscellaneous parts of the program");
      System.out.println("6.\tRun through the whole program");
      System.out.println("7.\tExit Program");
      System.out.println("***************************************");

      int whereTo = scan.nextInt();

      switch (whereTo) {
        case 1:
          BankingProblem codeChefProblem = new BankingProblem();
          codeChefProblem.findBalance(scan);
          break;
        case 2:
          scan.nextLine();
          IntegerDivision firstExample = new IntegerDivision();
          firstExample.divideSimple(scan);
          break;
        case 3:
          MonthSwitch monthToSeason = new MonthSwitch();
          monthToSeason.findMonth(scan);
          break;
        case 4:
          ArrayStuff arrayExamples = new ArrayStuff();
          arrayExamples.useArrays(scan);
          break;
        case 5:
          MiscellaneousBits integrationMisc = new MiscellaneousBits();
          integrationMisc.miscellaneous(scan);
          break;
        case 6:
          // BankingProblem codeChefProblem2 = new BankingProblem();
          // codeChefProblem2.findBalance(scan);
          //
          // IntegerDivision firstExample2 = new IntegerDivision();
          // firstExample2.divideSimple(scan);
          //
          // MonthSwitch monthToSeason2 = new MonthSwitch();
          // monthToSeason2.findMonth(scan);
          //
          // ArrayStuff arrayExamples2 = new ArrayStuff();
          // arrayExamples2.useArrays(scan);
          //
          // MiscellaneousBits integrationMisc2 = new MiscellaneousBits();
          // integrationMisc2.miscellaneous(scan);

          System.out.println(integrationMisc2.ScanInt(scan));
          break;
        case 7:
          selection = 100;
          break;
        default:
          break;
      }
    }

    System.out.println("Press enter to see my demonstration of using "
        + "getters and setters");
    scan.nextLine();
    scan.nextLine();

    MiscellaneousBits integrationMisc3 = new MiscellaneousBits();
    integrationMisc3.setTotalFruit(10, 14);
    System.out.println(integrationMisc3.getTotalFruit());

    scan.close();
  }
}
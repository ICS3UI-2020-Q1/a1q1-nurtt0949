import java.util.Scanner;

/**
 *This program converts degrees celcius to degrees fahrenheit
 * @author Tolga Nurtekin
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
   public static void main(String[] args) {
   //create a Scanner for user input
   Scanner input = new Scanner(System.in);

   // declare a variable that will store a name
   int Celcius;
  
  // ask user what degrees in Celsius they want converted to Fahrenheit
  System.out.println("Please enter a temparature you would like to convert in degrees Celsius.");
  // initialize the name variable with Celsius
  Celcius = input.nextInt();

  // declare and calculate their degrees Celsius into Fahrenheit
  int Fahrenheit = (Celcius * 9)/5 + 32;
  // tell the user their degrees in Fahrenheit
  System.out.println("Your degree in Fahrenheit is " + Fahrenheit);
  }
}

/*
 * @project Week6
 * @author  Osbardo Rodriguez
 * Date:    3/13/18
 */
package Week6;

/*
 * Import the Scanner java package.
 */
import java.util.Scanner;

/**
 * Define class Main.
 */
public class Main {

    public static void main(String[] args) {
    	// Formatting output
	    int example2 = 12;
	    String name = "Phil Tayco";
	    double example = 45.6789;
	    double cash = example * 50;

	    /*
	     * printf allows you to print value variables in a formatted way
	     * %d only works with integers
	     * %f only works with floats
	     * %.2f means add a decimal and round to 2 places
	     * %,.2f means to use a comma separator
	     * %s only works with strings
	     * \n is a new line
	     * \t is a tab character
	     * \" prints a quotation mark
	     * For more information, see https://docs.oracle.com/javase/tutorial/java/data/numberformat.html
	     */
	    System.out.printf( "The \"integer\" is %d\n", example2 );
	    System.out.printf( "%s : %f\n", name, example );
	    System.out.printf( "$%,.2f\n", cash );

	    /*
	     * Write a program that takes 3 numbers from he user and
	     * determines which one is the largest.
	     */

	    // Instantiate the Scanner
	    Scanner input = new Scanner( System.in );

	    /*
	     * Declare all of the variables needed
	     */
	    int number1, number2, number3, result;

	    System.out.print( "Enter number 1: " );
	    number1 = input.nextInt();

	    System.out.print( "Enter number 2: " );
	    number2 = input.nextInt();

	    System.out.print( "Enter number 3: " );
	    number3 = input.nextInt();

	    result = findLargest( number1, number2, number3 );

	    System.out.printf( "The largest number is: %d\n", result );
    }

	/*
	 * Code for logic that has the potential to be reused in
	 * multiple places in a program is a good candidate for
	 * writing "functions" (a.k.a. "methods")
	 *
	 * Methods are often designed to meet one primary purpose
	 * or objective and often result in an "output" value
	 *
	 * In mathematical terms, a method is like a function.
	 * f(x) = 2x+3
	 *
	 * There are 3 components to all functions (as well as methods)
	 * 1) Input values (a.k.a. parameters, @param)
	 * 2) Formula (in programming, its function)
	 * 3) One output value (the result of the code)
	 *
	 * The int for this method on the first line represents
	 * the method's "return type".
	 *
	 * It is the type of data that is expected to be returned
	 * when this method is complete.
	 *
	 * Since all functions perform a primary objective, they
	 * should be named appropriately and is done after the
	 * return type.
	 *
	 * Here, the name of the method is "findLargest".
	 *
	 * n1, n2, and n3 are the input parameters for this method
	 * specified in the parenthesis.
	 * These are 3 independent variables that love in the method
	 * and are initialized with the values sent in when the
	 * method is called.
	 *
	 * All these on the first line of the method make up what
	 * we call a "method signature". All methods have
	 * signatures and are defined as return type, function name,
	 * and input parameters.
.	 */
	public static int findLargest( int n1, int n2, int n3 ) {
		int result;

		if ( n1 >= n2 ) {
			result = n1;
		} else {
			result = n2;
		}

		if ( n3 >= result ) {
			result = n3;
		}

		return result;
	}
}

import java.util.Scanner; // this is an imported scanner

public class InputAndOutput {

	public static void main(String[] args) {
		System.out.println("What is your name");

		// every variable needs an identifier
		// type identifier = new type();
		Scanner scanner = new Scanner(System.in); // we use a scanner to ask for an argument
		String name = scanner.nextLine(); // then in the next line in console we receive the input

		int x = 5; // primitive evaluation
		Integer y = 5; // object evaluation (5 is autoboxed)
		
		System.out.println(x);
		System.out.println(y);
		System.out.println("hello " + name);

	}

}

// variables - stores some value
// expression - evaluates to a value
// operator - work on operands to produce a value
// operand - objects the operator works on
// literals - the value

// data types - how the computer interprets the data
// java is a statically typed language, so we have to declare the variables type

// primitive types - char, boolean, byte, short, int, long, float, double
// objects - instance of a class

// statically typed - variables are given data types up front
// dynamically typed language - variables do not have a fixed type
import java.util.Scanner; // this is an imported scanner

public class InputAndOutput {

	public static void main(String[] args) {
		System.out.println("What is your name");

		// every variable needs an identifier
		// type identifier = new type();
		Scanner scanner = new Scanner(System.in); // we use a scanner to ask for an argument
		String name = scanner.nextLine(); // then in the next line in console we receive the input

		System.out.println("hello " + name);

	}

}

// variables - stores some value
// expression - evaluates to a value
// operator - work on operands to produce a value
// operand - objects the operator works on
// literals - the value

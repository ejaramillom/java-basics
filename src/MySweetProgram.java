
public class MySweetProgram {
	// MySweetProgram is an identifier

	// this is a method
	public static void main(String[] args) {
		// something to do in java
		System.out.println("your name is " + args[0]); // we pick the first argument that is passed 
		// in the console
		System.out.println("Hello there!");
		// system.out is an statement

		var x = new MySweetProgram(); // this creates an object
		x.tacos(); // this works because of the static keyword
	}

	public void tacos() {
		// something to do in java
		System.out.println("Hello there in tacos!");
		// system.out is an statement
	}
	// the content are members

	String x = new String("Hello"); // this is an example of a property

	// syntax of java usually consist of identifiers made up of properties and
	// statements 
}

// curly braces are used to show what is part of a class identifier
// it is usually managed in OOP

// class - contains everything and has members
// methods - do something
// members - are methods that do something
// statement - telling the computer to do something
// properties - store something
// arguments - what we pass to a method (part of the calling or instance )
// parameters - is the variable that saves an argument (part of the definition)

// access modifiers (like public keyword) - who can use this methods and classes?
// static - No instance of a class is needed for it to work
// object - is an instance of a class

// when we invoque java MySweetProgram in the console, we are telling the console to run
// the 'main' method defined in the program


public class VariableDeclaration {
	
	public static final double PI = 314159;

	public static void main(String[] args) {
		int x = 5; // this is a 2 step process
		int y = 2; // this is initialization
		y = 5; // this is reassignation of value
		
		final int z = 5; // this is a constant, cannot be reassigned
		
		VariableDeclaration.PI; // we could call PI because is declared as a constant in the class
	}

}

// variable declaration
// 1. declare
// 2. initialize
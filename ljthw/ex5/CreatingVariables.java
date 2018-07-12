public class CreatingVariables {
	public static void main(String[] args) {
		int x, y, age;
		// ints are between ± 2 billion
		double seconds, e, checking;
		String firstName, lastName, title;

		x = 10;
		y = 400;
		age = 28;

		seconds = 4.71;
		e = 2.71828182845904523536;
		checking = 1.89;

		firstName = "Marty";
		lastName = "Stepien";
		title = "Ms.";

		System.out.println( "The variable x contains " + x + " and variable y contains " + y + ".");
		System.out.println( "The experiment took " + seconds + " seconds." );
		System.out.println( "A favorite irrational # is Euler's number: " + e);
		System.out.println("Hopefully you have more than $" + checking + "!");
		System.out.println( "My name is " + title + " " + firstName + " " + lastName + ".");
	}
}
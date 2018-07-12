public class EscapeSequencesComments {
	public static void main(String[] args) {
		System.out.print("Learn\tJava\n\tthe\nHard\tWay\n\n");
		System.out.print("\tLearn Java the \"Hard\" Way!\n");
		System.out.print("Hello\n");
		System.out.print("Jello\by\n"); // \b is the escape sequence for “backspace”
		System.out /* testing */.println("Hard to believe");
		System.out.println("Suprised? /* abcde */ or not?");
		System.out.println("\\ // -=- \\ //");
		System.out.println("\\\\ \\\\\\ \\\\\\\\");
		System.out.print("I hope you understand \"escape sequences\" now.\n");
	}
}
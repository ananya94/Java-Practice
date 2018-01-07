
public class Hangman {

	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("Usage: Java Hangman <answer>");
			System.err.println("Answer is required");
		}
		Game game = new Game(args[0]);
		prompter prompter = new prompter(game);
		while(game.getTries()>0 && !game.isWon()) {
			prompter.prompt();
			prompter.displayProgress(); 	
		}
		prompter.displayOutcome();

	}

}

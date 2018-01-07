
public class Hangman {

	public static void main(String[] args) {
		Game game = new Game("Hangman");
		prompter prompter = new prompter(game);
		while(game.getTries()>0 && !game.isWon()) {
			prompter.prompt();
			prompter.displayProgress(); 	
		}
		prompter.displayOutcome();

	}

}

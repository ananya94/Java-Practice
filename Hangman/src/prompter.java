import java.util.*;
public class prompter {
	private Game game;
	
	public prompter(Game game) {
		this.game = game;
	}
	
	public boolean prompt() {
		Scanner scanner = new Scanner(System.in);
		boolean isHit = false;
		boolean isAcceptable = false;
		
		do {
		System.out.println("Enter your letter");
		String guessIn = scanner.nextLine();
		try {
			isHit = game.applyGuess(guessIn);
			isAcceptable = true;
		}catch(IllegalArgumentException iae){
			System.out.printf("here is your error: %s, please try again! \n",iae.getMessage());
		}
		}while(! isAcceptable);
		return isHit;
	}
	
	public void displayProgress() {
		System.out.printf("You have %d tries left \n Try to solve: %s\n",game.getTries(), game.getProgress());
	}
	
	public void displayOutcome() {
		if(game.isWon()) {
			System.out.printf("Congratulations!! You won with %d tries remaining \n", game.getTries());
		}else {
			System.out.printf("Damn, the Word was %s", game.getAnswer());
		}
	}
}

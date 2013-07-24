import java.util.Scanner;
import java.util.Random;

public class Driver
{
	public static final int ROCK = 1;
	public static final int PAPER = 2;
	public static final int SCISSORS = 3;
	
	public static final int PLAYER_WINS = 100;
	public static final int AI_WINS = 200;
	public static final int TIE = 300;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Welcome to Rock, Paper, Scissors");
		String play = "y";
		while(play.equalsIgnoreCase("y"))
		{
			String input;
			do
			{
				System.out.println("Select: ");
				System.out.println("1. Rock");
				System.out.println("2. Paper");
				System.out.println("3. Scissors");
				input = scn.nextLine();
			} while(!(input.equals("1") || input.equals("2") || input.equals("3"))); //wait for the input to equal 1, 2, or 3
			//now we have the user input
			int playerChoice = Integer.parseInt(input);
			//lets get the ai's input
			Random rand = new Random();
			int aiChoice = rand.nextInt(3)+1; //0-2 inclusive
			int winner = 0;
			switch(aiChoice)
			{
				case(ROCK):
				{
					if(playerChoice == PAPER)
					{
						winner = PLAYER_WINS;
					}else if(playerChoice == SCISSORS)
					{
						winner = AI_WINS;
					}else
					{
						winner = TIE;
					}
					break;
				}
				case(PAPER):
				{
					if(playerChoice == ROCK)
					{
						winner = AI_WINS;
					}else if(playerChoice == SCISSORS)
					{
						winner = PLAYER_WINS;
					}else
					{
						winner = TIE;
					}
					break;
				}
				case(SCISSORS):
				{
					if(playerChoice == PAPER)
					{
						winner = AI_WINS;
					}else if(playerChoice == ROCK)
					{
						winner = PLAYER_WINS;
					}else
					{
						winner = TIE;
					}
					break;
				}
			}
			
			//we have the results
			switch(winner)
			{
				case(PLAYER_WINS):
				{
					System.out.println("Player wins");
					break;
				}
				case(AI_WINS):
				{
					System.out.println("AI wins");
					break;
				}
				case(TIE):
				{
					System.out.println("Tie");
					break;
				}
			}
			
			//want to play again?
			do
			{
				System.out.println("Want to play again?");
				play = scn.nextLine();
			}while(!(play.equalsIgnoreCase("n") || play.equalsIgnoreCase("y")));
		}
		System.out.println("Thanks for playing Rock, Paper, Scissors");
	}
}

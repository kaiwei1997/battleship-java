public class Menu {
    private Input input = new Input();
    private Screen screen = new Screen();

    public int menu() {
		screen.displayMessageLine( "\nBattleship" );
		screen.displayMessageLine( "1. Start" );
		screen.displayMessageLine( "2. Quit" );
		screen.displayMessageLine( "\nEnter a choice: " );
		return input.getInput();
    }
    public int difficulty() {
		screen.displayMessageLine( "-- Rules --\n" );
		screen.displayMessageLine( "- Find ships in the grid by guessing the row and column." );
		screen.displayMessageLine( "- You win the game if you hit 5 ships." );
		screen.displayMessageLine( "- You lose the game f you lost all 15 lives.\n\n" );


		screen.displayMessageLine( "-- Objects & descriptions --\n" );
		screen.displayMessageLine( "& - Potion" );
		screen.displayMessageLine( "    - Reveal Ship Potion - reveal ship on grid." );
		screen.displayMessageLine( "    - Reveal Trap Potion - reveal trap on grid." );
		screen.displayMessageLine( "    - Life Potion - increase life by 1.\n" );
		screen.displayMessageLine( "x - Trap" );
		screen.displayMessageLine( "    - High Level Trap - reduce life by 2." );
		screen.displayMessageLine( "    - Low Level Trap - reduce life by 1.\n" );
		screen.displayMessageLine( "O - Bombed ship\n" );
		screen.displayMessageLine( "> - Revealed ship\n" );

		screen.displayMessageLine( "\n-- Difficulty -- \n" );
		screen.displayMessageLine( "1. Beginner - 80 ships, 10 traps, 18 potions" );
		screen.displayMessageLine( "\n2. Intermediate - 50 ships, 20 traps, 18 potions" );
		screen.displayMessageLine( "\n3. Advanced - 20 ships, 30 traps, 18 potions" );
		screen.displayMessageLine( "\nChoose a difficulty: " );
		return input.getInput();
	}
}
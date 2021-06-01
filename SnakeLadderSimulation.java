public class SnakeLadderSimulation {
	public static void main(String[] args){
	  System.out.println ("Welcome To Snake Game Simulation");
	   BufferedReader userInput = new BufferedReader (new InputStreamReader (System.in));

		    String startGame = "y";
	        System.out.print ("Do you want to play? Y or N     >  ");
	        startGame = userInput.readLine ();
	        while (startGame.equals ("y") || startGame.equals ("Y"))
	        {
	            startGame = startGame(startGame);
	        }
	        System.out.println ("Thanks for playing!!");
  }

	private static String startGame(String sGame) throws IOException {

		BufferedReader userInput1 = new BufferedReader (new InputStreamReader (System.in));
       		int userPosition = 0;
        	int diceRoll = 0;
        	int userRoll = 0;

        	String playAgain = "y";
        	int snakesLaddersArray [] = new int [6];
        	snakesLaddersArray [0] = 54;
        	snakesLaddersArray [1] = 90;
        	snakesLaddersArray [2] = 99;
        	snakesLaddersArray [3] = 9;
        	snakesLaddersArray [4] = 40;
        	snakesLaddersArray [5] = 67;

		return playAgain;

	}

	public static int getDice (int diceRoll)
	    {
	        diceRoll = (int)(Math.random()*6 )+1 ;
	       return diceRoll;
	    }

}

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

		  while (playAgain.equals ("y") || playAgain.equals ("Y")) {
            	userRoll =  getDice(diceRoll);
            	System.out.println ("You Rolled a " + userRoll );
            	userPosition = userPosition + userRoll;
            	userPosition = getPosition(userPosition, userRoll, snakesLaddersArray);
            	System.out.println ("You are currently on square " + userPosition);



		return playAgain;
	   }
	}

	public static int getDice (int diceRoll)
	    {
	        diceRoll = (int)(Math.random()*6 )+1 ;
	       return diceRoll;
	    }


	 public static int getPosition(int userPosition, int userRoll, int snakesLaddersArray []) throws IOException
	    {
	        if(userPosition == snakesLaddersArray[0])
	        {
	        	 System.out.println ("You Got Bit By A Snake, GO DOWN!!!");
	            userPosition -= userRoll;
	        }
	        else if (userPosition == snakesLaddersArray[1])
	        {
	            userPosition -= userRoll;
	            System.out.println ("You Got Bit By A Snake, GO DOWN!!!");
	        }
	        else if (userPosition == snakesLaddersArray[2])
	        {
	            userPosition -= userRoll;
	            System.out.println ("You Got Bit By A Snake, GO DOWN!!!");
	        }
	        else if (userPosition == snakesLaddersArray[3])
	        {
	            userPosition = 34;
	            System.out.println ("You Got A Ladder!! GO UP!!!");
	        }
	        else if (userPosition == snakesLaddersArray[4])
	        {
	            userPosition = 64;
	            System.out.println ("You Got A Ladder!! GO UP!!!");
	        }
	        else if (userPosition == snakesLaddersArray[5])
	        {

	            userPosition = 86;
	            System.out.println ("You Got A Ladder!! GO UP!!!");
	        }

	        if (userPosition < 0 || userPosition > 112)
	        {
	            System.out.println ("An error has occured please reset the game!!!!!!");
	        }

	        else if (userPosition > 100)
	            userPosition = userPosition - userRoll;
	            System.out.println ("OHHH You cant jump, you must land on a 100");
	        }
	        else if (userPosition == 100)
	        {
	            System.out.println ("YOU WON, GOOD JOB!!!");
	            System.out.println ("The number of times the dice was played to win the game is : " +numberOfDicePlayed);

	        }
	        return userPosition;
	    }
}

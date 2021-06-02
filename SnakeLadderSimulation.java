import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SnakeLadderSimulation {
	static int numberOfDicePlayedByPlayer1 = 0;
	static int numberOfDicePlayedByPlayer2 = 0;

	public static void main(String[] args) throws IOException {
	
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
        int player1Position = 0; 
		int player2Position = 0;
        int diceRoll1 = 0;
		int diceRoll2 = 0;
        int player1Roll = 0;
		int player2Roll= 0;
       
        String playAgain = "y"; 
        int snakesLaddersArray [] = new int [6]; 
        snakesLaddersArray [0] = 54;
        snakesLaddersArray [1] = 90;
        snakesLaddersArray [2] = 99;
        snakesLaddersArray [3] = 9;
        snakesLaddersArray [4] = 40;
        snakesLaddersArray [5] = 67; 
        
        while (playAgain.equals ("y") || playAgain.equals ("Y")) {
            player1Roll = getDice1(diceRoll1); 
            System.out.println ("Player1 Rolled a " + player1Roll );
			player2Roll = getDice2(diceRoll2); 
			System.out.println ("Player2 Rolled a " + player2Roll );
          
		    player1Position = player1Position + player1Roll; 
			player2Position = player2Position + player2Roll;
			
            player1Position = getplayer1Position(player1Position, player1Roll, snakesLaddersArray);
			player2Position = getplayer2Position(player2Position, player2Roll, snakesLaddersArray,player1Position);
            System.out.println ("Player1 is currently on square " + player1Position);
			System.out.println ("Player2 currently on square " + player2Position);
            
            
            if (player1Position == 100 || player2Position == 100 )
            {
                player1Position = 0;
				player1Position = 0;
                System.out.print ("Do You Want To Roll Again? Y or N     >  ");
                playAgain = userInput1.readLine (); 
            }
            else
            {
                System.out.print ("Do you want to play? Y or N     >  ");
                playAgain = userInput1.readLine ();   
                if (playAgain.equals ("n") || playAgain.equals ("N")) {
                    System.out.println ("You are currently on square " + player1Position);
                	System.out.print ("Do you want to play? Y or N     >  ");
                    playAgain = userInput1.readLine (); 
                }
                
            }
               
        }
        return playAgain; 
        
	}
	  public static int getDice1(int diceRoll1)
	    {
	        diceRoll1 = (int)(Math.random()*6 )+1 ;  
	        numberOfDicePlayedByPlayer1 +=1;
	       return diceRoll1;
	       
	    }
		 public static int getDice2(int diceRoll2)
	    { 
			diceRoll2 = (int)(Math.random()*6 )+1 ; 
	        numberOfDicePlayedByPlayer2 +=1;
	       return diceRoll2;
	       
	    }
	  
	  public static int getplayer1Position(int player1Position, int player1Roll, int snakesLaddersArray []) throws IOException 
	    {
	        
	        if(player1Position == snakesLaddersArray[0]) 
	        {
	        	 System.out.println ("You Got Bit By A Snake, GO DOWN!!!");
	            player1Position -= player1Roll; 
	           
	        }
	        else if (player1Position == snakesLaddersArray[1]) 
	        {
	            player1Position -= player1Roll; 
	            System.out.println ("You Got Bit By A Snake, GO DOWN!!!");
	            
	        }
	        else if (player1Position == snakesLaddersArray[2]) 
	        {
	            player1Position -= player1Roll; 
	            System.out.println ("You Got Bit By A Snake, GO DOWN!!!");
	        }
	        else if (player1Position == snakesLaddersArray[3]) 
	        {
	            player1Position = 34; 
	            System.out.println ("You Got A Ladder!! GO UP!!!");
	            
	        }
	        else if (player1Position == snakesLaddersArray[4]) 
	        {
	            player1Position = 64;
	            System.out.println ("You Got A Ladder!! GO UP!!!");
	            
	        }
	        else if (player1Position == snakesLaddersArray[5]) 
	        {
	            
	            
	            player1Position = 86; 
	            System.out.println ("You Got A Ladder!! GO UP!!!");
	        }
	        
	        if (player1Position < 0 || player1Position > 112) 
	        {
	            System.out.println ("An error has occured please reset the game!!!!!!");
	        }
	        
	        else if (player1Position > 100) 
	        {
	            player1Position = player1Position - player1Roll; 
	            System.out.println ("OHHH You cant jump, you must land on a 100"); 
	        }
	        else if (player1Position == 100)
	        {
	            System.out.println ("YOU WON, GOOD JOB!!!");
	            System.out.println ("The number of times the dice was played to win the game is : " +numberOfDicePlayedByPlayer1);
	            
	        }
	        
	        return player1Position; 
	    }
		public static int getplayer2Position (int player2Position, int player2Roll, int snakesLaddersArray [], int player1Position ) throws IOException
    {
        
        if(player2Position == snakesLaddersArray[0])
        {
            player2Position -= player2Roll; 
            System.out.println ("Player2 Got Bit By A Snake, HE WENT GO DOWN!!!");
            
            
        }
        else if (player2Position == snakesLaddersArray[1])
        {
            player2Position -= player2Roll; 
            System.out.println ("Player2 Got Bit By A Snake, HE WENT GO DOWN!!!");
            
        }
        else if (player2Position == snakesLaddersArray[2])
        {
           player2Position -= player2Roll; 
            System.out.println ("Player2 Got Bit By A Snake, HE WENT GO DOWN!!!");
        }
        else if (player2Position == snakesLaddersArray[3])
        {
            player2Position = 34;
            System.out.println ("Player2 Got TO A Ladder, HE WENT UP!!!");
        }
        else if (player2Position == snakesLaddersArray[4])
        {
            player2Position = 64;
            System.out.println ("Player2 Got TO A Ladder, HE WENT UP!!!");
            
        }
        else if (player2Position == snakesLaddersArray[5])
        {
            player2Position = 86;
            System.out.println ("Player2 Got TO A Ladder, HE WENT UP!!!");
        }
        
        
        if (player2Position < 0 || player2Position > 112) 
        {
            System.out.println ("An error has occured for the computer, please reset the game!!!!!!");
        }
        
        else if (player2Position > 100) 
        {
            player2Position = player2Position - player2Roll; 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SnakeLadderSimulation {
	static int numberOfDicePlayedByPlayer1 = 0;
	static int numberOfDicePlayedByPlayer2 = 0;

	public static void main(String[] args) throws IOException {
	
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
        int player1Position = 0; 
		int player2Position = 0;
        int diceRoll1 = 0;
		int diceRoll2 = 0;
        int player1Roll = 0;
		int player2Roll= 0;
       
        String playAgain = "y"; 
        int snakesLaddersArray [] = new int [6]; 
        snakesLaddersArray [0] = 54;
        snakesLaddersArray [1] = 90;
        snakesLaddersArray [2] = 99;
        snakesLaddersArray [3] = 9;
        snakesLaddersArray [4] = 40;
        snakesLaddersArray [5] = 67; 
        
        while (playAgain.equals ("y") || playAgain.equals ("Y")) {
            player1Roll = getDice1(diceRoll1); 
            System.out.println ("Player1 Rolled a " + player1Roll );
			player2Roll = getDice2(diceRoll2); 
			System.out.println ("Player2 Rolled a " + player2Roll );
          
		    player1Position = player1Position + player1Roll; 
			player2Position = player2Position + player2Roll;
			
            player1Position = getplayer1Position(player1Position, player1Roll, snakesLaddersArray);
			player2Position = getplayer2Position(player2Position, player2Roll, snakesLaddersArray,player1Position);
            System.out.println ("Player1 is currently on square " + player1Position);
			System.out.println ("Player2 currently on square " + player2Position);
            
            
            if (player1Position == 100 || player2Position == 100 )
            {
                player1Position = 0;
				player1Position = 0;
                System.out.print ("Do You Want To Roll Again? Y or N     >  ");
                playAgain = userInput1.readLine (); 
            }
            else
            {
                System.out.print ("Do you want to play? Y or N     >  ");
                playAgain = userInput1.readLine ();   
                if (playAgain.equals ("n") || playAgain.equals ("N")) {
                    System.out.println ("You are currently on square " + player1Position);
                	System.out.print ("Do you want to play? Y or N     >  ");
                    playAgain = userInput1.readLine (); 
                }
                
            }
               
        }
        return playAgain; 
        
	}
	  public static int getDice1(int diceRoll1)
	    {
	        diceRoll1 = (int)(Math.random()*6 )+1 ;  
	        numberOfDicePlayedByPlayer1 +=1;
	       return diceRoll1;
	       
	    }
		 public static int getDice2(int diceRoll2)
	    { 
			diceRoll2 = (int)(Math.random()*6 )+1 ; 
	        numberOfDicePlayedByPlayer2 +=1;
	       return diceRoll2;
	       
	    }
	  
	  public static int getplayer1Position(int player1Position, int player1Roll, int snakesLaddersArray []) throws IOException 
	    {
	        
	        if(player1Position == snakesLaddersArray[0]) 
	        {
	        	 System.out.println ("You Got Bit By A Snake, GO DOWN!!!");
	            player1Position -= player1Roll; 
	           
	        }
	        else if (player1Position == snakesLaddersArray[1]) 
	        {
	            player1Position -= player1Roll; 
	            System.out.println ("You Got Bit By A Snake, GO DOWN!!!");
	            
	        }
	        else if (player1Position == snakesLaddersArray[2]) 
	        {
	            player1Position -= player1Roll; 
	            System.out.println ("You Got Bit By A Snake, GO DOWN!!!");
	        }
	        else if (player1Position == snakesLaddersArray[3]) 
	        {
	            player1Position = 34; 
	            System.out.println ("You Got A Ladder!! GO UP!!!");
	            
	        }
	        else if (player1Position == snakesLaddersArray[4]) 
	        {
	            player1Position = 64;
	            System.out.println ("You Got A Ladder!! GO UP!!!");
	            
	        }
	        else if (player1Position == snakesLaddersArray[5]) 
	        {
	            
	            
	            player1Position = 86; 
	            System.out.println ("You Got A Ladder!! GO UP!!!");
	        }
	        
	        if (player1Position < 0 || player1Position > 112) 
	        {
	            System.out.println ("An error has occured please reset the game!!!!!!");
	        }
	        
	        else if (player1Position > 100) 
	        {
	            player1Position = player1Position - player1Roll; 
	            System.out.println ("OHHH You cant jump, you must land on a 100"); 
	        }
	        else if (player1Position == 100)
	        {
	            System.out.println ("YOU WON, GOOD JOB!!!");
	            System.out.println ("The number of times the dice was played to win the game is : " +numberOfDicePlayedByPlayer1);
	            
	        }
	        
	        return player1Position; 
	    }
		public static int getplayer2Position (int player2Position, int player2Roll, int snakesLaddersArray [], int player1Position ) throws IOException
    {
        
        if(player2Position == snakesLaddersArray[0])
        {
            player2Position -= player2Roll; 
            System.out.println ("Player2 Got Bit By A Snake, HE WENT GO DOWN!!!");
            
            
        }
        else if (player2Position == snakesLaddersArray[1])
        {
            player2Position -= player2Roll; 
            System.out.println ("Player2 Got Bit By A Snake, HE WENT GO DOWN!!!");
            
        }
        else if (player2Position == snakesLaddersArray[2])
        {
           player2Position -= player2Roll; 
            System.out.println ("Player2 Got Bit By A Snake, HE WENT GO DOWN!!!");
        }
        else if (player2Position == snakesLaddersArray[3])
        {
            player2Position = 34;
            System.out.println ("Player2 Got TO A Ladder, HE WENT UP!!!");
        }
        else if (player2Position == snakesLaddersArray[4])
        {
            player2Position = 64;
            System.out.println ("Player2 Got TO A Ladder, HE WENT UP!!!");
            
        }
        else if (player2Position == snakesLaddersArray[5])
        {
            player2Position = 86;
            System.out.println ("Player2 Got TO A Ladder, HE WENT UP!!!");
        }
        
        
        if (player2Position < 0 || player2Position > 112) 
        {
            System.out.println ("An error has occured for the computer, please reset the game!!!!!!");
        }
        
        else if (player2Position > 100) 
        {
            player2Position = player2Position - player2Roll; 
            System.out.println ("THE Player2 CAN'T JUMP!!! He must land on a 100"); 
            
        }
        else if (player2Position == 100 && player1Position != 100)
        {
            System.out.println ("THE Player2 has WON, YOU FAILED!!!");
			 System.out.println ("The number of times the dice was played to win the game is : " +numberOfDicePlayedByPlayer2);
            
        }
        
        return player2Position; 
    } 
}


import java.util.Scanner;

public class Craps
	{

		public static void main(String[] args)
			{
				boolean noCorrectGuess = true;
		
				// TODO Auto-generated method stub
				Scanner userInput = new Scanner(System.in);
				System.out.println("What is your name?");
				String name = userInput.nextLine();
				System.out.println("Hello, " + name + " You have 100$");
				
				Scanner userInput2 = new Scanner(System.in);
				System.out.println("How much do you want to bet?");
				int bet = userInput2.nextInt();
				
				
				int balance = 100;
				int diceOne = (int)(Math.random()*6)+1;
				int diceTwo = (int)(Math.random()*6)+1;
				
				int sum = diceOne + diceTwo;
				int point = 0;
				if (sum == 2 || sum == 12)
					{
						System.out.println("You rolled a " + diceOne + " and a " + diceTwo + " for a total of " + sum + ". Sorry " + name 
								+ ". You lose." );
						System.out.println("Your balance is $" + (balance-bet));
						System.exit(0);
					}
				
				else if(sum == 7 || sum == 11)
					{
						System.out.println("You rolled a " + diceOne + " and a " + diceTwo + " for a total of " + sum + ". You win, " + name 
								+ "!" );
						System.out.println("Your balance is $" + (balance+bet));
						System.exit(0);
					}
				else
					{
						System.out.println("You rolled a " + diceOne + " and a " + diceTwo + ". Your point is " + sum + ", " + name 
								+ "." );
						point = sum;
						
					}
					
				while(noCorrectGuess)
					{
						int diceOne2 = (int)(Math.random()*6)+1;
						int diceTwo2 = (int)(Math.random()*6)+1;
						
						int sum2 = diceOne2 + diceTwo2;
					
						if (sum2 == point)
							{
							System.out.println("You rolled a " + diceOne2 + " and a " + diceTwo2 + ". Making your total " + sum2 + ". Nice job! You win, " + name 
									+ "." );
							System.out.println("Your balance is $" + (balance+bet));
							noCorrectGuess = false;
							}
						else if (sum2 == 7)
						{
							System.out.println("You rolled a " + diceOne2 + " and a " + diceTwo2 + " for a total of " + sum2 + ". Sorry " + name 
									+ " You lose." );
							System.out.println("Your balance is $" + (balance-bet));
							noCorrectGuess = false;
						}
						else
							{
								System.out.println("You rolled a " + diceOne2 + " and a " + diceTwo2 + " for a total of " + sum2 + ". So close, keep rolling.");
								
								
								
							}
					}
				
				
				
			}


		
	}

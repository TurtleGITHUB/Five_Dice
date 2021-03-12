// Chapter 4 game zone page 227

public class FiveDice
{
	public static void main(String[] args)
	{
		//  variables and constants
		Die playerDie1 = new Die();		
		Die playerDie2 = new Die();
		Die playerDie3 = new Die();
		Die playerDie4 = new Die();
		Die playerDie5 = new Die();	

		Die comDie1 = new Die();
		Die comDie2 = new Die();
		Die comDie3 = new Die();
		Die comDie4 = new Die();			
		Die comDie5 = new Die();

		// output phase
		System.out.println();
		System.out.println("The player's roll was: " + playerDie1.getDieValue() + ", " + playerDie2.getDieValue() + ", " + playerDie3.getDieValue() + ", " + playerDie4.getDieValue() + ", " + playerDie5.getDieValue());

		System.out.println("The computer's roll was: " + comDie1.getDieValue() + ", " + comDie2.getDieValue() + ", " + comDie3.getDieValue() + ", " + comDie4.getDieValue() + ", " + comDie5.getDieValue());
	}
}
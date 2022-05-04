package Study.errors.Customs;

import java.util.Random;

public class Game {
	int hiddenNumber;
	int chances;
	Game(Random obj)
	{
		this.hiddenNumber=obj.nextInt(20);
	
		this.chances=5;
	}
	
	public void setHiddenNumber(Random number)
	{
		this.hiddenNumber=number.nextInt(20);
		
	}
	public int  getHiddenNumber()
	{
		return this.hiddenNumber;
	}
	
	public void setChances(int chances)
	{
		this.chances=chances;
	}
	public int getChances()
	{
		return this.chances;
	}
	public  int is_Matching(int number)
	{
		if(hiddenNumber> number)
		{
			return 1;
		}
		if(hiddenNumber<number)
			return -1;
		return 0;
	}
}

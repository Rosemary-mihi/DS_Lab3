
public class Warrior extends Job 
{
	@Override
	public int attack(int val, Hero hero) 
	{
		return (int) (hero.getSTR()*val+hero.getDEX());
	}
}

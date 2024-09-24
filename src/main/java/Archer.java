
public class Archer extends Job 
{
	@Override
	public int attack(int val, Hero hero) 
	{
		return (int) (hero.getDEX()*1.5*val);
	}
	@Override
	public String name()
	{
		return "ARCHER";
	}
}

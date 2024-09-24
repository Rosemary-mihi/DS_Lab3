
public class Mage extends Job
{
	@Override
	public int attack(int val, Hero hero) 
	{
		return (int) (hero.getDEX()+hero.getINT()*val);
	}
}

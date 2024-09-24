public class Hero implements HeroInterface {

	private Job job;
	private Race race;
	
	public Hero(Race race, Job job)
	{
		this.race = race;
		this.job = job;
	}
	@Override
	public int attack(int val) 
	{
		return job.attack(val, this);
	}

	@Override
	public int getSTR()
	{
		return race.getSTR();
	}

	@Override
	public int getDEX() 
	{
		return race.getDEX();
	}

	@Override
	public int getINT() 
	{
		return race.getINT();
	}

	@Override
	public String getRaceName() {
		return race.name();
	}

	@Override
	public String getJobName() 
	{
		return job.name();
	}

}

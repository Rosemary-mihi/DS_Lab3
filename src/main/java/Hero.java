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
		return 20;
	}

	@Override
	public int getDEX() 
	{
		return 20;
	}

	@Override
	public int getINT() 
	{
		return 20;
	}

	@Override
	public String getRaceName() {
		return this.race.toString().toUpperCase();
	}

	@Override
	public String getJobName() 
	{
		return this.job.toString().toUpperCase();
	}

}

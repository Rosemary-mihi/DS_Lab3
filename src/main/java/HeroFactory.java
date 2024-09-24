
public class HeroFactory 
{

   public static HeroInterface createHero(String raceName, String jobName)   
   {
	   Job job = null;
	   Race race = null;
	   if (raceName == "ELF")
	   {
		   race = new Elf();
	   }
	   else if (raceName == "DWARF")
	   {
		   race = new Dwarf();
	   }
	   else if (raceName == "ROBOT")
	   {
		   race =  new Robot();
	   }
	   if (jobName == "ARCHER")
	   {
		   job = new Archer();
	   }
	   else if (jobName == "MAGE")
	   {
		   job = new Mage();
	   }
	   else if (jobName == "WARRIOR")
	   {
		   job = new Warrior();
	   }
	   if (job == null || race == null)
	   {
		   return null;
	   }
	   Hero A = new Hero(race,job);
	   return A;
   }







}
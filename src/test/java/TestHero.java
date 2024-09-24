import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestHero {
	HeroInterface aA;
	HeroInterface aB;
	HeroInterface aC;
	HeroInterface bA;
	HeroInterface bB;
	HeroInterface bC;
	HeroInterface cA;
	HeroInterface cB;
	HeroInterface cC;
	HeroInterface X;
	HeroInterface Y;
	
	@BeforeEach
	void setUp() throws Exception
	{
		aA = HeroFactory.createHero("ELF", "ARCHER");
		aB = HeroFactory.createHero("ELF", "MAGE");
		aC = HeroFactory.createHero("ELF", "WARRIOR");
		
		bA = HeroFactory.createHero("DWARF", "ARCHER");
		bB = HeroFactory.createHero("DWARF", "MAGE");
		bC = HeroFactory.createHero("DWARF", "WARRIOR");
		
		cA = HeroFactory.createHero("ROBOT", "ARCHER");
		cB = HeroFactory.createHero("ROBOT", "MAGE");
		cC = HeroFactory.createHero("ROBOT", "WARRIOR");
		
		X = HeroFactory.createHero("DOG", "WARRIOR");
		Y = HeroFactory.createHero("ROBOT", "DOCTOR");
	}

	@Test
	void testNullOrNot() 
	{
		assertNull(X);
		assertNull(Y);
		assertNotNull(aA);
		assertNotNull(bB);
		assertNotNull(cC);
	}
	@Test
	void testDEX() 
	{
		assertEquals(25,aA.getDEX());
		assertEquals(20,bB.getDEX());
		assertEquals(20,cC.getDEX());
	}
	void testSTR() 
	{
		assertEquals(20,aA.getSTR());
		assertEquals(25,bB.getSTR());
		assertEquals(20,cC.getSTR());
	}
	void testINT() 
	{
		assertEquals(20,aA.getINT());
		assertEquals(20,bB.getINT());
		assertEquals(25,cC.getINT());
	}
	void testRaceName() 
	{
		assertEquals("ELF",aA.getRaceName());
		assertEquals("ELF",bA.getRaceName());
		assertEquals("ELF",cA.getRaceName());
		
		assertEquals("DWARF",aB.getRaceName());
		assertEquals("DWARF",bB.getRaceName());
		assertEquals("DWARF",cB.getRaceName());
		
		assertEquals("ROBOT",aC.getRaceName());
		assertEquals("ROBOT",bC.getRaceName());
		assertEquals("ROBOT",cC.getRaceName());
	}
	void testJobName() 
	{
		assertEquals("ARCHER",aA.getJobName());
		assertEquals("MAGE",bA.getJobName());
		assertEquals("WARROIR",cA.getJobName());
		
		assertEquals("ARCHER",aB.getJobName());
		assertEquals("MAGE",bB.getJobName());
		assertEquals("WARRIOR",cB.getJobName());
		
		assertEquals("ARCHER",aC.getJobName());
		assertEquals("MAGE",bC.getJobName());
		assertEquals("WARRIOR",cC.getJobName());
	}
	void testAttack() 
	{
		assertEquals(375,aA.attack(10));
		assertEquals(225,bA.attack(10));
		assertEquals(225,cA.attack(10));
		
		assertEquals(300,aB.attack(10));
		assertEquals(220,bB.attack(10));
		assertEquals(270,cB.attack(10));
		
		assertEquals(300,aC.attack(10));
		assertEquals(270,bC.attack(10));
		assertEquals(220,cC.attack(10));
	}
}

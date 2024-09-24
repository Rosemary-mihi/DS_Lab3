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
		//assertNull(Y.getDEX());
		//assertNull(Y.getINT());
		//assertNull(Y.getSTR());
		//assertNull(Y.getJobName());
		//assertNull(Y.getRaceName());
		//assertNull(Y.attack(2));


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
	@Test
	void testSTR() 
	{
		assertEquals(20,aA.getSTR());
		assertEquals(25,bB.getSTR());
		assertEquals(20,cC.getSTR());
	}
	@Test
	void testINT() 
	{
		assertEquals(20,aA.getINT());
		assertEquals(20,bB.getINT());
		assertEquals(25,cC.getINT());
	}
	@Test
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
	@Test
	void testJobName() 
	{
		assertEquals("ARCHER",aA.getJobName());
		assertEquals("MAGE", aB.getJobName());
		assertEquals("WARRIOR",aC.getJobName());
		
		assertEquals("ARCHER",bA.getJobName());
		assertEquals("MAGE",bB.getJobName());
		assertEquals("WARRIOR",bC.getJobName());
		
		assertEquals("ARCHER",cA.getJobName());
		assertEquals("MAGE",cB.getJobName());
		assertEquals("WARRIOR",cC.getJobName());
	}
	@Test
	void testAttack() 
	{
		assertEquals(375,aA.attack(10));
		assertEquals(225,aB.attack(10));
		assertEquals(225,aC.attack(10));
		
		assertEquals(300,bA.attack(10));
		assertEquals(220,bB.attack(10));
		assertEquals(270,bC.attack(10));
		
		assertEquals(300,cA.attack(10));
		assertEquals(270,cB.attack(10));
		assertEquals(220,cC.attack(10));
	}
}

package terning;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RollMultipleTest {

	Dice DiceUTest;
	int[] rollArray = new int[6]; 
	
	@Before
	public void setUp() throws Exception {
		DiceUTest = new Dice(); 
	}
	

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRollMultiple60k() {
		for (int i=0; i<60000; i++) {
			rollArray[DiceUTest.roll()-1]++;
		}
		System.out.println(rollArray[0] + " times was a 1 rolled");
		System.out.println(rollArray[1] + " times was a 2 rolled");
		System.out.println(rollArray[2] + " times was a 3 rolled");
		System.out.println(rollArray[3] + " times was a 4 rolled");
		System.out.println(rollArray[4] + " times was a 5 rolled");
		System.out.println(rollArray[5] + " times was a 6 rolled");
		
		boolean actual0 = 59600 < rollArray[0] && rollArray[0] < 60400;
		boolean actual1 = 59600 < rollArray[1] && rollArray[1] < 60400;
		boolean actual2 = 59600 < rollArray[2] && rollArray[2] < 60400;
		boolean actual3 = 59600 < rollArray[3] && rollArray[3] < 60400;
		boolean actual4 = 59600 < rollArray[4] && rollArray[4] < 60400;
		boolean actual5 = 59600 < rollArray[5] && rollArray[5] < 60400;
		boolean actual = actual0 && actual1 && actual2 && actual3 && actual4 && actual5;
		assertEquals(true, actual);
	}
	
	@Test
	public void testRollMultipleAlleRolls() {
		for (int i=0; i<60000; i++) {
			rollArray[DiceUTest.roll()-1]++;
		}
		System.out.println(rollArray[0]+rollArray[1]+rollArray[2]+rollArray[3]+rollArray[4]+rollArray[5]);
		
	int actual = rollArray[0]+rollArray[1]+rollArray[2]+rollArray[3]+rollArray[4]+rollArray[5];
	int expected = 60000;
	assertEquals(expected, actual);
	}
}



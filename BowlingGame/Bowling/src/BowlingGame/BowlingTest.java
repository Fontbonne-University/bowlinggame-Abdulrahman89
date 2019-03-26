package BowlingGame;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class BowlingTest {

	private Game g;

	@Before
	public void setUp()
	{
		g = new Game();
	}
	@Test
	public void test() {
//		fail("Not yet implemented");
	}
	
	private void rollMany(int j, int pins) {
		for(int i=0; i< j; i++)
			g.roll(pins);
	}
	
	private void ollSpare() {
		g.roll(5);
		g.roll(5);
	}
	
	@Test 
	public void canRoll() {
		Game g = new Game();
		g.roll(0);
	}
	
	@Test 
	public void gutterGame( ) {
		
		rollMany(20, 0);
		assertEquals(0, g.score());
	}
	
	
	@Test 
	public void allOnes() {
	
		rollMany(20, 1);
		assertEquals(20, g.score());
		
	}
	
	@Test
	public void oneSpare() {
		
		ollSpare();	//spare
		g.roll(3);
		rollMany(17,0);
		assertEquals(16,g.score());
	}
	
	@Test
	public void oneSike()
	{
		g.roll(10);
		g.roll(3);
		g.roll(4);
		rollMany(16,0);
		assertEquals(24, g.score());
	}
	

}


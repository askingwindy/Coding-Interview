package hry.interview.jianzhiOffer.test;

import static org.junit.Assert.*;
import hry.interview.jianzhiOffer.Q36InversePairs;

import org.junit.Test;
 
public class Q36InversePairsTest {
	Q36InversePairs q36 = new Q36InversePairs();

	@Test
	public void testInversePair1() {
		int []array = {1,2,3,4,7,6,5};
		int expected = 3;
		assertEquals(expected, q36.inversePair(array));
	}
	
	@Test
	public void testInversePair2() {
		int []array = {6, 5, 4, 3, 2, 1};
		int expected = 15;
		assertEquals(expected, q36.inversePair(array));
	}
	
	@Test
	public void testInversePair3() {
		int []array = {1, 2, 3, 4, 5, 6};
		int expected = 0;
		assertEquals(expected, q36.inversePair(array));
	}

	@Test
	public void testInversePair4() {
		int []array = {1};
		int expected = 0;
		assertEquals(expected, q36.inversePair(array));
	}
	
	@Test
	public void testInversePair5() {
		int []array = {1,2};
		int expected = 0;
		assertEquals(expected, q36.inversePair(array));
	}
	
	@Test
	public void testInversePair6() {
		int []array = {2,1};
		int expected = 1;
		assertEquals(expected, q36.inversePair(array));
	}
	
	@Test
	public void testInversePair7() {
		int []array = {1,2,1,2,1};
		int expected = 3;
		assertEquals(expected, q36.inversePair(array));
	}
	
	@Test
	public void testInversePair8() {
		int []array = null;
		int expected = 0;
		assertEquals(expected, q36.inversePair(array));
	}
}

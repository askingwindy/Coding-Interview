package hry.interview.jianzhiOffer.test;

import static org.junit.Assert.*;
import hry.interview.jianzhiOffer.Q45LastNumberInCircle;

import org.junit.Before;
import org.junit.Test;

public class Q45LastNumberInCircleTest {
	private Q45LastNumberInCircle q45 = new Q45LastNumberInCircle();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testLastRemainintSolution1() {
		assertEquals(3, q45.LastRemainintSolution1(5, 3));
	}
	@Test
	public void testLastRemainintSolution2() {
		assertEquals(2, q45.LastRemainintSolution1(5, 2));
	}
	@Test
	public void testLastRemainintSolution3() {
		assertEquals(4, q45.LastRemainintSolution1(6, 7));
	}
	@Test
	public void testLastRemainintSolution4() {
		assertEquals(3, q45.LastRemainintSolution1(6, 6));
	}
	@Test
	public void testLastRemainintSolution5() {
		assertEquals(-1, q45.LastRemainintSolution1(0, 0));
	}
	@Test
	public void testLastRemainintSolution6() {
		assertEquals(1027, q45.LastRemainintSolution1(4000, 997));
	}


}

package hry.interview.jianzhiOffer.test;

import static org.junit.Assert.*;
import hry.interview.jianzhiOffer.Q47AddTwoNumbers;

import org.junit.Before;
import org.junit.Test;

public class Q47AddTwoNumbersTest {
	private Q47AddTwoNumbers q47 = new Q47AddTwoNumbers();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAdd1() {
		assertEquals(3, q47.add(1, 2));
	}
	@Test
	public void testAdd2() {
		assertEquals(1010, q47.add(111, 899));
	}
	@Test
	public void testAdd3() {
		assertEquals(1, q47.add(-1, 2));
	}
	@Test
	public void testAdd4() {
		assertEquals(-4, q47.add(-4, 0));
	}

}

package hry.interview.jianzhiOffer.test;

import static org.junit.Assert.*;
import hry.interview.jianzhiOffer.Q44ContinousCards;

import org.junit.Before;
import org.junit.Test;

public class Q44ContinousCardsTest {
	
	private Q44ContinousCards q44= new Q44ContinousCards();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIsContinuous1() {
		int numbers[] = {1, 3, 2, 5, 4};
		assertEquals(true, q44.isContinuous(numbers));
	}
	@Test
	public void testIsContinuous2() {
		int numbers[] = {1, 3, 2, 6, 4};
		assertEquals(false, q44.isContinuous(numbers));
	}
	@Test
	public void testIsContinuous3() {
		int numbers[] = {0, 3, 2, 6, 4};
		assertEquals(true, q44.isContinuous(numbers));
	}
	@Test
	public void testIsContinuous4() {
		int numbers[] = {0, 3, 1, 6, 4};
		assertEquals(false, q44.isContinuous(numbers));
	}
	@Test
	public void testIsContinuous5() {
		int numbers[] = {1, 3, 0, 5, 0};
		assertEquals(true, q44.isContinuous(numbers));
	}
	@Test
	public void testIsContinuous6() {
		int numbers[] = {1, 3, 0, 7, 0};
		assertEquals(false, q44.isContinuous(numbers));
	}
	@Test
	public void testIsContinuous7() {
		int numbers[] = {1, 0, 0, 5, 0};
		assertEquals(true, q44.isContinuous(numbers));
	}
	@Test
	public void testIsContinuous8() {
		int numbers[] = {1, 0, 0, 7, 0};
		assertEquals(false, q44.isContinuous(numbers));
	}
	@Test
	public void testIsContinuous9() {
		int numbers[] = {3, 0, 0, 0, 0};
		assertEquals(true, q44.isContinuous(numbers));
	}
	@Test
	public void testIsContinuous10() {
		int numbers[] = {0, 0, 0, 0, 0};
		assertEquals(true, q44.isContinuous(numbers));
	}
	@Test
	public void testIsContinuous11() {
		int numbers[] = {1, 0, 0, 1, 0};
		assertEquals(false, q44.isContinuous(numbers));
	}
	@Test
	public void testIsContinuous12() {
		assertEquals(false, q44.isContinuous(null));
	}
}

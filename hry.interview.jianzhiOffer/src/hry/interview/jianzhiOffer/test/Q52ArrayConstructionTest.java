package hry.interview.jianzhiOffer.test;

import static org.junit.Assert.assertEquals;
import hry.interview.jianzhiOffer.Q52ArrayConstruction;

import org.junit.Before;
import org.junit.Test;

public class Q52ArrayConstructionTest {
	private Q52ArrayConstruction q52 = new Q52ArrayConstruction();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test1() {
		Integer[] array1 = {1, 2, 3, 4, 5};
		Integer[] array2 = {0,0,0,0,0};
		Integer[] expected = {120, 60, 40, 30, 24};
		q52.multiply(array1, array2);
		assertEquals(expected, array2);
	}
	@Test
	public void test2() {
		Integer[] array1 = {1, 2, 0, 4, 5};
		Integer[] array2 = {0,0,0,0,0};
		Integer[] expected = {0, 0, 40, 0, 0};
		q52.multiply(array1, array2);
		assertEquals(expected, array2);
	}
	@Test
	public void test3() {
		Integer[] array1 = {1, 2, 0, 4, 0};
		Integer[] array2 = {0,0,0,0,0};
		Integer[] expected = {0, 0, 0, 0, 0};
		q52.multiply(array1, array2);
		assertEquals(expected, array2);
	}
	@Test
	public void test4() {
		Integer[] array1 = {1, -2, 3, -4, 5};
		Integer[] array2 = {0,0,0,0,0};
		Integer[] expected = {120, -60, 40, -30, 24};
		q52.multiply(array1, array2);
		assertEquals(expected, array2);
	}
	@Test
	public void test5() {
		Integer[] array1 = {1, -2};
		Integer[] array2 = {0,0};
		Integer[] expected = {-2,1};
		q52.multiply(array1, array2);
		assertEquals(expected, array2);
	}
}

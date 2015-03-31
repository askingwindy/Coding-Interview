package hry.interview.jianzhiOffer.test;

import static org.junit.Assert.*;
import hry.interview.jianzhiOffer.Q65MaxInSlidingWindow;

import org.junit.Before;
import org.junit.Test;

public class Q65MaxInSlidingWindowTest {
	Q65MaxInSlidingWindow q65 = new Q65MaxInSlidingWindow();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testMaxInWindows1() {
		Integer[] nums = {
			2, 3, 4, 2, 6, 2, 5, 1
		};
		Integer[] expected = {
			4,4,6,6,6,5	
		};
		Integer[] result = q65.maxInWindows(nums, 3);
		assertEquals(expected, result);
	}
	
	@Test
	public void testMaxInWindows2() {
		Integer[] nums = {
				1, 3, -1, -3, 5, 3, 6, 7
		};
		Integer[] expected = {
				3, 3, 5, 5, 6, 7
		};
		Integer[] result = q65.maxInWindows(nums, 3);
		assertEquals(expected, result);
	}
	
	@Test
	public void testMaxInWindows3() {
		Integer[] nums = {
				1, 3, 5, 7, 9, 11, 13, 15
		};
		Integer[] expected = {
				7, 9, 11, 13, 15
		};
		Integer[] result = q65.maxInWindows(nums, 4);
		assertEquals(expected, result);
	}
	
	@Test
	public void testMaxInWindows4() {
		Integer[] nums = {
				16, 14, 12, 10, 8, 6, 4
		};
		Integer[] expected = {
				16, 14, 12
		};
		Integer[] result = q65.maxInWindows(nums, 5);
		assertEquals(expected, result);
	}
	
	@Test
	public void testMaxInWindows5() {
		Integer[] nums = {
				10, 14, 12, 11
		};
		Integer[] expected = {
				10, 14, 12, 11
		};
		Integer[] result = q65.maxInWindows(nums, 1);
		assertEquals(expected, result);
	}
	
	@Test
	public void testMaxInWindows6() {
		Integer[] nums = {
				10, 14, 12, 11
		};
		Integer[] expected = {
				14
		};
		Integer[] result = q65.maxInWindows(nums, 4);
		assertEquals(expected, result);
	}
	
	@Test
	public void testMaxInWindows7() {
		Integer[] nums = {
				10, 14, 12, 11
		};
		Integer[] result = q65.maxInWindows(nums, 0);
		assertEquals(null, result);
	}
	
	@Test
	public void testMaxInWindows8() {
		Integer[] nums = {
				10, 14, 12, 11
		};
		Integer[] result = q65.maxInWindows(nums, 5);
		assertEquals(null, result);
	}

}

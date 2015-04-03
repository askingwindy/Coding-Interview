package hry.interview.jianzhiOffer.test;

import static org.junit.Assert.*;
import hry.interview.jianzhiOffer.Q30KLeastNumbers;

import org.junit.Test;

public class Q30KLeastNumbersTest {
	Q30KLeastNumbers q30 = new Q30KLeastNumbers();
	
	@Test
	public void testGetLestNumbers1() {
		Integer data[] = {4, 5, 1, 6, 2, 7, 3, 8};
		Integer expected[] = {1, 2, 3, 4};
	    assertEquals(expected, q30.getLestNumbers(data, expected.length));
	}
	
	@Test
	public void testGetLestNumbers2() {
		Integer data[] = {4, 5, 1, 6, 2, 7, 3, 8};
		Integer expected[] = {1, 2, 3, 4, 5, 6, 7, 8};
	    assertEquals(expected, q30.getLestNumbers(data, expected.length));
	}
	
	@Test
	public void testGetLestNumbers3() {
		Integer data[] = {4, 5, 1, 6, 2, 7, 3, 8};
		Integer expected[] =null;
	    assertEquals(expected, q30.getLestNumbers(data, 10));
	}
	
	@Test
	public void testGetLestNumbers4() {
		Integer data[] = {4, 5, 1, 6, 2, 7, 3, 8};
		Integer expected[] = {1};
	    assertEquals(expected, q30.getLestNumbers(data, expected.length));
	}
	
	@Test
	public void testGetLestNumbers5() {
		Integer data[] = {4, 5, 1, 6, 2, 7, 3, 8};
		Integer expected[] = null;
	    assertEquals(expected, q30.getLestNumbers(data, 0));
	}
	
	@Test
	public void testGetLestNumbers6() {
		Integer data[] = {4, 5, 1, 6, 2, 7, 2, 8};
		Integer expected[] = {1, 2};
	    assertEquals(expected, q30.getLestNumbers(data, expected.length));
	}
	
	@Test
	public void testGetLestNumbers7() {
		Integer data[] = null;
		Integer expected[] =null;
	    assertEquals(expected, q30.getLestNumbers(data, 0));
	}

}

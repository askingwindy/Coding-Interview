package hry.interview.jianzhiOffer.test;

import static org.junit.Assert.*;
import hry.interview.jianzhiOffer.Q55FirstCharacterInStream;

import org.junit.Before;
import org.junit.Test;

public class Q55FirstCharacterInStreamTest {
	private Q55FirstCharacterInStream q55 = new Q55FirstCharacterInStream();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testFirstAppearOnce1() {
		String s = "g";
		assertEquals('g', q55.firstAppearOnce(s));
	}
	@Test
	public void testFirstAppearOnce2() {
		String s = "go";
		assertEquals('g', q55.firstAppearOnce(s));
	}
	@Test
	public void testFirstAppearOnce3() {
		String s = "goo";
		assertEquals('g', q55.firstAppearOnce(s));
	}
	@Test
	public void testFirstAppearOnce4() {
		String s = "goog";
		assertEquals('\0', q55.firstAppearOnce(s));
	}
	@Test
	public void testFirstAppearOnce5() {
		String s = "googl";
		assertEquals('l', q55.firstAppearOnce(s));
	}
	@Test
	public void testFirstAppearOnce6() {
		String s = "google";
		assertEquals('l', q55.firstAppearOnce(s));
	}
}

package hry.interview.jianzhiOffer.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import hry.interview.jianzhiOffer.Q35FirstNotRepeatingChar;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)  
public class Q35FirstNotRepeatingCharTest {

	Q35FirstNotRepeatingChar q35 = new Q35FirstNotRepeatingChar();
	private String s;
	private char c;
	
	public Q35FirstNotRepeatingCharTest(String s, char c) {
		this.s = s;
		this.c = c;
	}
	
	@Parameters
	public static Collection data(){
		return Arrays.asList(new Object[][]{
				{"google", 'l'},
				{"aabccdbd", '\0'},
				{"abcdefg", 'a'},
				{null, '\0'}
		});
	}
	
	@Test
	public void testFirstNotRepeatingChar() {
		assertEquals(c, q35.firstNotRepeatingChar(s));
	}

}

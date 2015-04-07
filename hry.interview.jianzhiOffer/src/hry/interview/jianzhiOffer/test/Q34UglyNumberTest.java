package hry.interview.jianzhiOffer.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import hry.interview.jianzhiOffer.Q34UglyNumber;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)  
public class Q34UglyNumberTest {
	Q34UglyNumber q34 = new Q34UglyNumber();
	private int index;
	private int result;
	
	public Q34UglyNumberTest(int index, int result) {
		this.index = index;
		this.result = result;
	}
	@Parameters
	public static Collection data(){
		return Arrays.asList(new Object[][]{
				{1,1},
				{2,2},
				{3,3},
				{4,4},
				{5,5},
				{6,6},
				{7,8},
				{8,9},
				{9,10},
				{10,12},
				{11,15},
				{1500,859963392},
				{0,0}
		});
	}
	
	
	@Test
	public void testGetUglyNumber() {
		assertEquals(result, q34.getUglyNumber(index));
	}

}

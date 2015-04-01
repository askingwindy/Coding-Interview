package hry.interview.jianzhiOffer.test;

import static org.junit.Assert.assertEquals;
import hry.interview.jianzhiOffer.Q9Fibonacci;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)  
public class Q9FibonacciTest {
	private Q9Fibonacci q9 = new Q9Fibonacci();
	
	private int param;
	private long expected;
	
	public Q9FibonacciTest(int param, long expected){
		this.param = param;
		this.expected = expected;
	}
	
	@Parameters
	public static Collection data(){
		return Arrays.asList(new Object[][]{
				{0,0},
				{1,1},
				{2,1},
				{3,2},
				{4,3},
				{5,5},
				{6,8},
				{7,13},
				{8,21},
				{9,34},
				{40, 102334155}
		});
	}

	@Test
	public void testFibonacci() {
		assertEquals(expected, q9.fibonacci(param));
	}

}

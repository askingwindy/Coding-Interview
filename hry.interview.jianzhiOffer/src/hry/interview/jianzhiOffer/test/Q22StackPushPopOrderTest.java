package hry.interview.jianzhiOffer.test;

import static org.junit.Assert.*;
import hry.interview.jianzhiOffer.Q22StackPushPopOrder;

import org.junit.Before;
import org.junit.Test;

public class Q22StackPushPopOrderTest {
	Q22StackPushPopOrder q22 = new Q22StackPushPopOrder();

	@Test
	public void testIsPopOrder1() {
	    int push[] = {1, 2, 3, 4, 5};
	    int pop[] = {4, 5, 3, 2, 1};
	    assertEquals(true, q22.isPopOrder(push, pop));
	}
	
	@Test
	public void testIsPopOrder2() {
	    int push[] = {1, 2, 3, 4, 5};
	    int pop[] = {3, 5, 4, 2, 1};
	    assertEquals(true, q22.isPopOrder(push, pop));
	}
	
	@Test
	public void testIsPopOrder3() {
	    int push[] = {1, 2, 3, 4, 5};
	    int pop[] = {4, 3, 5, 1, 2};
	    assertEquals(false, q22.isPopOrder(push, pop));
	}
	
	@Test
	public void testIsPopOrder4() {
	    int push[] = {1, 2, 3, 4, 5};
	    int pop[] = {3, 5, 4, 1, 2};
	    assertEquals(false, q22.isPopOrder(push, pop));
	}
	
	@Test
	public void testIsPopOrder5() {
	    int push[] = {1};
	    int pop[] = {2};
	    assertEquals(false, q22.isPopOrder(push, pop));
	}
	
	@Test
	public void testIsPopOrder6() {
	    int push[] = {1};
	    int pop[] = {1};
	    assertEquals(true, q22.isPopOrder(push, pop));
	}
	
	@Test
	public void testIsPopOrder7() {
	    int push[] = null;
	    int pop[] = null;
	    assertEquals(false, q22.isPopOrder(push, pop));
	}

}

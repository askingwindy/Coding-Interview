package hry.interview.jianzhiOffer.test;

import static org.junit.Assert.*;
import hry.interview.jianzhiOffer.Q51DuplicationInArray;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * 测试案例中：2,4,5应该是失败的
 * @author RY
 *
 */
public class Q51DuplicationInArrayTest {
	private Q51DuplicationInArray q51 = new Q51DuplicationInArray();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testDuplicate1() {
		 int numbers[] = {2, 4, 3, 1, 4};
		 List<Integer> rst = new ArrayList<Integer>();
		 q51.duplicate(numbers, rst);
		 Object[] result =rst.toArray();
		 Object duplications[] = {4};
		 assertEquals(duplications, result);
	}
	@Test
	public void testDuplicate2() {
		 int numbers[] = {2, 4, 3, 1, 4};
		 List<Integer> rst = new ArrayList<Integer>();
		 q51.duplicate(numbers, rst);
		 Object[] result =rst.toArray();
		 Object duplications[] = {1};
		 assertEquals(duplications, result);
	}
	@Test
	public void testDuplicate3() {
		 int numbers[] = {2, 4, 2, 1, 4};
		 List<Integer> rst = new ArrayList<Integer>();
		 q51.duplicate(numbers, rst);
		 Object[] result =rst.toArray();
		 Object duplications[] = {2,4};
		 assertEquals(duplications, result);
	}
	@Test
	public void testDuplicate4() {
		 int numbers[] = {2, 1, 3, 0, 4};
		 List<Integer> rst = new ArrayList<Integer>();
		 q51.duplicate(numbers, rst);
		 Object[] result =rst.toArray();
		 Object duplications[] = {-1};
		 assertEquals(duplications, result);
	}
	@Test
	public void testDuplicate5() {
		 int numbers[] ={2, 1, 3, 5, 4};
		 List<Integer> rst = new ArrayList<Integer>();
		 q51.duplicate(numbers, rst);
		 Object[] result =rst.toArray();
		 Object duplications[] =  {-1};
		 assertEquals(duplications, result);
	}
}

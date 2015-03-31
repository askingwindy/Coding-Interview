package hry.interview.jianzhiOffer.test;

import static org.junit.Assert.assertEquals;
import hry.interview.jianzhiOffer.Q67RobotMove;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//���������Ա���Ҫд@RunWith���Annotation
@RunWith(Parameterized.class)  
public class Q67RobotMoveTest {
	Q67RobotMove q67 = new Q67RobotMove();
	private int threshold;
	private int rows;
	private int cols;
	private int expected;
	
	public Q67RobotMoveTest(int threshold, int rows, int cols, int expected) {
		this.threshold = threshold;
		this.rows = rows;
		this.cols = cols;
		this.expected = expected;
	}

	//@Paramters���ע�������@Testǰ��
	@Parameters
	public static Collection data(){
		return Arrays.asList(new Object[][]{
				{5,10,10,21},
				{ 15, 20, 20, 359},
				{ 10, 1, 100, 29},
				{10, 1, 10, 10},
				{15, 10, 1, 10},
				{15, 1, 1, 1},
				{ -10, 10, 10, 0}
		});
	}
	

	@Test
	public void testMovingCount1() {
		assertEquals(expected, q67.movingCount(threshold, rows, cols));
	}

}

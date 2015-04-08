package hry.interview.jianzhiOffer.test;

import static org.junit.Assert.*;
import hry.interview.jianzhiOffer.Q41_2ContinueSequenceWithSum;

import org.junit.Test;

public class Q41_2ContinueSequenceWithSumTest {
	Q41_2ContinueSequenceWithSum q41 = new Q41_2ContinueSequenceWithSum();
	@Test
	public void testFindContinuousSequence() {
		q41.findContinuousSequence(1);
		q41.findContinuousSequence(3);
		q41.findContinuousSequence(4);
		q41.findContinuousSequence(9);
		q41.findContinuousSequence(15);
		q41.findContinuousSequence(100);
	}

}

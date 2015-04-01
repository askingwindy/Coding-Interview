package hry.interview.jianzhiOffer.test;

import static org.junit.Assert.*;

import java.util.Arrays;

import hry.interview.jianzhiOffer.Q14ReorderArray;

import org.junit.Before;
import org.junit.Test;

public class Q14ReorderArrayTest {
	private Q14ReorderArray q14 = new Q14ReorderArray();
	
	private void test(int[]num){
		System.out.println("BEFORE: "+ Arrays.toString(num));
		q14.reorder(num);
		System.out.println("AFTER:  "+ Arrays.toString(num));
		System.out.println("-------------");
	}

	@Test
	public void test1() {
		int numbers[] = {1, 2, 3, 4, 5, 6, 7};
		test(numbers);
	}
	@Test
	public void test2() {
		int numbers[] = {2, 4, 6, 1, 3, 5, 7};
		test(numbers);
	}
	@Test
	public void test3() {
		int numbers[] = {1, 3, 5, 7, 2, 4, 6};
		test(numbers);
	}
	@Test
	public void test4() {
		int numbers[] = {1};
		test(numbers);
	}
	@Test
	public void test5() {
		int numbers[] = {2};
		test(numbers);
	}

}

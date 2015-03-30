package hry.interview.jianzhiOffer.test;

import static org.junit.Assert.assertEquals;
import hry.interview.jianzhiOffer.BinaryTreeNode;
import hry.interview.jianzhiOffer.Q58NextNodeInBinaryTrees;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

public class Q58NextNodeInBinaryTreesTest {
	private Q58NextNodeInBinaryTrees q58 = new Q58NextNodeInBinaryTrees();

	//  	  8
	//	 6      	10
	//5 	7    9  	11
	@Test
	public void testGetNext1() {
		BinaryTreeNode n8 = new BinaryTreeNode(8);
		BinaryTreeNode n6 = new BinaryTreeNode(6);
		BinaryTreeNode n10 = new BinaryTreeNode(10);
		BinaryTreeNode n5 = new BinaryTreeNode(5);
		BinaryTreeNode n7 = new BinaryTreeNode(7);
		BinaryTreeNode n9 = new BinaryTreeNode(9);
		BinaryTreeNode n11 = new BinaryTreeNode(11);
		
		n8.connectTreeNode(n6, n10);
		n6.connectTreeNode(n5, n7);
		n10.connectTreeNode(n9, n11);
		
		System.out.println("Tes1");
		assertEquals(n9, q58.getNext(n8));
		System.out.println("Test2");
		assertEquals(n7, q58.getNext(n6));
		System.out.println("Test3");
		assertEquals(n11, q58.getNext(n10));
		System.out.println("Test4");
		assertEquals(n6, q58.getNext(n5));
		System.out.println("Test5");
		assertEquals(n8, q58.getNext(n7));
		System.out.println("Test6");
		assertEquals(n10, q58.getNext(n9));
		System.out.println("Test7");
		assertEquals(null, q58.getNext(n11));
	}
	
	
	//  		5
	//		4
	//	3
	//2
	@Test
	public void testGetNext2() {
		BinaryTreeNode n5 = new BinaryTreeNode(5);
		BinaryTreeNode n4 = new BinaryTreeNode(4);
		BinaryTreeNode n3 = new BinaryTreeNode(3);
		BinaryTreeNode n2 = new BinaryTreeNode(2);

		
		n5.connectTreeNode(n4, null);
		n4.connectTreeNode(n3, null);
		n3.connectTreeNode(n2, null);
		
		System.out.println("Tes8");
		assertEquals(null, q58.getNext(n5));
		System.out.println("Test9");
		assertEquals(n5, q58.getNext(n4));
		System.out.println("Test10");
		assertEquals(n4, q58.getNext(n3));
		System.out.println("Test11");
		assertEquals(n3, q58.getNext(n2));

	}
	
	//  		2
	//				3
	//					4
	//						5
	@Test
	public void testGetNext3() {
		BinaryTreeNode n5 = new BinaryTreeNode(5);
		BinaryTreeNode n4 = new BinaryTreeNode(4);
		BinaryTreeNode n3 = new BinaryTreeNode(3);
		BinaryTreeNode n2 = new BinaryTreeNode(2);

		
		n2.connectTreeNode(null, n3);
		n3.connectTreeNode(null, n4);
		n4.connectTreeNode(null, n5);
		
		System.out.println("Tes12");
		assertEquals(null, q58.getNext(n5));
		System.out.println("Test13");
		assertEquals(n5, q58.getNext(n4));
		System.out.println("Test14");
		assertEquals(n4, q58.getNext(n3));
		System.out.println("Test15");
		assertEquals(n3, q58.getNext(n2));

	}
	
	@Test
	public void testGetNext4() {
		BinaryTreeNode n5 = new BinaryTreeNode(5);
		System.out.println("Test16");
		assertEquals(null, q58.getNext(n5));
	}

}

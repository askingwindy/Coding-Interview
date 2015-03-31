package hry.interview.jianzhiOffer.test;

import static org.junit.Assert.*;
import hry.interview.jianzhiOffer.BinaryTreeNode;
import hry.interview.jianzhiOffer.Q63KthNodeInBST;

import org.junit.Before;
import org.junit.Test;

public class Q63KthNodeInBSTTest {
	private Q63KthNodeInBST q63 = new Q63KthNodeInBST();
	@Before
	public void setUp() throws Exception {
	}
	
	//  	  8
	//	 6      	10
	//5 	7    9  	11
	@Test
	public void testKthNode1() {
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
		assertEquals(null, q63.kthNode(n8, 0));
		System.out.println("Test2");
		assertEquals(n5, q63.kthNode(n8,1));
		System.out.println("Test3");
		assertEquals(n6, q63.kthNode(n8,2));
		System.out.println("Test4");
		assertEquals(n7, q63.kthNode(n8,3));
		System.out.println("Test5");
		assertEquals(n8, q63.kthNode(n8,4));
		System.out.println("Test6");
		assertEquals(n9, q63.kthNode(n8,5));
		System.out.println("Test7");
		assertEquals(n10, q63.kthNode(n8,6));
		System.out.println("Test8");
		assertEquals(n11, q63.kthNode(n8,7));
		System.out.println("Test9");
		assertEquals(null, q63.kthNode(n8,8));
	}
	
	//				5
	//			4
	//		3
	//	2
	//1
	@Test
	public void testKthNode2() {
		BinaryTreeNode n5 = new BinaryTreeNode(5);
		BinaryTreeNode n4 = new BinaryTreeNode(4);
		BinaryTreeNode n3 = new BinaryTreeNode(3);
		BinaryTreeNode n2 = new BinaryTreeNode(2);
		BinaryTreeNode n1 = new BinaryTreeNode(1);
		
		n5.connectTreeNode(n4, null);
		n4.connectTreeNode(n3, null);
		n3.connectTreeNode(n2, null);
		n2.connectTreeNode(n1, null);
		
		System.out.println("TestB0");
		assertEquals(null, q63.kthNode(n5,0));	
		System.out.println("TestB1");
		assertEquals(n1, q63.kthNode(n5,1));
		System.out.println("TestB2");
		assertEquals(n2, q63.kthNode(n5,2));
		System.out.println("TestB3");
		assertEquals(n3, q63.kthNode(n5,3));
		System.out.println("TestB4");
		assertEquals(n4, q63.kthNode(n5,4));
		System.out.println("TestB5");
		assertEquals(n5, q63.kthNode(n5,5));
		System.out.println("TestB6");
		assertEquals(null, q63.kthNode(n5,6));

	}
	
	//	1
	//		2
	//			3
	//				4
	//					5
	@Test
	public void testKthNode3() {
		BinaryTreeNode n5 = new BinaryTreeNode(5);
		BinaryTreeNode n4 = new BinaryTreeNode(4);
		BinaryTreeNode n3 = new BinaryTreeNode(3);
		BinaryTreeNode n2 = new BinaryTreeNode(2);
		BinaryTreeNode n1 = new BinaryTreeNode(1);
		
		n1.connectTreeNode(null, n2);
		n2.connectTreeNode(null, n3);
		n3.connectTreeNode(null, n4);
		n4.connectTreeNode(null, n5);
		
		System.out.println("TestC0");
		assertEquals(null, q63.kthNode(n1,0));	
		System.out.println("TestC1");
		assertEquals(n1, q63.kthNode(n1,1));
		System.out.println("TestC2");
		assertEquals(n2, q63.kthNode(n1,2));
		System.out.println("TestC3");
		assertEquals(n3, q63.kthNode(n1,3));
		System.out.println("TestC4");
		assertEquals(n4, q63.kthNode(n1,4));
		System.out.println("TestC5");
		assertEquals(n5, q63.kthNode(n1,5));
		System.out.println("TestC6");
		assertEquals(null, q63.kthNode(n5,6));

	}
	
	@Test
	public void testKthNode4() {
		BinaryTreeNode n1 = new BinaryTreeNode(1);
		
		System.out.println("TestD0");
		assertEquals(null, q63.kthNode(n1,0));	
		System.out.println("TestD1");
		assertEquals(n1, q63.kthNode(n1,1));
		System.out.println("TestD2");
		assertEquals(null, q63.kthNode(n1,2));
	}

}

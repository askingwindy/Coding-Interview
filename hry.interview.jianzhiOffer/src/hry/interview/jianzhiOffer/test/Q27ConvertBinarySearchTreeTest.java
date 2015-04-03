package hry.interview.jianzhiOffer.test;

import static org.junit.Assert.*;
import hry.interview.jianzhiOffer.BinaryTreeNode;
import hry.interview.jianzhiOffer.Q27ConvertBinarySearchTree;

import org.junit.Test;

public class Q27ConvertBinarySearchTreeTest {
	Q27ConvertBinarySearchTree q27 = new Q27ConvertBinarySearchTree();
	
	private void printDoulbeList(BinaryTreeNode root){
		BinaryTreeNode head = root;
		if(head == null){
			System.out.println("null");
		}else{
			while(head!=null){
				System.out.print(head.val+"\t");
				head = head.right;
			}
			System.out.println();
		}
	}
	
	private void test(BinaryTreeNode root){
		System.out.println("-----BEFORE----");
		root.printTree();
		System.out.println("-----AFTER-----");
		printDoulbeList(q27.convert(root));
	}
	//  	   10
	//		/      \
	//	   6        14
	//    /\        /\
	//   4  8     12  16
	@Test
	public void testConvert1() {
		BinaryTreeNode n10 = new BinaryTreeNode(10);
		BinaryTreeNode n6 = new BinaryTreeNode(6);
		BinaryTreeNode n14 = new BinaryTreeNode(14);
		BinaryTreeNode n4 = new BinaryTreeNode(4);
		BinaryTreeNode n8 = new BinaryTreeNode(8);
		BinaryTreeNode n12 = new BinaryTreeNode(12);
		BinaryTreeNode n16 = new BinaryTreeNode(16);
		
		n10.connectTreeNode(n6, n14);
		n6.connectTreeNode(n4, n8);
		n14.connectTreeNode(n12, n16);
		System.out.println("===========TEST1==========");
		test(n10);	
	}
	
	//  							5
	// 							/
	//						4
	//					/
	//				3
	//			/
	//		2
	//	/
	//1
	@Test
	public void testConvert2() {
		BinaryTreeNode n5 = new BinaryTreeNode(5);
		BinaryTreeNode n4 = new BinaryTreeNode(4);
		BinaryTreeNode n3 = new BinaryTreeNode(3);
		BinaryTreeNode n2 = new BinaryTreeNode(2);
		BinaryTreeNode n1 = new BinaryTreeNode(1);

		
		n5.connectTreeNode(n4, null);
		n4.connectTreeNode(n3, null);
		n3.connectTreeNode(n2, null);
		n2.connectTreeNode(n1, null);
		System.out.println("===========TEST2==========");
		test(n5);	
	}
	
	// 1
	//  \
	//   2
	//    \
	//     3
	//      \
	//       4
	//        \
	//         5
	@Test
	public void testConvert3() {
		BinaryTreeNode n5 = new BinaryTreeNode(5);
		BinaryTreeNode n4 = new BinaryTreeNode(4);
		BinaryTreeNode n3 = new BinaryTreeNode(3);
		BinaryTreeNode n2 = new BinaryTreeNode(2);
		BinaryTreeNode n1 = new BinaryTreeNode(1);

		
		n1.connectTreeNode(null, n2);
		n2.connectTreeNode(null, n3);
		n3.connectTreeNode(null, n4);
		n4.connectTreeNode(null, n5);
		System.out.println("===========TEST3==========");
		test(n1);	
	}
	
	// 1
	@Test
	public void testConvert4() {
		BinaryTreeNode n1 = new BinaryTreeNode(1);

		System.out.println("===========TEST3==========");
		test(n1);	
	}
}

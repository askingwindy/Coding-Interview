package hry.interview.jianzhiOffer.test;

import hry.interview.jianzhiOffer.BinaryTreeNode;
import hry.interview.jianzhiOffer.Q19MirrorOfBinaryTree;

import org.junit.Test;

public class Q19MirrorOfBinaryTreeTest {
	Q19MirrorOfBinaryTree q19 = new Q19MirrorOfBinaryTree();
	
	// 测试完全二叉树：除了叶子节点，其他节点都有两个子节点
	//  	    8
	//		6      10
	//	   5 7    9  11
	@Test
	public void testMirrorTree1() {
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
		
		System.out.println("----------------BEFORE------------");
		n8.printTree();
		System.out.println("----------------AFTER-------------");
		BinaryTreeNode mirror = q19.mirrorTree(n8);
		mirror.printTree();
	}
	
	// 测试二叉树：出叶子结点之外，左右的结点都有且只有一个左子结点
	//  			8
	//			7   
	//		6 
	//	5
	//4
	@Test
	public void testMirrorTree2() {
		BinaryTreeNode n8 = new BinaryTreeNode(8);
		BinaryTreeNode n7 = new BinaryTreeNode(7);
		BinaryTreeNode n6 = new BinaryTreeNode(6);
		BinaryTreeNode n5 = new BinaryTreeNode(5);
		BinaryTreeNode n4 = new BinaryTreeNode(4);
		
		n8.connectTreeNode(n7, null);
		n7.connectTreeNode(n6, null);
		n6.connectTreeNode(n5, null);
		n5.connectTreeNode(n4, null);
		
		System.out.println("----------------BEFORE------------");
		n8.printTree();
		System.out.println("----------------AFTER-------------");
		BinaryTreeNode mirror = q19.mirrorTree(n8);
		mirror.printTree();
	}
	
	// 测试二叉树：出叶子结点之外，左右的结点都有且只有一个左子结点
	//  			8
	//					7   
	//						6 
	//							5
	//								4
	@Test
	public void testMirrorTree3() {
		BinaryTreeNode n8 = new BinaryTreeNode(8);
		BinaryTreeNode n7 = new BinaryTreeNode(7);
		BinaryTreeNode n6 = new BinaryTreeNode(6);
		BinaryTreeNode n5 = new BinaryTreeNode(5);
		BinaryTreeNode n4 = new BinaryTreeNode(4);
		
		n8.connectTreeNode(null, n7);
		n7.connectTreeNode(null, n6);
		n6.connectTreeNode(null, n5);
		n5.connectTreeNode(null, n4);
		
		System.out.println("----------------BEFORE------------");
		n8.printTree();
		System.out.println("----------------AFTER-------------");
		BinaryTreeNode mirror = q19.mirrorTree(n8);
		mirror.printTree();
	}
	
	// 测试只有一个结点的二叉树
	@Test
	public void testMirrorTree4() {
		BinaryTreeNode n8 = new BinaryTreeNode(8);
		
		System.out.println("----------------BEFORE------------");
		n8.printTree();
		System.out.println("----------------AFTER-------------");
		BinaryTreeNode mirror = q19.mirrorTree(n8);
		mirror.printTree();
	}
	
}

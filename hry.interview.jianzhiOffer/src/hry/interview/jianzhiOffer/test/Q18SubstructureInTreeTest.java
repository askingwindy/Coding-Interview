package hry.interview.jianzhiOffer.test;

import static org.junit.Assert.*;
import hry.interview.jianzhiOffer.BinaryTreeNode;
import hry.interview.jianzhiOffer.Q18SubstructureInTree;

import org.junit.Before;
import org.junit.Test;

public class Q18SubstructureInTreeTest {
	Q18SubstructureInTree q18 = new Q18SubstructureInTree();
	
	// 树中结点含有分叉，树B是树A的子结构
	//  			 8                8
	//			 /       \           / \
	//			8         7         9   2
	//		  /   \
	//		 9     2
	//			  / \
	//           4   7
	@Test
	public void testHasSubtree1() {
		BinaryTreeNode a1 = new BinaryTreeNode(8);
		BinaryTreeNode a2 = new BinaryTreeNode(8);
		BinaryTreeNode a3 = new BinaryTreeNode(7);
		BinaryTreeNode a4 = new BinaryTreeNode(9);
		BinaryTreeNode a5 = new BinaryTreeNode(2);
		BinaryTreeNode a6 = new BinaryTreeNode(4);
		BinaryTreeNode a7 = new BinaryTreeNode(7);
		
		a1.connectTreeNode(a2, a3);
		a2.connectTreeNode(a4, a5);
		a5.connectTreeNode(a6, a7);
		
		BinaryTreeNode b1 = new BinaryTreeNode(8);
		BinaryTreeNode b2 = new BinaryTreeNode(9);
		BinaryTreeNode b3 = new BinaryTreeNode(2);
		
		b1.connectTreeNode(b2, b3);
		
		assertEquals(true, q18.hasSubtree(a1, b1));
	}
	
	
	// 树中结点含有分叉，树B是树A的子结构
	//  			 8                8
	//			 /       \           / \
	//			8         7         9   2
	//		  /   \
	//		 9     3
	//			  / \
	//           4   7
	@Test
	public void testHasSubtree2() {
		BinaryTreeNode a1 = new BinaryTreeNode(8);
		BinaryTreeNode a2 = new BinaryTreeNode(8);
		BinaryTreeNode a3 = new BinaryTreeNode(7);
		BinaryTreeNode a4 = new BinaryTreeNode(9);
		BinaryTreeNode a5 = new BinaryTreeNode(3);
		BinaryTreeNode a6 = new BinaryTreeNode(4);
		BinaryTreeNode a7 = new BinaryTreeNode(7);
		
		a1.connectTreeNode(a2, a3);
		a2.connectTreeNode(a4, a5);
		a5.connectTreeNode(a6, a7);
		
		BinaryTreeNode b1 = new BinaryTreeNode(8);
		BinaryTreeNode b2 = new BinaryTreeNode(9);
		BinaryTreeNode b3 = new BinaryTreeNode(2);
		
		b1.connectTreeNode(b2, b3);
		
		assertEquals(false, q18.hasSubtree(a1, b1));
	}
	
	// 树中结点只有左子结点，树B是树A的子结构
	//  			8                  8
	//			   /                   / 
	//			8                   9   
	//		   /                    /
	//		9                    2
	//	   /      
	//   2        
	// /
	//5
	@Test
	public void testHasSubtree3() {
		BinaryTreeNode a1 = new BinaryTreeNode(8);
		BinaryTreeNode a2 = new BinaryTreeNode(8);
		BinaryTreeNode a3 = new BinaryTreeNode(9);
		BinaryTreeNode a4 = new BinaryTreeNode(2);
		BinaryTreeNode a5 = new BinaryTreeNode(5);

		
		a1.connectTreeNode(a2, null);
		a2.connectTreeNode(a3, null);
		a3.connectTreeNode(a4, null);
		a4.connectTreeNode(a5, null);
		
		BinaryTreeNode b1 = new BinaryTreeNode(8);
		BinaryTreeNode b2 = new BinaryTreeNode(9);
		BinaryTreeNode b3 = new BinaryTreeNode(2);
		
		b1.connectTreeNode(b2, null);
		b2.connectTreeNode(b3, null);
		
		assertEquals(true, q18.hasSubtree(a1, b1));
	}
	
	// 树中结点只有左子结点，树B是树A的子结构
	//  			8                  8
	//			   /                   / 
	//			8                   9   
	//		   /                    /
	//		9                    3
	//	   /      
	//   2        
	// /
	//5
	@Test
	public void testHasSubtree4() {
		BinaryTreeNode a1 = new BinaryTreeNode(8);
		BinaryTreeNode a2 = new BinaryTreeNode(8);
		BinaryTreeNode a3 = new BinaryTreeNode(9);
		BinaryTreeNode a4 = new BinaryTreeNode(2);
		BinaryTreeNode a5 = new BinaryTreeNode(5);

		
		a1.connectTreeNode(a2, null);
		a2.connectTreeNode(a3, null);
		a3.connectTreeNode(a4, null);
		a4.connectTreeNode(a5, null);
		
		BinaryTreeNode b1 = new BinaryTreeNode(8);
		BinaryTreeNode b2 = new BinaryTreeNode(9);
		BinaryTreeNode b3 = new BinaryTreeNode(3);
		
		b1.connectTreeNode(b2, null);
		b2.connectTreeNode(b3, null);
		
		assertEquals(false, q18.hasSubtree(a1, b1));
	}
	
	// 树中结点只有右子结点，树B是树A的子结构
	//  8                   8
	//   \                   \ 
	//    8                   9   
	//     \                   \
	//      9                   2
	//       \      
	//        2        
	//         \
	//          5
	@Test
	public void testHasSubtree5() {
		BinaryTreeNode a1 = new BinaryTreeNode(8);
		BinaryTreeNode a2 = new BinaryTreeNode(8);
		BinaryTreeNode a3 = new BinaryTreeNode(9);
		BinaryTreeNode a4 = new BinaryTreeNode(2);
		BinaryTreeNode a5 = new BinaryTreeNode(5);

		
		a1.connectTreeNode(null, a2);
		a2.connectTreeNode(null, a3);
		a3.connectTreeNode(null, a4);
		a4.connectTreeNode(null, a5);
		
		BinaryTreeNode b1 = new BinaryTreeNode(8);
		BinaryTreeNode b2 = new BinaryTreeNode(9);
		BinaryTreeNode b3 = new BinaryTreeNode(2);
		
		b1.connectTreeNode(null, b2);
		b2.connectTreeNode(null, b3);
		
		assertEquals(true, q18.hasSubtree(a1, b1));
	}
	
	// 树中结点只有右子结点，树B是树A的子结构
	//  8                   8
	//   \                   \ 
	//    8                   9   
	//     \                 /  \
	//      9               3    2
	//       \      
	//        2        
	//         \
	//          5
	@Test
	public void testHasSubtree6() {
		BinaryTreeNode a1 = new BinaryTreeNode(8);
		BinaryTreeNode a2 = new BinaryTreeNode(8);
		BinaryTreeNode a3 = new BinaryTreeNode(9);
		BinaryTreeNode a4 = new BinaryTreeNode(2);
		BinaryTreeNode a5 = new BinaryTreeNode(5);

		
		a1.connectTreeNode(null, a2);
		a2.connectTreeNode(null, a3);
		a3.connectTreeNode(null, a4);
		a4.connectTreeNode(null, a5);
		
		BinaryTreeNode b1 = new BinaryTreeNode(8);
		BinaryTreeNode b2 = new BinaryTreeNode(9);
		BinaryTreeNode b3 = new BinaryTreeNode(3);
		BinaryTreeNode b4 = new BinaryTreeNode(2);
		
		b1.connectTreeNode(null, b2);
		b2.connectTreeNode(b3, b4);
		
		assertEquals(false, q18.hasSubtree(a1, b1));
	}
	
	// 树A为空树
	@Test
	public void testHasSubtree7() {
	
		BinaryTreeNode b1 = new BinaryTreeNode(8);
		BinaryTreeNode b2 = new BinaryTreeNode(9);
		BinaryTreeNode b3 = new BinaryTreeNode(3);
		BinaryTreeNode b4 = new BinaryTreeNode(2);
		
		b1.connectTreeNode(null, b2);
		b2.connectTreeNode(b3, b4);
		
		assertEquals(false, q18.hasSubtree(null, b1));
	}
	
	// 树B为空树
	@Test
	public void testHasSubtree8() {
	
		BinaryTreeNode a1 = new BinaryTreeNode(8);
		
		assertEquals(false, q18.hasSubtree(a1, null));
	}
	
	// 树AB为空树
	@Test
	public void testHasSubtree9() {		
		assertEquals(false, q18.hasSubtree(null, null));
	}
}

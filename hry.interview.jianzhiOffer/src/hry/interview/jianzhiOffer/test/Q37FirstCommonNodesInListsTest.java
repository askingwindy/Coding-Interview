package hry.interview.jianzhiOffer.test;

import static org.junit.Assert.assertEquals;
import hry.interview.jianzhiOffer.ListNode;
import hry.interview.jianzhiOffer.Q37FirstCommonNodesInLists;

import org.junit.Test;

public class Q37FirstCommonNodesInListsTest {
	private Q37FirstCommonNodesInLists q37 = new Q37FirstCommonNodesInLists();
	// 第一个公共结点在链表中间
	// 1 - 2 - 3 \
	//	            6 - 7
	//	     4 - 5 /
	@Test
	public void testFindFirstCommonNode1() {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		ListNode n6 = new ListNode(6);
		ListNode n7 = new ListNode(7);
		
		n1.connectListNode(n2);
		n2.connectListNode(n3);
		n3.connectListNode(n6);
		
		n4.connectListNode(n5);
		n5.connectListNode(n6);
		n6.connectListNode(n7);
		
		assertEquals(n6, q37.findFirstCommonNode(n1, n4));

	}
	// 没有公共结点
	// 1 - 2 - 3 - 4
	//	            
	// 5 - 6 - 7
	@Test
	public void testFindFirstCommonNode2() {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		ListNode n6 = new ListNode(6);
		ListNode n7 = new ListNode(7);
		
		n1.connectListNode(n2);
		n2.connectListNode(n3);
		n3.connectListNode(n4);
		
		n5.connectListNode(n6);
		n6.connectListNode(n7);
		
		assertEquals(null, q37.findFirstCommonNode(n1, n5));
	}
	
	// 公共结点是最后一个结点
	// 1 - 2 - 3 - 4 \
	//	                7
	//	         5 - 6 /
	@Test
	public void testFindFirstCommonNode3() {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		ListNode n6 = new ListNode(6);
		ListNode n7 = new ListNode(7);
		
		n1.connectListNode(n2);
		n2.connectListNode(n3);
		n3.connectListNode(n4);
		n4.connectListNode(n7);
		
		n5.connectListNode(n6);
		n6.connectListNode(n7);
		
		assertEquals(n7, q37.findFirstCommonNode(n1, n5));
	}
	
	// 公共结点是第一个结点
	// 1 - 2 - 3 - 4 - 5
	// 两个链表完全重合   
	@Test
	public void testFindFirstCommonNode4() {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);

		
		n1.connectListNode(n2);
		n2.connectListNode(n3);
		n3.connectListNode(n4);
		n4.connectListNode(n5);

		
		assertEquals(n1, q37.findFirstCommonNode(n1, n1));
	}
	// 输入的两个链表有一个空链表
	@Test
	public void testFindFirstCommonNode5() {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);

		
		n1.connectListNode(n2);
		n2.connectListNode(n3);
		n3.connectListNode(n4);
		n4.connectListNode(n5);

		
		assertEquals(null, q37.findFirstCommonNode(n1, null));
	}
	// 输入的两个链表都是空链表
	@Test
	public void testFindFirstCommonNode6() {
		assertEquals(null, q37.findFirstCommonNode(null, null));
	}
}

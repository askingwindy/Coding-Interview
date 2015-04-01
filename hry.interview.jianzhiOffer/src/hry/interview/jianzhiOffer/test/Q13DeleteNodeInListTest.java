package hry.interview.jianzhiOffer.test;

import hry.interview.jianzhiOffer.ListNode;
import hry.interview.jianzhiOffer.Q13DeleteNodeInList;

import org.junit.Test;

public class Q13DeleteNodeInListTest {
	Q13DeleteNodeInList q13 = new Q13DeleteNodeInList();
	
	private void test(ListNode head, ListNode delete){
		ListNode.printList(head);
		System.out.println("Delete " + delete.toString());
		ListNode.printList(q13.deleteNode(head, delete));
		System.out.println();
	}

	@Test
	public void testDeleteNode1() {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		
		n1.connectListNode(n2);
		n2.connectListNode(n3);
		n3.connectListNode(n4);
		n4.connectListNode(n5);
		
		test(n1, n3);
	}
	
	@Test
	public void testDeleteNode2() {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		
		n1.connectListNode(n2);
		n2.connectListNode(n3);
		n3.connectListNode(n4);
		n4.connectListNode(n5);
		
		test(n1, n5);
	}
	
	@Test
	public void testDeleteNode3() {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		
		n1.connectListNode(n2);
		n2.connectListNode(n3);
		n3.connectListNode(n4);
		n4.connectListNode(n5);
		
		test(n1, n1);
	}
	
	@Test
	public void testDeleteNode4() {
		ListNode n1 = new ListNode(1);
		test(n1, n1);
	}

}

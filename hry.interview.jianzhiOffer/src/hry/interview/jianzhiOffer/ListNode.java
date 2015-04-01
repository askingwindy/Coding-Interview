package hry.interview.jianzhiOffer;

public class ListNode {
	int val;
	ListNode next;
	public ListNode(int x){
		this.val = x;
		this.next = null;
	}
	
	
	@Override
	public String toString() {
		return "ListNode [val=" + val + "]";
	}


	public void connectListNode(ListNode node){
		this.next = node;
	}
	
	public static void printList(ListNode head){
		if(head == null){
			System.out.println( "null");
			return;
		}
		while(head.next!= null){
			System.out.print(head.val + "-->");
			head = head.next;
		}
		System.out.println(head.val);
	}
}

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

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + val;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ListNode other = (ListNode) obj;
		if (val != other.val)
			return false;
		return true;
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

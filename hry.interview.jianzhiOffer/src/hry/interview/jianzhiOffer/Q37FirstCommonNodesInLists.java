package hry.interview.jianzhiOffer;

/**
 * 37题，两个链表的重合点
 * 可以用：栈、hash表，以及普通的长度差计算（不占用多余空间，BEST）
 * @author RY
 *
 */
public class Q37FirstCommonNodesInLists {
	/**
	 * 先得到两个链表的长度，然后得到长度差k
	 * 长的链表先走k步，再同时往前走，第一个相遇的点就是结果
	 * @param root1
	 * @param root2
	 * @return
	 */
	public ListNode findFirstCommonNode(ListNode root1, ListNode root2){
		if(root1==null || root2 == null){
			return null;
		}
		int len1 = getLen(root1);
		int len2 = getLen(root2);
		
		int diff = len2-len1;
		ListNode longer = root2;
		ListNode shorter = root1;
		
		if(len2 < len1){
			diff = len1 - len2;
			longer = root1;
			shorter = root2;
		}
		
		for(int i=0; i<diff; i++){
			longer = longer.next;
		}
		
		while(longer != null && shorter != null){
			if(longer == shorter){
				return longer;
			}
			longer = longer.next;
			shorter = shorter.next;
		}
		return null;
	}
	
	/**
	 * 得到链表的长度
	 * @param root
	 * @return
	 */
	private int getLen(ListNode root){
		ListNode head = root;
		int count = 0;
		while(head != null){
			head = head.next;
			++count;
		}
		return count;
	}
}

package hry.interview.jianzhiOffer;

/**
 * 以O(1)的时间删除一个节点
 * @author RY
 *
 */
public class Q13DeleteNodeInList {

	/**
	 * 删除一个节点需要考虑三种情况：头阶段、尾节点、普通节点
	 * @param root
	 * @param delete
	 * @return
	 */
	public ListNode deleteNode(ListNode root, ListNode delete){
		if(root == null || delete == null){
			return root;
		}
		if(root == delete){//头节点
			root = root.next;
			return root;
		}else if(delete.next == null){//尾节点
			return deleteTailNode(root);
		}else{//普通节点
			delete.val = delete.next.val;
			delete.next = delete.next.next;
			return root;
		}
	}
	private ListNode deleteTailNode(ListNode root){
		if(root == null){
			return root;
		}else if(root.next == null){
			root = null;
			return null;
		}
		ListNode head = root;
		while(head.next.next != null){
			head = head.next;
		}
		head.next = null;
		return root;
	}
}

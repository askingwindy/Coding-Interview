package hry.interview.jianzhiOffer;

/**
 * ��O(1)��ʱ��ɾ��һ���ڵ�
 * @author RY
 *
 */
public class Q13DeleteNodeInList {

	/**
	 * ɾ��һ���ڵ���Ҫ�������������ͷ�׶Ρ�β�ڵ㡢��ͨ�ڵ�
	 * @param root
	 * @param delete
	 * @return
	 */
	public ListNode deleteNode(ListNode root, ListNode delete){
		if(root == null || delete == null){
			return root;
		}
		if(root == delete){//ͷ�ڵ�
			root = root.next;
			return root;
		}else if(delete.next == null){//β�ڵ�
			return deleteTailNode(root);
		}else{//��ͨ�ڵ�
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

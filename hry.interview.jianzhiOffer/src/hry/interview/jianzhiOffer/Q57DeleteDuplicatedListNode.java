package hry.interview.jianzhiOffer;

/**
 * ɾ�������ظ��Ľڵ�
 * �Լ�ͨ��leetcode��֤��https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
 * @author RY
 *
 */
public class Q57DeleteDuplicatedListNode {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
        	return head;
        }
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = head;
        while(cur != null){
        	int val = cur.val;
        	while(cur.next != null && val == cur.next.val){
        		cur = cur.next;
        	}
        	//�ص��ڣ�curͣ�������һ���ظ��Ľڵ���
        	//��ô�ж�pre��cur,cur.next֮��Ĺ�ϵ��
        	if(pre.next != cur && cur.val == val){
        		cur = cur.next;
        		pre.next = cur;
        	}else{
        		pre = cur;
        		cur = cur.next;
        	}
        }
        return dummy.next;
    }
}

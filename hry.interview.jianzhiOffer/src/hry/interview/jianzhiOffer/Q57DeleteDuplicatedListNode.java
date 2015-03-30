package hry.interview.jianzhiOffer;

/**
 * 删除所有重复的节点
 * 以及通过leetcode验证：https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
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
        	//重点在：cur停在了最后一个重复的节点上
        	//怎么判定pre，cur,cur.next之间的关系？
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

package hry.interview.jianzhiOffer;

/**
 * 57题，求环装链表的入口处
 * 已通过leetcode验证：https://leetcode.com/problems/linked-list-cycle-ii/
 * @author RY
 *
 */
public class Q56EntryNodeInListLoop {
    /**
     * 思路：快慢指针第一次相遇后，慢指针回到head处，他们以相同的1步步速前进
     * 相遇的那个位置就是环装链表的入口处
     * @param head
     * @return
     */
    public ListNode detectCycle(ListNode head) {
        if(head == null){
        	return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        while(fast != null && fast.next != null){
        	fast = fast.next.next;
        	slow = slow.next;
        	if(fast == slow){
        		flag = true;
        		break;
        	}
        }
        if(!flag){
        	return null;
        }
        slow = head;
        while(slow != fast){
        	slow = slow.next;
        	fast = fast.next;
        }
        return fast;
    }
}

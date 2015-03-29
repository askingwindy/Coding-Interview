package hry.interview.jianzhiOffer;

/**
 * 57�⣬��װ�������ڴ�
 * ��ͨ��leetcode��֤��https://leetcode.com/problems/linked-list-cycle-ii/
 * @author RY
 *
 */
public class Q56EntryNodeInListLoop {
    /**
     * ˼·������ָ���һ����������ָ��ص�head������������ͬ��1������ǰ��
     * �������Ǹ�λ�þ��ǻ�װ�������ڴ�
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

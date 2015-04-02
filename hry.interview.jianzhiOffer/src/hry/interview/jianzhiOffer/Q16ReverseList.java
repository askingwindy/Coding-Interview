package hry.interview.jianzhiOffer;

/**
 * 16题，反转链表
 * 已通过lintcode测试：http://lintcode.com/en/problem/reverse-linked-list/#
 * @author RY
 *
 */
public class Q16ReverseList {
    /**
     * @param head: The head of linked list.
     * @return: The new head of reversed linked list.
     */
    public ListNode reverse(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode pre = null;
        ListNode cur = head;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}

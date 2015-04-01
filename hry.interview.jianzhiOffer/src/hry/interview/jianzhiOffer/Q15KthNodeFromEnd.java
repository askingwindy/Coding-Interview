package hry.interview.jianzhiOffer;

/**
 * 删除链表倒数第k个节点
 * 已通过leetcode验证：https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 * @author RY
 *
 */
public class Q15KthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || n <=0){
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        for(int i=0;i<n; i++){
            if(head != null){
                head = head.next;
            }else{
                return head;
            }
        }
        ListNode delete = dummy.next;
        ListNode pre = dummy;
        while(head != null){
            head = head.next;
            pre = delete;
            delete = delete.next;
        }
        pre.next = delete.next;
        return dummy.next;
    }
}

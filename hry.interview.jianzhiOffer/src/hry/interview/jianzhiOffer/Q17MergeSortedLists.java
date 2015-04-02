package hry.interview.jianzhiOffer;

/**
 * 17题，将两个有序链表合二为一
 * 已通过Lintcode验证：http://lintcode.com/en/problem/merge-two-sorted-lists/#
 * @author RY
 *
 */
public class Q17MergeSortedLists {
    /**
     * @param ListNode l1 is the head of the linked list
     * @param ListNode l2 is the head of the linked list
     * @return: ListNode head of linked list
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // write your code here
        if(l1 == null && l2==null){
            return null;
        }else if(l1==null || l2==null){
            return l1!=null?l1:l2;
        }
        
        ListNode min = l1;
        ListNode max = l2;
        if(l1.val > l2.val){
            min = l2;
            max = l1;
        }
        
        ListNode head = min;
        min = min.next;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        while(min!= null && max != null){
            if(min.val < max.val){
                head.next = min;
                min = min.next;
            }else if(min.val >= max.val){
                head.next = max;
                max = max.next;
            }
            head = head.next;
        }
        if(min == null){
            head.next = max;
        }else if(max == null){
            head.next = min;
        }
        return dummy.next;
    }
}

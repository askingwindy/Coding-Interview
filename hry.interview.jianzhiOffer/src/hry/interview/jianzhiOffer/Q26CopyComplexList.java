package hry.interview.jianzhiOffer;

/**
 * 26题，复杂链表的深拷贝
 * @author RY
 *
 */
public class Q26CopyComplexList {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null){
            return head;
        }
        RandomListNode dummy = new RandomListNode(-1);
        dummy.next = head;
        while(head != null){
            RandomListNode temp = new RandomListNode(head.label);
            temp.next = head.next;
            head.next = temp;
            head = temp.next;
        }
        head = dummy.next;
        while(head != null){
            if(head.random != null)
                head.next.random = head.random.next;
            head = head.next.next;
        }
        head = dummy.next;
        RandomListNode copyDummy = new RandomListNode(-1);
        RandomListNode copy = head.next;
        copyDummy.next = copy;
        while(head != null){
            head.next = head.next.next;
            if(copy.next !=null)
                copy.next = copy.next.next;
            head = head.next;
            copy = copy.next;
        }
        return copyDummy.next;
    }
}

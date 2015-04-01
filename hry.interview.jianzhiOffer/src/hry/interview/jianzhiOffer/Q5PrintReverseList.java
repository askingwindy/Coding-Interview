package hry.interview.jianzhiOffer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *第5题，将链表逆序输出
 * @author RY
 *
 */
public class Q5PrintReverseList {
	public List<Integer> printListReverse(ListNode head){
		List<Integer> rst= new ArrayList<Integer>();
		if(head==null){
			return rst;
		}
		Stack<Integer> stack = new Stack<Integer>();
		while(head != null){
			stack.push(head.val);
		}
		while(!stack.isEmpty()){
			rst.add(stack.pop());
		}
		return rst;
	}
}

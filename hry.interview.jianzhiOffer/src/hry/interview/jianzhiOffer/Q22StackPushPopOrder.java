package hry.interview.jianzhiOffer;

import java.util.Stack;

/**
 * 22题，判断出栈顺序
 * @author RY
 *
 */
public class Q22StackPushPopOrder {
	/**
	 * 需要一个辅助栈
	 * 如果下个弹出的数字恰好是栈顶元素，那么直接弹出；
	 * 如果不是，把压栈序列中没有入栈的数字继续压入，直到找到需要弹出的数字为止
	 * 如果连所有数字压栈后没有找到下一个数字，返回false
	 * @param push
	 * @param pop
	 * @return
	 */
	public boolean isPopOrder(int[]push, int[]pop){
		if(push==null || pop==null){
			return false;
		}
		if(push.length != pop.length){
			return false;
		}
		
		Stack<Integer> stack = new Stack<Integer>();
		int i = 0;
		int j = 0;
		for(;j<pop.length; j++){
			while(stack.isEmpty() || stack.peek() != pop[j]){
				// 当辅助栈的栈顶元素不是要弹出的元素,先压入一些数字入栈
				if(i == push.length){
					// 如果所有数字都压入辅助栈了，退出循环
					break;
				}
				stack.push(push[i++]);
			}
			if(stack.peek() != pop[j]){
				break;
			}
			stack.pop();
		}
		if(stack.isEmpty() && j==pop.length){
			return true;
		}
		return false;

	}
}

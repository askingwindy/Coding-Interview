package hry.interview.jianzhiOffer;

import java.util.Stack;

/**
 * 通过两个栈模拟队列
 * 已通过Lintcode验证：http://lintcode.com/en/problem/implement-queue-by-two-stacks/#
 * @author RY
 *
 */
public class Q7QueueWithTwoStacks {
	
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public Q7QueueWithTwoStacks() {
       // do initialization if necessary
       stack1 = new Stack<Integer>();
       stack2 = new Stack<Integer>();
    }
    
    public void push(int element) {
        // write your code here
        stack1.push(element);
    }

    public int pop() {
        // write your code here
        stack1Tostack2();
        return stack2.pop();
    }

    public int top() {
        // write your code here
        stack1Tostack2();
        return stack2.peek();
    }
    
    private void stack1Tostack2(){
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
    }
}

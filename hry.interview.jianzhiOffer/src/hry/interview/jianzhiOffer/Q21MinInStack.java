package hry.interview.jianzhiOffer;

import java.util.Stack;

/**
 * 21�⣬O(1)��ʱ��õ���СԪ��
 * ��ͨ��leetcode��֤��https://leetcode.com/problems/min-stack/
 * @author RY
 *
 */
public class Q21MinInStack {
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> minStack = new Stack<Integer>();
    
    public void push(int x) {
        if(minStack.isEmpty()||x <= minStack.peek()){
            minStack.push(x);
        }
        stack.push(x);    
    }

    public void pop() {
        if(stack.isEmpty()) return;
        if(minStack.peek() >= stack.peek()){//note:why >= ? 
            minStack.pop();
        } 
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

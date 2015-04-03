package hry.interview.jianzhiOffer;

import java.util.Stack;

/**
 * 22�⣬�жϳ�ջ˳��
 * @author RY
 *
 */
public class Q22StackPushPopOrder {
	/**
	 * ��Ҫһ������ջ
	 * ����¸�����������ǡ����ջ��Ԫ�أ���ôֱ�ӵ�����
	 * ������ǣ���ѹջ������û����ջ�����ּ���ѹ�룬ֱ���ҵ���Ҫ����������Ϊֹ
	 * �������������ѹջ��û���ҵ���һ�����֣�����false
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
				// ������ջ��ջ��Ԫ�ز���Ҫ������Ԫ��,��ѹ��һЩ������ջ
				if(i == push.length){
					// ����������ֶ�ѹ�븨��ջ�ˣ��˳�ѭ��
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

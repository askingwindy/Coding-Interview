package hry.interview.jianzhiOffer;

import java.util.Deque;
import java.util.LinkedList;

/**
 * �󻬶��������ֵ
 * �ؼ��㣺˫�˶��У������д���ܳ�Ϊ���ֵ������Index
 * @author RY
 *
 */
public class Q65MaxInSlidingWindow {
	
	/**
	 * ע��corner case:
	 * windowSize == 0 �Լ�nums.length < windowSize
	 * @param nums
	 * @param windowSize
	 * @return
	 */
	public Integer[] maxInWindows(Integer[] nums, int windowSize){
		if(nums==null || nums.length==0){
			return nums;
		}
		
		if(windowSize == 0 || nums.length < windowSize){
			return null;
		}
		Integer[]result = new Integer[nums.length-windowSize+1];
		
		Deque<Integer> queue = new LinkedList<Integer>();
		
		for(int i=0; i<windowSize; i++){
			while(!queue.isEmpty() && nums[i]>=nums[queue.getLast()]){
				queue.pollLast();
			}
			queue.offerLast(i);
		}
		int count = 0;
		for(int i=windowSize; i<nums.length; i++){
			result[count++] = nums[queue.getFirst()];
			
			while(!queue.isEmpty() && nums[i]>=nums[queue.getLast()]){
				queue.pollLast();
			}
			if(!queue.isEmpty() && queue.getFirst() <= (i-windowSize)){
				queue.pollFirst();
			}
			queue.offerLast(i);
		}
		//�������һ��ֵ��ѭ�������
		result[count] = nums[queue.peekFirst()];
		return result;
	}
}

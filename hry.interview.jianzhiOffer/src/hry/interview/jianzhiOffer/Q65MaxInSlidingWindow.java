package hry.interview.jianzhiOffer;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 求滑动窗口最大值
 * 关键点：双端队列，队列中存可能成为最大值的数的Index
 * @author RY
 *
 */
public class Q65MaxInSlidingWindow {
	
	/**
	 * 注意corner case:
	 * windowSize == 0 以及nums.length < windowSize
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
		//！！最后一个值在循环外求得
		result[count] = nums[queue.peekFirst()];
		return result;
	}
}

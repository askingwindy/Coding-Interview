package hry.interview.jianzhiOffer;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * lintcode:  
 * Median II: 按照输入流的顺序求出输入流的中位数（利用最大堆与最小堆）：http://lintcode.com/en/problem/median-ii/
 * @author RY
 *
 */
public class Q64StreamMedian {
    /**
     * 利用最大堆存储左边的数，最小堆存储右边的数
     * 为了得到中位数，必须让最大堆.size()与最小堆.size()之差<=1
     * 所以当数目为奇数个时，插入最大堆；否则插入最小堆；
     * 同时需要保证最大堆的所有数字<=最小堆的所有数字（堆顶元素比较）
     * @param nums
     * @return
     */
    public int[] medianII(int[] nums) {
        // write your code here
        if(nums==null || nums.length == 0){
            return nums;
        }
        
        Queue<Integer> min = new PriorityQueue<Integer>();
        Queue<Integer> max = new PriorityQueue<Integer>(nums.length, new Comparator<Integer>(){
			@Override
			public int compare(Integer arg0, Integer arg1) {
				return arg1.compareTo(arg0);
			}
        });
        int[] result =new int[nums.length];
        for(int i=0; i<nums.length; i++){
        	if((i&0x01)==0){
        		//数目为奇数个，加入最大堆（左边）
        		max.add(nums[i]);       		
        	}else{
        		//数目为偶数个,加入最小堆
        		min.add(nums[i]);
        	}
        	if(i > 0){
        		//最小堆不为空
    		    int leftMax = max.peek();
        		int rightMin = min.peek();
            	while(leftMax > rightMin){
            	    max.poll();
            	    min.poll();
            		max.add(rightMin);
            		min.add(leftMax);
            		leftMax = max.peek();
            		rightMin = min.peek();
            	}
        	}
        	result[i] = max.peek();
        }
        
        return result;
    }
}

/**
 * lintcode:
 * Median : 求数组中的中位数（利用快速排序）：http://lintcode.com/en/problem/median/
 * @author RY
 *
 */
class Q64Median{
    /**
     * 利用快速排序找到中位数
     * @param nums
     * @return
     */
    public int median(int[] nums) {
        // write your code here
        if(nums==null || nums.length == 0){
            return -1;
        }
        
        if(nums.length == 1){
            return nums[0];
        }else if(nums.length ==2){
            return nums[0];
        }
        
        int kth = (nums.length&0x01)==1?nums.length/2:(nums.length/2-1);
        
        return getKth(nums, 0, nums.length-1, kth);
    }
    
    private int getKth(int[]nums, int left, int right, int k){
        int partition = partition(nums, left, right);
        if(partition == k){
            return nums[partition];
        }else if(partition < k){
            return getKth(nums, partition+1, right, k);
        }else{
            return getKth(nums, left, partition-1, k);
        }
    }
    
    private int partition(int[]nums, int left, int right){
        int start = left, end = right+1, key = nums[left];
        while(true){
            while(nums[++start]<key){
                if(start == right){
                    break;
                }
            }
            while(nums[--end] > key){
                if(end == left){
                    break;
                }
            }
            if(start >= end){
                break;
            }
            swap(nums, start, end);
        }
        swap(nums, left, end);
        return end;
    }
    private void swap(int[]nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}

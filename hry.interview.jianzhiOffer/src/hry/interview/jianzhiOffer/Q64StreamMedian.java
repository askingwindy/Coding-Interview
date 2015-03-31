package hry.interview.jianzhiOffer;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * lintcode:  
 * Median II: ������������˳���������������λ����������������С�ѣ���http://lintcode.com/en/problem/median-ii/
 * @author RY
 *
 */
public class Q64StreamMedian {
    /**
     * �������Ѵ洢��ߵ�������С�Ѵ洢�ұߵ���
     * Ϊ�˵õ���λ��������������.size()����С��.size()֮��<=1
     * ���Ե���ĿΪ������ʱ���������ѣ����������С�ѣ�
     * ͬʱ��Ҫ��֤���ѵ���������<=��С�ѵ��������֣��Ѷ�Ԫ�رȽϣ�
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
        		//��ĿΪ���������������ѣ���ߣ�
        		max.add(nums[i]);       		
        	}else{
        		//��ĿΪż����,������С��
        		min.add(nums[i]);
        	}
        	if(i > 0){
        		//��С�Ѳ�Ϊ��
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
 * Median : �������е���λ�������ÿ������򣩣�http://lintcode.com/en/problem/median/
 * @author RY
 *
 */
class Q64Median{
    /**
     * ���ÿ��������ҵ���λ��
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

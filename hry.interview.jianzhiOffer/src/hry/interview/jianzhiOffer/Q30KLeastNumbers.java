package hry.interview.jianzhiOffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 30题，求出最小的k个数
 * 类似Lintcode的：ktht largest Element:http://lintcode.com/en/problem/kth-largest-element/#
 * @author RY
 *
 */
public class Q30KLeastNumbers {
    //param k : description of k
    //param numbers : array of numbers
    //return: description of return
    public Integer[] getLestNumbers(Integer[]input,int k) {
    	if(input==null || input.length == 0 || k ==0 || k>input.length){
    		return null;
    	}
    	Integer[]output = new Integer[k];
    	
    	Queue<Integer> heap = new PriorityQueue<Integer>(k, new Comparator<Integer>(){

			@Override
			public int compare(Integer arg0, Integer arg1) {
				return arg1.compareTo(arg0);
			}
    		
    	});
    	
    	for(int i=0; i<input.length; i++){
    		if(heap.isEmpty() || heap.size()< k){
    			heap.add(input[i]);
    		}else if(heap.size()==k && input[i] < heap.peek()){
    			heap.poll();
    			heap.add(input[i]);
    		}
    	}
    	
    	for(int i=0; i<k; i++){
    		output[i] = heap.poll();
    	}
    	Arrays.sort(output);
    	return output;
    }   
}

package hry.interview.jianzhiOffer;

import java.util.Arrays;

/**
 * 36题，统计数组中的逆序对
 * @author RY
 *
 */
public class Q36InversePairs {
	/**
	 * 统计逆序对是一个归并排序的过程
	 * @param data
	 * @return
	 */
	public int inversePair(int[] data){
		if(data == null || data.length <=0){
			return 0;
		}
		
		int[] copy = new int[data.length];
		
		int count = inversePairHelper(data, copy,0, data.length-1);
		return count;
	}

	/**
	 * 归并排序的divide方法
	 * @param data
	 * @param copy
	 * @param start
	 * @param end
	 * @return
	 */
	private int inversePairHelper(int[] data, int[] copy, int start, int end) {
		if(start == end){
			copy[start] = data[start];
			return 0;
		}
		int mid = (start+end)/2;
		
		int left = inversePairHelper(data, copy, start, mid);
		int right = inversePairHelper(data, copy, mid+1, end);
		
		return left+right + merge(data, copy, start, end, mid);
	}
	
	/**
	 * 归并排序的merge方法
	 * 注意：要将copy拷贝回data数组！！
	 * @param data
	 * @param copy
	 * @param start
	 * @param end
	 * @param mid
	 * @return
	 */
	private int merge(int[] data, int[] copy, int start, int end, int mid) {
		//i是前半段第一个数字的下标
		int i = start;
		//j是后半段第一个数字的下标
		int j = mid+1;
	
		int indexCopy  = start;
		int count = 0;
		
		while(i <= mid && j<= end){
			if(data[i] > data[j]){
				copy[indexCopy++] = data[i++];
				count += (end-j+1);
			}else{
				copy[indexCopy++] = data[j++];
			}
		}
		
		for(; i<=mid ; ++i){
			copy[indexCopy++] = data[i];
		}
		for(;j<=end; ++j){
			copy[indexCopy++] = data[j];
		}
		//!!!!important:要将copy拷贝回data数组！！
		for(i=start; i<=end; i++){
			data[i] = copy[i];
		}
		return count;
	
	}
}

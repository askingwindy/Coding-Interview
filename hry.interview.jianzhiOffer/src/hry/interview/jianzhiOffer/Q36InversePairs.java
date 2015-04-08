package hry.interview.jianzhiOffer;

import java.util.Arrays;

/**
 * 36�⣬ͳ�������е������
 * @author RY
 *
 */
public class Q36InversePairs {
	/**
	 * ͳ���������һ���鲢����Ĺ���
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
	 * �鲢�����divide����
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
	 * �鲢�����merge����
	 * ע�⣺Ҫ��copy������data���飡��
	 * @param data
	 * @param copy
	 * @param start
	 * @param end
	 * @param mid
	 * @return
	 */
	private int merge(int[] data, int[] copy, int start, int end, int mid) {
		//i��ǰ��ε�һ�����ֵ��±�
		int i = start;
		//j�Ǻ��ε�һ�����ֵ��±�
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
		//!!!!important:Ҫ��copy������data���飡��
		for(i=start; i<=end; i++){
			data[i] = copy[i];
		}
		return count;
	
	}
}

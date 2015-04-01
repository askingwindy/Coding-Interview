package hry.interview.jianzhiOffer;

/**
 * 按照某种规则将数组重排
 * @author RY
 *
 */
public class Q14ReorderArray {
	/**
	 * @param array
	 */
	public void reorder(int[] array){
		if(array == null || array.length == 0){
			return;
		}
		int left = 0;
		int right = array.length-1;
		while(left < right){
			while(left < right && getCondition(array[left])){
				left ++;
			}
			while(left < right && !getCondition(array[right])){
				right --;
			}
			if(left < right){
				int temp = array[left];
				array[left] = array[right];
				array[right] = temp;
			}
		}
	}
	private boolean getCondition(int num){
		if((num & 0x01)==1){
			return true;
		}else{
			return false;
		}
	}
}

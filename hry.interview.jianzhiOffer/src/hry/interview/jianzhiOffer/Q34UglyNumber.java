package hry.interview.jianzhiOffer;

/**
 * 34�⣬�õ�����
 * ������ֻ��������2,3,5����
 * Ȼ������һ��������1
 * @author RY
 *
 */
public class Q34UglyNumber {
	/**
	 * @param index
	 * @return
	 */
	public int getUglyNumber(int index){
		if(index <= 0){
			return 0;
		}
		
		int[] numbers = new int[index];
		numbers[0] = 1;
		int nextIndex = 1;
		
		int mul2 = 0;//numbers[mul2]*2 = M2 
		int mul3 = 0;//numbers[mul3]*3 = M3
		int mul5 = 0;//numbers[mul5]*5 = M5
		
		while(nextIndex < index){
			int min = Math.min(numbers[mul2]*2, 
								Math.min(numbers[mul3]*3, numbers[mul5]*5));
			numbers[nextIndex] = min;
			
			while(numbers[mul2]*2 <= numbers[nextIndex]){
				//M2*2һ����ĳ������
				++mul2;
			}
			while(numbers[mul3]*3 <= numbers[nextIndex]){
				//M3*3һ���Ǹ�����
				++mul3;
			}
			while(numbers[mul5]*5 <= numbers[nextIndex]){
				//M5*5һ���Ǹ�����
				++mul5;
			}
			++nextIndex;
		}
		return numbers[nextIndex-1];
		
	}
}

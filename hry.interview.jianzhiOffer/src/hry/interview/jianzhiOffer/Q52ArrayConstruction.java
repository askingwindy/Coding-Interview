package hry.interview.jianzhiOffer;

/**
 * 构建一个乘积数组
 * @author RY
 *
 */
public class Q52ArrayConstruction {
	/**
	 * @param A 输入的数组
	 * @param B 需要得到的乘积数组
	 */
	public void multiply(Integer[] A, Integer[] B){
		if(A==null || A.length == 0 || B==null || A.length != B.length){
			return;
		}
		
		B[0] = 1;
		for(int i=1; i<A.length; i++){
			B[i] = B[i-1]*A[i-1];
		}
		Integer temp = 1;
		for(int i=A.length-2; i>=0; i--){
			temp = temp*A[i+1];
			B[i] = B[i]*temp;
		}
		
	}
}

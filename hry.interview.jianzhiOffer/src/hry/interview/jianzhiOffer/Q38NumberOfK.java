package hry.interview.jianzhiOffer;

/**
 * 38��,�ҵ����������������г��ֵĴ���
 * ��leetcode��search for a range����ͬ���������ҵ�һ����Χ
 * ��ͨ��leetcode��֤��https://leetcode.com/problems/search-for-a-range/
 * @author RY
 *
 */
public class Q38NumberOfK {
    /**
     * ͨ�����ַ����ҵ���߽����ұ߽�
     * @param A
     * @param target
     * @return
     */
    public int[] searchRange(int[] A, int target) {
    	if(A==null || A.length == 0){
    		return null;
    	}
		 int[] rst = {-1,-1};
		 
		 int left = 0, right = A.length-1;
		 while(left + 1 < right){
		     int mid = (left + right)/2;
		     if(A[mid] == target){
		         right = mid;
		     }else if(A[mid] < target){
		         left = mid;
		     }else if(A[mid] > target){
		         right = mid;
		     }
		 }
		 int firstPos = -1;
		 if(A[left] == target){
		     firstPos = left;
		 }else if(A[right] == target){
		     firstPos = right;
		 }else{
		     return rst;
		 }
		 
		 left = 0;
		 right = A.length -1;
		 while(left + 1< right){
		     int mid = (left + right)/2;
		     if(A[mid] == target){
		         left = mid;
		     }else if(A[mid] < target){
		         left = mid;
		     }else if(A[mid] > target){
		         right = mid;
		     }
		 }
		 int secondPos = -1;
		 if(A[right] == target){
		     secondPos = right;
		 }else if(A[left] == target){
		     secondPos = left;
		 }else{
		     return rst;
		 }
		 rst[0] = firstPos;
		 rst[1] = secondPos;
		 return rst;
	}
}

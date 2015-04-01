package hry.interview.jianzhiOffer;

/**
 * 在翻转的数组中查找一个数字
 * 已通过Lintcode验证：http://lintcode.com/en/problem/search-in-rotated-sorted-array/#
 * @author RY
 *
 */
public class Q8AppendexSearchInrRotatedSortedArray {
    /** 
     *@param A : an integer rotated sorted array
     *@param target :  an integer to be searched
     *return : an integer
     */
    public int search(int[] A, int target) {
        // write your code here
        if(A==null || A.length == 0){
            return -1;
        }
        int left  = 0;
        int right = A.length-1;
        while(left+1<right){
            int mid = left + (right-left)/2;
            if(A[mid] == target){
                return mid;
            }
            if(A[mid] < A[right]){
                if(A[mid]<=target && target<=A[right]){
                    left = mid;
                }else{
                    right = mid;
                }
            }else{
                if(A[left]<=target && target <= A[mid]){
                    right = mid;
                }else{
                    left = mid;
                }
            }
        }
        if(A[left] == target){
            return left;
        }else if(A[right] == target){
            return right;
        }
        return -1;
    }
}

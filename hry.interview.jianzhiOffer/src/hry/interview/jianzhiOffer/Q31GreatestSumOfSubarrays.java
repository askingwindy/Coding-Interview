package hry.interview.jianzhiOffer;

/**
 * 31题，连续子数组的最大和
 * 已通过Leetcode：https://leetcode.com/problems/maximum-subarray/
 * @author RY
 *
 */
public class Q31GreatestSumOfSubarrays {
    /**
     * 贪心算法，总是得到最大值；如果值小于0，下次从0开始计算
     * @param A
     * @return
     */
    public int maxSubArray(int[] A) {
        if(A==null || A.length == 0){
            return -1;
        }
        int max = A[0];
        int cur = A[0];
        for(int i=1; i<A.length; i++){
            if(cur <= 0){
                cur = 0;
            }
            cur += A[i];
            max = Math.max(cur, max);
        }
        return max;
    }
}

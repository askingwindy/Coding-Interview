package hry.interview.jianzhiOffer;

/**
 * 31�⣬���������������
 * ��ͨ��Leetcode��https://leetcode.com/problems/maximum-subarray/
 * @author RY
 *
 */
public class Q31GreatestSumOfSubarrays {
    /**
     * ̰���㷨�����ǵõ����ֵ�����ֵС��0���´δ�0��ʼ����
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

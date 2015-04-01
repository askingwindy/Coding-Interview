package hry.interview.jianzhiOffer;


/**
 * 求得二进制数字中1的个数
 * 已通过leetcode验证：https://leetcode.com/problems/number-of-1-bits/
 * @author RY
 *
 */
public class Q10NumberOf1InBinary {
    /**
     * 思路是：n&(n-1)会将最后边的1变为0
     * @param n
     * @return
     */
    public int hammingWeight(int n) {
        int count = 0;
        while(n !=0){
            count +=1;
            n = n&(n-1);
        }
        return count;
    }
}

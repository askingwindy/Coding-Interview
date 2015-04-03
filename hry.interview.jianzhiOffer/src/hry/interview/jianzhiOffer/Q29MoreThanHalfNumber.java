package hry.interview.jianzhiOffer;

import java.util.ArrayList;

/**
 * 29题，数组中出线次数超过一半的数字
 * 已通过Lintcode验证：http://lintcode.com/en/problem/majority-number/#
 * @author RY
 *
 */
public class Q29MoreThanHalfNumber {
    /**
     * @param nums: a list of integers
     * @return: find a  majority number
     */
    public int majorityNumber(ArrayList<Integer> nums) {
        if(nums==null || nums.size()==0){
            return Integer.MIN_VALUE;
        }
        int num = nums.get(0);
        int count = 1;
        for(int i=1; i<nums.size(); i++){
            int cur = nums.get(i);
            if(cur == num){
                ++count;
            }else{
                --count;
            }
            if(count == 0){
                num = cur;
                count = 1;
            }
        }
        return num;
    }
}

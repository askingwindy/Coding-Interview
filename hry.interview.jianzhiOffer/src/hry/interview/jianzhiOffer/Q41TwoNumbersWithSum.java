package hry.interview.jianzhiOffer;

import java.util.HashMap;

/**
 * 41题，在数组中找到两个数和为target
 * 注:leetcode中返回的是下标，所以不能重排序后利用前后指针（复杂度高）
 * 可以存在hashMap中，
 * 已通过Leetcode验证：https://leetcode.com/problems/two-sum/
 * @author RY
 *
 */
public class Q41TwoNumbersWithSum {
    /**
     * 注意陷阱：{3,2,4},6
     * 需要判定6-3=3是否在map中，但是这个3已经被利用了！
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum(int[] numbers, int target) {
        if(numbers==null || numbers.length == 0){
            return numbers;
        }
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<numbers.length; i++){
            map.put(numbers[i], i);
        }
        int[]rst = new int[2];
        for(int i=0; i<numbers.length; i++){
            if(map.containsKey(target-numbers[i])){
                int rst1 = i+1;
                int rst2 = map.get(target-numbers[i])+1;
                if(rst1==rst2){
                    continue;//IMPRTANT
                }
                rst[0] = Math.min(rst1, rst2);
                rst[1] = Math.max(rst1, rst2);
                return rst;
            }
        }

        return rst;
    }
}

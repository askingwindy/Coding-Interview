package hry.interview.jianzhiOffer;

import java.util.ArrayList;
import java.util.List;

/**
 * 28题，字符串的排序
 * 已通过leetcode验证：https://leetcode.com/problems/permutations/
 * @author RY
 *
 */
public class Q28StringPermutation {
    public List<List<Integer>> permute(int[] num) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(num == null || num.length ==0){
            return result;
        }
        boolean[] used = new boolean[num.length];
        helper(num, used, result, new ArrayList<Integer>());
        return result;
    }
    private void helper(int[]num, boolean[]used, List<List<Integer>> result, List<Integer> rst){
        if(rst.size()==num.length){
            result.add(new ArrayList<Integer>(rst));
            return;
        }
        for(int i=0; i<num.length; i++){
            if(used[i]){
                continue;
            }
            rst.add(num[i]);
            used[i] = true;
            helper(num, used, result, rst);
            rst.remove(rst.size()-1);
            used[i] = false;
        }
    }
}

package hry.interview.jianzhiOffer;

import java.util.HashMap;

/**
 * 41�⣬���������ҵ���������Ϊtarget
 * ע:leetcode�з��ص����±꣬���Բ��������������ǰ��ָ�루���Ӷȸߣ�
 * ���Դ���hashMap�У�
 * ��ͨ��Leetcode��֤��https://leetcode.com/problems/two-sum/
 * @author RY
 *
 */
public class Q41TwoNumbersWithSum {
    /**
     * ע�����壺{3,2,4},6
     * ��Ҫ�ж�6-3=3�Ƿ���map�У��������3�Ѿ��������ˣ�
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

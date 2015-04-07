package hry.interview.jianzhiOffer;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 33题，输入一个正整数，将数字拼接为最小的数
 * （leetcode是拼接为最大的数，这里按照leetcoe来做
 * 已通过Leetcode验证：https://leetcode.com/problems/largest-number/）
 * @author RY
 *
 */
public class Q33SortArrayForMinNumber {
    /**
     * 注意一些边界条件
     * 1. 如果String 太大，怎么破？可以换为Long，如果Long无法承受，自己写个比较方法
     * 2. 如果是[0,0]=>“00”，[0]=>“0"怎么区分结果？
     * @param num
     * @return
     */
    public String largestNumber(int[] num) {
        if(num==null || num.length == 0){
            return "";
        }
        String[] array = new String[num.length];
        for(int i=0; i<num.length; i++){
        	array[i] = String.valueOf(num[i]);
        }
        Arrays.sort(array, new Comparator<String>(){

			@Override
			public int compare(String arg0, String arg1) {
				String sb01 =arg0+arg1;
				String sb10 =arg1+arg0;
				return -(int)(Long.parseLong(sb01)-Long.parseLong(sb10));
			}
        	
        });
        StringBuilder sb = new StringBuilder();
        for(String i:array){
        	sb.append(i);
        }
        String rst = sb.toString();
        int begin = 0;
        for(;begin<rst.length(); begin++){
            if(rst.charAt(begin) != '0'){
                break;
            }
        }
        String tmp = rst.substring(begin);
        return tmp.equals("")?"0":tmp;
    }
}

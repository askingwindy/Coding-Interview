package hry.interview.jianzhiOffer;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 33�⣬����һ����������������ƴ��Ϊ��С����
 * ��leetcode��ƴ��Ϊ�����������ﰴ��leetcoe����
 * ��ͨ��Leetcode��֤��https://leetcode.com/problems/largest-number/��
 * @author RY
 *
 */
public class Q33SortArrayForMinNumber {
    /**
     * ע��һЩ�߽�����
     * 1. ���String ̫����ô�ƣ����Ի�ΪLong�����Long�޷����ܣ��Լ�д���ȽϷ���
     * 2. �����[0,0]=>��00����[0]=>��0"��ô���ֽ����
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

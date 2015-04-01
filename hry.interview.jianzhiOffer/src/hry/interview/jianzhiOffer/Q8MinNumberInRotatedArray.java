package hry.interview.jianzhiOffer;

/**
 * �ӷ�ת�������������ҵ���С��
 * NOTE������num[end]��Ƚ�
 * ��ͨ��Lintcode��֤
 * @author RY
 *
 */
public class Q8MinNumberInRotatedArray {
    /**
     * ��Ŀ1�������ת������û���ظ�Ԫ��
     * ��ͨ��Lintcode��֤��http://lintcode.com/en/problem/find-minimum-in-rotated-sorted-array/#
     * @param num
     * @return
     */
    public int findMin(int[] num) {
        // write your code here
        if(num==null || num.length == 0){
            return Integer.MAX_VALUE;
        }
        int left = 0;
        int right = num.length -1;
        while(left+1<right){
            int mid = left + (right-left)/2;
            if(num[mid]< num[right]){// NOTE������num[end]��Ƚ�
                right = mid;
            }else if(num[mid] > num[right]){// NOTE������num[end]��Ƚ�
                left = mid;
            }
        }
        return num[left]<num[right]?num[left]:num[right];
    }
    
    /**
     * ��Ŀ2�������ת�������ظ�Ԫ��
     * ��ͨ��Lintcode��֤��http://lintcode.com/en/problem/find-minimum-in-rotated-sorted-array-ii/#
     * @param num
     * @return
     */
    public int findMinII(int[] num) {
        if(num==null || num.length==0){
            return Integer.MAX_VALUE;
        }
        int left = 0;
        int right = num.length-1;
        while(left+1<right){
            int mid = left + (right-left)/2;
            if(num[mid] < num[right]){// NOTE������num[end]��Ƚ�
                right = mid;
            }else if(num[mid] > num[right]){// NOTE������num[end]��Ƚ�
                left = mid;
            }else if(num[mid] == num[right]){// NOTE������num[end]��Ƚ�
                right = right -1;
            }
        }
        return num[left]<num[right]?num[left]:num[right];
    }
}

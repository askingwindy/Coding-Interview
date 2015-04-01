package hry.interview.jianzhiOffer;

/**
 * 从翻转的排序数组中找到最小数
 * NOTE：是与num[end]相比较
 * 已通过Lintcode验证
 * @author RY
 *
 */
public class Q8MinNumberInRotatedArray {
    /**
     * 题目1：这个翻转的数组没有重复元素
     * 已通过Lintcode验证：http://lintcode.com/en/problem/find-minimum-in-rotated-sorted-array/#
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
            if(num[mid]< num[right]){// NOTE：是与num[end]相比较
                right = mid;
            }else if(num[mid] > num[right]){// NOTE：是与num[end]相比较
                left = mid;
            }
        }
        return num[left]<num[right]?num[left]:num[right];
    }
    
    /**
     * 题目2：这个翻转链表有重复元素
     * 已通过Lintcode验证：http://lintcode.com/en/problem/find-minimum-in-rotated-sorted-array-ii/#
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
            if(num[mid] < num[right]){// NOTE：是与num[end]相比较
                right = mid;
            }else if(num[mid] > num[right]){// NOTE：是与num[end]相比较
                left = mid;
            }else if(num[mid] == num[right]){// NOTE：是与num[end]相比较
                right = right -1;
            }
        }
        return num[left]<num[right]?num[left]:num[right];
    }
}

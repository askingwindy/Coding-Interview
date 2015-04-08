package hry.interview.jianzhiOffer;

import java.util.ArrayList;
import java.util.List;

/**
 * 40题，数组中找出只出现一次的数字（有两个数字只出现了一次，其他都出现两次）
 * 已通过lintcode验证：http://lintcode.com/en/problem/single-number-iii/#
 * @author RY
 *
 */
public class Q40NumbersAppearOnce {
    public List<Integer> singleNumberIII(int[] A) {
        // write your code here
        if(A==null || A.length == 0){
            return null;
        }
        int tmp = 0;
        for(int i=0; i<=A.length-1; i++){
            tmp ^= A[i];
        }
        int kth = -1;
        for(int i=31; i>=0; i--){
            if(((tmp>>i)&0x01) == 1){
                kth = i;
                break;
            }
        }
        
        if(kth == -1){
            return null;
        }
        
        int res1 = 0;
        int res2 = 0;
        for(int i=0; i<A.length; i++){
            if(((A[i]>>kth)&0x01) == 1){
                res1 ^= A[i];
            }else{
                res2 ^= A[i];
            }
        }
        List<Integer> rst = new ArrayList<Integer>();
        rst.add(res1);
        rst.add(res2);
        return rst;
    }
    
    public static void main(String[] args){
    	int[] A = {
    		1,2,3,3,2,4,1,5	
    	};
    	new Q40NumbersAppearOnce().singleNumberIII(A);
    }
}

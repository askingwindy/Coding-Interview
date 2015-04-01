package hry.interview.jianzhiOffer;

/**
 * 11题，实现Pow方法
 * 已通过leetcode验证：https://leetcode.com/problems/powx-n/
 * @author RY
 *
 */
public class Q11Power {
    public double pow(double x, int n) {
        if(x == 0){
            return 0;
        }else if(x == 1){
            return 1;
        }
        if(n==0){
            return 1;
        }if(n == 1){
            return x;
        }else if( n == -1){
            return 1/x;
        }
        
        boolean nega = false;
        if(n < 0){
            nega = true;
            n = Math.abs(n);
        }
        int k = n/2;
        int l = n- k*2;
        double ans1 = pow(x, k);
        double ans2 = pow(x, l);
        double ans = ans1*ans1*ans2;
        if(!nega){
            return ans;
        }else{
            return 1/ans;
        }
    }
}

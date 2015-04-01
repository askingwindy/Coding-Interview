package hry.interview.jianzhiOffer;

/**
 * 9题，得到斐波拉契数列
 * @author RY
 *
 */
public class Q9Fibonacci {
	public long fibonacci(int n){
		if(n<= 0){
			return 0;
		}else if(n==1){
			return 1;
		}
		long fiOne = 0;
		long fiTwo = 1;
		for(int i=2;i<=n; i++){
			long fiTemp = fiOne + fiTwo;
			fiOne = fiTwo;
			fiTwo = fiTemp;
		}
		return fiTwo;
	}
}

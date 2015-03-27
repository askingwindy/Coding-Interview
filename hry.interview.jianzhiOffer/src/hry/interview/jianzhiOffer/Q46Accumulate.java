package hry.interview.jianzhiOffer;

/**
 * 验证：JAVA中数组构造时是否会调用构造函数？？？否
 * @author RY
 *
 */
public class Q46Accumulate {
	private static int n=0;
	private static int sum = 0;
	
	public Q46Accumulate(){
		n += 1;
		sum += n;
	}
	
	public void sum(int n){
		Q46Accumulate[] array = new Q46Accumulate[n];
		//与c++不同，数组在构造时被置为null，并没有调用构造函数 array = {null,null,null}
		System.out.println(sum);
	}
	
	public static void main(String[] args){
		Q46Accumulate q = new Q46Accumulate();
		q.sum(10);
		//输出为1
	}
}

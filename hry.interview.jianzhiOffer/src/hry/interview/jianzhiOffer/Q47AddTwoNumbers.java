package hry.interview.jianzhiOffer;

public class Q47AddTwoNumbers {
	public int add(int num1, int num2){
		int sum = 0;
		int carry =0;
		do{
			//对于没有进位的二进制加法而言，异或与加法效果一致
			sum = num1^num2;
			//对于进位而言，0+0,0+1,1+0都不会产生进位，只有1+1才有，所有做与运输，并左移一位即可
			carry = (num1 & num2)<<1;
			
			num1 = sum;
			num2 = carry;
		}while(num2 !=0);
		
		return num1;
	}
}

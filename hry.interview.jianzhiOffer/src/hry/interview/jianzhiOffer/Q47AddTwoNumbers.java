package hry.interview.jianzhiOffer;

public class Q47AddTwoNumbers {
	public int add(int num1, int num2){
		int sum = 0;
		int carry =0;
		do{
			//����û�н�λ�Ķ����Ƽӷ����ԣ������ӷ�Ч��һ��
			sum = num1^num2;
			//���ڽ�λ���ԣ�0+0,0+1,1+0�����������λ��ֻ��1+1���У������������䣬������һλ����
			carry = (num1 & num2)<<1;
			
			num1 = sum;
			num2 = carry;
		}while(num2 !=0);
		
		return num1;
	}
}

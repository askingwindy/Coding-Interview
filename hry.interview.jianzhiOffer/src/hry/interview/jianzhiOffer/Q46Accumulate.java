package hry.interview.jianzhiOffer;

/**
 * ��֤��JAVA�����鹹��ʱ�Ƿ����ù��캯����������
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
		//��c++��ͬ�������ڹ���ʱ����Ϊnull����û�е��ù��캯�� array = {null,null,null}
		System.out.println(sum);
	}
	
	public static void main(String[] args){
		Q46Accumulate q = new Q46Accumulate();
		q.sum(10);
		//���Ϊ1
	}
}

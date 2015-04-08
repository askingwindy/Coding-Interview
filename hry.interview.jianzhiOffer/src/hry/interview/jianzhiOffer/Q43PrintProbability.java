package hry.interview.jianzhiOffer;


/**
 * @author RY
 *�õ��˿��Ƴ��ִ����ĸ���
 */
public class Q43PrintProbability {
	private final int MAX_NUM = 6;
	public void printProbability(int number){
		if(number < 1){
			return;
		}
		int[][] pProbabilities = new int[2][MAX_NUM*number+1];
		
		int flag = 0;
		//��ʼ����һ�����飬1...6���ֵĴ�������1
		for(int i=1; i<= MAX_NUM; i++){
			pProbabilities[flag][i] = 1;
		}
		
		for(int k=2; k<=number; ++k){
			//��С��k�ĵ�����Ϊ0�������ʱk=3����ô��С����Ϊ3��1,2��������0�Σ�
			for(int i=0; i<k; ++i){
				pProbabilities[1-flag][i] = 0;
			}
			//�õ�k..MAX_NUM*k�ĵ����ĳ��ִ���
			for(int i=k; i<=MAX_NUM*k; ++i){
				//��ʼ��
				pProbabilities[1-flag][i] = 0;
				//i���ֵĴ�������һ�����ӵ���i-1,i-2..i-6��ͬ����
				for(int j=1; j<=i && j<=MAX_NUM; j++){
					pProbabilities[1-flag][i] += pProbabilities[flag][i-j];
				}
			}
			//����˳��
			flag = 1-flag;
		}
		double total = Math.pow(MAX_NUM, number);
		for(int i=number; i<=MAX_NUM*number; ++i){
			double radio = (double)pProbabilities[flag][i]/total;
			System.out.println("����:"+i+" ��Ƶ��Ϊ��"+radio);
		}
		
	}
    public static void main( String[] args ) throws ClassNotFoundException
    {
    	new Q43PrintProbability().printProbability(1);
    	new Q43PrintProbability().printProbability(2);
    	new Q43PrintProbability().printProbability(3);
    	new Q43PrintProbability().printProbability(4);
    	new Q43PrintProbability().printProbability(11);
    }
}

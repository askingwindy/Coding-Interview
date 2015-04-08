package hry.interview.jianzhiOffer;


/**
 * @author RY
 *得到扑克牌出现次数的概率
 */
public class Q43PrintProbability {
	private final int MAX_NUM = 6;
	public void printProbability(int number){
		if(number < 1){
			return;
		}
		int[][] pProbabilities = new int[2][MAX_NUM*number+1];
		
		int flag = 0;
		//初始化第一个数组，1...6出现的次数都是1
		for(int i=1; i<= MAX_NUM; i++){
			pProbabilities[flag][i] = 1;
		}
		
		for(int k=2; k<=number; ++k){
			//将小于k的点数置为0（如果此时k=3，那么最小点数为3；1,2点数出现0次）
			for(int i=0; i<k; ++i){
				pProbabilities[1-flag][i] = 0;
			}
			//得到k..MAX_NUM*k的点数的出现次数
			for(int i=k; i<=MAX_NUM*k; ++i){
				//初始化
				pProbabilities[1-flag][i] = 0;
				//i出现的次数由上一次骰子点数i-1,i-2..i-6共同决定
				for(int j=1; j<=i && j<=MAX_NUM; j++){
					pProbabilities[1-flag][i] += pProbabilities[flag][i-j];
				}
			}
			//交换顺序
			flag = 1-flag;
		}
		double total = Math.pow(MAX_NUM, number);
		for(int i=number; i<=MAX_NUM*number; ++i){
			double radio = (double)pProbabilities[flag][i]/total;
			System.out.println("数字:"+i+" 的频率为："+radio);
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

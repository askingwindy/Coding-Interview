package hry.interview.jianzhiOffer;


import java.util.Arrays;

/**
 * �鿴һ�����Ƿ���˳��
 * 2-10Ϊ�����ֱ���AΪ1�� JΪ11, QΪ12, KΪ13, ��С��Ϊ0
 * ˼·�����������gap�ֶ��ٸ�����С���ĸ����Ƿ������gap
 * @author RY
 */
public class Q44ContinousCards {
	public boolean isContinuous(int[] num){
		if(num== null || num.length==0){
			return false;
		}
		Arrays.sort(num);
		
		int numZero = 0;
		int numGap = 0;
		//ͳ��0�ĸ���
		for(int i=0; i<num.length; i++){
			if(num[i]==0){
				numZero += 1;
			}
		}
		//ͳ��gap����
		//IMPORTANT:��Ҫ�ӵ�һ������0�����ֿ�ʼ����
		for(int i=numZero; i<num.length-1; i++){
			if(num[i+1] == num[i]+1){
				continue;
			}else if(num[i+1]==num[i]){//���ӣ�����˳��
				return false;
			}else{
				numGap += num[i+1]-num[i]-1;
			}
		}
		return numGap>numZero?false:true;		
	}
	
}

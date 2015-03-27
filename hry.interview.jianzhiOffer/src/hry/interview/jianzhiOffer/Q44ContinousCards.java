package hry.interview.jianzhiOffer;


import java.util.Arrays;

/**
 * 查看一副牌是否是顺子
 * 2-10为牌数字本身，A为1， J为11, Q为12, K为13, 大小王为0
 * 思路：看牌里面的gap又多少个，大小王的个数是否能填充gap
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
		//统计0的个数
		for(int i=0; i<num.length; i++){
			if(num[i]==0){
				numZero += 1;
			}
		}
		//统计gap个数
		//IMPORTANT:需要从第一个不是0的数字开始计数
		for(int i=numZero; i<num.length-1; i++){
			if(num[i+1] == num[i]+1){
				continue;
			}else if(num[i+1]==num[i]){//对子，不是顺子
				return false;
			}else{
				numGap += num[i+1]-num[i]-1;
			}
		}
		return numGap>numZero?false:true;		
	}
	
}

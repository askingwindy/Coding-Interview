package hry.interview.jianzhiOffer;

import java.util.ArrayList;
import java.util.List;

public class Q45LastNumberInCircle {
	public int LastRemainintSolution1(int n, int m){
		if(n<1 || m<1){
			return -1;
		}
		List<Integer> circle = new ArrayList<Integer>();
		for(int i=0; i<n; i++){
			circle.add(i);
		}
		int index = 0;
		//注意：当curIndex = 0时，index(count)=1,
		while(circle.size()!=1){
			for(int i=0; i<m; i++){			
				if(index == circle.size()-1){
					index = 0;
				}else{
					index+=1;
				}
			}
			//在删除时，必须将Index -1
			index -= 1;
			//如果Index在删除前为0，表明应该删除最后一个元素，处理稍微复杂
			if(index == -1){
				index = circle.size()-1;
				circle.remove(index);
				index = 0;
			}else{
				circle.remove(index);
			}
		}
		return circle.get(0);
	}
}

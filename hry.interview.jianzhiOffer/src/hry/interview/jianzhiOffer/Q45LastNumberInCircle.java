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
		//ע�⣺��curIndex = 0ʱ��index(count)=1,
		while(circle.size()!=1){
			for(int i=0; i<m; i++){			
				if(index == circle.size()-1){
					index = 0;
				}else{
					index+=1;
				}
			}
			//��ɾ��ʱ�����뽫Index -1
			index -= 1;
			//���Index��ɾ��ǰΪ0������Ӧ��ɾ�����һ��Ԫ�أ�������΢����
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

package hry.interview.jianzhiOffer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 找出数组中重复的数字（可能有多个）
 * @author RY
 *
 */
public class Q51DuplicationInArray {
	/**
	 * @param numbers 输入的数组
	 * @param rst 返回的是重复的值存储的数组
	 * @return 如果没有重复值，返回false
	 */
	public boolean duplicate(int[]numbers, List<Integer> rst){
		if(numbers == null || numbers.length == 0){
			return false;
		}
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0; i<numbers.length; i++){
			int cur = numbers[i];
			if(!map.containsKey(cur)){
				map.put(cur, 1);
			}else{
				if(map.get(cur)==1){
					rst.add(cur);
				}
				map.put(cur, map.get(cur)+1);
			}
		}
		if(rst.isEmpty()){
			return false;
		}else{
			return true;
		}
	}
}

package hry.interview.jianzhiOffer;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 求得s中第一个不重复的char,如果没有返回'\0'
 * @author RY
 *
 */
public class Q55FirstCharacterInStream {
	/**
	 * 利用LinkedHashMap，保证键值的插入是有序的
	 * （TreeMap是保证键值自然有序，而不是插入有序）
	 * @param s
	 * @return
	 */
	public char firstAppearOnce(String s){
		if(s==null || s.length()==0){
			return '\0';
		}
		Map<Character, Integer> map = new LinkedHashMap<Character,Integer>();
		for(int i=0; i<s.length(); i++){
			char c = s.charAt(i);
			if(map.containsKey(c)){
				map.put(c,  map.get(c)+1);
			}else{
				map.put(c, 1);
			}
		}
		char rst = '\0';
		for(char c: map.keySet()){
			if(map.get(c)==1){
				rst = c;
				break;
			}
		}
		return rst;
	}
	
	public static void main(String[] args){
		String s = "google";
		System.out.println(new Q55FirstCharacterInStream().firstAppearOnce(s));
	}
}

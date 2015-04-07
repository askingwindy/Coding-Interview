package hry.interview.jianzhiOffer;

import java.util.LinkedHashMap;
import java.util.Map;

public class Q35FirstNotRepeatingChar {

	public char firstNotRepeatingChar(String s){
		if(s==null || s.length() ==0){
			return '\0';
		}
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		for(int i=0; i<s.length(); i++){
			char cur = s.charAt(i);
			if(map.containsKey(cur)){
				map.put(cur, map.get(cur)+1);
			}else{
				map.put(cur,1);
			}
		}
		for(int i=0; i<s.length(); i++){
			char cur = s.charAt(i);
			if(map.get(cur) == 1){
				return cur;
			}
		}
		return '\0';
	}
}

package hry.interview.jianzhiOffer;

import java.util.LinkedHashMap;
import java.util.Map;

public class Q55FirstCharacterInStream {
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

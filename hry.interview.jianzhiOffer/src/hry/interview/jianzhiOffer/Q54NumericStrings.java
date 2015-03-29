package hry.interview.jianzhiOffer;

/**
 * 54题，判断一个string是否为合法的数字
 * 该数字可以是+11， 5e2, 3.13, -1e-1
 * 不合法的是：1e, 1a3, 1.2.2, +-5,1e1.2
 * 已在Leetcode上验证：https://leetcode.com/problems/valid-number/
 * @author RY
 *
 */
public class Q54NumericStrings {
    public boolean isNumber(String s) {
        if(s==null || s.length()==0){
        	return false;
        }
        s = s.trim();
        if(s.length()==0){
        	return false;
        }
        //首先要找到第一个合法的位置
        int begin = (s.charAt(0)=='+'||s.charAt(0)=='-')?1:0;
        //分别判断数字、点、e
        boolean num = false, dot = false, exp = false;
        
        while(begin < s.length()){
        	char c = s.charAt(begin);
			if(Character.isDigit(c)){
        		num = true;
        	}else if(c=='.'){
        		if(exp || dot){
        			//如果已经出现了e与.，那么再次出现.是非法的
        			return false;
        		}
        		dot = true;
        	}else if(c=='e'){
        		if(exp || !num){
        			//如果已经出现了e，或者说出现这个e时前面还没出现数字，那么非法
        			return false;
        		}
        		exp = true;
        		num = false;//为了防止1e这种情况
        	}else if(c=='+'||c=='-'){
        		//在中途遇见+/-号，那么那符号前一定是e,否则非法
        		if(s.charAt(begin-1)!='e'){
        			return false;
        		}
        	}else{
        		return false;
        	}
			++begin;
        }
        return num;
    }
}

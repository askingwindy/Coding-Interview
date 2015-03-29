package hry.interview.jianzhiOffer;

/**
 * 正则表达式的匹配
 * 已通过leetcode验证：https://leetcode.com/problems/regular-expression-matching/
 * @author RY
 *
 */
public class Q53RegularExpressionMatching {
    public boolean isMatch(String s, String p) {
        if((s==null&&p==null)||(s.length()==0 && p.length()==0)){
            return true;
        }
        
        if(s.length()==0){
            return checkEmpty(p);
        }
        if(p.length()==0){
            return false;
        }
        
        char c1 = s.charAt(0);
        char d1 = p.charAt(0);
        char d2 = '0';
        
        if(p.length()>1){
            d2 = p.charAt(1);
        }
        if(d2=='*'){
            if(compare(c1,d1)){
                return 
                        isMatch(s.substring(1), p)
                        || isMatch(s, p.substring(2));
            }else{
                return isMatch(s, p.substring(2));
            }
        }else{
            if(compare(c1,d1)){
                return isMatch(s.substring(1), p.substring(1));
            }else{
                return false;
            }
        }
        
    }
    private boolean compare(char c1, char d1){
        return d1=='.'||c1==d1;
    }
    private boolean checkEmpty(String p){
        if((p.length()&0x01) !=0)return false;
        for(int i=1; i<p.length(); i+=2){
            if(p.charAt(i)!='*'){
                return false;
            }
        }
        return true;
    }
}

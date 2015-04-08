package hry.interview.jianzhiOffer;

/**
 * 42题，翻转字符串
 * 已通过leetcode验证：https://leetcode.com/problems/reverse-words-in-a-string/
 * @author RY
 *
 */
public class Q42ReverseWordsInSetence {
	/**
	 * 最好不要对string进行直接操作，利用StringBuilder
	 * @param s
	 * @return
	 */
	public String reverseWords(String s) {
        if(s== null || s.length()==0){
            return s;
        }
        s = s.trim();
        if(s.length()==0){
            return s;
        }
        char[] array = s.toCharArray();
        reverseParts(array, 0, array.length-1);
        int left = 0, right = 1;
        StringBuilder sb = new StringBuilder();
        while(right < array.length){
            if(array[right] == ' '){
                reverseParts(array, left, right-1);
                sb.append(array,left, right-left);//append(char[] c, int offset, int length);
                sb.append(" ");
                left = right +1;
                while(array[left] == ' '){
                    ++left;
                }
                right = left;
            }
            right += 1;
        }
        reverseParts(array, left, right-1);
        sb.append(array,left, right-left);
        return sb.toString();
    }
    private void reverseParts(char[] array, int left, int right){
        if(left == right){
            return;
        }
        while(left < right){
            swap(array, left, right);  
            left++;
            right--;
        }
    }
    private void swap(char[] array, int left, int right){
        char c = array[left];
        array[left] = array[right];
        array[right] = c;
    }
    public static void main(String[] args){
    	new Q42ReverseWordsInSetence().reverseWords("  a  b  ");
    }
}

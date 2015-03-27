package hry.interview.jianzhiOffer;

/**
 * 已通过leetcode:https://leetcode.com/problems/string-to-integer-atoi/
 * 将字符串转换为int
 * NOTE：
 * 输入字符串可能含有空格：“  +12”，这是合法的，输出为12
 * 输入字符串可能为：“12ac23”，这个输出为12（标志位为false）
 * 输入字符串可能超出int大小！
 * @author RY
 *
 */
public class Q49StringToInt {
	private boolean isValid = true;
	 
    /**
     * @param str 输入的一个字符串
     * @return str转为的int数字
     */
    public int atoi(String str) {
        if(str==null || str.length()==0){
            return 0;
        }
        str = str.trim();
        
        if(str.length()==0){
            return 0;
        }
        
        int index = 0;
        int sigh = 1;
        
        char[]array = str.toCharArray();
        
        //第一位为“+/-"是合法的
        if(array[0] =='+'){
            index++;
        }else if(array[0]=='-'){
            index++;
            sigh=-1;
        }else if(array[0]<'0'||array[0]>'9'){
            isValid = false;
            return 0;
        }
        return stringToInt(array, index,sigh);
    }
	    
    /**
     * 核心程序
     * @param array 已经被处理好的char数组
     * @param index char数组的开始位置
     * @param sigh 判断返回的数字的正/负号
     * @return 一个int型的数字
     */
    private int stringToInt(char[]array, int index, int sigh){
        long rst = 0;
        for(int i=index; i<array.length; i++){
            if(array[i]<'0'||array[i]>'9'){
                isValid = false;
                break;
            }else{
                rst = rst*10 + (array[i]-'0');
                //判断此时rst是否溢出
                if(rst*sigh > Integer.MAX_VALUE){
                    isValid = false;
                    return Integer.MAX_VALUE;
                }else if(rst*sigh < Integer.MIN_VALUE){
                    isValid = false;
                    return Integer.MIN_VALUE;
                }
            }
        }
        return (int)(rst*sigh);
    }
}

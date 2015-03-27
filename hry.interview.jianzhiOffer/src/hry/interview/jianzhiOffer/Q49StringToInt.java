package hry.interview.jianzhiOffer;

/**
 * ��ͨ��leetcode:https://leetcode.com/problems/string-to-integer-atoi/
 * ���ַ���ת��Ϊint
 * NOTE��
 * �����ַ������ܺ��пո񣺡�  +12�������ǺϷ��ģ����Ϊ12
 * �����ַ�������Ϊ����12ac23����������Ϊ12����־λΪfalse��
 * �����ַ������ܳ���int��С��
 * @author RY
 *
 */
public class Q49StringToInt {
	private boolean isValid = true;
	 
    /**
     * @param str �����һ���ַ���
     * @return strתΪ��int����
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
        
        //��һλΪ��+/-"�ǺϷ���
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
     * ���ĳ���
     * @param array �Ѿ�������õ�char����
     * @param index char����Ŀ�ʼλ��
     * @param sigh �жϷ��ص����ֵ���/����
     * @return һ��int�͵�����
     */
    private int stringToInt(char[]array, int index, int sigh){
        long rst = 0;
        for(int i=index; i<array.length; i++){
            if(array[i]<'0'||array[i]>'9'){
                isValid = false;
                break;
            }else{
                rst = rst*10 + (array[i]-'0');
                //�жϴ�ʱrst�Ƿ����
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

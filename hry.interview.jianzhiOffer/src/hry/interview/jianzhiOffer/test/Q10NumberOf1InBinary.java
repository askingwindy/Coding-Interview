package hry.interview.jianzhiOffer.test;

/**
 * ��ö�����������1�ĸ���
 * ��ͨ��leetcode��֤��
 * @author RY
 *
 */
public class Q10NumberOf1InBinary {
    /**
     * ˼·�ǣ�n&(n-1)�Ὣ���ߵ�1��Ϊ0
     * @param n
     * @return
     */
    public int hammingWeight(int n) {
        int count = 0;
        while(n !=0){
            count +=1;
            n = n&(n-1);
        }
        return count;
    }
}

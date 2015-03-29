package hry.interview.jianzhiOffer;

/**
 * 54�⣬�ж�һ��string�Ƿ�Ϊ�Ϸ�������
 * �����ֿ�����+11�� 5e2, 3.13, -1e-1
 * ���Ϸ����ǣ�1e, 1a3, 1.2.2, +-5,1e1.2
 * ����Leetcode����֤��https://leetcode.com/problems/valid-number/
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
        //����Ҫ�ҵ���һ���Ϸ���λ��
        int begin = (s.charAt(0)=='+'||s.charAt(0)=='-')?1:0;
        //�ֱ��ж����֡��㡢e
        boolean num = false, dot = false, exp = false;
        
        while(begin < s.length()){
        	char c = s.charAt(begin);
			if(Character.isDigit(c)){
        		num = true;
        	}else if(c=='.'){
        		if(exp || dot){
        			//����Ѿ�������e��.����ô�ٴγ���.�ǷǷ���
        			return false;
        		}
        		dot = true;
        	}else if(c=='e'){
        		if(exp || !num){
        			//����Ѿ�������e������˵�������eʱǰ�滹û�������֣���ô�Ƿ�
        			return false;
        		}
        		exp = true;
        		num = false;//Ϊ�˷�ֹ1e�������
        	}else if(c=='+'||c=='-'){
        		//����;����+/-�ţ���ô�Ƿ���ǰһ����e,����Ƿ�
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

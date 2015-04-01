package hry.interview.jianzhiOffer;

/**
 * ��4�⣬�滻%20Ϊ�ո�
 * @author RY
 *
 */
public class Q4ReplaceBlank {
	/**
	 * ����Ҫԭchar[]�����Ͻ��в���
	 * @param string ����һ��char[]����,char[]���鳤�ȱ���Ч�ַ����ȴ�ܶ�
	 */
	public void replaceBlank(char[] string){
		if(string == null || string.length <= 2){
			return ;
		}
		int len = 0;
		int blank = 0;
		for(int i=0; i<string.length; i++){
			if(string[i] == '\0'){
				break;
			}
			if(string[i] == ' '){
				++blank;
			}else{
				++len;
			}		
		}
		if(blank == 0){
			return;
		}
		int newPoint = len + 3*blank-1;
		int oldPoint = len+blank-1;
		while(newPoint >=0){
			char old = string[oldPoint];
			if(old == ' '){
				string[newPoint--] = '0';
				string[newPoint--] = '2';
				string[newPoint--] = '%';
				oldPoint--;
			}else{
				string[newPoint--] = string[oldPoint--];
			}		
		}
	}
	
	public static void main(String[] args){
	    int length = 100;
	    String string = "hello world";
	    char[] array = new char[100];
	    for(int i=0; i<string.length(); i++){
	    	array[i] = string.charAt(i);
	    }
	    new Q4ReplaceBlank().replaceBlank(array);
	}
}

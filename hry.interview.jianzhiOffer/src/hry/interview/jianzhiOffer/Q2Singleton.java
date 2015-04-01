package hry.interview.jianzhiOffer;

/**
 * ����ģʽ�ļ���д��
 * @author RY
 *
 */

public class Q2Singleton {

}

class LazySingleton{
	//�����ʱ�ͳ�ʼ��
	private static final LazySingleton instance = new LazySingleton();
	
	private LazySingleton(){};
	
	public static LazySingleton getInstance(){
		return instance;
	}
}

class DoubleCheckSingleton{
	private static volatile DoubleCheckSingleton instance;
	
	private DoubleCheckSingleton(){}
	
	public static DoubleCheckSingleton getInstance(){
		if(instance == null){
			synchronized(DoubleCheckSingleton.class){
				if(instance == null){
					instance = new DoubleCheckSingleton();
				}
			}
		}
		return instance;
	}
}

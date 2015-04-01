package hry.interview.jianzhiOffer;

/**
 * 单例模式的几种写法
 * @author RY
 *
 */

public class Q2Singleton {

}

class LazySingleton{
	//类加载时就初始化
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

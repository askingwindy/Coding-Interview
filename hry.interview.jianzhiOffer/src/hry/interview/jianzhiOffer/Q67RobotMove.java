package hry.interview.jianzhiOffer;

public class Q67RobotMove {
	public int movingCount(int threshold, int rows, int cols){
		if(rows <= 0 || cols <=0 || threshold<0){
			return 0;
		}
		boolean[] used = new boolean[rows*cols];
		return counting(threshold, rows, cols, 0, 0, used);
	}
	private int counting(int threshold, int rows, int cols, int x, int y, boolean[]used){
		int count = 0;
		if(check(threshold, rows, cols, x, y, used)){
			used[x*cols+y] = true;
			count = 1 + 
					counting(threshold, rows, cols, x+1, y, used) +
					counting(threshold, rows, cols,x-1, y, used) +
					counting(threshold, rows, cols, x, y+1, used)+
					counting(threshold ,rows, cols, x, y-1, used);
		}
		return count;
	}
	private boolean check(int threshold, int rows, int cols, int x, int y, boolean[]used){
		if(x<0||x>=rows||y<0||y>=cols||used[x*cols+y]){
			return false;
		}
		if(change(x)+change(y) > threshold){
			return false;
		}
		return true;
	}
	private int change(int x){
		int rst = 0;
		while(x != 0){
			rst += x %10;
			x = x/10;
		}
		return rst;
	}
}

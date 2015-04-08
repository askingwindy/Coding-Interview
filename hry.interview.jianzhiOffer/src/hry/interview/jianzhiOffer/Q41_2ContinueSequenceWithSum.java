package hry.interview.jianzhiOffer;

public class Q41_2ContinueSequenceWithSum {
	public void findContinuousSequence(int sum){
		if(sum < 3){
			return;
		}
		
		int small = 1;
		int big = 2;
		int middle = (1+sum)/2;
		int curSum = big+small;
		
		while(small < middle){
			if(curSum == sum){
				printResult(small, big);
			}
			while(curSum >sum && small < middle){
				curSum -= small;
				small += 1;
				if(curSum == sum){
					printResult(small, big);
				}
			}
			big+=1;
			curSum += big;
		}
	}
	private void printResult(int small, int big){
		for(int i=small; i<=big; ++i){
			System.out.print(i + "\t");
		}
		System.out.println();
	}
}

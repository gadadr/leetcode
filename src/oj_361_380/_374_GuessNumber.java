package oj_361_380;

public class _374_GuessNumber {
	public static int guessNumber(int n) {
		long i = 1;
		long j = n;

		while(true) {
			if (guess((int) j) == 0) {
				return (int) j;
			}
			long val =  (i+j)/2;
			int x = guess((int) val);
			if (x == 0) {
				return (int) val;
			} else if (x == -1) {
				j = val;
			} else {
				i = val;
			}
		}
	}
	
	private static int guess(int val) {
		int x = 1702766719;
		if (x == val) {
			return 0;
		} else if (x < val) {
			return -1;
		} else {
			return 1;
		}
	}
}
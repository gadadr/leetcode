package _501_520;

public class _509_FibonacciNumber {

    public int fib(int N) {
        if (N<2) return N;

        int i=0, j=1;
        for (int x=2; x<=N; x++) {
            j = i+j;
            i = j-i;
        }
        return j;
    }

}

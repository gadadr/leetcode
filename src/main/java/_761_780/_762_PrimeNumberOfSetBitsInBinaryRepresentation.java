package _761_780;

import java.util.HashSet;
import java.util.Set;

public class _762_PrimeNumberOfSetBitsInBinaryRepresentation {
    static Set<Integer> primes = new HashSet<>();

    public int countPrimeSetBits(int L, int R) {
        primes.add(2);
        int answer = 0;
        for (int i=L; i<=R; i++) {
            int bits = bits(i);
            answer += primes.contains(bits) ? 1 : isPrime(bits) ?  1 : 0;
        }
        return answer;
    }

    private int bits(int n) {
        int bits = 0;
        while (n > 0) {
            if (n % 2 == 1) bits ++;
            n = n >> 1;
        }
        return bits;
    }

    private boolean isPrime(int n) {
        if (n%2 == 0 || n < 2) {
            return false;
        }

        for (int i=3; i<n/2; i+=2) {
            if (n%i == 0) {
                return false;
            }
        }
        primes.add(n);
        return true;
    }
}

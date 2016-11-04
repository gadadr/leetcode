package _341_360;

public class OJ_343_IntegerBreak {
	
	public static void main(String[] args) {
		OJ_343_IntegerBreak break1 = new OJ_343_IntegerBreak();
		break1.integerBreak(3);
	}
	
	public int integerBreak(int n) {
        if (n==0) return 0;
        
        int den = 1;
        int max = 1;
        while (den < n) {
            int rem = n%den;
            int prod = 1;
            for (int i=den; i<=n-rem; i+=den) {
                if (i==den && rem!=0) {
                    if (rem == 1 && den+rem != n) {
                        prod*= (den+rem);
                    } else {
                        prod*= den * rem;
                    }
                } else {
                    prod *= den;
                }
            }
            if (prod>=max) {
                max = prod;
                den++;
            } else {
                break;
            }
        }
        return max;
    }
}

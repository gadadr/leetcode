package _721_740;

import java.util.ArrayList;
import java.util.List;

public class _728_SelfDividingNumbers {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> selfDividingNumbersList = new ArrayList();
        for (int i=left; i<=right; i++) {
            int temp = i;
            boolean selfDividing = true;
            while (temp > 0) {
                int rem = temp % 10;
                if (rem == 0 || i % rem != 0) {
                    selfDividing = false;
                    break;
                }
                temp = temp / 10;
            }
            if (selfDividing) {
                selfDividingNumbersList.add(i);
            }
        }
        return selfDividingNumbersList;
    }
}

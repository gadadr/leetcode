package _561_580;

import java.util.*;
import java.util.stream.Collectors;

public class _575_DistributeCandles {
    public int distributeCandies(int[] candies) {
        Set<Integer> candieSet = Arrays.stream(candies).boxed().collect(Collectors.toSet());
        return candies.length/2 > candieSet.size() ? candieSet.size() : candies.length/2;
    }
}

package oj_101_120;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OJ_118_PascalsTriangle {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> outer = new ArrayList<>();
        if (numRows <= 0) {
            return outer;
        }
        List<Integer> first = new ArrayList<>(Arrays.asList(1));
        outer.add(first);
        for (int i=1; i<numRows; i++) {
            List<Integer> inner = new ArrayList<>();
            List<Integer> prev = outer.get(i-1);
            inner.add(prev.get(0));
            for (int j=0; j<prev.size()-1; j++) {
            	inner.add(prev.get(j) + prev.get(j+1));
            }
            inner.add(prev.get(prev.size()-1));
            outer.add(inner);
        }
        return outer;
    }
}

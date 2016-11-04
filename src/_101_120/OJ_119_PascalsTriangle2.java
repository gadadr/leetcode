package _101_120;

import java.util.ArrayList;
import java.util.List;

public class OJ_119_PascalsTriangle2 {
	public List<Integer> getRow(int rowIndex) {
        List<Integer> outer = new ArrayList<>();
        if (rowIndex < 0) {
            return outer;
        }
        outer.add(1);
        for (int i=1; i<=rowIndex; i++) {
            List<Integer> inner = new ArrayList<>();
            List<Integer> prev = outer;
            inner.add(prev.get(0));
            for (int j=0; j<prev.size()-1; j++) {
            	inner.add(prev.get(j) + prev.get(j+1));
            }
            inner.add(prev.get(prev.size()-1));
            outer = inner;
        }
        return outer;
    }
}

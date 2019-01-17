package _761_780;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _763_PartitionLabels {

    public List<Integer> partitionLabels(String S) {
        List<Integer> partitions = new ArrayList<>();
        for(int i=0; i<S.length(); i++) {
            LinkedList<Character> queue = new LinkedList<>();
            queue.add(S.charAt(i));
            int last = 0;
            while(!queue.isEmpty()) {
                char ch = queue.pop();
                int tempLast = S.lastIndexOf(ch);
                if (tempLast > last) {
                    for (int j=i; j<tempLast; j++) {
                        if (!queue.contains(S.charAt(j))) {
                            queue.add(S.charAt(j));
                        }
                    }
                    last = tempLast;
                }
            }
            partitions.add(last+1-i);
            i = last;
        }
        return partitions;
    }
}

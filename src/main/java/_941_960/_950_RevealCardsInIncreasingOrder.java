package _941_960;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class _950_RevealCardsInIncreasingOrder {

    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);

        int[] ans = new int[deck.length];
        Queue<Integer> queue = new LinkedList<>();
        for (int i=0; i<deck.length; i++) queue.add(i);

        for (int i=0; i<deck.length; i++) {
            int x = queue.poll();
            ans[x] = deck[i];
            queue.add(queue.poll());
        }

        return ans;
    }

    @Test
    public void test() {
        deckRevealedIncreasing(new int[]{17,13,11,2,3,5,7});
    }

}

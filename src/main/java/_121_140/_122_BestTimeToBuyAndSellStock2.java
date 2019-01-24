package _121_140;

public class _122_BestTimeToBuyAndSellStock2 {

    public int maxProfit(int[] prices) {
        int i=0, j=1, profit=0;
        for (; j<prices.length; ) {
            if (prices[i] < prices[j]) {
                while(j+1 < prices.length) {
                    if(prices[j+1] >= prices[j]) {
                        j++;
                    } else {
                        break;
                    }
                }
                profit += prices[j] - prices[i];
                i=j;
                j++;
            } else {
                i++; j++;
            }
        }
        return profit;
    }
}

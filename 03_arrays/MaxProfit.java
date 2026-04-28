/*
Intuition:

Buy at lowest, sell at highest after

Greedy
*/


public class MaxProfit {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE, profit = 0;
        for (int p : prices) {
            min = Math.min(min, p);
            profit = Math.max(profit, p - min);
        }
        return profit;
    }
}

/*
O(n), O(1)
*/
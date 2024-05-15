//•	Stock Buy/Sell to Maximize profit o The cost of a stock on each day is given in an array. Find the maximum profit that you can make by buying and selling on those days. If the given array of prices is sorted in decreasing order, then profit cannot be earned at all
//o	Input: arr[] = {100, 180, 260, 310, 40, 535, 695} o Output: 865
//o	Explanation: Buy the stock on day 0 and sell it on day 3 => 310 – 100 = 210
//Buy the stock on day 4 and sell it on day 6 => 695 – 40 = 655 Maximum Profit  = 210 + 655 = 865


public class BuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {100, 180, 260, 310, 40, 535, 695};
        int max = 0;
        int start = prices[0];
        int len = prices.length;
        for(int i = 1;i<len; i++){
            if(start < prices[i]) max += prices[i] - start;
            start = prices[i];
        }
        System.out.println(max);

    }
}

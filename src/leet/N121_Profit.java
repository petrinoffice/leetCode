package leet;

public class N121_Profit {
    public static void main(String[] args) {
        System.out.println(new N121_Profit().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(new N121_Profit().maxProfit(new int[]{7, 6, 4, 3, 1}));
        System.out.println(new N121_Profit().maxProfit(new int[]{2, 4, 1}));
        System.out.println(new N121_Profit().maxProfit(new int[]{2,1,2,0,1}));
    }

    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (min>prices[i]) {
                min = prices[i];
                continue;
            }

            maxProfit = Math.max(maxProfit, prices[i] - min);
        }

        return maxProfit;



























//        int buyPrice = prices[0];
//        int profit = 0;
//
//        for (int i = 1; i < prices.length; i++) {
//            if (buyPrice > prices[i]) {
//                buyPrice = prices[i];
//                continue;
//            }
//
//            profit = Math.max(profit, prices[i] - buyPrice);
//
//        }
//
//        return profit;
    }
}

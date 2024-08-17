package leet;

public class N122_Best_Time_to_Buy_Sell_Stock_II {
    public static void main(String[] args) {
        System.out.println(new N122_Best_Time_to_Buy_Sell_Stock_II().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    public int maxProfit(int[] prices) {
        int answer = 0;
        int prev = prices[0];

        for (int i = 1; i < prices.length; i++) {
            int sum = prices[i] - prev;
            if (sum > 0) {
                answer += sum;
            }

            prev = prices[i];
        }

        return answer;
    }
}

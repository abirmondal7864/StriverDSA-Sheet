package arraysStrings;

/**
 * LeetCode 121 – Best Time to Buy and Sell Stock
 *
 * <p>
 * Given an array where prices[i] represents the stock price on the i-th day,
 * this method returns the maximum profit achievable by buying on one day and
 * selling on a later day.
 * </p>
 *
 * <p>
 * Approach:
 * <ul>
 * <li>Track the minimum stock price encountered so far.</li>
 * <li>At each day, compute the profit if selling on that day.</li>
 * <li>Update the maximum profit accordingly.</li>
 * </ul>
 * </p>
 *
 * <p>
 * Time Complexity: O(n) – Single pass through the array<br>
 * Space Complexity: O(1) – Constant extra space
 * </p>
 *
 * @param prices an array of stock prices where prices[i] is the price on day i
 * @return the maximum profit possible; returns 0 if no profit can be made
 */
class StockBuySell {

    /**
     * Calculates the maximum profit from a single buy-sell transaction.
     *
     * @param prices array of daily stock prices
     * @return maximum profit achievable
     */
    public int maxProfit(int[] prices) {

        // Minimum price observed so far (best buying price)
        int minPrice = Integer.MAX_VALUE;

        // Maximum profit achieved so far
        int maxProfit = 0;

        // Traverse prices array
        for (int price : prices) {

            // Update minimum price if a lower price is found
            if (price < minPrice) {
                minPrice = price;
            } // Update max profit if selling today gives higher profit
            else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }
}

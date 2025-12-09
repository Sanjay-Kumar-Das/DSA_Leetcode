class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> discount = new Stack<>();
        int[] ans = new int[prices.length];
        for(int i=prices.length-1;i>=0;i--){
            while (!discount.isEmpty() && discount.peek() > prices[i]) {
                discount.pop();
            }
            ans[i] = prices[i] - (discount.isEmpty() ? 0 : discount.peek());
            discount.push(prices[i]);
        }
        return ans;
    }
}
class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int M=money;
        int i=0;
        int count=0;
        while(i<prices.length){
            if(money<prices[i]){
                return M;
            }
            money=money-prices[i];
            i++;
            count++;
            if(count==2){
                break;
            }
            if(money<0){
                return M;
            }
        }
        return money;
    }
}

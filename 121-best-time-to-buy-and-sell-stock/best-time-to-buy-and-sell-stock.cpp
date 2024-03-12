class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int n = prices.size();
        int maxR = prices[n-1];
        int maxProf = 0;
        for(int i = n - 2; i >= 0; i--){
            maxR = max(prices[i], maxR);
            maxProf = max(maxProf, maxR - prices[i]);
        }
        
        return maxProf;
        
    }
};
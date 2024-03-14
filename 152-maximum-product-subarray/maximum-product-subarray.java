class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
    int lProd = 1;
    int rProd = 1;
    int ans = nums[0];

    for (int i = 0; i < n; i++) {

      
      lProd = lProd == 0 ? 1 : lProd;
      rProd = rProd == 0 ? 1 : rProd;

    
      lProd *= nums[i];

   
      rProd *= nums[n - 1 - i];

      ans = Math.max(ans, Math.max(lProd, rProd));
    }

    return ans;
        
    }
}
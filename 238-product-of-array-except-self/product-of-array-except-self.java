class Solution {
    public int[] productExceptSelf(int[] nums) {
         // Array to store all left multiplication
    int[] l = new int[nums.length];

    // Array to store all right multiplication
    int[] r = new int[nums.length];

    l[0] = 1;
    for (int i = 1; i < nums.length; i++) {
      l[i] = l[i - 1] * nums[i - 1];
    }

    r[nums.length - 1] = 1;
    for (int i = nums.length - 2; i > -1; i--) {
      r[i] = r[i + 1] * nums[i + 1];
    }

    int[] ans = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      ans[i] = l[i] * r[i];
    }

    return ans;
  }
        
    }

public class Solution {
    public static void main(String[] args) {
        int[] param_1 = { /* your array values here */ };
        int ret = singleNumber(param_1);
        System.out.println(ret);
    }

    public static int singleNumber(int[] nums) {
        int ans = 0;
        for (int index = 0; index < nums.length; index++) {
            ans = ans ^ nums[index];
        }
        return ans;
    }
}


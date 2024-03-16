class Solution {
    public int findMin(int[] nums) {
        
  int x = 0; 
    int y = nums.length -1;
	while(x < y){
		int z= x+ (y - x)/2;
		if(nums[z]>nums[y]) x = z+1;
		else y = z;
	}
	return nums[x];
  }}
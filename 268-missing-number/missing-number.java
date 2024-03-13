import java.util.Arrays;
class Solution {
    public int missingNumber(int[] nums) {
        int length=nums.length;
         int x=0;
        int arr[]=new int[length+1];
        for(int i=0;i<arr.length;i++){
            arr[i]=i;
        }
        Arrays.sort(nums);
        if(nums[nums.length-1]!=arr[arr.length-1]){
            return arr.length-1;
        }
        else{
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=arr[i]){
                     x=arr[i];
                   break;
                }
            }
        }
        return x;
        
    
}}
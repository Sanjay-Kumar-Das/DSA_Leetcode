class Solution {
    public int missingNumber(int[] nums) {
       int n = nums.length, actualSum = 0;
       int expectSum = n*(n+1)/2;
       for(int i=0;i<n;i++){
         actualSum += nums[i];    
       } 
       return expectSum-actualSum;
    }
}
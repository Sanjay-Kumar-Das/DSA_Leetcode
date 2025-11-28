class Solution {
    public int missingNumber(int[] nums) {
       int n = nums.length, expectSum =n, actualSum = 0;
       for(int i=0;i<n;i++){
         expectSum += i;
         actualSum += nums[i];    
       } 
       return expectSum-actualSum;
    }
}
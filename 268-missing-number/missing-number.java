class Solution {
    public int missingNumber(int[] nums) {
       int n = nums.length, sum =n, sum2 = 0;
       for(int i=0;i<n;i++){
         sum += i;
         sum2 += nums[i];    
       } 
       return sum-sum2;
    }
}
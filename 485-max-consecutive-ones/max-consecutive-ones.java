class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length, count=0, ans =0;
        for(int i=0;i<n;i++){
            if(nums[i]==1) count++;
            else{
                ans = Math.max(count,ans);
                count =0;
            }
        }
        return Math.max(count,ans);
    }
}
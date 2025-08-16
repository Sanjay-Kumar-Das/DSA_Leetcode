class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length,count=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]==goal) count++;
            int sum = nums[i];
            for(int j=i+1;j<n;j++){
                sum += nums[j];
                if(sum == goal) count++;
                else if(sum > goal) break;
            }
        }
        if(nums[n-1]== goal) count++;
        return count;
    }
}
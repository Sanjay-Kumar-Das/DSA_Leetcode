class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length, count =0,left =0,zeros=0,right=0,idx=0;
        for(int ele : nums){
            if(ele==0) count++;
        }
        int[] zero = new int[count];
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                zero[idx]=i;
                idx++;
            }
        }
        count =0;idx=0;
        while(right < n){
            if(nums[right]==0){
                if(zeros < k){
                    zeros++;
                }else{
                    count = Math.max(count,right-left);
                    left= zero[idx]+1;
                    idx++;    
                }
            }
            right++;
        }
        return Math.max(count,right-left);
    }
}
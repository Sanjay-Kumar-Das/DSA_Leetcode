class Solution {
    public int[] findErrorNums(int[] nums) {
        int [] ans = new int[2];
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                ans[0] = nums[i];
            }else
                if(nums[i+1]-nums[i] == 2) ans[1]=nums[i]+1;
        }
        if(ans[1] == 0){
            ans[1] = (nums[0]>1) ? nums[0]-1 : nums[nums.length-1]+1 ;
        }
        return ans;
    }
}
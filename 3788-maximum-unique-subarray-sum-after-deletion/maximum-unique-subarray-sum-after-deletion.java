class Solution {
    public int maxSum(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) set.add(nums[i]);
        }
        int sum =0;
        for(int ele:set){
            sum+=ele;
        }
        if(sum==0){
            int mx =Integer.MIN_VALUE;
            for(int i=0;i<nums.length;i++){
                mx = Math.max(mx,nums[i]);
            }
            return mx;
        }
        return sum;
    }
}
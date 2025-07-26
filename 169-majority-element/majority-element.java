class Solution {
    public int majorityElement(int[] nums) {
        int count =0, ans =0;
        for(int ele : nums){
            if(count == 0) ans = ele;
            if(ans == ele) count++;
            else count--;
        }
        return ans;
    }
}
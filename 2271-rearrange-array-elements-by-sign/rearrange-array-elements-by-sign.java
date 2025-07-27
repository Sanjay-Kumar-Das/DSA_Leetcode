class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int posIdx = 0, negIdx = 1;
        for(int ele : nums){
           if(ele >=0){
            ans[posIdx]=ele;
            posIdx +=2;
           } else{
            ans[negIdx] = ele;
            negIdx +=2;
           }
        }
        return ans;
    }
}
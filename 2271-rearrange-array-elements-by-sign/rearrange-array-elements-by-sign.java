class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length,posIdx = 0, negIdx =0;
        int[] pos = new int[n/2];
        int[] neg = new int[n/2];
        for(int i=0;i<n;i++){
            if(nums[i]>=0 ){
                pos[posIdx]=nums[i];
                posIdx++;
            }else{
                neg[negIdx] = nums[i];
                negIdx++;
            }
        }
        int i = 0, idx = 0;
        while(i<n-1){
            nums[i] = pos[idx];
            nums[i+1]= neg[idx];
            i+=2;
            idx++;
        }
        return nums;
    }
}
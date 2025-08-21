class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int presum=0,count=0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            if(nums[i] % 2 == 0) nums[i]=0;
            else nums[i]=1;
        }
          for(int ele : nums){
            presum += ele;
            if(map.containsKey(presum-k)){
                count += map.get(presum-k);
            }
            map.put(presum,map.getOrDefault(presum,0)+1);
          }  
        
        return count;
    }
}
class Solution {
    public int subarraySum(int[] nums, int k) {
        int presum =0, count =0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
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
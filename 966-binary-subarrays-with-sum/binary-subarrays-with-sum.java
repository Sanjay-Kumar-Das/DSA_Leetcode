class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int presum =0,count =0;
        Map<Integer, Integer>map = new HashMap<>();
        map.put(0,1);
        for(int ele : nums){
            presum += ele;
            if(map.containsKey(presum-goal))
                count += map.get(presum-goal);
            map.put(presum,map.getOrDefault(presum,0)+1);
        }
        return count;
    }
}
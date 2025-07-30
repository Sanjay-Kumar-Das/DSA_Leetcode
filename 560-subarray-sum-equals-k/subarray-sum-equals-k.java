class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length, count = 0;
        int[] prefixsum = new int[n];
        prefixsum[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefixsum[i] = nums[i] + prefixsum[i - 1];
        }

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int i = 0; i < n; i++) {
            
            int val = prefixsum[i] - k;
            count += map.getOrDefault(val, 0);

            map.put(prefixsum[i], map.getOrDefault(prefixsum[i], 0) + 1);
        }

        return count;
    }
}

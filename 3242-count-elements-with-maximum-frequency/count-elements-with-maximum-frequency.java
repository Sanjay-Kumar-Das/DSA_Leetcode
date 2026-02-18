class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer>map = new HashMap<>();
        for(int ele:nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele :map.keySet()){
            int freq = map.get(ele);
            pq.add(freq);
        }
        int num = pq.remove();
        int sum =num;
        while(pq.size() != 0 && num == pq.peek()){
            sum += pq.remove();
        }
        return sum;
    }
}
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : stones){
            pq.add(ele);
        }
        while(pq.size() >1){
            int x = pq.remove();
            int y = pq.remove();
            pq.add(x-y);
        }
        return pq.remove();
    }
}
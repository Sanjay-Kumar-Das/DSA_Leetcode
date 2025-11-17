class Solution {
    public boolean canArrange(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int ele = ((arr[i] % k)+k)%k;
            map.put(ele,map.getOrDefault(ele,0)+1);
        }

        if(map.containsKey(0)){
            if(map.get(0)%2 !=0) return false;
            map.remove(0);
            }
        for(int key : map.keySet()){
            // int rem = k-key;
            if(!map.containsKey(k-key)) return false;
            //int keyfreq = map.get(key);
            int remfreq = map.get(k-key);
            if(map.get(key) != remfreq) return false;
        }
        return true;
    }
}
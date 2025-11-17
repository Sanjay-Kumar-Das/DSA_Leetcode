class Solution {
    public boolean canArrange(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int ele = ((arr[i] % k)+k)%k;
            map.put(ele,map.getOrDefault(ele,0)+1);
            // if(map.containsKey(ele)){
            //     int freq = map.get(ele);
            //     map.put(ele,freq+1);
            // }else{
            //     map.put(ele,1);
            // }
        }

        if(map.containsKey(0)){
            if(map.get(0)%2 !=0) return false;
            map.remove(0);
            }
        for(int key : map.keySet()){
            int rem = k-key;
            if(!map.containsKey(rem)) return false;
            int keyfreq = map.get(key);
            int remfreq = map.get(rem);
            if(keyfreq != remfreq) return false;
        }
        return true;
    }
}
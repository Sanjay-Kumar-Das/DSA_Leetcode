class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        Set<Integer> seen = new HashSet<>();
        for(Integer ele : map.values()){
            if(seen.contains(ele)) return false;
            seen.add(ele);
        }
        return true;
    }
}
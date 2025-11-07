class Solution {
    public int[] findEvenNumbers(int[] digits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer>ans = new ArrayList<>();
        for(int ele:digits){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        for(int i=100;i<999;i++){
            int num = i;
            int a = num % 10;  num /= 10;
            int b = num % 10;  num /= 10;
            int c = num;
            if(map.containsKey(a) && a % 2 == 0){
                int afreq = map.get(a);
                map.put(a,afreq-1);
                if(afreq == 1) map.remove(a);
                if(map.containsKey(b)){
                    int bfreq = map.get(b);
                    map.put(b,bfreq-1);
                    if(bfreq == 1) map.remove(b);
                    if(map.containsKey(c)){
                        ans.add(i);
                    }
                    map.put(b,bfreq);
                }
                map.put(a,afreq);
            }
        }
        int [] arr = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            arr[i] = ans.get(i);
        }
        return arr;
    }
}
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : magazine.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch : ransomNote.toCharArray()){
            if(map.containsKey(ch)){
                int freq = map.get(ch);
                if(freq > 0) map.put(ch,freq-1);
                else return false;
            }else return false;
        }
        return true;
    }
}
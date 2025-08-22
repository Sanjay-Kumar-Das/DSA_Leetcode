class Solution {
    public String minWindow(String s, String t) {
       String ans = "";
       int count = 0;
       Map<Character,Integer>map = new HashMap<>();
       for(int i=0;i<t.length();i++){
        char ch = t.charAt(i);
        map.put(ch,map.getOrDefault(ch,0)+1);  
       } 
       int i=0,j=0;

       while(j<s.length()){
        char ch = s.charAt(j);
        if(map.containsKey(ch)){
            if(map.get(ch)>0){
                count++;
            }
            map.put(ch,map.getOrDefault(ch,0)-1);     
        }
        while(count == t.length()){
            String str = s.substring(i,j+1);
            if(ans.length()== 0 || str.length()<ans.length()){
                ans = str;
            }
                char c = s.charAt(i);
                if(map.containsKey(c)){
                    map.put(c,map.getOrDefault(c,0)+1);
                    if(map.get(c)>0){
                        count--;
                    }                
                }
                i++;   
        }  
        j++;
       }
       return ans;
    }
}
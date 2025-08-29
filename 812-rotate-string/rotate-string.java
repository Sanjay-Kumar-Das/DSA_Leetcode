class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.equals(goal)) return true;
       StringBuilder sb = new StringBuilder(s);
       for(int i=0;i<s.length();i++){
           sb.deleteCharAt(0);
           sb.append(s.charAt(i));
           if(sb.toString().equals(goal)) return true;
       } 
       return false;
    }
}
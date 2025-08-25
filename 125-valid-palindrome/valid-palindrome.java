class Solution {
    public boolean isPalindrome(String s) {
      int n = s.length();
      if(n<2) return true;
      StringBuilder sb = new StringBuilder();

      for(int i=0;i<n;i++){
        char ch = s.charAt(i);
        if(Character.isLetterOrDigit(ch)){
         sb.append(Character.toLowerCase(ch));
        }
      }
     if(sb.toString().equals(sb.reverse().toString())) return true;
     return false;
    }
}
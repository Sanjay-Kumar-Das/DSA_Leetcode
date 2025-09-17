class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if(s.length()==0) return 0;
        Boolean neg = false;
        int idx = 0;
        if (s.charAt(idx) == '-' || s.charAt(idx) == '+') {
            neg = (s.charAt(idx) == '-');
            idx++;
        }
        long ans = 0;
        for(int i=idx;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
               ans = ans*10+ (ch-'0');
            if(neg==true && -ans < Integer.MIN_VALUE)
             return Integer.MIN_VALUE;
            if(neg == false && ans > Integer.MAX_VALUE )
             return Integer.MAX_VALUE; 
            }
             else break; 
        }
        return neg ? - (int) ans : (int) ans;   
    }
}
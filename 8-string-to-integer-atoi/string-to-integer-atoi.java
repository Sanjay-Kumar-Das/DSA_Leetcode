class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if(s.length()==0) return 0;
        StringBuilder sb = new StringBuilder();
        Boolean neg = false;
        int idx = 0;
        if (s.charAt(idx) == '-' || s.charAt(idx) == '+') {
            neg = (s.charAt(idx) == '-');
            idx++;
        }
        for(int i=idx;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch >='0' && ch <='9')sb.append(ch);
            else break;
        }
        if(sb.isEmpty()) return 0;
        String str = sb.toString();
        try {
            int x = Integer.parseInt(str);
            return (neg == true)? 0-x : x;
        }catch(Exception e){
            if(neg == true) return Integer.MIN_VALUE;
            else return Integer.MAX_VALUE;
        }
        
    }
}
class Solution {
    public int myAtoi(String s) {
        StringBuilder sb = new StringBuilder();
        Boolean neg = false;
        int minus =0,pos =0;
        for(char ch : s.toCharArray()){
            if(ch == ' ' && sb.isEmpty() && pos == 0 && minus==0) continue;
            else if(ch == '+' && sb.isEmpty()){
                if(minus > 0 || pos >0) break;
                pos++;
            }
            else if(ch == '-' && sb.isEmpty()){
                if(pos>0 || minus > 0) break;
                minus++;
                neg = true;
            } 
            else if(ch >='0' && ch <='9') sb.append(ch);
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
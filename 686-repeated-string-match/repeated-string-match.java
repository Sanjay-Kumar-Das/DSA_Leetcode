class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int repeat = 0;
        while(sb.length() < b.length()){
            sb.append(a);
            repeat++;
        }
        if(sb.toString().contains(b)) return repeat;
        sb.append(a);
        repeat++;
        if(sb.toString().contains(b)) return repeat;
       return -1; 
    }
}
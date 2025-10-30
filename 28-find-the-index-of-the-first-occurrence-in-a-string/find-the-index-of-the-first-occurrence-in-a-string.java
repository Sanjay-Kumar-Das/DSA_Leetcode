class Solution {
    public int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();
        if(m == n){
            return haystack.equals(needle) ? 0 : -1;
        }
        for(int i=0;i<=m-n;i++){
            String s = haystack.substring(i,i+n);
            if(s.equals(needle)) return i;
        }
        return -1;
    }
}
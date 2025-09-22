class Solution {
    static List <String> str ;
    public void printParanthesis(int open,int close,int n,String s){
        if(s.length() == n*2){
            str.add(s);
            return;
        }
        if(open < n) printParanthesis(open+1,close,n,s+"(");
        if(close < open) printParanthesis(open,close+1,n,s+")");
    }
    public List<String> generateParenthesis(int n) {
        str = new ArrayList<>();
        printParanthesis(0,0,n,"");
        return str;
    }
}
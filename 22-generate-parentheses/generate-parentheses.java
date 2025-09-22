class Solution {
    static List <String> str ;
    public void printParanthesis(int open,int close,int n,StringBuilder sb){
        if(sb.length() == n*2){
            str.add(sb.toString());
            return;
        }
        if(open < n){
            sb.append("(");
            printParanthesis(open+1,close,n,sb);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close < open){
            sb.append(")");
            printParanthesis(open,close+1,n,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        str = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        printParanthesis(0,0,n,sb);
        return str;
    }
}
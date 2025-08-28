class Solution {
    public String removeOuterParentheses(String s) {
        int left = 0, right = 0, lpara = 0, rpara = 0;
        StringBuilder sb = new StringBuilder();
        while(right<s.length()){
            char ch = s.charAt(right);
            if(ch == '(') lpara++;
            else rpara++;
            if(lpara == rpara){
                for(int i=left+1;i<right;i++){
                    sb.append(s.charAt(i));
                }
                left = right+1;
            }
            right++;
        }
        return sb.toString();
    }
}
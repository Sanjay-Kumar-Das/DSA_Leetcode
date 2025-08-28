class Solution {
    public String reverseWords(String s) {
        Stack<String> st = new Stack<>();
        int left = 0, right = 0;

        while (right < s.length()) {
            char ch = s.charAt(right);
            if (ch == ' ') {
                if (left < right) { 
                    st.push(s.substring(left, right));
                }
                left = right + 1;
            }
            if (right == s.length() - 1 && left <= right) {
                st.push(s.substring(left, right + 1));
            }
            right++;
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
            if (!st.isEmpty()) sb.append(" "); 
        }
        return sb.toString();
    }
}

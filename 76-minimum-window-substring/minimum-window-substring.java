class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        Map<Character, Integer> map = new HashMap<>();
        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int i = 0, j = 0;
        int required = map.size(); // how many unique chars needed
        int formed = 0;            // how many unique chars are satisfied
        Map<Character, Integer> window = new HashMap<>();

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while (j < s.length()) {
            char ch = s.charAt(j);
            window.put(ch, window.getOrDefault(ch, 0) + 1);

            if (map.containsKey(ch) && window.get(ch).intValue() == map.get(ch).intValue()) {
                formed++;
            }

            // Try shrinking from left if valid
            while (i <= j && formed == required) {
                if (j - i + 1 < minLen) {
                    minLen = j - i + 1;
                    start = i;
                }

                char leftChar = s.charAt(i);
                window.put(leftChar, window.get(leftChar) - 1);

                if (map.containsKey(leftChar) && window.get(leftChar) < map.get(leftChar)) {
                    formed--;
                }

                i++;
            }
            j++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}

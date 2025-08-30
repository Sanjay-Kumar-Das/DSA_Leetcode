class Solution {
    public int reverse(int x) {
      boolean sign  = x < 0; int res = 0;
      String s = String.valueOf(Math.abs(x));
      StringBuilder sb = new StringBuilder(s).reverse();
      try {
            res = Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
      return sign ? -res : res;
      

    }
}
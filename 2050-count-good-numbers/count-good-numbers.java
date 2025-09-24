class Solution {
    static final long MOD = 1000000007;

    public static long pow(long x, long n) {
        if (n == 0) return 1;
        long half = pow(x, n / 2);
        long result = (half * half) % MOD;
        if (n % 2 == 1) {
            result = (result * x) % MOD;
        }
        return result;
    }

    public int countGoodNumbers(long n) {
        long even = (n + 1) / 2; // positions with 5 choices
        long odd = n / 2;       // positions with 4 choices

        long first = pow(4, odd);   // odd positions
        long second = pow(5, even); // even positions

        long ans = (first * second) % MOD;
        return (int) ans;
    }
}

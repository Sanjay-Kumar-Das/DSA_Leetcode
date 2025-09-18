class Solution {
    public double pow(double x, long n){
        if(n == 0) return 1.0;
        double ans = pow(x,n/2);
        if(n % 2 == 0) return ans*ans;
        else if(n %2 != 0) return ans*ans*x;
        return ans; 
    }
    public double myPow(double x, int n) {
        long a = n;
        if(n<0){
            a = -a;
            x = 1/x;
        }
        return pow(x,a);
    }
}
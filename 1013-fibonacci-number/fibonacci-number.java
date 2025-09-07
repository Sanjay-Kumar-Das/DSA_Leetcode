class Solution {
    public static int fibo(int[] arr, int n){
        if(n<=1) return n;
        if(arr[n] != 0) return arr[n];
        int sum = fibo(arr,n-1)+fibo(arr,n-2);
        arr[n] = sum;
        return sum;
    }
    public int fib(int n) {
        int[] arr = new int[n+1];
        return fibo(arr,n);
    }
}
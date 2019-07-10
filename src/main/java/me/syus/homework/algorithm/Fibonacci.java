package me.syus.homework.algorithm;

public class Fibonacci {

    public int fib(int n) {
        if (n <= 0) return 0;
        if (n < 2) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public int fibWithMem(int n, int[] mem) {
        if (mem[n] > 0) return mem[n];
        if (n <= 0) return 0;
        if (n <= 2) {
            mem[n] = 1;
            return mem[n];
        }
        int val = fibWithMem(n - 1, mem) + fibWithMem(n - 2, mem);
        mem[n] = val;
        return mem[n];
    }


    public int fibDp(int n) {
        int[] dp = new int[n + 2];
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }


    public static void main(String args[]) {
        Fibonacci fib = new Fibonacci();
        System.out.println(fib.fibDp(30));


    }
}

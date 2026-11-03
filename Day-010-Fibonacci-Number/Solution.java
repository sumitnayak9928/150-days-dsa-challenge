// Is approach mein recursion nahi hai, repeated function calls bhi nahi hain 
//Java code – Iterative approach
class Solution {
    public int fib(int n) {

        if (n == 0) {
            return 0;
        }

        int a = 0;
        int b = 1;

        for (int i = 2; i <= n; i++) {
            int next = a + b;

            a = b;
            b = next;
        }

        return b;
    }
}
```

// Recursion Method

public int fib(int n) {
    if (n == 0) {
        return 0;
    }

    if (n == 1) {
        return 1;
    }

    return fib(n - 1) + fib(n - 2);
}

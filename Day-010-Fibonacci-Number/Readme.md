# Day 10 – Fibonacci Number

**LeetCode Problem:** [#509 – Fibonacci Number](https://leetcode.com/problems/fibonacci-number/)

**Difficulty:** Easy

**Language:** Java

## Problem Statement

The Fibonacci sequence is defined as:

- F(0) = 0
- F(1) = 1
- F(n) = F(n - 1) + F(n - 2), for n greater than 1.

Given an integer `n`, return the nth Fibonacci number.

## Example

**Input:**
```text
n = 5
```

**Output:**
```text
5
```

**Explanation:**

The Fibonacci sequence is:

`0, 1, 1, 2, 3, 5, 8, 13...`

Therefore, F(5) = 5.

## Approach – Iterative Method

Instead of using recursion, we use an iterative approach with three variables.

1. Initialize `a = 0` and `b = 1`.
2. Handle the special case when `n = 0`.
3. Use a `for` loop starting from 2.
4. Calculate the next number using `a + b`.
5. Update `a` and `b` for the next iteration.
6. Return `b`.

## Java Concepts Learned

- Recursion
- Base Case
- Iteration
- For Loop
- Variables
- Updating Variable Values
- Return Statement

## Complexity Analysis

**Time Complexity: O(n)**

The loop runs from 2 to n, so the number of iterations grows linearly with n.

**Space Complexity: O(1)**

We use only three variables (`a`, `b`, and `next`) regardless of the input size.

## Key Learning

Learned the Fibonacci sequence, recursion, base cases, and how to calculate Fibonacci numbers efficiently using iteration.

Also understood why the iterative approach avoids repeated recursive calculations.

---

**Challenge:** 150 Days of DSA  
**Day:** 9/150  
**Language:** Java

# Day 07 – Counting Bits

**LeetCode Problem:** 338 – Counting Bits

**Topic:** Array | Binary Numbers | Bit Manipulation

**Difficulty:** Easy

## Problem Statement

Given an integer `n`, return an array `ans` of length `n + 1` such that for every `i` (`0 <= i <= n`), `ans[i]` is the number of 1's in the binary representation of `i`.

## Example

**Input:**
```java
n = 5
```

**Output:**
```java
[0, 1, 1, 2, 1, 2]
```

## Approach – Binary Counting

1. Create an answer array of size `n + 1`.
2. Use a `for` loop to traverse numbers from `0` to `n`.
3. Store the current number in a temporary variable `num`.
4. Use a `while` loop to process its binary digits.
5. Use `% 2` to extract the last binary digit.
6. If the digit is `1`, increment the count.
7. Divide `num` by `2` until it becomes zero.
8. Store the count in `ans[i]`.
9. Return the answer array.

## Java Concepts Learned

- Binary Number Representation
- Modulo (`%`) Operator
- Integer Division (`/`)
- For Loop
- While Loop
- Arrays

## Complexity Analysis

- **Time Complexity:** O(n log n) – Each number is processed by checking its binary digits.
- **Space Complexity:** O(n) – The answer array stores `n + 1` elements.

## LeetCode Link

https://leetcode.com/problems/counting-bits/

---

**Day 07/150 – Learning, Practicing and Improving! 🚀**

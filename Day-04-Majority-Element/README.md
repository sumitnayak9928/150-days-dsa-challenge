# Day 4: Majority Element

**150 Days DSA Challenge | LeetCode #169 | Java**

## 📌 Problem Statement

Given an integer array `nums` of size `n`, return the majority element.

The majority element is the element that appears more than `⌊n / 2⌋` times.

**Problem Link:** [LeetCode #169 — Majority Element](https://leetcode.com/problems/majority-element/)

## 💡 Approach: Brute Force

1. Calculate the length of the array using `nums.length`.
2. Use an outer loop to select each element.
3. Initialize `count = 0` for each selected element.
4. Use an inner loop to count how many times that element appears.
5. If `count > n / 2`, return the current element.

## 💻 Language

Java

## ⏱️ Time Complexity: O(n²)

- The outer loop can run `n` times.
- For each outer loop iteration, the inner loop can also run `n` times.
- Total comparisons in the worst case: `n × n = n²`.

Therefore, the worst-case time complexity is **O(n²)**.

## 💾 Auxiliary Space Complexity: O(1)

- Only a constant number of extra variables are used, such as `n`, `i`, `j`, and `count`.
- No additional array or data structure is created.

Therefore, the auxiliary space complexity is **O(1)**.

## 📚 Key Learnings

- Arrays and element frequency
- Nested loops
- Counting occurrences
- Conditional statements
- Time and space complexity analysis
- Brute-force problem-solving

## 🎯 Challenge Progress

- [x] Day 1 — Backspace String Compare
- [x] Day 2 — Move Zeroes
- [x] Day 3 — Balanced Binary Tree
- [x] Day 4 — Majority Element

**Consistency over perfection. Learning one problem at a time! 🚀**

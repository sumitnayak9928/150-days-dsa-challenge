# Day 06 – Contains Duplicate

**LeetCode Problem:** 217 – Contains Duplicate

**Topic:** Array | HashSet | For-Each Loop

**Difficulty:** Easy

## Problem Statement

Given an integer array `nums`, return `true` if any value appears at least twice in the array, and return `false` if every element is distinct.

## Example

**Input:**
```java
nums = [1, 2, 3, 1]
```

**Output:**
```java
true
```

**Explanation:** The number `1` appears twice in the array.

## Approach – HashSet

1. Create a HashSet to store visited elements.
2. Traverse the array using an Enhanced For Loop.
3. Check whether the current element already exists using `contains()`.
4. If it exists, return `true`.
5. Otherwise, add the element to the HashSet.
6. If the loop completes without finding a duplicate, return `false`.

## Java Concepts Learned

- HashSet
- `contains()` method
- `add()` method
- Enhanced For Loop (For-Each Loop)

## Complexity Analysis

- **Time Complexity:** O(n) – Average case, each element is processed once, with average O(1) HashSet operations.
- **Space Complexity:** O(n) – In the worst case, all elements are stored in the HashSet.

## LeetCode Link

https://leetcode.com/problems/contains-duplicate/

---

**Day 06/150 – Consistency is the key! 🚀**

# Day 02 — Move Zeroes

## Problem Details
- **Platform:** LeetCode
- **Problem Number:** 283
- **Difficulty:** Easy
- **Language:** Java
- **Status:** Accepted ✅

## Problem Statement
Move all zeros to the end of the array while maintaining the relative order of non-zero elements.

## Approach
1. Initialize a pointer `j = 0`.
2. Traverse the array using pointer `i`.
3. Copy every non-zero element to index `j`.
4. Increment `j` after copying each non-zero element.
5. Fill the remaining positions with zeros.

## Example

**Input:**
`[0, 5, 0, 2, 8]`

**Output:**
`[5, 2, 8, 0, 0]`

## Complexity Analysis
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

## Key Learnings
- Two-pointer technique
- Array traversal
- In-place array modification

---

**Challenge:** 150 Days DSA Challenge 🚀

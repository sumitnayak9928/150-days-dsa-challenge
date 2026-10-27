# Day 3: Balanced Binary Tree 🌳

**150 Days DSA Challenge | LeetCode #110**

## 📌 Problem

Given a binary tree, determine if it is height-balanced.

A binary tree is height-balanced if the height difference between the left and right subtrees of every node is at most 1.

## 💡 Approach

- Handle the base case when the current node is `null`.
- Calculate the heights of the left and right subtrees.
- Find the absolute difference between their heights using `Math.abs()`.
- If the difference is greater than 1, return `false`.
- Recursively check whether both subtrees are balanced.

## 🛠️ Concepts Learned

- Binary Trees
- Recursion
- Tree Height
- `Math.abs()`
- `Math.max()`

## 💻 Language

Java

## ⏱️ Complexity

**Time Complexity:** O(n²) in the worst case for this straightforward recursive approach.

**Auxiliary Space:** O(h) for the recursion stack, where `h` is the tree height.

## 🔗 LeetCode

[Balanced Binary Tree — Problem #110](https://leetcode.com/problems/balanced-binary-tree/)

## 🎯 Challenge Progress

- [x] Day 1 — Backspace String Compare
- [x] Day 2 — Move Zeroes
- [x] Day 3 — Balanced Binary Tree

Learning consistently, one problem at a time! 🚀

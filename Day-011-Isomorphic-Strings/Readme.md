# Day 10 – Isomorphic Strings

**LeetCode Problem:** [#205 – Isomorphic Strings](https://leetcode.com/problems/isomorphic-strings/)

**Difficulty:** Easy

**Language:** Java

## Problem Statement

Given two strings `s` and `t`, determine whether they are isomorphic.

Two strings are isomorphic if the characters in `s` can be replaced to get `t`, while maintaining the character order.

Each character must map consistently to another character, and two different characters cannot map to the same character.

## Examples

**Example 1:**

```text
Input:
s = "egg"
t = "add"

Output:
true
```

**Example 2:**

```text
Input:
s = "foo"
t = "bar"

Output:
false
```

**Example 3:**

```text
Input:
s = "paper"
t = "title"

Output:
true
```

## Approach – Two HashMaps

I used two HashMaps to maintain character mappings in both directions.

1. Create two HashMaps.
2. Traverse both strings using a `for` loop.
3. Extract characters using `charAt()`.
4. Check whether the first character already exists in the first HashMap.
5. If it exists, verify that its mapped character is consistent.
6. Otherwise, store the new mapping.
7. Repeat the same process in reverse using the second HashMap.
8. If any mapping conflict occurs, return `false`.
9. If all characters are processed successfully, return `true`.

## Java Concepts Learned

- HashMap
- Character Mapping
- `put()` method
- `get()` method
- `containsKey()` method
- `charAt()` method
- For Loop
- Conditional Statements

## Complexity Analysis

**Time Complexity: O(n)**

We traverse the strings once. HashMap operations take O(1) average time.

**Space Complexity: O(n)**

We use two HashMaps to store character mappings. In the general analysis, auxiliary space grows linearly with the input size.

## Key Learning

Learned how to use two HashMaps to maintain consistent one-to-one character mappings and solve string problems efficiently.

---

**Challenge:** 150 Days of DSA  
**Day:** 10/150  
**Language:** Java

# Day 8 – Roman to Integer

**LeetCode Problem:** [#13 – Roman to Integer](https://leetcode.com/problems/roman-to-integer/)

## Problem Statement
Given a Roman numeral string, convert it into an integer.

Roman numerals use the following symbols:

| Symbol | Value |
|---|---:|
| I | 1 |
| V | 5 |
| X | 10 |
| L | 50 |
| C | 100 |
| D | 500 |
| M | 1000 |

## Approach
- Traverse the string using a `for` loop.
- Get the integer value of the current Roman character using a helper method.
- Compare the current value with the next value.
- If the current value is smaller, subtract it.
- Otherwise, add it.
- Add the last character directly because it has no next character.

## Java Concepts Learned
- `charAt()` method
- `String.length()`
- `for` loop
- `switch-case`
- Helper methods
- Character comparison
- Conditional statements

## Complexity Analysis

**Time Complexity: O(n)**

We traverse the Roman numeral string once. Each character is processed in constant time.

**Space Complexity: O(1)**

We use only a fixed number of variables. No additional data structure is required.

## Key Learning
Learned how to compare the current and next Roman numeral values to decide whether to add or subtract.

---
**Challenge:** 150 Days of DSA  
**Day:** 8/150  
**Language:** Java

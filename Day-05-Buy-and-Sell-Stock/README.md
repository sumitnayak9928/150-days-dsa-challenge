Day 5: Best Time to Buy and Sell Stock
150 Days DSA Challenge | LeetCode #121 | Java

📌 Problem Statement
You are given an array prices where prices[i] is the price of a given stock on the $i^{th}$ day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
Problem Link: LeetCode #121 — Best Time to Buy and Sell Stock

💡 Approach: Single Pass / Greedy
1. Initialize minPrice with Integer.MAX_VALUE to track the minimum price seen so far.
2. Initialize maxProfit to 0 to store the maximum profit.
3. Iterate through the array of prices using a single loop.
4. If the current price is less than minPrice, update minPrice.
5. Otherwise, calculate the profit (current price - minPrice) and update maxProfit if it exceeds the previous maximum.
6. Return maxProfit at the end of the loop.

💻 Language
Java

⏱️ Time Complexity: O(n)
- The array is traversed only once from start to finish.
- Therefore, the time complexity is linear, i.e., O(n).

💾 Auxiliary Space Complexity: O(1)
- Only a constant number of extra variables (minPrice and maxProfit) are used.
- No additional data structures are created.
Therefore, the auxiliary space complexity is O(1).

📚 Key Learnings
- Array traversal and tracking minimum/maximum values
- Greedy approach for single-pass optimization
- Time and space complexity reduction from O(n²) to O(n)
- Optimizing problem-solving logic for interviews

🎯 Challenge Progress
- Day 1 — Backspace String Compare
- Day 2 — Move Zeroes
- Day 3 — Balanced Binary Tree
- Day 4 — Majority Element
- Day 5 — Best Time to Buy and Sell Stock

Consistency over perfection. Learning one problem at a time! 🚀

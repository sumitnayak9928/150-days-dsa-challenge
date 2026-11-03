Day 9: Time Needed to Buy Tickets
150 Days DSA Challenge | LeetCode #2073 | Java
📌 Problem Statement
There are n people in a line queueing to buy tickets. You are given a 0-indexed integer array tickets of length n where the number of tickets that the i-th person would like to buy is tickets[i]. Return the time taken for the person initially at position k to finish buying tickets.
Problem Link: LeetCode #2073 — Time Needed to Buy Tickets
💡 Approach: Queue Simulation
1. Ek Queue<Integer> banai aur usme sare indices (0 se n-1 tak) daal diye.
2. Jab tak queue empty nahi hoti, loop chalaya.
3. Queue se element poll kiya, tickets kam kiye, aur time++ kiya.
4. Agar current person 'k' hai aur uske tickets 0 ho gaye, toh time return kar diya.
💻 Language
Java
⏱️ Time Complexity: O(n × tickets[k])
💾 Auxiliary Space Complexity: O(n)
📚 Key Learnings
- Queue data structure implementation
- Simulation of real-world queue logic
- Handling indices in problem solving
🎯 Challenge Progress
- Day 8 — Time Needed to Buy Tickets
Consistency over perfection. Learning one problem at a time! 🚀

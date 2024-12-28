Problem Description:
Given an integer n, determine if it is a power of four.


Approach:
First, check if n is greater than 0, as powers of four are always positive.
If n is 1, return true (since 4 power 0 = 1).
Use a while loop to repeatedly divide n by 4 as long as it is divisible by 4.
If, after all divisions, n becomes 1, return true. Otherwise, return false.


Time Complexity:
O(log₄(n)), because we are repeatedly dividing n by 4.


Space Complexity:
O(1), as we are using a constant amount of space (only a few variables).

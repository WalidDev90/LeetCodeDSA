Problem Description:
Given an integer n, determine if it is a power of two.


Approach:
First, check if n is greater than 0 because powers of two are always positive integers.
If n is 1, return true (since 2 raised to the power of 0 equals 1).
Use a while loop to repeatedly divide n by 2 as long as it is divisible by 2.
After all divisions, if n becomes 1, return true. Otherwise, return false.


Time Complexity:
O(log₂(n)), because we are repeatedly dividing n by 2, which reduces its value logarithmically.


Space Complexity:
O(1), as we are using a constant amount of space (only a few variables).
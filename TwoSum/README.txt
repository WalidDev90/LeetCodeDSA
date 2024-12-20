Problem Description: Given an array of integers nums and an integer target,
return the indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution,
and you cannot use the same element twice.


Approach: We use a nested loop to iterate through all pairs of numbers in the array.
For each pair of numbers, check if their sum equals the target.
If a valid pair is found, return the indices of these two numbers in an array.
Ensure the indices are not the same (i.e., i != j).


Time Complexity: O(n^2), where n is the number of elements in the nums array, due to the nested loop.


Space Complexity: O(1), since the solution only uses a constant amount of extra space for the result.
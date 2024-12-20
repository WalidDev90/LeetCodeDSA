Problem Description:
Given an integer array nums and an integer val, remove all instances of val in nums in place.
The relative order of the elements should be kept the same. The function should return
the new length of the array after removal.


Approach:
We use a pointer k to track the position where elements not equal to val should be placed.
Iterate through the array, and for each element that is not equal to val, assign it to the position k, then increment k.
After the iteration, the first k elements will contain the desired elements, and the function returns k as the length of the new array.


Time Complexity:
O(n), where n is the number of elements in the nums array. We iterate through the array once.


Space Complexity:
O(1), as the solution works in-place without using extra space.
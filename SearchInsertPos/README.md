Problem Description:
Given a sorted array of integers nums and an integer target, the task is to determine the index at which the target
value should be inserted into the array in order to maintain the sorted order.
If the target is already present in the array, return its index. Otherwise,
return the index where it should be inserted.


Approach:
Initial Search: First, we loop through the array to check if the target is already present in the array. If the target is found, we return the index of that element.
Insert Position Determination: If the target is not found in the array, we proceed to find the appropriate position for insertion:
If the target is smaller than the first element, return index 0, as it should be inserted at the start of the array.
If the target is greater than the last element, return the index equal to the length of the array (i.e., insert at the end).
Otherwise, for each element in the array, check if the target lies between two consecutive elements, and if so, return the index where it should be inserted.


Time Complexity:
O(n), where n is the number of elements in the nums array. The solution contains two loops:
The first loop checks if the target is present in the array.
The second loop iterates through the array to find the appropriate insertion index.


Space Complexity:
O(1), as the solution uses only a constant amount of extra space regardless of the size of the input array.
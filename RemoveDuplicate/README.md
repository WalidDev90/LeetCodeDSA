Problem Description:
Given a sorted integer array nums, remove the duplicates in place such that
each element appears only once. The relative order of the elements
should be kept the same. The function should return the new length
of the array after removal.


Approach:
To solve this problem, we use a two-pointer technique with a List to handle
the unique elements:
Pointer i keeps track of the last unique element in the list.
Pointer j scans the list and compares each element with list.get(i)


Time Complexity:
O(n), where n is the number of elements in the list.
We iterate through the list once, comparing each element to the last unique element.


Space Complexity:
O(1), as we modify the list in place without requiring extra space (besides the original List).

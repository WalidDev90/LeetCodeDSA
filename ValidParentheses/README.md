Problem Description:
Given a string s consisting of just '(', ')', '{', '}', '[', and ']',
determine if the input string is valid. An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.

Approach:
Use an array to keep track of opening brackets. For each closing bracket,
check if it matches the most recent opening bracket in the array.
If they match, remove the element; otherwise, return false.
Finally, return true if the array is empty after processing the string.


Time Complexity: O(n), where n is the length of the string.


Space Complexity: O(n), due to the stack storing at most n characters.
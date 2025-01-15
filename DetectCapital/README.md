Problem Description:
Given a string word, return true if it follows one of these capitalization rules:
All letters are uppercase.
All letters are lowercase.
The first letter is uppercase and the rest are lowercase.


Approach:
Check if the word is all uppercase using toUpperCase().
Check if the word is all lowercase using toLowerCase().
Check if the first letter is uppercase and the rest are lowercase.
Return true if any condition is met, otherwise return false.


Time Complexity:
O(n), where n is the length of the string.


Space Complexity:
O(1), as we use constant space.
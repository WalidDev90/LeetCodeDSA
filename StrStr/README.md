Problem Description:
Find the first occurrence of a substring (needle) in a string (haystack).
Return the index of the first character of the match,
or -1 if the substring is not found. If needle is empty, return 0.


Approach:
Use two pointers: i for haystack and j for needle.
Compare characters at haystack[i] and needle[j].
If a mismatch occurs, reset i to the next possible starting position and j to 0.
If needle is found, return the starting index.


Time Complexity:
O(n * m), where n is the length of haystack and m is the length of needle.


Space Complexity:
O(1), as only pointers and counters are used
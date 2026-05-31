class Solution:
    def isPalindrome(self, s: str) -> bool:
        newS = "";
        for c in s:
            if (c.isalnum()): newS += c
        s = newS;
        for i in range((int) (len(s) / 2)):
            if (s[i].lower() != s[len(s) - 1 - i].lower()): return False;

        return True;
        
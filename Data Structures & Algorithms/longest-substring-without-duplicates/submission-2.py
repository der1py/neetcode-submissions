class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        l = 0
        r = 0

        longest = 0
        chars = set()

        # l = 1, r = 2, dvf

        while (r < len(s)):
            while (s[r] in chars):
                chars.remove(s[l])
                l += 1
            chars.add(s[r])
            longest = max(longest, r - l + 1)
            r += 1

        return longest
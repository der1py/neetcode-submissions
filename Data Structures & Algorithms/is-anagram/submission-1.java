class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] charCount = new int[26]; // a is 0, z is 25
        for (int i = 0; i < s.length(); i++) {
            // increment for each character in s and decrement
            // for each character in z, should be all 0 if anagram
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--;
        }

        for (int i : charCount) {
            if (i != 0) return false;
        }

        return true;
    }
}

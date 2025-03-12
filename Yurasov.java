import java.util.*;

class Solution {
    // Hello boss, it's my first commit in my branch
    public int lengthOfLongestSubstring(String s) {
        Set<Character> usedChars = new HashSet<>();
        int maxLen = 0;
        for (int right = 0, left = 0; right < s.length(); right++) {
            while (usedChars.contains(s.charAt(right))) {
                usedChars.remove(s.charAt(left));
                left++;
            }

            usedChars.add(s.charAt(right));

            maxLen = Math.max(maxLen, usedChars.size());
        }

        return maxLen;
    }
}

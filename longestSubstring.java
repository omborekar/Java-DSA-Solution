// LeetCode Problem: Longest Substring Without Repeating Characters
// www.leetcode.com/problems/longest-substring-without-repeating-characters/
import java.util.HashSet;
import java.util.Set;
class longestSubstring {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            // If duplicate found, shrink window from left
            while (set.contains(c)) {
                set.remove(s.charAt(start));
                start++;
            }
            set.add(c);
            max = Math.max(max, end - start + 1);
        }

        return max;
    }
    public static void main(String[] args) {
        longestSubstring solution = new longestSubstring();
        String input = "abcabcbb";
        int result = solution.lengthOfLongestSubstring(input);
        System.out.println("Length of longest substring without repeating characters: " + result);
    }
}

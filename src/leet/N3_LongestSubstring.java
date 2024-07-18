package leet;

import java.util.HashSet;
import java.util.Set;

//Longest Substring Without Repeating Characters
public class N3_LongestSubstring {

    public static void main(String[] args) {
        System.out.println(new N3_LongestSubstring().lengthOfLongestSubstring("abcabcbb")+" ->3");
        System.out.println(new N3_LongestSubstring().lengthOfLongestSubstring("bbbbb")+" ->1");
        System.out.println(new N3_LongestSubstring().lengthOfLongestSubstring("pwwkew")+" ->3");
        System.out.println(new N3_LongestSubstring().lengthOfLongestSubstring("aab")+" ->2");
    }

    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left= 0;
        int right = 0;

        int max = 0;

        while(right<s.length()) {
            if (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }else {
                set.add(s.charAt(right));
                right++;
            }

            max = Math.max(max, set.size());
        }

        return max;
    }
}

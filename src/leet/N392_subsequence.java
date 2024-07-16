package leet;

public class N392_subsequence {
    public static void main(String[] args) {
        System.out.println(new N392_subsequence().isSubsequence("abc", "ahbgdc"));
        System.out.println(new N392_subsequence().isSubsequence("axc", "ahbgdc"));
        System.out.println(new N392_subsequence().isSubsequence("", "ahbgdc"));
        System.out.println(new N392_subsequence().isSubsequence("aaa", ""));
    }

    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()){
            return true;
        }

        int left = 0;

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(left)) {
                left++;
            }

            if (left == s.length()) {
                return true;
            }
        }
        return false;
    }
}

package leet;

public class N14_Prefix {
    public static void main(String[] args) {
        System.out.println(new N14_Prefix().longestCommonPrefix(new String[]{"flower", "flow", "flight"}) + " fl");
        System.out.println(new N14_Prefix().longestCommonPrefix(new String[]{"dog","racecar","car"}) + " ");
        System.out.println(new N14_Prefix().longestCommonPrefix(new String[]{"a"}) + " a");
        System.out.println(new N14_Prefix().longestCommonPrefix(new String[]{"ab", "a"}) + " a");
    }

    public String longestCommonPrefix(String[] strs) {
        String example = strs[0];

        for (int i = 0; i < example.length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (i > strs[j].length()-1 || example.charAt(i) != strs[j].charAt(i)) {
                    return example.substring(0, i);
                }
            }
        }
        return example;
    }
}

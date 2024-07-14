package leet;

public class N28_Find_first {
    public static void main(String[] args) {
        System.out.println(new N28_Find_first().strStr("sadbutsad", "sad"));
        System.out.println(new N28_Find_first().strStr("leetcode", "leeto"));
        System.out.println(new N28_Find_first().strStr("aaa", "aaaa"));
        System.out.println(new N28_Find_first().strStr("mississippi", "issip"));
        System.out.println(new N28_Find_first().strStr("a", "a"));
        System.out.println(new N28_Find_first().strStr("mississippi", "pi"));
    }

    public int strStr(String haystack, String needle) {
        for (int i = 0; i <= haystack.length()-needle.length(); i++) {
            int j =0;
            while(j < needle.length() && haystack.charAt(i+j) == needle.charAt(j)) {
                j++;
            }

            if(j==needle.length()) {
                return i;
            }
        }

        return -1;
    }

    public int strStr2(String haystack, String needle) {
        char[] charArray = haystack.toCharArray();
        char[] needleCharArray = needle.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == needleCharArray[0]) {

                for (int j = 1; j <= needleCharArray.length; j++) {
                    if (j == needleCharArray.length) {
                        return i;
                    }

                    if(i + j == charArray.length){
                        return -1;
                    }

                    if (charArray[i + j] != needleCharArray[j]) {
                        break;
                    }
                }
            }
        }
        return -1;
    }

    public int strStr1(String haystack, String needle) {
        char[] charArray = haystack.toCharArray();
        char[] needleCharArray = needle.toCharArray();

        for (int i = 0, j = 0; i < charArray.length; i++) {
            if (charArray[i] == needleCharArray[j]) {
                j++;
            } else {
                i = i - j;
                j = 0;
            }

            if (j == needleCharArray.length) {
                return i - j + 1;
            }
        }

        return -1;
    }
}
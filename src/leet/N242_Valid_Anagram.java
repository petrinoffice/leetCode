package leet;

public class N242_Valid_Anagram {
    public static void main(String[] args) {
        System.out.println(new N242_Valid_Anagram().isAnagram("anagram", "nagaram"));
        System.out.println(new N242_Valid_Anagram().isAnagram("rat", "car"));
        System.out.println(new N242_Valid_Anagram().isAnagram("ab", "a"));
        System.out.println(new N242_Valid_Anagram().isAnagram("a", "ab"));
    }

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] letters = new int[26];

        for (int i = 0; i < t.length(); i++) {
            int index = t.charAt(i) - 'a';
            letters[index]++;
        }

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';

            if (letters[index] > 0) {
                letters[index]--;
            } else {
                return false;
            }

        }

        return true;
    }
}

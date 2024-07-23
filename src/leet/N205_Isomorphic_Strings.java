package leet;

public class N205_Isomorphic_Strings {
    public static void main(String[] args) {
        System.out.println(new N205_Isomorphic_Strings().isIsomorphic("egg", "add"));
        System.out.println(new N205_Isomorphic_Strings().isIsomorphic("foo", "bar"));
    }

    public boolean isIsomorphic(String s, String t) {
        int[] sChars = new int[26];
        int[] tChars = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int sInt = s.charAt(i) - 'a';
            int tInt = t.charAt(i) - 'a';

            if (sChars[sInt] != tChars[tInt]) {
                return false;
            }

            sChars[sInt] = ++sChars[sInt];
            tChars[tInt] = ++tChars[tInt];
        }

        return true;
    }
}

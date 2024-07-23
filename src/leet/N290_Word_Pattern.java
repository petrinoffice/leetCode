package leet;

import java.util.HashMap;

public class N290_Word_Pattern {
    public static void main(String[] args) {
        System.out.println(new N290_Word_Pattern().wordPattern("abba", "dog cat cat dog"));
        System.out.println(new N290_Word_Pattern().wordPattern("abba", "dog cat cat fish"));
        System.out.println(new N290_Word_Pattern().wordPattern("aaaa", "dog cat cat dog"));
        System.out.println(new N290_Word_Pattern().wordPattern("abba", "dog dog dog dog"));
        System.out.println(new N290_Word_Pattern().wordPattern("aaa", "aa aa aa aa"));
    }

    public boolean wordPattern(String pattern, String s) {
        HashMap<String, Character> keys = new HashMap<>();

        String[] strings = s.split(" ");

        if(strings.length != pattern.length()){
            return false;
        }

        for (int i = 0; i < strings.length; i++) {
            String string = strings[i];
            char c = pattern.charAt(i);

            if (keys.containsKey(string)) {
                if (keys.get(string) != c) {
                    return false;
                }
            } else if (keys.containsValue(c)) {
                return false;
            } else {
                keys.put(string, c);
            }
        }

        return true;
    }
}

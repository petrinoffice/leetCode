package leet;

import java.util.HashMap;
import java.util.Map;

public class N205_Isomorphic_Strings {
    public static void main(String[] args) {
//        System.out.println(new N205_Isomorphic_Strings().isIsomorphic("egg", "add"));
//        System.out.println(new N205_Isomorphic_Strings().isIsomorphic("foo", "bar"));
//        System.out.println(new N205_Isomorphic_Strings().isIsomorphic("paper", "title"));
//        System.out.println(new N205_Isomorphic_Strings().isIsomorphic("bbbaaaba",  "aaabbbba"));
        System.out.println(new N205_Isomorphic_Strings().isIsomorphic("badc",  "baba"));
    }

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(map.containsKey(sChar)){
                if(map.get(sChar)!= tChar){
                    return false;
                }
            } else {
                if(map.containsValue(tChar)){
                    return false;
                }
                map.put(sChar, tChar);
            }
        }

        return true;
    }

//    public boolean isIsomorphic(String s, String t) {
//        if (s.length() != t.length()) {
//            return false;
//        }
//
//        int[] sCheck = new int[128];
//        int[] tCheck = new int[128];
//
//        for (int i = 0; i < s.length(); i++) {
//            int sPosition = s.charAt(i);
//            int tPosition = t.charAt(i);
//
//            if (sCheck[sPosition] != tCheck[tPosition]) {
//                return false;
//            }
//
//            sCheck[sPosition] = i+1;
//            tCheck[tPosition] = i+1;
//        }
//
//        return true;
//    }
}

package leet;

import java.util.HashMap;
import java.util.Objects;

public class N383_Ransom_Note {

    public static void main(String[] args) {
        System.out.println(new N383_Ransom_Note().canConstruct("a", "b"));
        System.out.println(new N383_Ransom_Note().canConstruct("aa", "ab"));
        System.out.println(new N383_Ransom_Note().canConstruct("aa", "aab"));
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }


        for (char c : ransomNote.toCharArray()) {
            Integer count = map.get(c);
            if(Objects.isNull(count)){
                return false;
            }

            if (count ==0){
                return false;
            }

            map.put(c, --count);
        }


        return true;
    }
}

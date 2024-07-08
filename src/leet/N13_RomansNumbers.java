package leet;

import java.util.Map;

public class N13_RomansNumbers {
    public static void main(String[] args) {
        System.out.println(new N13_RomansNumbers().romanToInt("III")+" "+ 3);
        System.out.println(new N13_RomansNumbers().romanToInt("LVIII")+" "+ 58);
        System.out.println(new N13_RomansNumbers().romanToInt("MCMXCIV")+" "+ 1994);
    }

    private final Map<Character, Integer> values = Map
            .of('I', 1,
                    'V', 5,
                    'X', 10,
                    'L', 50,
                    'C', 100,
                    'D', 500,
                    'M', 1000);



    public int romanToInt(String s) {
        //Can be improved by following previous symbol
        boolean IVX = false;
        boolean XLC = false;
        boolean CDM = false;

        int count = 0;
        char[] charArray = s.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            char c = charArray[i];

            if (c == 'V' || c == 'X') IVX = true;
            if (c == 'L' || c == 'C') XLC = true;
            if (c == 'D' || c == 'M') CDM = true;

            int value = values.get(c);
            if (IVX && c == 'I') {
                count -= value;
                continue;
            }
            if (XLC && c == 'X') {
                count -= value;
                continue;
            }
            if (CDM && c == 'C') {
                count -= value;
                continue;
            }

            count += value;
        }

        return count;
    }
}

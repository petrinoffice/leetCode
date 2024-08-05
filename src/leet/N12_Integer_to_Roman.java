package leet;

import java.util.List;

public class N12_Integer_to_Roman {
    public static void main(String[] args) {
        System.out.println(new N12_Integer_to_Roman().intToRoman(3749));
        System.out.println(new N12_Integer_to_Roman().intToRoman(58));
        System.out.println(new N12_Integer_to_Roman().intToRoman(1994));
    }

    record Data(int value, String symbol) {
    }

    List<Data> values = List.of(
            new Data(1000, "M"),
            new Data(900, "CM"),
            new Data(500, "D"),
            new Data(400, "CD"),
            new Data(100, "C"),
            new Data(90, "XC"),
            new Data(50, "L"),
            new Data(40, "XL"),
            new Data(10, "X"),
            new Data(9, "IX"),
            new Data(5, "V"),
            new Data(4, "IV"),
            new Data(1, "I")
    );

    public String intToRoman(int num) {
        StringBuilder answer = new StringBuilder();

        for (Data data : values) {
            int count = num / data.value;

            if (count > 0) {
                for (int j = 0; j < count; j++) {
                    answer.append(data.symbol);
                }

                num = num - data.value * count;
            }
        }

        return answer.toString();
    }
}

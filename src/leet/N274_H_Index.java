package leet;

import java.util.Arrays;

public class N274_H_Index {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);

        int citation = 0;
        for (int i = citations.length - 1; i >= 0; i--) {
            if (citations[i] > citation) {
                citation++;
            }
        }

        return citation;
    }
}

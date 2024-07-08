package alex;

import java.util.Arrays;
import java.util.Stack;

public class TemperatureRow {

    public static void main(String[] args) {
        int[] temperature = new int[]{13, 12, 15, 11, 9, 12, 16};

        int[] result1 = simpleSolution(temperature);
        int[] result2 = hardSolution(temperature);

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }

    private static int[] hardSolution(int[] temperature) {
        class Temp {
            final int value;
            final int number;

            Temp(int value, int number) {
                this.value = value;
                this.number = number;
            }
        }

        Stack<Temp> stack = new Stack<>();
        int[] result = new int[temperature.length];

        for (int i = temperature.length - 1; i >= 0; i--) {
            while (!stack.empty() && stack.peek().value <= temperature[i]) {
                stack.pop();
            }

            if (!stack.empty()) {
            result[i] = stack.peek().number - i;
            }

            stack.add(new Temp(temperature[i], i));
        }
        return result;
    }

    private static int[] simpleSolution(int[] temperature) {
        int[] result = new int[temperature.length];

        for (int i = 0; i < temperature.length; i++) {
            for (int j = i + 1; j < temperature.length; j++) {
                if (temperature[i] < temperature[j]) {
                    result[i] = j - i;
                    break;
                }
            }
        }

        return result;
    }
}

package leet;

import java.util.ArrayList;
import java.util.List;

public class N54_Spiral_Matrix {
    public static void main(String[] args) {
        System.out.println(new N54_Spiral_Matrix().spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        int x = 0;
        int y = 0;

        int directX = 1;
        int directY = 0;

        int column = matrix.length;
        int row = matrix[0].length;

        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < column * row; i++) {
            answer.add(matrix[y][x]);
            matrix[y][x] = -101;

            boolean xBorder = x + directX < 0 || x + directX >= row;

            boolean yBorder = y + directY < 0 || y + directY >= column;

            if((xBorder || yBorder) || matrix[y + directY][x + directX]==-101){
                int temp = directX;
                directX = -directY;
                directY = temp;
            }

            x+=directX;
            y+=directY;

        }

        return answer;
    }
}

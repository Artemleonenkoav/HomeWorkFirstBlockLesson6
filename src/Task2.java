//Вывести в консоль числа (от нуля) высотой N и шириной M.
//Пример: n = 3, m = 3;
//0 1 2
//3 4 5
//6 7 8

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[][] twoDimArray = new int[3][4];;
        twoDimArray[0][0] = 5;
        twoDimArray[0][1] = 7;
        twoDimArray[0][2] = 3;
        twoDimArray[0][3] = 17;
        twoDimArray[1][0] = 7;
        twoDimArray[1][1] = 0;
        twoDimArray[1][2] = 1;
        twoDimArray[1][3] = 12;
        twoDimArray[2][0] = 8;
        twoDimArray[2][1] = 1;
        twoDimArray[2][2] = 2;
        twoDimArray[2][3] = 3;

        for (int i = 0; i < twoDimArray.length; i++) {
            System.out.println(Arrays.deepToString(twoDimArray));
        }
    }
}

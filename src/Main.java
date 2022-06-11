//Матрици
//•	въвеждане на матрица от клавиатурата
//  o	да се задават размерности и да се въвеждат елементите по удобен начин
//•	извеждане на матрица на екрана
//  o	да се извежда матрицата в подреден табличен вид
//•	събиране и изваждане на матрици (на 2 матрици)
//•	умножение на матрици
//  o	да се прави проверка дали размерностите на матриците са подходящи
//•	намиране на детерминанта на матрица
//  o	без значение кой алгоритъм ще бъде използван
//•	намиране на обратна матрица
//  o	да се извежда грешка, ако матрицата няма обратна
//•	проверка дали дадена квадратна матрица може да се преобразува до единичната  (E)

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of row in the matrix1:  ");
        int n = scan.nextInt();
        System.out.print("Enter the number of columns in the matrix1:  ");
        int m = scan.nextInt();
        int[][] matrix1 = new int[n][m];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                System.out.printf("matrix1[%d,%d] = ", i, j);
                matrix1[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                System.out.print(matrix1[i][j] + "|");
                //System.out.printf("%d ", matrix1[i][j]);
            }
            System.out.println();
        }

        System.out.print("Enter the number of row in the matrix2:  ");
        int p = scan.nextInt();
        System.out.print("Enter the number of columns in the matrix2:  ");
        int q = scan.nextInt();
        int[][] matrix2 = new int[p][q];
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                System.out.printf("matrix2[%d,%d] = ", i, j);
                matrix2[i][j] = scan.nextInt();
            }
        }
        if ((n == p) && (m == q)) {

        } else {
            System.out.println("Disproportionate arrays");
        }

    }
}
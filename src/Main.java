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
    // Function to print Matrix
    static void print_matrix(int output[][], int r, int c)
    {
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }
    }
    // Function to multiply two matrices a[][] and b[][]
    static void multiply(int r1, int c1, int r2, int c2, int a[][], int b[][])
    {
        int i, j, k;
        // Check if multiplication is Possible
        if(r2!=c1)
        {
            System.out.println("\n We can’t multiply these matrices.");
            return;
        }
        // Matrix to store the result
        //The product matrix will be of size row1 x col2
        int c[][] = new int[r1][c2];
        // Multiply the two marices
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c2;j++)
            {
                for(k=0;k<r2;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        print_matrix(c,r1,c2);
    }

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

        if (n != p && m != q) {
            System.out.println("\n We can't add these matrices.");
        } else {
            int c[][] = new int[n][m];
            for (int i = 0; i <  matrix1.length; i++) {
                for (int j = 0; j <  matrix2[0].length; j++) {
                    c[i][j] = matrix1[i][j] + matrix2[i][j];
                    System.out.print(c[i][j] + "|");
                }
                System.out.println();

            int d[][] = new int[n][m];
            for (i = 0; i < matrix1.length; i++) {
                for (int j = 0; j< matrix2[0].length; j++) {
                    d[i][j] = matrix1[i][j] - matrix2[i][j];
                    System.out.print(d[i][j] + "|");
                    }
                    System.out.println();

                }
            }
        }

        int r1,c1,r2,c2;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number of row in multiplication matrix a:  ");
        r1 = inp.nextInt();
        System.out.print("Enter the number of column in multiplication matrix a:  ");
        c1 = inp.nextInt();
        System.out.print("Enter the number of row in multiplication matrix b:  ");
        r2 = inp.nextInt();
        System.out.print("Enter the number of column in multiplication matrix b:  ");
        c2 = inp.nextInt();
        int a[][] = new int[r1][c1];
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                System.out.printf("a[%d,%d] = ", i, j);
                a[i][j]=inp.nextInt();
            }
        }
        int b[][] = new int[r2][c2];
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                System.out.printf("b[%d,%d] = ", i, j);
                b[i][j]=inp.nextInt();
            }
        }
        multiply(r1,c1,r2,c2,a,b);
    }
}


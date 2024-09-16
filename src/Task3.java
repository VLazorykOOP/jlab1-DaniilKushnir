import java.util.Scanner;

public class Task3 {
    public static void fillMatrix(int[][] matrix, int n, Scanner scanner) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Елемент [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    public static int[] calculateX(int[][] A, int[][] B, int n) {
        int [] X = new int[n];

        for (int i = 0; i < n; i++){
            boolean allNegative = true;
            for(int j = 0; j < n; j++){
                if(A[i][j] >= 0 || B[i][j] >= 0){
                    allNegative = false;
                    break;
                }
            }
            if (allNegative) {
                X[i] = 1;
            } else {
                X[i] = 0;
            }
        }
        return X;
    }
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

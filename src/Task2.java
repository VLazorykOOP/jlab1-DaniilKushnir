import java.util.Scanner;

public class Task2 {

    public static void fillArrayManually(int[] A, int[] B, Scanner scanner) {
        System.out.println("Введіть елементи масиву A:");
        fillArrayFromUserInput(A, scanner);
        
        System.out.println("Введіть елементи масиву B:");
        fillArrayFromUserInput(B, scanner);
        
        System.out.println("Масив A:");
        printArr(A);
        
        System.out.println("Масив B:");
        printArr(B);

    }

    public static int[] symmetricDifference(int [] A, int [] B){
        int maxSize = A.length + B.length;
        int[] tempResult = new int[maxSize];    

        // знаходимо значення які є в А і нема в В
        int index = 0;
        for (int i = 0; i < A.length; i++){
            boolean Flag = false;
            for (int j = 0; j < B.length; j++){
                if (A[i] == B[j]){
                    Flag = true;
                    break;
                }
            }
            if(!Flag){
                tempResult[index++] = A[i];
            }
        }

        // знаходимо значення які є в B і нема в A
        for (int i = 0; i < B.length; i++){
            boolean Flag = false;
            for (int j = 0; j < A.length; j++){
                if (B[i] == A[j]){
                    Flag = true;
                    break;
                }
            }
            if(!Flag){
                tempResult[index++] = B[i];
            }
        }

        int [] result = new int[index];
        System.arraycopy(tempResult, 0, result, 0, index); //обрізаєм масив до потрібного розміру
        return result;

    }       

    
    private static void fillArrayFromUserInput(int[] arr, Scanner scanner) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Елемент " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
    }   
    public static void printArr(int[] arr){
        for(int i:arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

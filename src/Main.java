import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) { //try для кращого управління ресурсами щоб не було витоків ресурсів

            //task 1 (6)
            System.out.println("Введiть перше дiйсне число:");
            double n = in.nextDouble();  
            System.out.println("Введiть друге дiйсне число:");
            double m = in.nextDouble();  

            Task1 task1 = new Task1(n, m);

            double result1 = task1.calculateResult1();
            System.out.println("Результат double + double = " + result1);

            double result2 = task1.calculateResult2();
            System.out.println("Результат int + int = " + result2);

            int result3 = task1.calculateResult3();
            System.out.println("Результат double + double (перетворений на int) = " + result3);


            //task 2 (10)
            System.out.println("Введiть ромір масиву A (макс 500):");
            int nvar = in.nextInt();
            if (nvar > 500){
                System.out.println("Розмір масиву A не може перевищувати 500.");
                return;
            }
            int[] A = new int[nvar];

            System.out.println("Введiть ромір масиву B (макс 200):");
            int mvar = in.nextInt();
            if (nvar > 200){
                System.out.println("Розмір масиву B не може перевищувати 200.");
                return;
            }

            int[] B = new int[mvar];

            Task2.fillArrayManually(A,B, in);

            int[] result = Task2.symmetricDifference(A, B);
            System.out.println("Результат симметричної рiзницi:");
            Task2.printArr(result);
        
        //task 3 (7)
            System.out.print("Введіть розмір матриць n (n <= 15): ");
            int matrixSize = in.nextInt();
            if (matrixSize > 15) {
                System.out.println("Розмір матриць не може перевищувати 15.");
                return;
            }

            int[][] matrixA = new int[matrixSize][matrixSize];
            int[][] matrixB = new int[matrixSize][matrixSize];

            System.out.println("Введіть елементи матриці A:");
            Task3.fillMatrix(matrixA, matrixSize, in);

            System.out.println("Введіть елементи матриці B:");
            Task3.fillMatrix(matrixB, matrixSize, in);

            int[] resultX = Task3.calculateX(matrixA, matrixB, matrixSize);
            System.out.println("Вектор X:");
            Task3.printArray(resultX);



        //task 4 (8)
            System.out.println("Введіть текст:");
            String inputText = in.nextLine();
            String resultText = Task4.removeOddLengthWords(inputText);

            System.out.println("Результат без слів непарної довжини:");
            System.out.println(resultText);
        }
    }
}

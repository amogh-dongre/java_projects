/* Develop a multithreaded program to calculate the sum of all values of an N x N matrix (5<=N<=10).
 *In the first phase of calculation we fill all the values of the matrix, row wise, with random numbers ranging from 10 to 50 using N threads.
 * Later in the second phase the main thread computes sum. The selection of ‘N’ value is to be done at random and not to be interactive.
 */
import java.util.Random;

class MatrixFillThread implements Runnable {
      int[][] matrix;
      int startRow;
      int endRow;

    public MatrixFillThread(int[][] matrix, int startRow, int endRow) {
        this.matrix = matrix;
        this.startRow = startRow;
        this.endRow = endRow;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (int i = startRow; i < endRow; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = random.nextInt(41) + 10;
            }
        }
    }
}
public class Testmatrix {
    public static void main(String[] args) {
        int N = (int) (Math.random() * 6) + 5; // Random value of N between 5 and 10
        int[][] matrix = new int[N][N];
        Thread[] threads = new Thread[N];
        int rowsPerThread = N / threads.length;
        for (int i = 0; i < threads.length; i++) {
            int startRow = i * rowsPerThread;
            int endRow = startRow + rowsPerThread;
            threads[i] = new Thread(new MatrixFillThread(matrix, startRow, endRow));
            threads[i].start();
        }
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        int matrixSum = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                matrixSum += value;
            }
        }
        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        System.out.println("Sum of all values: " + matrixSum);
    }
}

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Task3Test {

    @Test
    public void testCalculateX_AllNegativeRows() {
        int[][] A = {
            {-1, -2, -3},
            {-4, -5, -6},
            {1, 2, 3}
        };
        int[][] B = {
            {-1, -2, -3},
            {-4, -5, -6},
            {4, 5, 6}
        };
        int n = 3;

        int[] expected = {1, 1, 0}; 
        int[] actual = Task3.calculateX(A, B, n);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testCalculateX_MixedRows() {
        int[][] A = {
            {-1, -2, -3},
            {4, 5, 6},
            {1, -2, -3}
        };
        int[][] B = {
            {-1, -2, -3},
            {0, 0, 0},
            {4, 5, 6}
        };
        int n = 3;

        int[] expected = {1, 0, 0}; // Only the first row is all negative
        int[] actual = Task3.calculateX(A, B, n);
        assertArrayEquals(expected, actual);
    }
}

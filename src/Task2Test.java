import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Task2Test {

    @Test
    public void testSymmetricDifference() {
        int[] A = {1, 2, 3, 4};
        int[] B = {3, 4, 5, 6};

        int[] expected = {1, 2, 5, 6};
        int[] actual = Task2.symmetricDifference(A, B);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSymmetricDifferenceWithNoCommonElements() {
        int[] A = {1, 2, 3};
        int[] B = {4, 5, 6};

        int[] expected = {1, 2, 3, 4, 5, 6};
        int[] actual = Task2.symmetricDifference(A, B);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSymmetricDifferenceWithEmptyArrays() {
        int[] A = {};
        int[] B = {1, 2, 3};

        int[] expected = {1, 2, 3};
        int[] actual = Task2.symmetricDifference(A, B);

        assertArrayEquals(expected, actual);
    }
    }


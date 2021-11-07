import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CyclicRotationTest {
    @Test
    void testSolution() {
        int[] actualSolutionResult = (new CyclicRotation.CyclicRotationSolution()).solution(new int[]{1, 1, 1, 1}, 1);
        assertEquals(4, actualSolutionResult.length);
        assertEquals(1, actualSolutionResult[0]);
        assertEquals(1, actualSolutionResult[1]);
        assertEquals(1, actualSolutionResult[2]);
        assertEquals(1, actualSolutionResult[3]);
    }

    @Test
    void testSolution3() {
        int[] actualSolutionResult = (new CyclicRotation.CyclicRotationSolution()).solution(new int[]{4, 3, 2, 1}, 2);
        assertEquals(4, actualSolutionResult.length);
        assertEquals(2, actualSolutionResult[0]);
        assertEquals(1, actualSolutionResult[1]);
        assertEquals(4, actualSolutionResult[2]);
        assertEquals(3, actualSolutionResult[3]);
    }

    @Test
    void testSolution2() {
        assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> (new CyclicRotation.CyclicRotationSolution()).solution(new int[]{1, 1, 1, 1}, -1));
    }
}


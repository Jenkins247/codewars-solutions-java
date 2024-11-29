package kata.kyu8;

import java.util.ArrayList;

/**
 * Implement the function generateRange which takes three arguments (start, stop, step) and returns the range of integers from start to stop (inclusive) in increments of step.
 * <p>
 * Examples<p>
 * (1, 10, 1) -> [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]<p>
 * (-10, 1, 1) -> [-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1]<p>
 * (1, 15, 20) -> [1]<p>
 * Note<p>
 * start < stop<p>
 * step > 0
 */

public class GenerateRangeOfIntegers {
    public static int[] generateRange(int min, int max, int step) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = min; i <= max; ) {
            result.add(i);
            i += step;
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}

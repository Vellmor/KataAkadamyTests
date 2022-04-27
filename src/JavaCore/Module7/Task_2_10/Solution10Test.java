package JavaCore.Module7.Task_2_10;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static JavaCore.Module7.Task_2_10.Solution10.pseudoRandomStream;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution10Test {

    @Test
    void PseudoRandomStreamTest() {
        IntStream intStream = pseudoRandomStream(13);
        int[] collect = intStream
                .limit(10)
                .toArray();
        assertArrayEquals(new int[]{13, 16, 25, 62, 384, 745, 502, 200, 0, 0}, collect);
    }
}
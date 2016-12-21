import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by davidtan on 21/12/2016.
 */
public class QuicksortTest {
    @Test
    public void singlePartition() throws Exception {
        int[] original = new int[]{9, 7, 5, 11, 12, 2, 14, 3, 10, 4, 6};
        assertEquals(4, Quicksort.partition(original, 0, original.length - 1));
    }

    @Test
    public void singlePartition2() throws Exception {
        int[] original = new int[]{5, 3, 2, 8, 4};
        assertEquals(2, Quicksort.partition(original, 0, original.length - 1));
    }

    @Test
    public void quicksort() throws Exception {
        int[] original = new int[]{9, 7, 5, 11, 12, 2, 14, 3, 10, 0, 1, 4, 6};
        int[] expected = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12, 14};
        assertArrayEquals(expected, Quicksort.quicksort(original, 0, original.length - 1));
    }


}
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by davidtan on 21/12/2016.
 */
public class QuicksortTest {
    @Test
    public void firstTest() throws Exception {
        int[] expected = new int[]{1,2,3,4,5};
        assertArrayEquals(expected, Quicksort.quicksort(new int[]{3,4,1,5,2}));
    }
}
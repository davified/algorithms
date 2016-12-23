import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by davidtan on 23/12/2016.
 */
public class RectangleTest {
    @Test
    public void shouldReturnNull() throws Exception {
        assertEquals(null, Rectangle.sqInRect(5, 5));
    }

    @Test
    public void solution() throws Exception {
        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(3,2,1,1));
        assertEquals(expected, Rectangle.sqInRect(5,3));
    }

}
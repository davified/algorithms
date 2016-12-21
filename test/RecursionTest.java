import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by davidtan on 21/12/2016.
 */
public class RecursionTest {
    @Test
    public void shouldReturn120() throws Exception {
        assertEquals(120, Recursion.factorial(5));
    }

    @Test
    public void shouldReturn362880() throws Exception {
        assertEquals(362880, Recursion.factorial(9));
    }

    @Test
    public void isPalindromeTrue() throws Exception {
        assertEquals(true, Recursion.isPalindrome("rotor"));
    }

    @Test
    public void isPalindromeFalse() throws Exception {
        assertEquals(false, Recursion.isPalindrome("motor"));
    }

    @Test
    public void isPalindromeTrueTacocat() throws Exception {
        assertEquals(true, Recursion.isPalindrome("tacocat"));
    }
}
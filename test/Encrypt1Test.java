import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by davidtan on 23/12/2016.
 */
public class Encrypt1Test {
    @Test
    public void encrypt() throws Exception {
        assertEquals("This is a test!", Encrypt1.encrypt("This is a test!", 0));
    }

    @Test
    public void test2() throws Exception {
        assertEquals("hsi  etTi sats!", Encrypt1.encrypt("This is a test!", 1));
    }

    @Test
    public void test3() throws Exception {
        assertEquals("s eT ashi tist!", Encrypt1.encrypt("This is a test!", 2));
    }

    @Test
    public void test4() throws Exception {
        assertEquals(" Tah itse sits!", Encrypt1.encrypt("This is a test!", 3));
    }

    @Test
    public void test5() throws Exception {
        assertEquals("This is a test!", Encrypt1.encrypt("This is a test!", 4));
    }

    @Test
    public void test6() throws Exception {
        assertEquals("This is a test!", Encrypt1.encrypt("This is a test!", -1));
    }

    @Test
    public void test7() throws Exception {
        assertEquals("hskt svr neetn!Ti aai eyitrsig", Encrypt1.encrypt("This kata is very interesting!", 1));
    }
}
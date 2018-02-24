
import org.junit.Assert;
import org.junit.Test;

import java.io.*;

public class CounterTest {

    @Test
    public void SimpleTest() {
        Counter c = new Counter(0);
        int val = c.getAndIncrement();

        Assert.assertEquals(1, val);
    }

}

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
    @Test
    public void testHello(){
        assertEquals("Haha", App.sayHello());
    }
}
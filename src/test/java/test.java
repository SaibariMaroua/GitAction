import org.example.Main;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class test {

 @Test
    public void testAdd() {
        Main main = new Main();
        assertEquals(5, main.add(2, 7), "2 + 3 devrait être égal à 5");
    }


    }




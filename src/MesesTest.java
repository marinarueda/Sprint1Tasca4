import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class MesesTest {

    @Test
        public void testMesesSize(ArrayList<String>meses) {
            int expectedSize = 12;
            int actualSize = meses.size();

            Assert.assertEquals(expectedSize, actualSize);
        }

    @Test
    public void testAgostoEnPosicion8(ArrayList<String>meses) {
        String expectedMonth = "Agosto";
        String actualMonth = meses.get(7);

        Assert.assertEquals(expectedMonth, actualMonth);
    }
}



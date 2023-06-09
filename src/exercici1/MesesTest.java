package exercici1;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class MesesTest {

    @Test
        public void testMesesSize(ArrayList<String>meses) {
            int expectedSize = 12;
            int actualSize = meses.size();

            Assert.assertEquals(expectedSize, actualSize);
            System.out.println("El test testMesesSize ha pasado correctamente. Hay 12 meses");
        }

    @Test
    public void testAgostoEnPosicion8(ArrayList<String>meses) {
        String expectedMonth = "Agosto";
        String actualMonth = meses.get(7);

        Assert.assertEquals(expectedMonth, actualMonth);
        System.out.println("El test testAgostoEnPosicion8 ha pasado correctamente.");
    }
}



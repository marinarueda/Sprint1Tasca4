package exercici3;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProgramaTest {

    @Test
    public void testPrograma(ArrayList<Integer> numeros, Throwable exception) {

        assertThrows(IndexOutOfBoundsException.class, () -> {numeros.get(2);});
        String expectedMessage = "El programa no está funcionando porque la lista no contiene esta posición";

        String mensajeError = exception.getMessage();
        assertTrue(mensajeError.contains(expectedMessage));
    }
}


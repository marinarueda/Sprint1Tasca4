package exercici3;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProgramaTest {

    @Test
    public void testPrograma() {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(5);

        System.out.println("Intentando acceder a una posición no válida de la lista...");
        Throwable exception = assertThrows(IndexOutOfBoundsException.class, () -> {numeros.get(2);});
        String expectedMessage = "Index 2 out of bounds for length 1";

        String mensajeError = exception.getMessage();
        assertEquals(expectedMessage, mensajeError);
        System.out.println("El test testPrograma ha pasado correctamente.");
    }


}


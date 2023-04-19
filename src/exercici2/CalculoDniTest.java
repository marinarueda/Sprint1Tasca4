package exercici2;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculoDniTest {

    @Test
    public void testCalcularLetra() {
        int[] numeros = {12345678, 87654321, 47277732, 54857896, 87458965, 12547852, 63598452, 56985632, 41258965, 45289652};
        char[] letrasEsperadas = {'Z', 'E', 'J', 'X', 'R', 'G', 'M', 'E', 'P', 'W'};

        for(int i = 0; i < numeros.length; i++) {
            CalculoDni dni = new CalculoDni(numeros[i]);
            char letraCalculada = dni.calcularLetra(numeros[i]);
            assertEquals(letrasEsperadas[i], letraCalculada);
        }
    }
}




